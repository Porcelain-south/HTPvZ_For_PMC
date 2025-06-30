package com.hungteen.pvz.common.block.plants;

import com.hungteen.pvz.common.item.ItemRegister;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class PeaBlock extends CropsBlock{
	//public static final IntegerProperty AGE = BlockStateProperties.AGE_3;

	private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
    		Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), 
    		Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), 
    		Block.box(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), 
    		Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), 
	};

	public PeaBlock(Properties properties) {
		super(properties);
	}

	//public IntegerProperty getAgeProperty() {
	//	return BlockStateProperties.AGE_3;
	//}

	public int getMaxAge() {
		return 3;
	}

    @Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		int age = state.getValue(this.getAgeProperty());
		if (age < 0 || age >= SHAPE_BY_AGE.length) return SHAPE_BY_AGE[0];
		return SHAPE_BY_AGE[age];
	}

	@SuppressWarnings("deprecation")
//	@Override
//	public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
//			Hand handIn, BlockRayTraceResult hit) {
//		if(! worldIn.isClientSide) {
//			if(this.isMaxAge(state)) {
//				worldIn.addFreshEntity(new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemRegister.PEA.get(), 2)));
//				worldIn.setBlockAndUpdate(pos, this.getStateForAge(0));
//				return ActionResultType.SUCCESS;
//			}
//		}
//		return super.use(state, worldIn, pos, player, handIn, hit);
//	}
	
	@Override
	protected IItemProvider getBaseSeedId() {
		return ItemRegister.PEA.get();
	}
}
