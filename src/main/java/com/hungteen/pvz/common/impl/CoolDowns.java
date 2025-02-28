package com.hungteen.pvz.common.impl;

import com.hungteen.pvz.PVZMod;
import com.hungteen.pvz.api.PVZAPI;
import com.hungteen.pvz.api.types.ICoolDown;
import com.hungteen.pvz.utils.MathUtil;

import javax.annotation.Nullable;
import java.util.*;

public abstract class CoolDowns implements ICoolDown {

	private static final List<ICoolDown> LIST = new ArrayList<>();
	private static final Map<String, ICoolDown> MAP = new HashMap<>();

	public static final ICoolDown DEFAULT = new ICoolDown() {

		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.default";
		}

		@Override
		public int getCD(int lvl) {
			return 5;
		}

	};

	//2s to 1.4s.
	public static final ICoolDown SUPER_FAST = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.super_fast";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 40, 28);
		}
		
	};

	//3s to 2.1s.
	public static final ICoolDown HUGE_FAST = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.huge_fast";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 60, 42);
		}
		
	};

	//5s to 2.75s.
	public static final ICoolDown VERY_FAST = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.very_fast";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 100, 55);
		}
		
	};

	//10s to 5.5s.
	public static final ICoolDown FAST = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.fast";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 200, 110);
		}
		
	};

	//15s to 8.25s.
	public static final ICoolDown LITTLE_FAST = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.little_fast";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 300, 165);
		}

	};

	//20s to 11s.
	public static final ICoolDown NORMAL = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.normal";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 400, 220);
		}
		
	};

	//30s to 12s.
	public static final ICoolDown LITTLE_SLOW = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.little_slow";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 600, 240);
		}
		
	};

	//40s to 16s.
	public static final ICoolDown SLOW = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.slow";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 800, 320);
		}
		
	};

	//50s to 20s.
	public static final ICoolDown VERY_SLOW = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.very_slow";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 1000, 400);
		}
		
	};

	//150s to 60s.
	public static final ICoolDown HUGE_SLOW = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.huge_slow";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 3000, 1200);
		}
		
	};

	//250s to 100s
	public static final ICoolDown SUPER_SLOW = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.super_slow";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 5000, 2000);
		}
		
	};

	public static void registerCD(ICoolDown cd){
		if(! MAP.containsKey(cd.toString())){
			MAP.put(cd.toString(), cd);
		} else{
			PVZMod.LOGGER.warn("CD Register : Duplicate CoolDown Type.");
		}
	}

	public static void registerCDs(Collection<ICoolDown> cds){
		cds.forEach(cd -> registerCD(cd));
	}

	public static void register(){
		PVZAPI.get().registerCDs(LIST);
	}

	@Nullable
	public static ICoolDown getCDByName(String name){
		return MAP.getOrDefault(name, null);
	}

	private final String name;

	protected CoolDowns(String name){
		this.name = name;
		LIST.add(this);
	}

	@Override
	public String toString() {
		return name;
	}
}
