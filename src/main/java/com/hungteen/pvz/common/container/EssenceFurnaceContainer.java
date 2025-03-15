package com.hungteen.pvz.common.container;

import com.hungteen.pvz.common.tileentity.EssenceFurnaceTileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.container.FurnaceResultSlot;
import net.minecraft.inventory.container.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIntArray;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class EssenceFurnaceContainer extends PVZContainer {
    public final EssenceFurnaceTileEntity te;
    private final IInventory container;
    private final IIntArray data;
    protected final World level;

    public EssenceFurnaceContainer(int id, PlayerEntity player, BlockPos worldPos) {
        super(ContainerRegister.ESSENCE_FURNACE.get(), id);
        this.te = (EssenceFurnaceTileEntity) player.level.getBlockEntity(worldPos);
        if (te == null) {
            throw new IllegalStateException("No EssenceFurnaceTileEntity found at position " + worldPos);
        }
        checkContainerSize(this.te, 3);
        checkContainerDataCount(te.dataAccess, 4);
        this.container = te;
        this.data = te.dataAccess;
        this.level = player.level;
        this.addSlot(new Slot(this.te, 0, 56, 17));
        this.addSlot(new Slot(this.te, 1, 56, 53));
        this.addSlot(new FurnaceResultSlot(player, this.te, 2, 116, 35){
            @Override
            public boolean mayPlace(ItemStack itemStack) {
                return false;
            }

        });

        int k;

        for (k = 0; k < 3; ++k) {
            for (int j = 0; j < 9; ++j) {
                this.addSlot(new Slot(player.inventory, j + k * 9 + 9, 8 + j * 18, 84 + k * 18));
            }
        }
        for(k = 0; k < 9; ++k) {
            this.addSlot(new Slot(player.inventory, k, 8 + k * 18, 142));
        }

        this.addDataSlots(this.data);
    }

    @OnlyIn(Dist.CLIENT)
    public int getSize() {
        return 3;
    }

    @Override
    public boolean stillValid(PlayerEntity player) {
        return this.container.stillValid(player);
    }

    @Override
    public ItemStack quickMoveStack(PlayerEntity player, int slotId) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(slotId);
        if (slot.hasItem()) {
            ItemStack itemstack1 = slot.getItem();
            itemstack = itemstack1.copy();
            if (slotId == 2) {
                if (!this.moveItemStackTo(itemstack1, 3, 39, true)) {
                    return ItemStack.EMPTY;
                }
                slot.onQuickCraft(itemstack1, itemstack);
            } else if (slotId >= 3 && slotId < 39) {
                if (!this.moveItemStackTo(itemstack1, 0, 2, false)) {
                    if (slotId < 30) {
                        if (!this.moveItemStackTo(itemstack1, 30, 39, false)) {
                            return ItemStack.EMPTY;
                        }
                    } else if (!this.moveItemStackTo(itemstack1, 3, 30, false)) {
                        return ItemStack.EMPTY;
                    }
                }
            } else if (!this.moveItemStackTo(itemstack1, 3, 39, false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }

            if (itemstack1.getCount() == itemstack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot.onTake(player, itemstack1);
        }

        return itemstack;
    }

    @OnlyIn(Dist.CLIENT)
    public int getBurnProgress() {
        int i = this.data.get(2);
        int j = this.data.get(3);
        return j != 0 && i != 0 ? i * 24 / j : 0;
    }

    @OnlyIn(Dist.CLIENT)
    public int getLitProgress() {
        int i = this.data.get(1);
        if (i == 0) {
            i = 200;
        }

        return this.data.get(0) * 13 / i;
    }

    @OnlyIn(Dist.CLIENT)
    public boolean isLit() {
        return this.data.get(0) > 0;
    }

}
