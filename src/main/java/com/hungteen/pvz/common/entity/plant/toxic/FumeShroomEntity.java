package com.hungteen.pvz.common.entity.plant.toxic;

import com.hungteen.pvz.api.types.IPlantType;
import com.hungteen.pvz.common.entity.bullet.AbstractBulletEntity;
import com.hungteen.pvz.common.entity.bullet.FumeEntity;
import com.hungteen.pvz.common.entity.plant.base.PlantShooterEntity;
import com.hungteen.pvz.common.impl.SkillTypes;
import com.hungteen.pvz.common.impl.plant.PVZPlants;
import com.hungteen.pvz.common.misc.sound.SoundRegister;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class FumeShroomEntity extends PlantShooterEntity {

	protected static final double SHOOT_OFFSET = 0.2D;
	
	public FumeShroomEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
		super(type, worldIn);
	}
	
	@Override
	public void shootBullet() {
		if(this.isPlantInSuperMode()) {
			this.performShoot(SHOOT_OFFSET, 0, 0, this.getExistTick() % 5 == 0, FORWARD_SHOOT_ANGLE);
		} else {
			this.performShoot(SHOOT_OFFSET, 0, 0, this.getAttackTime() == 1, FORWARD_SHOOT_ANGLE);
		}
	}
	
	@Override
	protected AbstractBulletEntity createBullet() {
		return new FumeEntity(this.level, this);
	}
	
	@Override
	protected SoundEvent getShootSound() {
		return SoundRegister.FUME.get();
	}

	@Override
	public void startShootAttack() {
		this.setAttackTime(1);
	}
	
	@Override
	public int getSuperTimeLength() {
		return 60;
	}
	
	@Override
	public EntitySize getDimensions(Pose poseIn) {
		return EntitySize.scalable(0.8f, 1.25f);
	}
	
    @Override
	public float getShootRange() {
		return 20;
	}

    @Override
	public IPlantType getPlantType() {
		return PVZPlants.FUME_SHROOM;
	}

	@Override
	public float getAttackDamage() {
		return this.getSkillValue(SkillTypes.FUME_DAMAGE);
	}
	
}
