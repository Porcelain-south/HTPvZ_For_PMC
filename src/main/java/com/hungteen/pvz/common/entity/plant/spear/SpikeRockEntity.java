package com.hungteen.pvz.common.entity.plant.spear;

import com.hungteen.pvz.api.types.IPlantType;
import com.hungteen.pvz.common.impl.SkillTypes;
import com.hungteen.pvz.common.impl.plant.PVZPlants;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class SpikeRockEntity extends SpikeWeedEntity {

    public SpikeRockEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
		super(type, worldIn);
//		this.setSpikeNum(this.getSpikesCount());
	}

	@Override
	public void onSpawnedByPlayer(@Nullable PlayerEntity player, int sunCost) {
		super.onSpawnedByPlayer(player, sunCost);
//		this.getPlantInfo().ifPresent(info -> {
//			info.setSunCost(sunCost);
//		});
		this.setSpikeNum(this.getSpikesCount());
	}

	@Override
	public int getSpikesCount() {
		return (int) this.getSkillValue(SkillTypes.MORE_SPIKE);
//		return 2;
	}

	@Override
	public int getAttackCD() {
		return 20;
	}

	@Override
	public IPlantType getPlantType() {
		return PVZPlants.SPIKE_ROCK;
	}

	@Override
	public float getAttackDamage(){
		return this.getSkillValue(SkillTypes.SPIKE_DAMAGE)*2;
	}
	
}
