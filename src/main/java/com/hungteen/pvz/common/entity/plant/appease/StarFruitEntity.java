package com.hungteen.pvz.common.entity.plant.appease;

import com.hungteen.pvz.api.types.IPlantType;
import com.hungteen.pvz.common.entity.bullet.AbstractBulletEntity;
import com.hungteen.pvz.common.entity.bullet.StarEntity;
import com.hungteen.pvz.common.entity.plant.base.PlantShooterEntity;
import com.hungteen.pvz.common.impl.SkillTypes;
import com.hungteen.pvz.common.impl.plant.PVZPlants;
import com.hungteen.pvz.common.misc.sound.SoundRegister;
import com.hungteen.pvz.utils.EntityUtil;
import net.minecraft.command.arguments.EntityAnchorArgument.Type;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntitySize;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Pose;
import net.minecraft.world.World;

public class StarFruitEntity extends PlantShooterEntity {

	public static final float PER_ANGLE = 360F / 5;
	private static final float SHOOT_HEIGHT = 0.2F;
	public int lightTick = 0;
	private boolean afterSuperRemove = false;
	
	public StarFruitEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
		super(type, worldIn);
		if(!level.isClientSide) {
			//检测附近20格内是否有另外4个星星果
			int cnt = 1;
			final int range = 20;
			for(StarFruitEntity starfruit : level.getEntitiesOfClass(StarFruitEntity.class, EntityUtil.getEntityAABB(this, range, range), starfruit -> {
				return this.canSuperTogether(starfruit);
			})) {
				if(starfruit.canStartSuperMode()) {
					++ cnt;
				}
			}
			if(cnt >= 5) {
				for(StarFruitEntity starfruit : level.getEntitiesOfClass(StarFruitEntity.class, EntityUtil.getEntityAABB(this, range, range), starfruit -> {
					return this.canSuperTogether(starfruit);
				})) {
					if(starfruit.canStartSuperMode()) {
						starfruit.startSuperAndRemove(false);
					}
				}
				startSuperAndRemove(false);
			}
		}
	}

	public void startSuperAndRemove(boolean first) {
		startSuperMode(first);
		afterSuperRemove = true;
	}

	/**
	 * {@link #startSuperAndRemove(boolean)}
	 */
	protected boolean canSuperTogether(StarFruitEntity entity) {
		if(EntityUtil.canTargetEntity(this, entity) || entity.getPlantType() != this.getPlantType()) {
			return false;
		}
		return this.getOwnerUUID().isPresent() && entity.getOwnerUUID().isPresent() && entity.getOwnerUUID().get().equals(this.getOwnerUUID().get());
	}
	
	@Override
	public void normalPlantTick() {
		if(level.isClientSide) {
			if(this.lightTick > 0) {
				-- this.lightTick;
			}
			if(this.getAttackTime() > 0) {
			    this.lightTick = 8;
			}
		}
		//激发后移除
		if(!level.isClientSide) {
			if(afterSuperRemove&&!this.isPlantInSuperMode())
			{
				this.remove();
			}
		}
		super.normalPlantTick();
	}
	
	@Override
	protected boolean canAttackNow() {
		return this.getAttackTime() == 2;
	}
	
	@Override
	public int getSuperTimeLength() {
		return 100;
	}

	@Override
	public void shootBullet() {
		float now = this.yRot + 180F;
		for(int i = 0; i < 5; ++ i) {
			this.shootByAngle(now, SHOOT_HEIGHT);
			now += PER_ANGLE;
		}
		EntityUtil.playSound(this, SoundRegister.SNOW_SHOOT.get());
	}
	
	@Override
	protected AbstractBulletEntity createBullet() {
		final StarEntity.StarTypes type = this.isPlantInSuperMode() ? StarEntity.StarTypes.HUGE : StarEntity.StarTypes.NORMAL;
		return new StarEntity(level, this, type, StarEntity.StarStates.YELLOW);
	}
	
	@Override
	public float getAttackDamage() {
		return this.getSkillValue(SkillTypes.MORE_STAR_DAMAGE);
	}
	
	@Override
	public EntitySize getDimensions(Pose poseIn) {
		return EntitySize.scalable(0.9F, 0.5F);
	}
	
	@Override
	public double getMaxShootAngle() {
		return 90;
	}

	@Override
	public void startShootAttack() {
		this.updateFacing();
		this.setAttackTime(2);
	}
	
	private void updateFacing() {
		float now = this.getRandom().nextFloat() * 3.14159F * 2F;
		double dx = Math.sin(now);
		double dz = Math.cos(now);
		double dy = 0;
		this.lookAt(Type.FEET, this.position().add(dx, dy, dz));
	}
	
	@Override
	public IPlantType getPlantType() {
		return PVZPlants.STAR_FRUIT;
	}
	
}
