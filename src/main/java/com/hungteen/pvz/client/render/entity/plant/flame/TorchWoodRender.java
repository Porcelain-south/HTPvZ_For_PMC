package com.hungteen.pvz.client.render.entity.plant.flame;

import com.hungteen.pvz.client.model.entity.plant.flame.TorchWoodModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.common.entity.plant.flame.TorchWoodEntity;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TorchWoodRender extends PVZPlantRender<TorchWoodEntity>{
	private final ResourceLocation TEX1 = StringUtil.prefix("textures/entity/plant/flame/torch_wood.png");
	private final ResourceLocation TEX2 = StringUtil.prefix("textures/entity/plant/flame/torch_wood_blue.png");


	public TorchWoodRender(EntityRendererManager rendererManager) {
		super(rendererManager, new TorchWoodModel(), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(TorchWoodEntity entity) {
		final boolean percent = entity.getFlameType()== TorchWoodEntity.FlameTypes.BLUE;
		return percent ? TEX2 : TEX1;
	}

}
