package com.hungteen.pvz.common.recipe;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.*;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.JSONUtils;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistryEntry;

public class EssenceFurnaceRecipe  implements IRecipe<IInventory> {
    public static final ResourceLocation UID = StringUtil.prefix("essence_furnace");

    private final ResourceLocation id;
    private final String group;

    private final Ingredient ingredient;
    private final Ingredient fuel;
    private final ItemStack result;
    private final int fuelTime;
    public final int cookingTime;

    public EssenceFurnaceRecipe(ResourceLocation resourceLocation, String group, Ingredient ingredient,Ingredient fuel,
                                ItemStack result, int fuelTime,int cookingTime) {
        this.id = resourceLocation;
        this.ingredient = ingredient;
        this.fuel = fuel;
        this.result = result;
        this.group = group;
        this.fuelTime = fuelTime;
        this.cookingTime = cookingTime;
    }

    @Override
    public boolean matches(IInventory inventory, World world) {
        return this.ingredient.test(inventory.getItem(0)) && this.fuel.test(inventory.getItem(1));
    }

    @Override
    public ItemStack assemble(IInventory inventory) {
        return result.copy();
    }

    @Override
    public boolean canCraftInDimensions(int i, int i1) {
        return true;
    }

    public String getGroup() {
        return this.group;
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> nonnulllist = NonNullList.create();
        nonnulllist.add(this.ingredient);
        nonnulllist.add(this.fuel);
        return nonnulllist;
    }

    @Override
    public ItemStack getResultItem() {
        return result;
    }

    @Override
    public ItemStack getToastSymbol() {
        return new ItemStack(BlockRegister.ESSENCE_FURNACE.get());
    }

    @Override
    public ResourceLocation getId() {
        return this.id;
    }

    public Ingredient getFuel() {
        return this.fuel;
    }

    public int getFuelTime() {
        return this.fuelTime;
    }

    public int getCookingTime(){
        return this.cookingTime;
    }

    public IRecipeSerializer<?> getSerializer() {
        return RecipeRegister.FURNACE_SERIALIZER.get();
    }

    @Override
    public IRecipeType<?> getType() {
        return RecipeRegister.FURNACE_RECIPE_TYPE;
    }

    public static class Serializer extends ForgeRegistryEntry<IRecipeSerializer<?>>  implements IRecipeSerializer<EssenceFurnaceRecipe> {

        public EssenceFurnaceRecipe fromJson(ResourceLocation id, JsonObject json) {
            String group = JSONUtils.getAsString(json, "group", "");
            int cookingTime = JSONUtils.getAsInt(json, "cookingtime", 200);
            JsonElement jsonelement = JSONUtils.isArrayNode(json, "ingredient") ? JSONUtils.getAsJsonArray(json, "ingredient") : JSONUtils.getAsJsonObject(json, "ingredient");
            Ingredient ingredient = Ingredient.fromJson(jsonelement);

            JsonObject fuelObj = JSONUtils.getAsJsonObject(json, "fuel");
            Ingredient fuel = Ingredient.fromJson(fuelObj);

            int fuelTime = fuelObj.has("fueltime") ?
                    JSONUtils.getAsInt(fuelObj, "fueltime") :
                    200;

            if (!json.has("result")) {
                throw new JsonSyntaxException("Missing result, expected to find a string or object");
            }
            ItemStack result;
            if (json.get("result").isJsonObject()) {
                result = ShapedRecipe.itemFromJson(JSONUtils.getAsJsonObject(json, "result"));
            } else {
                String s1 = JSONUtils.getAsString(json, "result");
                ResourceLocation resourcelocation = new ResourceLocation(s1);
                if (ForgeRegistries.ITEMS.containsKey(resourcelocation)) {
                    result = ForgeRegistries.ITEMS.getValue(resourcelocation).getDefaultInstance();
                } else {
                    throw new IllegalStateException("Item: " + s1 + " does not exist");
                }
            }

            return new EssenceFurnaceRecipe(id, group, ingredient, fuel, result, fuelTime, cookingTime);
        }

        @Override
        public EssenceFurnaceRecipe fromNetwork(ResourceLocation id, PacketBuffer buffer) {
            Ingredient ingredient = Ingredient.fromNetwork(buffer);
            Ingredient fuel = Ingredient.fromNetwork(buffer);
            ItemStack result = buffer.readItem();
            String group = buffer.readUtf();
            int fuelTime = buffer.readInt();
            int cookingTime = buffer.readInt();

            return new EssenceFurnaceRecipe(id, group, ingredient, fuel, result, fuelTime,cookingTime);
        }

        @Override
        public void toNetwork(PacketBuffer buffer, EssenceFurnaceRecipe recipe) {
            recipe.ingredient.toNetwork(buffer);
            recipe.fuel.toNetwork(buffer);
            buffer.writeItem(recipe.result);
            buffer.writeUtf(recipe.group);
            buffer.writeInt(recipe.fuelTime);
            buffer.writeInt(recipe.cookingTime);
        }
    }

}