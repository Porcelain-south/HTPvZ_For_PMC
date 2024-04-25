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
			return 50;
		}

	};

	//5s to 3s.
	public static final ICoolDown SUPER_FAST = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.super_fast";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 100, 60);
		}
		
	};

	//10s to 6s.
	public static final ICoolDown HUGE_FAST = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.huge_fast";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 200, 120);
		}
		
	};

	//15s to 9s.
	public static final ICoolDown VERY_FAST = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.very_fast";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 300, 180);
		}
		
	};

	//20s to 12s.
	public static final ICoolDown FAST = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.fast";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 400, 240);
		}
		
	};

	//25s to 15s.
	public static final ICoolDown LITTLE_FAST = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.little_fast";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 500, 300);
		}
		
	};

	//36s to 18s.
	public static final ICoolDown NORMAL = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.normal";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 720, 360);
		}
		
	};

	//50s to 20s.
	public static final ICoolDown LITTLE_SLOW = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.little_slow";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 1000, 400);
		}
		
	};

	//60s to 24s.
	public static final ICoolDown SLOW = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.slow";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 1200, 480);
		}
		
	};

	//75s to 30s.
	public static final ICoolDown VERY_SLOW = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.very_slow";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 1500, 600);
		}
		
	};

	//300s to 120s.
	public static final ICoolDown HUGE_SLOW = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.huge_slow";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 6000, 2400);
		}
		
	};

	//500s to 200s
	public static final ICoolDown SUPER_SLOW = new ICoolDown() {
		
		@Override
		public String getTranslateKey() {
			return "misc.pvz.cd.super_slow";
		}
		
		@Override
		public int getCD(int lvl) {
			return MathUtil.getIncreaseAverage(lvl, SkillTypes.COOL_DOWN_LEVEL, 10000, 4000);
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
