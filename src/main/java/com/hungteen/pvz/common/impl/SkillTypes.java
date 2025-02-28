package com.hungteen.pvz.common.impl;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.api.PVZAPI;
import com.hungteen.pvz.api.types.ISkillType;
import com.hungteen.pvz.utils.ArrayUtil;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.*;

public class SkillTypes {

    private static final Map<String, ISkillType> SKILL_MAP = new HashMap<>();
    public static final String SKILL_TAG = "paz_skill_tag";
    public static final int COOL_DOWN_LEVEL = 3;

    /*
    Skills for both plants and zombies.
     */
    public static final ISkillType FAST_CD = new SkillType("fast_cd",
            ArrayUtil.getAverageArray(COOL_DOWN_LEVEL + 1, 0F, 3F),
            Arrays.asList(3, 4, 5)
    );

    public static final ISkillType LESS_SUN = new SkillType("less_sun",
            ArrayUtil.getAverageArray(3, 0F, 50F),
            Arrays.asList(2, 3)
    );

    /*
    Skills of plants.
     */

    //peashooter.
    public static final ISkillType PLANT_MORE_LIFE = new SkillType("plant_more_life",
            ArrayUtil.getAverageArray(4, 20F, 50F),
            Arrays.asList(2, 3, 4)
    );

    //peashooter.
    public static final ISkillType PEA_DAMAGE = new SkillType("pea_damage",
            ArrayUtil.getAverageArray(5, 3F, 5F),
            Arrays.asList(2, 2, 3, 3)
    );

    //cherry bomb.
    public static final ISkillType NORMAL_BOMB_DAMAGE = new SkillType("normal_bomb_damage",
            ArrayUtil.getAverageArray(4, 150F, 450F),
            Arrays.asList(1, 3, 5)
    );

    //potato mine bomb.
    public static final ISkillType POTATO_BOMB_DAMAGE = new SkillType("potato_bomb_damage",
            ArrayUtil.getAverageArray(4, 130F, 190F),
            Arrays.asList(1, 2, 3)
    );

    //wall nut.
    public static final ISkillType NUT_MORE_LIFE = new SkillType("nut_more_life",
            ArrayUtil.getAverageArray(6, 250F, 500F),
            Arrays.asList(1, 1, 2, 3, 3)
    );

    //tall wall nut.
    public static final ISkillType TALL_NUT_MORE_LIFE = new SkillType("tall_nut_more_life",
            ArrayUtil.getAverageArray(6, 325F, 700F),
            Arrays.asList(2, 2, 3, 3, 5)
    );

    //potato mine.
    public static final ISkillType MINE_FAST_PREPARE = new SkillType("mine_fast_prepare",
            ArrayUtil.getAverageArray(5, 240F, 40F),
            Arrays.asList(2, 2, 3, 4)
    );

    //chomper and TangleKelp.
    public static final ISkillType NORMAL_ENHANCE_STRENGTH = new SkillType("normal_enhance_strength",
            ArrayUtil.getAverageArray(5, 140F, 300F),
            Arrays.asList(1, 2, 2, 3)
    );

    //squash.
    public static final ISkillType SQUASH_ENHANCE_STRENGTH = new SkillType("squash_enhance_strength",
            ArrayUtil.getAverageArray(5, 100F, 300F),
            Arrays.asList(1, 2, 2, 3)
    );

    //puff shroom.
    public static final ISkillType PUFF_DAMAGE = new SkillType("spore_damage",
            ArrayUtil.getAverageArray(5, 2F, 6F),
            Arrays.asList(2, 2, 3, 3)
    );

    //fume shroom.
    public static final ISkillType FUME_DAMAGE = new SkillType("spore_damage",
            ArrayUtil.getAverageArray(3, 2F, 3F),
            Arrays.asList(3, 5)
    );

    //gloom shroom.
    public static final ISkillType Gloom_DAMAGE = new SkillType("spore_damage",
            ArrayUtil.getAverageArray(6, 2.5F, 5F),
            Arrays.asList(2, 2, 3, 3, 5)
    );

    //doom shroom.
    public static final ISkillType HIGH_EXPLODE_DAMAGE = new SkillType("high_explode_damage",
            ArrayUtil.getAverageArray(4, 200F, 800F),
            Arrays.asList(2, 3, 5)
    );

    //squash.
    public static final ISkillType SQUASH_AGAIN = new SkillType("squash_again",
            ArrayUtil.getAverageArray(4, 0F, 0.6F),
            Arrays.asList(2, 3, 5)
    );

    //spike weed
    public static final ISkillType SPIKE_DAMAGE = new SkillType("spike_damage",
            ArrayUtil.getAverageArray(6, 4F, 6.5F),
            Arrays.asList(2, 2, 3, 3, 5)
    );

    //spike rock
    public static final ISkillType MORE_SPIKE = new SkillType("more_spike",
            ArrayUtil.getAverageArray(4, 6F, 12F),
            Arrays.asList(2, 3, 3)
    );

    //torch wood
    public static final ISkillType HEAT_PEA_RANGE = new SkillType("heat_pea_range",
            ArrayUtil.getAverageArray(4, 1.5F, 4.5F),
            Arrays.asList(2, 4, 6)
    );


    public static final ISkillType MORE_MORE_LIFE = new SkillType("more_more_life",
            ArrayUtil.getAverageArray(6, 60F, 160F),
            Arrays.asList(2, 2, 3, 3, 5)
    );

    //plantern
    public static final ISkillType MORE_LIGHT_RANGE = new SkillType("more_light_range",
            ArrayUtil.getAverageArray(3, 20F, 40F),
            Arrays.asList(3, 4)
    );

    //plantern
    public static final ISkillType NIGHT_VISION = new SkillType("night_vision",
            ArrayUtil.getAverageArray(3, 0F, 1200F),
            Arrays.asList(2, 4)
    );

    //cactus
    public static final ISkillType MORE_THORN_DAMAGE = new SkillType("more_thorn_damage",
            ArrayUtil.getAverageArray(6, 5F, 10F),
            Arrays.asList(2, 2, 3, 3, 5)
    );

    //blover.
    public static final ISkillType BLOW_STRENGTH = new SkillType("blow_strength",
            ArrayUtil.getAverageArray(5, 46F, 286F),
            Arrays.asList(2, 3, 3, 5)
    );

    //split pea.
    public static final ISkillType SPLIT_DOUBLE_CHANCE = new SkillType("split_double_chance",
            ArrayUtil.getAverageArray(5, 0.2F, 1.0F),
            Arrays.asList(2, 2, 3, 3)
    );

    //star fruit.
    public static final ISkillType MORE_STAR_DAMAGE = new SkillType("more_star_damage",
            ArrayUtil.getAverageArray(5, 6F, 10F),
            Arrays.asList(2, 2, 3, 3)
    );

    //magnet shroom.
    public static final ISkillType LESS_WORK_CD = new SkillType("less_work_cd",
            ArrayUtil.getAverageArray(4, 600F, 300F),
            Arrays.asList(2, 3, 5)
    );

    //cabbage pult
    public static final ISkillType MORE_CABBAGE_DAMAGE = new SkillType("more_cabbage_damage",
            ArrayUtil.getAverageArray(5, 12F, 20F),
            Arrays.asList(2, 2, 3, 3)
    );

    //kernel pult
    public static final ISkillType MORE_KERNEL_DAMAGE = new SkillType("more_kernel_damage",
            ArrayUtil.getAverageArray(4, 4F, 10F),
            Arrays.asList(2, 3, 3)
    );

    //melon pult
    public static final ISkillType MORE_MELON_DAMAGE = new SkillType("more_melon_damage",
            ArrayUtil.getAverageArray(7, 12F, 30F),
            Arrays.asList(2, 4, 6, 9, 12, 16)
    );

    //winter melon pult
    public static final ISkillType MORE_WINTER_MELON_DAMAGE = new SkillType("more_winter_melon_damage",
            ArrayUtil.getAverageArray(5, 24F, 36F),
            Arrays.asList(2, 3, 3, 5)
    );

    //bonk choy
    public static final ISkillType MORE_SWING_DAMAGE = new SkillType("more_swing_damage",
            ArrayUtil.getAverageArray(6, 5F, 15F),
            Arrays.asList(1, 2, 2, 3, 3)
    );

    //gold leaf
    public static final ISkillType ADVANCE_GOLD = new SkillType("advance_gold",
            ArrayUtil.getAverageArray(3, 1F, 3F),
            Arrays.asList(4, 8)
    );

    //angle star fruit
    public static final ISkillType TEN_STARS = new SkillType("ten_stars",
            ArrayUtil.getAverageArray(5, 0.2F, 1.0F),
            Arrays.asList(1, 2, 2, 3)
    );

    //bamboo lord
    public static final ISkillType SMALL_BOMB_DAMAGE = new SkillType("small_bomb_damage",
            ArrayUtil.getAverageArray(5, 80F, 400F),
            Arrays.asList(2, 2, 3, 5)
    );

    //CobCannon
    public static final ISkillType CANNON_FAST_PREPARE = new SkillType("cannon_fast_prepare",
            ArrayUtil.getAverageArray(6, 1800F, 600F),
            Arrays.asList(1, 2, 2, 3, 5)
    );

    //garlic
    public static final ISkillType MORE_GARLIC_LIFE = new SkillType("more_garlic_life",
            ArrayUtil.getAverageArray(4, 100F, 250F),
            Arrays.asList(2, 3, 5)
    );

    public static final ISkillType GARLIC_POTION_RANGE = new SkillType("garlic_potion_range",
            ArrayUtil.getAverageArray(3, 3.5F, 7.5F),
            Arrays.asList(3,5)
    );

    public static final ISkillType SUPER_GARLIC = new SkillType("super_garlic",
            ArrayUtil.getAverageArray(2, 0F, 1F),
            Arrays.asList(5)
    );

    //water guard
    public static final ISkillType MORE_GUARD_LIFE = new SkillType("more_guard_life",
            ArrayUtil.getAverageArray(6, 150F, 400F),
            Arrays.asList(2, 3, 4, 4, 5)
    );

    public static final ISkillType MORE_DEFENSE = new SkillType("more_defense",
            ArrayUtil.getAverageArray(6, 0F, 5F),
            Arrays.asList(3, 4, 4, 5, 6)
    );

    public static final ISkillType GUARD_DAMAGE = new SkillType("guard_damage",
            ArrayUtil.getAverageArray(4, 2.5F, 4F),
            Arrays.asList(2, 3, 5)
    );

    //butter pult
    public static final ISkillType MORE_BUTTER_DAMAGE = new SkillType("more_butter_damage",
            ArrayUtil.getAverageArray(5, 2F, 10F),
            Arrays.asList(1, 2, 2, 3)
    );
//    public static final ISkillType BIG_PEA = new SkillType("big_pea", "pvz:special_pea",
//            ArrayUtil.getAverageArray(6, 0F, 0.04F),
//            Arrays.asList(20, 30, 50, 75, 100)
//    );
//
//    public static final ISkillType KB_PEA = new SkillType("kb_pea", "pvz:special_pea",
//            ArrayUtil.getAverageArray(6, 0F, 0.1F),
//            Arrays.asList(20, 30, 50, 75, 100)
//    );

    /*
    Skills of zombies.
     */

    //normal zombie.
    public static final ISkillType ZOMBIE_FAST_MOVE = new SkillType("zombie_fast_move",
            ArrayUtil.getAverageArray(5, 1F, 1.4F),
            Arrays.asList(2, 5, 12, 30)//50
    );

    //normal zombie.
    public static final ISkillType HIGH_EAT_DAMAGE = new SkillType("high_eat_damage",
            ArrayUtil.getAverageArray(7, 0F, 6F),
            Arrays.asList(20, 20, 20, 50, 50, 70)//60 160 230
    );

    //normal zombie.
    public static final ISkillType TOUGH_BODY = new SkillType("tough_body",
            ArrayUtil.getAverageArray(6, 0F, 20F),
            Arrays.asList(2, 5, 12, 30, 80)//50 130
    );

    public static void registerSkillType(ISkillType type){
        SKILL_MAP.put(type.getIdentity(), type);
    }

    public static int getSkillLevel(CompoundNBT nbt, ISkillType type){
        if(nbt.contains(type.getIdentity())){
            return nbt.getInt(type.getIdentity());
        }
        return 0;
    }
    
    public static int getSkillLevel(ItemStack stack, ISkillType type){
        if(stack.getOrCreateTag().contains(SKILL_TAG)) {
        	final CompoundNBT tmp = stack.getOrCreateTag().getCompound(SKILL_TAG);
        	if(tmp.contains(type.getIdentity())){
        		return tmp.getInt(type.getIdentity());
        	}
        }
        return 0;
    }
    
    public static void addSkillLevel(ItemStack stack, ISkillType type, int lvl){
    	if(stack.getOrCreateTag().contains(SKILL_TAG)) {
    		final CompoundNBT tmp = stack.getOrCreateTag().getCompound(SKILL_TAG);
    		tmp.putInt(type.getIdentity(), lvl);
    		stack.getOrCreateTag().put(SKILL_TAG, tmp);
    	} else {
    		final CompoundNBT tmp = new CompoundNBT();
    		tmp.putInt(type.getIdentity(), lvl);
    		stack.getOrCreateTag().put(SKILL_TAG, tmp);
    	}
    }

    public static void addSkillLevel(CompoundNBT nbt, ISkillType type, int lvl){
    	if(nbt.contains(SKILL_TAG)) {
    		final CompoundNBT tmp = nbt.getCompound(SKILL_TAG);
    		tmp.putInt(type.getIdentity(), lvl);
    		nbt.put(SKILL_TAG, tmp);
    	} else {
    		final CompoundNBT tmp = new CompoundNBT();
    		tmp.putInt(type.getIdentity(), lvl);
    		nbt.put(SKILL_TAG, tmp);
    	}
    }

    public static ISkillType getSkillType(String name){
        return SKILL_MAP.get(name);
    }

    public static class SkillType implements ISkillType {

        private static final List<ISkillType> SKILLS = new ArrayList<>();
        private final List<Float> values = new ArrayList<>();
        private final List<Integer> costs = new ArrayList<>();
        private final String name;
        private final String group;

        public SkillType(String name, Collection<Float> values, Collection<Integer> costs){
            this.name = name;
            this.group = this.getIdentity();
            this.values.addAll(values);
            this.costs.addAll(costs);
            SKILLS.add(this);
        }

//        public SkillType(String name, String group, Collection<Float> values, Collection<Integer> costs){
//            this.name = name;
//            this.group = group;
//            this.values.addAll(values);
//            this.costs.addAll(costs);
//            SKILLS.add(this);
//        }

        public static void register(){
            PVZAPI.get().registerSkillTypes(SKILLS);
        }

        @Override
        public String toString() {
            return this.name;
        }

        @Override
        public String getIdentity() {
            return StringUtil.identify(this.getModID(), this.toString());
        }

        @Override
        public TranslationTextComponent getText() {
            return new TranslationTextComponent("skill." + this.getModID() + "." + this.toString());
        }

        @Override
        public IFormattableTextComponent getDescription() {
            return new TranslationTextComponent("skill." + this.getModID() + "." + this.toString() + ".desc");
        }

        @Override
        public String getModID() {
            return PVZMod.MOD_ID;
        }

        @Override
        public float getValueAt(int pos) {
            return this.values.get(pos);
        }

        @Override
        public int getCostAt(int pos) {
            return this.costs.get(pos);
        }

        @Override
        public String getConflictGroup() {
            return this.group;
        }

        @Override
        public int getMaxLevel() {
            return this.costs.size();
        }
    }
}
