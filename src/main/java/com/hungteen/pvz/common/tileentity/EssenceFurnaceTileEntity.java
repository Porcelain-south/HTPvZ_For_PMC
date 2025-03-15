package com.hungteen.pvz.common.tileentity;

import com.hungteen.pvz.common.container.EssenceFurnaceContainer;
import com.hungteen.pvz.common.recipe.EssenceFurnaceRecipe;
import com.hungteen.pvz.common.recipe.RecipeRegister;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IRecipeHelperPopulator;
import net.minecraft.inventory.IRecipeHolder;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.inventory.ItemStackHelper;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.RecipeItemHelper;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.LockableTileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.IIntArray;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.wrapper.SidedInvWrapper;

import javax.annotation.Nullable;
import java.util.Iterator;

public class EssenceFurnaceTileEntity  extends LockableTileEntity implements ISidedInventory, IRecipeHolder, IRecipeHelperPopulator, INamedContainerProvider, ITickableTileEntity {
    private static final int[] SLOTS_FOR_UP = new int[]{0};
    private static final int[] SLOTS_FOR_DOWN = new int[]{2, 1};
    private static final int[] SLOTS_FOR_SIDES = new int[]{1};
    protected NonNullList<ItemStack> items;
    private int litTime;
    private int litDuration;
    private int cookingProgress;
    private int cookingTotalTime;
    public final IIntArray dataAccess;
    private final Object2IntOpenHashMap<ResourceLocation> recipesUsed;
    protected final IRecipeType<? extends EssenceFurnaceRecipe> recipeType;
    LazyOptional<? extends IItemHandler>[] handlers;

    public EssenceFurnaceTileEntity() {
        super(TileEntityRegister.ESSENCE_FURNACE.get());
        this.items = NonNullList.withSize(3, ItemStack.EMPTY);
        this.dataAccess = new IIntArray() {
            public int get(int p_221476_1_) {
                switch (p_221476_1_) {
                    case 0:
                        return EssenceFurnaceTileEntity.this.litTime;
                    case 1:
                        return EssenceFurnaceTileEntity.this.litDuration;
                    case 2:
                        return EssenceFurnaceTileEntity.this.cookingProgress;
                    case 3:
                        return EssenceFurnaceTileEntity.this.cookingTotalTime;
                    default:
                        return 0;
                }
            }

            public void set(int id, int p_221477_2_) {
                switch (id) {
                    case 0:
                        EssenceFurnaceTileEntity.this.litTime = p_221477_2_;
                        break;
                    case 1:
                        EssenceFurnaceTileEntity.this.litDuration = p_221477_2_;
                        break;
                    case 2:
                        EssenceFurnaceTileEntity.this.cookingProgress = p_221477_2_;
                        break;
                    case 3:
                        EssenceFurnaceTileEntity.this.cookingTotalTime = p_221477_2_;
                }

            }

            public int getCount() {
                return 4;
            }
        };
        this.recipesUsed = new Object2IntOpenHashMap();
        this.handlers = SidedInvWrapper.create(this, Direction.UP, Direction.DOWN, Direction.NORTH);
        this.recipeType = RecipeRegister.FURNACE_RECIPE_TYPE;
    }


    private boolean isLit() {
        return this.litTime > 0;
    }

    public void load(BlockState p_230337_1_, CompoundNBT p_230337_2_) {
        super.load(p_230337_1_, p_230337_2_);
        this.items = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
        ItemStackHelper.loadAllItems(p_230337_2_, this.items);
        this.litTime = p_230337_2_.getInt("BurnTime");
        this.cookingProgress = p_230337_2_.getInt("CookTime");
        this.cookingTotalTime = p_230337_2_.getInt("CookTimeTotal");

        IRecipe<?> irecipe = this.level.getRecipeManager().getRecipeFor(this.recipeType, this, this.level).orElse(null);
        this.litDuration = this.getBurnDuration(this.items.get(1),irecipe);

        CompoundNBT compoundnbt = p_230337_2_.getCompound("RecipesUsed");
        Iterator var4 = compoundnbt.getAllKeys().iterator();

        while(var4.hasNext()) {
            String s = (String)var4.next();
            this.recipesUsed.put(new ResourceLocation(s), compoundnbt.getInt(s));
        }

    }

    public CompoundNBT save(CompoundNBT p_189515_1_) {
        super.save(p_189515_1_);
        p_189515_1_.putInt("BurnTime", this.litTime);
        p_189515_1_.putInt("CookTime", this.cookingProgress);
        p_189515_1_.putInt("CookTimeTotal", this.cookingTotalTime);
        ItemStackHelper.saveAllItems(p_189515_1_, this.items);
        CompoundNBT compoundnbt = new CompoundNBT();
        this.recipesUsed.forEach((p_235643_1_, p_235643_2_) -> {
            compoundnbt.putInt(p_235643_1_.toString(), p_235643_2_);
        });
        p_189515_1_.put("RecipesUsed", compoundnbt);
        return p_189515_1_;
    }

    public void tick() {
        boolean flag = this.isLit();
        boolean flag1 = false;
        if (this.isLit()) {
            --this.litTime;
        }

        if (!this.level.isClientSide) {
            ItemStack itemstack = this.items.get(1);
            if (!this.isLit() && (itemstack.isEmpty() || ((ItemStack)this.items.get(0)).isEmpty())) {
                if (!this.isLit() && this.cookingProgress > 0) {
                    this.cookingProgress = MathHelper.clamp(this.cookingProgress - 2, 0, this.cookingTotalTime);
                }
            } else {
                IRecipe<?> irecipe = this.level.getRecipeManager().getRecipeFor(this.recipeType, this, this.level).orElse(null);
                if (!this.isLit() && this.canBurn(irecipe)) {
                    this.litTime = this.getBurnDuration(itemstack,irecipe);
                    this.litDuration = this.litTime;
                    if (this.isLit()) {
                        flag1 = true;
                        if (itemstack.hasContainerItem()) {
                            this.items.set(1, itemstack.getContainerItem());
                        } else if (!itemstack.isEmpty()) {
                            Item item = itemstack.getItem();
                            itemstack.shrink(1);
                            if (itemstack.isEmpty()) {
                                this.items.set(1, itemstack.getContainerItem());
                            }
                        }
                    }
                }

                if (this.isLit() && this.canBurn(irecipe)) {
                    ++this.cookingProgress;
                    if (this.cookingProgress == this.cookingTotalTime) {
                        this.cookingProgress = 0;
                        this.cookingTotalTime = this.getTotalCookTime();
                        this.burn(irecipe);
                        flag1 = true;
                    }
                } else {
                    this.cookingProgress = 0;
                }
            }

            if (flag != this.isLit()) {
                flag1 = true;
                this.level.setBlock(this.worldPosition, this.level.getBlockState(this.worldPosition).setValue(AbstractFurnaceBlock.LIT, this.isLit()), 3);
            }
        }

        if (flag1) {
            this.setChanged();
        }

    }

    protected boolean canBurn(@Nullable IRecipe<?> recipe) {
        if (!(recipe instanceof EssenceFurnaceRecipe) ||
                this.items.get(0).isEmpty() ||
                this.items.get(1).isEmpty()) { // 索引0=待烧品，1=燃料
            return false;
        }
        EssenceFurnaceRecipe furnaceRecipe = (EssenceFurnaceRecipe) recipe;
        ItemStack inputStack = this.items.get(0);
        ItemStack fuelStack = this.items.get(1);

        boolean inputValid = furnaceRecipe.getIngredients().get(0).test(inputStack);
        boolean fuelValid = furnaceRecipe.getFuel().test(fuelStack);
        if (!inputValid || !fuelValid) {
            return false;
        }
        ItemStack output = recipe.getResultItem();
        ItemStack currentOutput = this.items.get(2);
        if (currentOutput.isEmpty()) {
            return true;
        } else if (!currentOutput.sameItem(output)) {
            return false;
        } else {
            return currentOutput.getCount() + output.getCount() <= output.getMaxStackSize();
        }
    }

    private void burn(@Nullable IRecipe<?> recipe) {
        if (recipe instanceof EssenceFurnaceRecipe && this.canBurn(recipe)) {
            EssenceFurnaceRecipe furnaceRecipe = (EssenceFurnaceRecipe) recipe;
            ItemStack itemstack = this.items.get(0);
            ItemStack itemstack2 = this.items.get(2);
            ItemStack resultStack = furnaceRecipe.assemble(this);;

            if (resultStack.isEmpty()) {
                this.items.set(2, ItemStack.EMPTY);
            }else {
                if (itemstack2.isEmpty()) {
                    this.items.set(2, resultStack.copy());
                } else if (ItemStack.isSame(itemstack2, resultStack)) {
                    itemstack2.grow(resultStack.getCount());
                }
            }

            if (!this.level.isClientSide) {
                this.setRecipeUsed(recipe);
            }

            itemstack.shrink(1);
        }
    }

    protected int getBurnDuration(ItemStack itemStack,@Nullable IRecipe<?> recipe) {
        if(!itemStack.isEmpty() && recipe instanceof EssenceFurnaceRecipe && (((EssenceFurnaceRecipe) recipe).getFuel().test(itemStack)))
         return getFuelBurnTime();

        return 0;
    }

    protected int getFuelBurnTime() {
         return 200;
    }

    protected int getTotalCookTime() {
        return this.level.getRecipeManager().getRecipeFor(this.recipeType, this, this.level).map(EssenceFurnaceRecipe::getCookingTime).orElse(200);
    }

    public int[] getSlotsForFace(Direction direction) {
        if (direction == Direction.DOWN) {
            return SLOTS_FOR_DOWN;
        } else {
            return direction == Direction.UP ? SLOTS_FOR_UP : SLOTS_FOR_SIDES;
        }
    }

    public boolean canPlaceItemThroughFace(int p_180462_1_, ItemStack p_180462_2_, @Nullable Direction p_180462_3_) {
        return this.canPlaceItem(p_180462_1_, p_180462_2_);
    }

    public boolean canTakeItemThroughFace(int p_180461_1_, ItemStack p_180461_2_, Direction p_180461_3_) {
        if (p_180461_3_ == Direction.DOWN && p_180461_1_ == 1) {
            Item item = p_180461_2_.getItem();
            if (item != Items.WATER_BUCKET && item != Items.BUCKET) {
                return false;
            }
        }

        return true;
    }

    public int getContainerSize() {
        return this.items.size();
    }

    public boolean isEmpty() {
        Iterator var1 = this.items.iterator();

        ItemStack itemstack;
        do {
            if (!var1.hasNext()) {
                return true;
            }

            itemstack = (ItemStack)var1.next();
        } while(itemstack.isEmpty());

        return false;
    }

    public ItemStack getItem(int p_70301_1_) {
        return this.items.get(p_70301_1_);
    }

    public ItemStack removeItem(int p_70298_1_, int p_70298_2_) {
        return ItemStackHelper.removeItem(this.items, p_70298_1_, p_70298_2_);
    }

    public ItemStack removeItemNoUpdate(int p_70304_1_) {
        return ItemStackHelper.takeItem(this.items, p_70304_1_);
    }

    public void setItem(int p_70299_1_, ItemStack p_70299_2_) {
        ItemStack itemstack = this.items.get(p_70299_1_);
        boolean flag = !p_70299_2_.isEmpty() && p_70299_2_.sameItem(itemstack) && ItemStack.tagMatches(p_70299_2_, itemstack);
        this.items.set(p_70299_1_, p_70299_2_);
        if (p_70299_2_.getCount() > this.getMaxStackSize()) {
            p_70299_2_.setCount(this.getMaxStackSize());
        }

        if (p_70299_1_ == 0 && !flag) {
            this.cookingTotalTime = this.getTotalCookTime();
            this.cookingProgress = 0;
            this.setChanged();
        }
    }

    public boolean stillValid(PlayerEntity p_70300_1_) {
        if (this.level.getBlockEntity(this.worldPosition) != this) {
            return false;
        } else {
            return p_70300_1_.distanceToSqr((double)this.worldPosition.getX() + 0.5, (double)this.worldPosition.getY() + 0.5, (double)this.worldPosition.getZ() + 0.5) <= 64.0;
        }
    }

    public void clearContent() {
        this.items.clear();
    }

    public void setRecipeUsed(@Nullable IRecipe<?> p_193056_1_) {
        if (p_193056_1_ != null) {
            ResourceLocation resourcelocation = p_193056_1_.getId();
            this.recipesUsed.addTo(resourcelocation, 1);
        }

    }

    @Nullable
    public IRecipe<?> getRecipeUsed() {
        if (this.recipeType == RecipeRegister.FURNACE_RECIPE_TYPE && !this.items.get(0).isEmpty()) {
            return this.level.getRecipeManager().getRecipeFor(this.recipeType, this, this.level)
                    .filter(recipe -> {
                        if (recipe instanceof EssenceFurnaceRecipe) {
                            return recipe.getIngredients().get(0).test(this.items.get(0))
                                    && recipe.getFuel().test(this.items.get(1));
                        }
                        return false;
                    })
                    .orElse(null);
        }
        return null;
    }

    public void fillStackedContents(RecipeItemHelper p_194018_1_) {
        Iterator var2 = this.items.iterator();

        while(var2.hasNext()) {
            ItemStack itemstack = (ItemStack)var2.next();
            p_194018_1_.accountStack(itemstack);
        }

    }

    public <T> LazyOptional<T> getCapability(Capability<T> p_getCapability_1_, @Nullable Direction p_getCapability_2_) {
        if (!this.remove && p_getCapability_2_ != null && p_getCapability_1_ == CapabilityItemHandler.ITEM_HANDLER_CAPABILITY) {
            if (p_getCapability_2_ == Direction.UP) {
                return this.handlers[0].cast();
            } else {
                return p_getCapability_2_ == Direction.DOWN ? this.handlers[1].cast() : this.handlers[2].cast();
            }
        } else {
            return super.getCapability(p_getCapability_1_, p_getCapability_2_);
        }
    }

    protected void invalidateCaps() {
        super.invalidateCaps();

        for(int x = 0; x < this.handlers.length; ++x) {
            this.handlers[x].invalidate();
        }

    }

    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("block.pvz.essence_furnace");
    }

    protected Container createMenu(int id, PlayerInventory playerInventory) {
        return new EssenceFurnaceContainer(id, playerInventory.player, this.getBlockPos());
    }
}