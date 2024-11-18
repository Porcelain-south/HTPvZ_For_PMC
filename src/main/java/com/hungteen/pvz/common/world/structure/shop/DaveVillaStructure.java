package com.hungteen.pvz.common.world.structure.shop;

import com.hungteen.pvz.common.world.structure.PVZStructureBase;
import com.hungteen.pvz.utils.ConfigUtil;
import com.mojang.serialization.Codec;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.registry.DynamicRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class DaveVillaStructure extends PVZStructureBase<NoFeatureConfig> {
	
	public DaveVillaStructure(Codec<NoFeatureConfig> p_i231997_1_) {
		super(p_i231997_1_);
	}

	@Override
	public String getPVZStructureName() {
		return "dave_villa";
	}

	@Override
	public IStartFactory<NoFeatureConfig> getStartFactory() {
		return Start::new;
	}
	
	public static class Start extends StructureStart<NoFeatureConfig> {

		public Start(Structure<NoFeatureConfig> structure, int chunkPosX, int chunkPosZ, MutableBoundingBox bounds, int references, long seed) {
            super(structure, chunkPosX, chunkPosZ, bounds, references, seed);
        }
		
		@Override
		public void generatePieces(DynamicRegistries p_230364_1_, ChunkGenerator generator, TemplateManager templateManagerIn, int chunkX, int chunkZ,
				Biome biomeIn, NoFeatureConfig p_230364_7_) {
			Rotation rotation = Rotation.values()[this.random.nextInt(Rotation.values().length)];
			final int len = 50;
			int x = (chunkX << 4);
	        int z = (chunkZ << 4);
	        int dx = 0, dz = 0;
			switch(rotation) {
				case CLOCKWISE_90:{
					dx -= 2 * len;
					dz += len;
					break;
				}
				case CLOCKWISE_180:{
					dx -= len;
					dz -= 2 * len;
					break;
				}
				case COUNTERCLOCKWISE_90:{
					dx += 2 * len;
					dz -= len;
					break;
				}
				default:{
					dx += len;
					dz += 2 * len;
					break;
				}
			}

			int[] h = new int[9];
			for(int i = 0; i < 3; i++)
			{
				for(int j = 0; j < 3; j++)
				{
					h[3*i + j] = generator.getFirstOccupiedHeight(x + i*dx/2, z + j*dz/2, Heightmap.Type.WORLD_SURFACE_WG);
				}
			}
			int avgh = 0;
			int maxh = h[0];
			for(int i = 0; i < 9; i++)
			{
				avgh += h[i];
				maxh = Math.max(maxh, h[i]);
			}
			avgh /= 9;


			if(ConfigUtil.StrictVilla())
			{
				for(int i = 0; i < 9; i++)
				{
					if(Math.abs(h[i] - avgh) > 4)
						return;
				}
				avgh = Math.min(avgh + 2, maxh);
			}
			BlockPos blockpos = new BlockPos(x, avgh, z);
			DaveVillaComponents.generate(templateManagerIn, blockpos, rotation, this.pieces, this.random);
			this.calculateBoundingBox();
		}
	}

}
