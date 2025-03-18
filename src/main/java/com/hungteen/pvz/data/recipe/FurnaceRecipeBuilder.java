package com.hungteen.pvz.data.recipe;

import com.google.gson.JsonObject;
import com.hungteen.pvz.common.recipe.RecipeRegister;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.ICriterionInstance;
import net.minecraft.advancements.IRequirementsStrategy;
import net.minecraft.advancements.criterion.RecipeUnlockedTrigger;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public class FurnaceRecipeBuilder {

    private final Item result;
    private final Ingredient ingredient;
    private final  Ingredient fuel;
    private final int fuelTime;
    private final int cookingTime;
    private final Advancement.Builder advancement = Advancement.Builder.advancement();
    private String group;

    private FurnaceRecipeBuilder(IItemProvider result, Ingredient ingredient, Ingredient fuel, int fuelTime, int cookingTime) {
        this.result = result.asItem();
        this.ingredient = ingredient;
        this.fuel = fuel;
        this.fuelTime = fuelTime;
        this.cookingTime = cookingTime;
    }

    public static FurnaceRecipeBuilder essence(Ingredient ingredient, Ingredient fuel, IItemProvider result, int fuelTime, int cookingTime) {
        return new FurnaceRecipeBuilder(result, ingredient, fuel,fuelTime,cookingTime);
    }

    public FurnaceRecipeBuilder unlockedBy(String criterionName, ICriterionInstance criterion) {
        this.advancement.addCriterion(criterionName, criterion);
        return this;
    }

    public void save(Consumer<IFinishedRecipe> consumer) {
        this.save(consumer, Registry.ITEM.getKey(this.result));
    }

    public void save(Consumer<IFinishedRecipe> consumer, String path) {
        ResourceLocation resultId = Registry.ITEM.getKey(this.result);
        ResourceLocation newPath = new ResourceLocation(path);
        if (newPath.equals(resultId)) {
            throw new IllegalStateException("Recipe path should not match item registry name: " + path);
        }
        this.save(consumer, newPath);
    }

    public void save(Consumer<IFinishedRecipe> consumer, ResourceLocation id) {
        this.ensureValid(id);
        this.advancement.parent(new ResourceLocation("recipes/root"))
                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(id))
                .rewards(net.minecraft.advancements.AdvancementRewards.Builder.recipe(id))
                .requirements(IRequirementsStrategy.OR);

        consumer.accept(new Result(
                id,
                this.group == null ? "" : this.group,
                this.ingredient,
                this.fuel,
                this.result,
                this.fuelTime,
                this.cookingTime,
                this.advancement,
                new ResourceLocation(id.getNamespace(), "recipes/" + id.getPath())
        ));
    }

    private void ensureValid(ResourceLocation id) {
        if (this.advancement.getCriteria().isEmpty()) {
            throw new IllegalStateException("No unlock conditions for recipe: " + id);
        }
    }

    public static class Result implements IFinishedRecipe {
        private final ResourceLocation id;
        private final String group;
        private final Ingredient ingredient;
        private final Ingredient fuel;
        private final Item result;
        private final int fuelTime;
        private final int cookingTime;
        private final Advancement.Builder advancement;
        private final ResourceLocation advancementId;

        public Result(ResourceLocation id, String group, Ingredient ingredient, Ingredient fuel, Item result, int fuelTime ,int cookingTime, Advancement.Builder advancement, ResourceLocation advancementId) {
            this.id = id;
            this.group = group;
            this.ingredient = ingredient;
            this.fuel = fuel;
            this.result = result;
            this.fuelTime = fuelTime;
            this.cookingTime = cookingTime;
            this.advancement = advancement;
            this.advancementId = advancementId;
        }

        @Override
        public void serializeRecipeData(JsonObject json) {
            json.addProperty("type", "pvz:essence_furnace");

            if (!this.group.isEmpty()) {
                json.addProperty("group", this.group);
            }

            json.add("ingredient", this.ingredient.toJson());

            JsonObject fuelObj = new JsonObject();
            fuelObj.addProperty("item", Registry.ITEM.getKey(this.fuel.getItems()[0].getItem()).toString());
            fuelObj.addProperty("fueltime", this.fuelTime);
            json.add("fuel", fuelObj);

            JsonObject resultObj = new JsonObject();
            resultObj.addProperty("item", Registry.ITEM.getKey(this.result).toString());
            json.add("result", resultObj);

            json.addProperty("cookingtime", this.cookingTime);
        }

        @Override
        public IRecipeSerializer<?> getType() {
            return RecipeRegister.FURNACE_SERIALIZER.get();
        }

        @Override
        public ResourceLocation getId() {
            return this.id;
        }

        @Nullable
        @Override
        public JsonObject serializeAdvancement() {
            return this.advancement.serializeToJson();
        }

        @Nullable
        @Override
        public ResourceLocation getAdvancementId() {
            return this.advancementId;
        }
    }
}