package com.hungteen.pvz.client.render.entity.plant.defence;

import com.hungteen.pvz.client.model.entity.plant.defence.TallNutModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.client.render.layer.component.TallNutArmorLayer;
import com.hungteen.pvz.common.entity.plant.defence.TallNutEntity;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TallNutRender extends PVZPlantRender<TallNutEntity>{
	private final ResourceLocation TEX1 = StringUtil.prefix("textures/entity/plant/defence/tall_nut.png");
	private final ResourceLocation TEX2 = StringUtil.prefix("textures/entity/plant/defence/tall_nut_1.png");
	private final ResourceLocation TEX3 = StringUtil.prefix("textures/entity/plant/defence/tall_nut_2.png");


	public TallNutRender(EntityRendererManager rendererManager) {
		super(rendererManager, new TallNutModel(), 0.45f);
	}

	@Override
	protected void addPlantLayers() {
		super.addPlantLayers();
		this.addLayer(new TallNutArmorLayer(this));
	}

	@Override
	public ResourceLocation getTextureLocation(TallNutEntity entity) {
		final double percent = entity.getHealth() / entity.getMaxHealth();
		return percent > 2 / 3F ? TEX1 : percent > 1 / 3F ? TEX2 : TEX3;
	}

}
