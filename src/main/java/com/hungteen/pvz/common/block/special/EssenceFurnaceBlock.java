package com.hungteen.pvz.common.block.special;


import com.hungteen.pvz.common.tileentity.EssenceFurnaceTileEntity;
import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;

public class EssenceFurnaceBlock extends AbstractFurnaceBlock {

    public EssenceFurnaceBlock() {
        super(Block.Properties.copy(Blocks.FURNACE));
    }

    @Override
    protected void openContainer(World world, BlockPos blockPos, PlayerEntity playerEntity) {
        TileEntity te = world.getBlockEntity(blockPos);
        if (te instanceof INamedContainerProvider) {
            NetworkHooks.openGui((ServerPlayerEntity) playerEntity, (INamedContainerProvider) te, blockPos);
        }
    }

    @Nullable
    @Override
    public TileEntity newBlockEntity(IBlockReader iBlockReader) {
        return new EssenceFurnaceTileEntity();
    }
}