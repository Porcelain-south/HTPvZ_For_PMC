package com.hungteen.pvz.compat.jei.category;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.hungteen.pvz.common.block.BlockRegister;
import com.hungteen.pvz.common.recipe.EssenceFurnaceRecipe;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.matrix.MatrixStack;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableAnimated;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.gui.ingredient.IGuiItemStackGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class EssenceFurnaceRecipeCategory implements IRecipeCategory<EssenceFurnaceRecipe> {

    protected final IDrawableStatic staticFlame;
    protected final IDrawableAnimated animatedFlame;

    private final IDrawable background;
    private final int regularCookTime;
    private final IDrawable icon;
    private final ITextComponent localizedName;
    private final LoadingCache<Integer, IDrawableAnimated> cachedArrows;

    public static final ResourceLocation ESSENCE_FURNACE_GUI = StringUtil.prefix("textures/gui/jei/essence_furnace.png");

    public EssenceFurnaceRecipeCategory(IGuiHelper guiHelper) {
        super();
        this.background = guiHelper.createDrawable(ESSENCE_FURNACE_GUI, 0, 114, 82, 54);
        this.regularCookTime = 200;
        this.icon = guiHelper.createDrawableIngredient(new ItemStack(BlockRegister.ESSENCE_FURNACE.get()));
        this.localizedName = new TranslationTextComponent("block.pvz.essence_furnace");
        this.cachedArrows = CacheBuilder.newBuilder()
                .maximumSize(25)
                .build(new CacheLoader<Integer, IDrawableAnimated>() {
                    @Override
                    public IDrawableAnimated load(Integer cookTime) {
                        return guiHelper.drawableBuilder(ESSENCE_FURNACE_GUI, 82, 128, 24, 17)
                                .buildAnimated(cookTime, IDrawableAnimated.StartDirection.LEFT, false);
                    }
                });
        staticFlame = guiHelper.createDrawable(ESSENCE_FURNACE_GUI, 82, 114, 14, 14);
        animatedFlame = guiHelper.createAnimatedDrawable(staticFlame, 300, IDrawableAnimated.StartDirection.TOP, true);

    }

    protected IDrawableAnimated getArrow(EssenceFurnaceRecipe recipe) {
        int cookTime = recipe.getCookingTime();
        if (cookTime <= 0) {
            cookTime = regularCookTime;
        }
        return this.cachedArrows.getUnchecked(cookTime);
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Override
    public IDrawable getIcon() {
        return icon;
    }

    @Override
    public void setIngredients(EssenceFurnaceRecipe recipe, IIngredients ingredients) {
        ingredients.setInputIngredients(recipe.getIngredients());
        ingredients.setOutput(VanillaTypes.ITEM, recipe.getResultItem());
    }

    @Override
    public void draw(EssenceFurnaceRecipe recipe, MatrixStack matrixStack, double mouseX, double mouseY) {
        animatedFlame.draw(matrixStack, 1, 20);

        IDrawableAnimated arrow = getArrow(recipe);
        arrow.draw(matrixStack, 24, 18);

        drawCookTime(recipe, matrixStack, 45);
    }

    protected void drawCookTime(EssenceFurnaceRecipe recipe, MatrixStack matrixStack, int y) {
        int cookTime = recipe.getCookingTime();
        if (cookTime > 0) {
            int cookTimeSeconds = cookTime / 20;
            TranslationTextComponent timeString = new TranslationTextComponent("gui.jei.category.smelting.time.seconds", cookTimeSeconds);
            Minecraft minecraft = Minecraft.getInstance();
            FontRenderer fontRenderer = minecraft.font;
            int stringWidth = fontRenderer.width(timeString);
            fontRenderer.draw(matrixStack, timeString, background.getWidth() - stringWidth, y, 0xFF808080);
        }
    }

    @Override
    public ResourceLocation getUid() {
        return EssenceFurnaceRecipe.UID;
    }

    @Override
    public Class<? extends EssenceFurnaceRecipe> getRecipeClass() {
        return EssenceFurnaceRecipe.class;
    }

    @Override
    @Deprecated
    public String getTitle() {
        return localizedName.getString();
    }

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, EssenceFurnaceRecipe recipe, IIngredients ingredients) {
        IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();

        guiItemStacks.init(0, true, 0, 0);
        guiItemStacks.init(1, true, 0, 36);
        guiItemStacks.init(2, false, 60, 18);

        guiItemStacks.set(ingredients);
    }

    @Override
    public boolean isHandled(EssenceFurnaceRecipe recipe) {
        return !recipe.isSpecial();
    }
}