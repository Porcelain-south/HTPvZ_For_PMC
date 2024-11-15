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
	        int h1 = generator.getFirstOccupiedHeight(x, z, Heightmap.Type.WORLD_SURFACE_WG);
			boolean isPlains1 = generator.getBiomeSource().getNoiseBiome(chunkX,h1,chunkZ).getBiomeCategory() == Biome.Category.PLAINS;

	        int h2 = generator.getFirstOccupiedHeight(x, z + dz, Heightmap.Type.WORLD_SURFACE_WG);
			boolean isPlains2 = generator.getBiomeSource().getNoiseBiome(chunkX,h2,chunkZ + dz/16).getBiomeCategory() == Biome.Category.PLAINS;

	        int h3 = generator.getFirstOccupiedHeight(x + dx, z, Heightmap.Type.WORLD_SURFACE_WG);
			boolean isPlains3 = generator.getBiomeSource().getNoiseBiome(chunkX + dx/16,h3,chunkZ).getBiomeCategory() == Biome.Category.PLAINS;

	        int h4 = generator.getFirstOccupiedHeight(x + dx, z + dz, Heightmap.Type.WORLD_SURFACE_WG);
			boolean isPlains4 = generator.getBiomeSource().getNoiseBiome(chunkX + dx/16,h4,chunkZ + dz/16).getBiomeCategory() == Biome.Category.PLAINS;

	        int h = (h1 + h2 + h3 + h4) / 4;
			if(ConfigUtil.StrictVilla())
			{
				if (!isPlains1 || !isPlains2 || !isPlains3 || !isPlains4)
					return;
				if (Math.abs(h - h1) > 5 ||Math.abs(h - h2) > 5 ||Math.abs(h - h2) > 5 ||Math.abs(h - h4) > 5)
					return;
			}
			BlockPos blockpos = new BlockPos(x, h, z);
			DaveVillaComponents.generate(templateManagerIn, blockpos, rotation, this.pieces, this.random);
			this.calculateBoundingBox();
		}
	}

}
