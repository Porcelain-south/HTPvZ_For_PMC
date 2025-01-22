package com.hungteen.pvz.common.entity.plant.defence;

import com.hungteen.pvz.api.types.IPlantType;
import com.hungteen.pvz.common.entity.plant.base.PlantDefenderEntity;
import com.hungteen.pvz.common.impl.SkillTypes;
import com.hungteen.pvz.common.impl.plant.CustomPlants;
import com.hungteen.pvz.common.misc.PVZEntityDamageSource;
import com.hungteen.pvz.utils.EntityUtil;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.SwimGoal;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class WaterGuardEntity extends PlantDefenderEntity{

	public WaterGuardEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
		super(type, worldIn);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(2, new SwimGoal(this));
	}
	@Override
	public boolean hurt(DamageSource source, float amount) {
		if(source instanceof PVZEntityDamageSource && ((PVZEntityDamageSource) source).isEatDamage() && source.getEntity() instanceof MobEntity) {
			giveDamageToZombie((int) getDamage());
		}

		return super.hurt(source, Math.max(1,amount - this.getSkillValue(SkillTypes.MORE_DEFENSE)));
	}
	@Override
	public void tick() {
		if(EntityUtil.isEntityValid(this) && !this.level.isClientSide()&&this.tickCount%40==0) {
			giveDamageToZombie((int) 2);
		}
		super.tick();
	}
	@Override
	public float getLife() {
		return this.getSkillValue(SkillTypes.MORE_GUARD_LIFE);
	}
	private void giveDamageToZombie(int damage) {
		EntityUtil.getTargetableLivings(this, EntityUtil.getEntityAABB(this, 2, 2)).forEach((entity) -> {

			if (EntityUtil.isEntityValid(entity))entity.hurt(PVZEntityDamageSource.mobAttack(this), damage);

		});
	}
	@Override
	public float getSuperLife() {
		return 300;
	}
	
	@Override
	public int getSuperTimeLength() {
		return 20;
	}

	public float getDamage() {
		return this.getSkillValue(SkillTypes.GUARD_DAMAGE);
	}
	
	@Override
	public EntitySize getDimensions(Pose poseIn) {
		return new EntitySize(0.8f, 0.8f, false);
	}

	@Override
	public IPlantType getPlantType() {
		return CustomPlants.WATER_GUARD;
	}

}
