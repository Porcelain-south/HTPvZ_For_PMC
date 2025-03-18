package com.hungteen.pvz.common.tileentity;

import com.hungteen.pvz.common.block.special.EssenceFurnaceBlock;
import com.hungteen.pvz.common.container.EssenceFurnaceContainer;
import com.hungteen.pvz.common.recipe.EssenceFurnaceRecipe;
import com.hungteen.pvz.common.recipe.RecipeRegister;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.IRecipeHelperPopulator;
import net.minecraft.inventory.ISidedInventory;
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
import net.minecraft.util.Direction;
import net.minecraft.util.IIntArray;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.wrapper.RecipeWrapper;
import net.minecraftforge.items.wrapper.SidedInvWrapper;

import javax.annotation.Nullable;

public class EssenceFurnaceTileEntity extends PVZTileEntity implements ISidedInventory, IRecipeHelperPopulator, INamedContainerProvider, ITickableTileEntity {

    private static final int[] SLOTS_FOR_UP = new int[]{0};
    private static final int[] SLOTS_FOR_DOWN = new int[]{2, 1};
    private static final int[] SLOTS_FOR_SIDES = new int[]{1};
    public final ItemStackHandler handler = new ItemStackHandler(3);
    public int tick = 0;
    private int litTime;
    private int litDuration;
    private int cookingProgress;
    private int cookingTotalTime;
    public final IIntArray dataAccess;
    protected final IRecipeType<? extends EssenceFurnaceRecipe> recipeType;
    LazyOptional<? extends IItemHandler>[] handlers;

    public EssenceFurnaceTileEntity() {
        super(TileEntityRegister.ESSENCE_FURNACE.get());
        this.dataAccess = new IIntArray() {
            public int get(int id) {
                switch (id) {
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

            public void set(int id, int num) {
                switch (id) {
                    case 0:
                        EssenceFurnaceTileEntity.this.litTime = num;
                        break;
                    case 1:
                        EssenceFurnaceTileEntity.this.litDuration = num;
                        break;
                    case 2:
                        EssenceFurnaceTileEntity.this.cookingProgress = num;
                        break;
                    case 3:
                        EssenceFurnaceTileEntity.this.cookingTotalTime = num;
                }

            }

            public int getCount() {
                return 4;
            }
        };
        this.handlers = SidedInvWrapper.create(this, Direction.UP, Direction.DOWN, Direction.NORTH);
        this.recipeType = RecipeRegister.FURNACE_RECIPE_TYPE;
    }

    private boolean isLit() {
        return this.litTime > 0;
    }

    @Override
    public void tick() {
        boolean flag = this.isLit();
        boolean flag1 = false;
        if (this.isLit()) {
            --this.litTime;
        }

        if (!this.level.isClientSide) {
            ItemStack fuelStack  = this.handler.getStackInSlot(1);
            if (fuelStack.isEmpty() || this.handler.getStackInSlot(0).isEmpty()) {
                if (!this.isLit() && this.cookingProgress > 0) {
                    this.cookingProgress = MathHelper.clamp(this.cookingProgress - 2, 0, this.cookingTotalTime);
                }
            } else {
                EssenceFurnaceRecipe irecipe = this.getCurrentRecipe();
                if (!this.isLit() && this.canBurn(irecipe)) {
                    this.cookingTotalTime = this.getTotalCookTime();
                    this.litTime = this.getBurnDuration(fuelStack ,irecipe);
                    this.litDuration = this.litTime;
                    if (this.isLit()) {
                        flag1 = true;
                        if (fuelStack.hasContainerItem()) {
                            this.handler.setStackInSlot(1, fuelStack.getContainerItem());
                        } else if (!fuelStack.isEmpty()) {
                            fuelStack .shrink(1);
                            if (fuelStack .isEmpty()) {
                                this.handler.setStackInSlot(1, fuelStack .getContainerItem());
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
                this.level.setBlock(this.worldPosition, this.level.getBlockState(this.worldPosition).setValue(EssenceFurnaceBlock.LIT, this.isLit()), 3);
            }
        }

        if (flag1) {
            this.setChanged();
        }

    }

    @Override
    public void load(BlockState state, CompoundNBT compound) {
        super.load(state, compound);
        if(compound.contains("tick")) {
            this.tick = compound.getInt("tick");
        }
        if (compound.contains("essence_furnace_slots")) {
            this.handler.deserializeNBT(compound.getCompound("essence_furnace_slots"));
        }
        this.litTime = compound.getInt("BurnTime");
        this.cookingProgress = compound.getInt("CookTime");
        this.cookingTotalTime = compound.getInt("CookTimeTotal");
    }

    @Override
    public CompoundNBT save(CompoundNBT compound) {
        compound.put("essence_furnace_slots", this.handler.serializeNBT());
        compound.putInt("tick", this.tick);
        compound.putInt("BurnTime", this.litTime);
        compound.putInt("CookTime", this.cookingProgress);
        compound.putInt("CookTimeTotal", this.cookingTotalTime);
        return super.save(compound);
    }

    protected boolean canBurn(@Nullable IRecipe<?> recipe) {
        if (!(recipe instanceof EssenceFurnaceRecipe) ||
                this.handler.getStackInSlot(0).isEmpty() ||
                this.handler.getStackInSlot(1).isEmpty()) {
            return false;
        }
        EssenceFurnaceRecipe furnaceRecipe = (EssenceFurnaceRecipe) recipe;
        ItemStack inputStack = this.handler.getStackInSlot(0).copy();
        ItemStack fuelStack = this.handler.getStackInSlot(1).copy();

        boolean inputValid = furnaceRecipe.getIngredients().get(0).test(inputStack);
        boolean fuelValid = furnaceRecipe.getFuel().test(fuelStack);
        if (!inputValid || !fuelValid) {
            return false;
        }
        ItemStack output = recipe.getResultItem();
        ItemStack currentOutput = this.handler.getStackInSlot(2).copy();
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
            ItemStack itemstack = this.handler.getStackInSlot(0);
            ItemStack itemstack2 = this.handler.getStackInSlot(2);
            ItemStack resultStack = furnaceRecipe.assemble(this);;

            if (resultStack.isEmpty()) {
                this.handler.setStackInSlot(2, ItemStack.EMPTY);
            }else {
                if (itemstack2.isEmpty()) {
                    this.handler.setStackInSlot(2, resultStack.copy());
                } else if (ItemStack.isSame(itemstack2, resultStack)) {
                    itemstack2.grow(resultStack.getCount());
                }
            }
            itemstack.shrink(1);
        }
    }

    @Nullable
    private EssenceFurnaceRecipe getCurrentRecipe() {
        return this.level.getRecipeManager()
                .getRecipeFor(this.recipeType, new RecipeWrapper(handler), level)
                .orElse(null);
    }

    protected int getBurnDuration(ItemStack itemStack,@Nullable IRecipe<?> recipe) {
        if(!itemStack.isEmpty() && recipe instanceof EssenceFurnaceRecipe && (((EssenceFurnaceRecipe) recipe).getFuel().test(itemStack)))
            return getFuelBurnTime();

        return 0;
    }

    protected int getFuelBurnTime() {
        return this.getCurrentRecipe().getCookingTime() <=0 ? 200 : this.getCurrentRecipe().getFuelTime();
    }

    protected int getTotalCookTime() {
        return this.getCurrentRecipe().getCookingTime() <=0 ? this.getFuelBurnTime() : this.getCurrentRecipe().getCookingTime();
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
        return this.handler.getSlots();
    }

    public boolean isEmpty() {
        for(int i = 0; i < handler.getSlots(); ++i) {
            if(!handler.getStackInSlot(i).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public ItemStack getItem(int slot) {
        return this.handler.getStackInSlot(slot);
    }

    public ItemStack removeItem(int slot, int amount) {
        return handler.extractItem(slot, amount, false);
    }

    public ItemStack removeItemNoUpdate(int slot) {
        ItemStack stack = handler.getStackInSlot(slot);
        handler.setStackInSlot(slot, ItemStack.EMPTY);
        return stack;
    }

    public void setItem(int p_70299_1_, ItemStack itemStack) {
        ItemStack itemstack = this.handler.getStackInSlot(p_70299_1_);
        boolean flag = !itemStack.isEmpty() && itemStack.sameItem(itemstack) && ItemStack.tagMatches(itemStack, itemstack);
        this.handler.setStackInSlot(p_70299_1_, itemStack);
        if (itemStack.getCount() > this.getMaxStackSize()) {
            itemStack.setCount(this.getMaxStackSize());
        }

        if (p_70299_1_ == 0 && !flag) {
            this.cookingTotalTime = this.getTotalCookTime();
            this.cookingProgress = 0;
            this.setChanged();
        }
    }

    public boolean stillValid(PlayerEntity player) {
        if (this.level.getBlockEntity(this.worldPosition) != this) {
            return false;
        } else {
            return player.distanceToSqr((double)this.worldPosition.getX() + 0.5, (double)this.worldPosition.getY() + 0.5, (double)this.worldPosition.getZ() + 0.5) <= 64.0;
        }
    }

    public void clearContent() {
        for(int i = 0; i < handler.getSlots(); ++i) {
            handler.setStackInSlot(i, ItemStack.EMPTY);
        }
    }

    @Override
    public ITextComponent getDisplayName() {
        return new TranslationTextComponent("block.pvz.essence_furnace");
    }

    @Override
    public Container createMenu(int id, PlayerInventory inv, PlayerEntity player) {
        return new EssenceFurnaceContainer(id, player, this.worldPosition);
    }

    @Override
    public void fillStackedContents(RecipeItemHelper helper) {
        for(int i=0; i<handler.getSlots(); i++){
            ItemStack stack = handler.getStackInSlot(i);
            if(!stack.isEmpty()){
                helper.accountStack(new ItemStack(stack.getItem(), stack.getCount()));
            }
        }
    }
}