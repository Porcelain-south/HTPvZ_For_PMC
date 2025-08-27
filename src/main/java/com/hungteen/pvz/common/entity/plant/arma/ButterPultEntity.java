package com.hungteen.pvz.common.entity.plant.arma;

import com.hungteen.pvz.api.types.IPlantType;
import com.hungteen.pvz.common.entity.bullet.ButterEntity;
import com.hungteen.pvz.common.entity.bullet.PultBulletEntity;
import com.hungteen.pvz.common.impl.SkillTypes;
import com.hungteen.pvz.common.impl.plant.CustomPlants;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

public class ButterPultEntity extends KernelPultEntity {

	public ButterPultEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
		super(type, worldIn);
		this.setCurrentBullet(CornTypes.BUTTER);
	}
	
	@Override
	protected PultBulletEntity createBullet() {
		return new ButterEntity(level, this);
	}
	
	@Override
	protected void changeBullet() {
		this.setCurrentBullet(CornTypes.BUTTER);
	}

	@Override
	public float getSuperDamage() {
		return 3 * this.getAttackDamage();
	};

	@Override
	public float getAttackDamage() {
		return this.getSkillValue(SkillTypes.MORE_BUTTER_DAMAGE);
	}
	
	@Override
	public int getButterDuration() {
		return 200;
	}
	
	@Override
	public IPlantType getPlantType() {
		return CustomPlants.BUTTER_PULT;
	}

	@Override
	public int getPultCD() {
		return 120;
	}
}
