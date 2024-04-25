package com.hungteen.pvz.common.entity.plant.ice;

import com.hungteen.pvz.api.interfaces.IAlmanacEntry;
import com.hungteen.pvz.api.interfaces.IIceEffect;
import com.hungteen.pvz.api.types.IPlantType;
import com.hungteen.pvz.common.entity.bullet.MelonEntity.MelonStates;
import com.hungteen.pvz.common.entity.plant.arma.MelonPultEntity;
import com.hungteen.pvz.common.impl.SkillTypes;
import com.hungteen.pvz.common.impl.plant.PVZPlants;
import com.hungteen.pvz.common.potion.EffectRegister;

import com.hungteen.pvz.utils.enums.PAZAlmanacs;
import com.mojang.datafixers.util.Pair;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class WinterMelonEntity extends MelonPultEntity implements IIceEffect {

	public WinterMelonEntity(EntityType<? extends CreatureEntity> type, World worldIn) {
		super(type, worldIn);
	}

	public int getColdLvl() {
		return 2;
	}
	
	public int getColdTick() {
		return 80;
	}
	
	@Override
	public Optional<EffectInstance> getColdEffect() {
		return Optional.ofNullable(new EffectInstance(EffectRegister.COLD_EFFECT.get(), this.getColdTick(), this.getColdLvl(), false, false));
	}

	public float getAttackDamage() {
		return this.getSkillValue(SkillTypes.MORE_WINTER_MELON_DAMAGE);
	}

	@Override
	public void addAlmanacEntries(List<Pair<IAlmanacEntry, Number>> list) {
		super.addAlmanacEntries(list);
		list.addAll(Arrays.asList(
				Pair.of(PAZAlmanacs.COLD_LEVEL, this.getColdLvl()+1),
				Pair.of(PAZAlmanacs.COLD_TIME, this.getColdTick())
		));
	}

	@Override
	public Optional<EffectInstance> getFrozenEffect() {
		return Optional.empty();
	}
	
	@Override
	protected MelonStates getThrowMelonState() {
		return MelonStates.ICE;
	}
	
	@Override
	public IPlantType getPlantType() {
		return PVZPlants.WINTER_MELON;
	}

}
