package com.hungteen.pvz.common.recipe;

import com.hungteen.pvz.PVZMod;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.ShapedRecipe;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RecipeRegister {

    public static final DeferredRegister<IRecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, PVZMod.MOD_ID);

    static {
        ShapedRecipe.setCraftingSize(5, 5);
    }
    //recipe type.
    public static final IRecipeType<FusionRecipe> FUSION_RECIPE_TYPE = IRecipeType.register("pvz:card_fusion");
    public static final IRecipeType<FragmentRecipe> FRAGMENT_RECIPE_TYPE = IRecipeType.register("pvz:fragment_splice");
    public static final IRecipeType<EssenceFurnaceRecipe> FURNACE_RECIPE_TYPE = IRecipeType.register("pvz:essence_furnace");
//    registerType(FragmentRecipe.TYPE);

    //serializer.
    public static final RegistryObject<FusionRecipe.Serializer> FUSION_SERIALIZER = RECIPE_SERIALIZERS.register("card_fusion", FusionRecipe.Serializer::new);
    public static final RegistryObject<FragmentRecipe.Serializer> FRAGMENT_SERIALIZER = RECIPE_SERIALIZERS.register("fragment_splice", FragmentRecipe.Serializer::new);
    public static final RegistryObject<EssenceFurnaceRecipe.Serializer> FURNACE_SERIALIZER = RECIPE_SERIALIZERS.register("essence_furnace", EssenceFurnaceRecipe.Serializer::new);

}
