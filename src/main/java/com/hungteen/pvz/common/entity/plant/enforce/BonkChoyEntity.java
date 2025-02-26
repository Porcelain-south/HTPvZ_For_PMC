package com.hungteen.pvz.common.entity.plant.enforce;

import com.hungteen.pvz.api.interfaces.IAlmanacEntry;
import com.hungteen.pvz.api.types.IPlantType;
import com.hungteen.pvz.common.entity.ai.goal.target.PVZNearestTargetGoal;
import com.hungteen.pvz.common.entity.plant.PVZPlantEntity;
import com.hungteen.pvz.common.entity.zombie.pool.BalloonZombieEntity;
import com.hungteen.pvz.common.impl.SkillTypes;
import com.hungteen.pvz.common.impl.plant.OtherPlants;
import com.hungteen.pvz.common.misc.PVZEntityDamageSource;
import com.hungteen.pvz.common.misc.sound.SoundRegister;
import com.hungteen.pvz.utils.EntityUtil;
import com.hungteen.pvz.utils.enums.PAZAlmanacs;
import com.mojang.datafixers.util.Pair;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

public class BonkChoyEntity extends PVZPlantEntity {

	protected static final float AttackRange = 3.5F;

	protected static final float SuperAttackRange = 5F;

	public BonkChoyEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
		super(type, worldIn);
	}
	
	@Override
	protected void registerGoals() {
		super.registerGoals();
		this.goalSelector.addGoal(0, new BonkChoyAttackGoal(this));
		this.targetSelector.addGoal(0, new PVZNearestTargetGoal(this, true, false, AttackRange, AttackRange));
	}
	
	@Override
	protected void normalPlantTick() {
		super.normalPlantTick();
		if(! level.isClientSide) {
			if(this.isPlantInSuperMode() && this.getSuperTime() % 5 == 0) {
				final float range = SuperAttackRange;
				EntityUtil.getTargetableEntities(this, EntityUtil.getEntityAABB(this, range, range)).forEach((target) -> {
					target.hurt(PVZEntityDamageSource.normal(this), this.getAttackDamage() * 2);
					EntityUtil.spawnParticle(target, 7);
					EntityUtil.playSound(this, SoundRegister.SWING.get());
				});
			}
		}
	}
	
	public void attackTarget(LivingEntity target) {
		EntityUtil.playSound(this, SoundRegister.SWING.get());
		EntityUtil.spawnParticle(target, 7);
		target.hurt(PVZEntityDamageSource.normal(this), this.getAttackDamage());
	}
	
	@Override
	public boolean canPAZTarget(Entity entity) {
		if(entity instanceof BalloonZombieEntity) {
			return true;
		}
		return super.canPAZTarget(entity);
	}

	@Override
	public void addAlmanacEntries(List<Pair<IAlmanacEntry, Number>> list) {
		super.addAlmanacEntries(list);
		list.addAll(Arrays.asList(
				Pair.of(PAZAlmanacs.ATTACK_DAMAGE, this.getAttackDamage()),
				Pair.of(PAZAlmanacs.ATTACK_CD, this.getAttackCD())
		));
	}

	@Override
	public float getLife() {
		return this.getSkillValue(SkillTypes.MORE_MORE_LIFE);
	}

	public int getAttackCD() {
		return 10;
	}
	
	public float getAttackDamage() {
		return this.getSkillValue(SkillTypes.MORE_SWING_DAMAGE);
	}
	
	@Override
	public int getSuperTimeLength() {
		return 80;
	}
	
	@Override
	public IPlantType getPlantType() {
		return OtherPlants.BONK_CHOY;
	}
	
	private final class BonkChoyAttackGoal extends Goal {
		
		private final BonkChoyEntity attacker;
		
		public BonkChoyAttackGoal(BonkChoyEntity attacker) {
			this.attacker = attacker;
			this.setFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
		}
		
		@Override
		public boolean canUse() {
			LivingEntity living = this.attacker.getTarget();
			if (! EntityUtil.isEntityValid(living)) return false;
			return this.attacker.canSee(living) && EntityUtil.getAttackRange(attacker, living, AttackRange) >= EntityUtil.getNearestDistance(this.attacker, living);
		}
		
		@Override
		public boolean canContinueToUse() {
			LivingEntity living = this.attacker.getTarget();
			if (! EntityUtil.isEntityValid(living)) return false;
			return this.attacker.canSee(living) && EntityUtil.getAttackRange(attacker, living, AttackRange) >= EntityUtil.getNearestDistance(this.attacker, living);
		}
		
		@Override
		public void stop() {
			this.attacker.setTarget(null);
			this.attacker.setAttackTime(0);
		}
		
		@Override
		public void tick() {
			LivingEntity target = this.attacker.getTarget();
			this.attacker.getLookControl().setLookAt(target, 30F, 30F);
			if(this.attacker.getAttackTime() == 0) {
				if(this.attacker.getAttackDamage() >= EntityUtil.getCurrentHealth(target)) {
					this.attacker.setAttackTime(1);
				} else {
					this.attacker.setAttackTime(- 1);
				}
			} else if(this.attacker.getAttackTime() > 0) {
				this.attacker.setAttackTime(this.attacker.getAttackTime() + 1);
				if(this.attacker.getAttackTime() == this.attacker.getAttackCD() * 4 / 5) {
				    this.attacker.attackTarget(target);
				} else if(this.attacker.getAttackTime() >= this.attacker.getAttackCD()) {
					this.attacker.setAttackTime(0);
				}
			} else {
				this.attacker.setAttackTime(this.attacker.getAttackTime() - 1);
				if(- this.attacker.getAttackTime() == this.attacker.getAttackCD() * 4 / 5) {
				    this.attacker.attackTarget(target);
				} else if(- this.attacker.getAttackTime() >= this.attacker.getAttackCD()) {
					this.attacker.setAttackTime(0);
				}
			}
		}
		
	}

}
