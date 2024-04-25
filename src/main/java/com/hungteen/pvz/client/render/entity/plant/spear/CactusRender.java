package com.hungteen.pvz.client.render.entity.plant.spear;

import com.hungteen.pvz.client.model.entity.plant.spear.CactusModel;
import com.hungteen.pvz.client.render.entity.plant.PVZPlantRender;
import com.hungteen.pvz.client.render.layer.eyes.CactusEyeLayer;
import com.hungteen.pvz.common.entity.plant.spear.CactusEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CactusRender extends PVZPlantRender<CactusEntity> {

	public CactusRender(EntityRendererManager rendererManager) {
		super(rendererManager, new CactusModel(), 0.5F);
	}
	protected void addPlantLayers(){
		super.addPlantLayers();
		this.addLayer(new CactusEyeLayer<>(this));
	}

	@Override
	public Vector3d getTranslateVec(CactusEntity entity) {
		float h = entity.getCactusHeight();
		return new Vector3d(0, - h, 0);
	}

}
