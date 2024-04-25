package com.hungteen.pvz.client.model.entity.plant.defence;

import com.hungteen.pvz.client.model.entity.ComponentModel;
import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.defence.TallNutEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class TallNutModel extends PVZPlantModel<TallNutEntity> {
	private final ModelRenderer body;
	private final ModelRenderer getPlantWholeBody;

	public TallNutModel() {
		texWidth = 128;
		texHeight = 128;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 24.0F, 0.0F);
		body.texOffs(42, 45).addBox(-7.0F, -2.0F, -7.0F, 14.0F, 2.0F, 14.0F, 0.0F, false);
		body.texOffs(0, 59).addBox(-7.0F, -27.0F, -7.0F, 14.0F, 25.0F, 1.0F, 0.0F, false);
		body.texOffs(0, 0).addBox(-1.0F, -25.0F, -7.975F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		body.texOffs(16, 70).addBox(-7.0F, -25.0F, -7.975F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		body.texOffs(16, 70).addBox(-7.0F, -21.0F, -7.975F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		body.texOffs(16, 70).addBox(1.0F, -21.0F, -7.975F, 6.0F, 1.0F, 1.0F, 0.0F, true);
		body.texOffs(16, 70).addBox(1.0F, -25.0F, -7.975F, 6.0F, 1.0F, 1.0F, 0.0F, true);
		body.texOffs(0, 0).addBox(-8.0F, -25.0F, -7.975F, 2.0F, 5.0F, 1.0F, -0.1F, false);
		body.texOffs(0, 0).addBox(6.0F, -25.0F, -7.975F, 2.0F, 5.0F, 1.0F, -0.1F, true);
		body.texOffs(0, 0).addBox(-8.0F, -27.0F, -8.0F, 16.0F, 25.0F, 16.0F, 0.0F, false);
		body.texOffs(0, 41).addBox(-7.0F, -31.0F, -7.0F, 14.0F, 4.0F, 14.0F, 0.0F, false);
		body.texOffs(48, 0).addBox(-3.0F, -21.0F, -3.0F, 6.0F, 9.0F, 6.0F, 0.0F, false);

		getPlantWholeBody = new ModelRenderer(this);
		getPlantWholeBody.setPos(0.0F, 0.0F, 0.0F);

	}

	@Override
	public void setupAnim(TallNutEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.body;
	}

	@Override
	public EntityModel<TallNutEntity> getPlantModel() {
		return this;
	}
	public static class TallNutArmorModel extends ComponentModel<TallNutEntity> {

		private final ModelRenderer body;

		public TallNutArmorModel() {
			texWidth = 128;
			texHeight = 128;
	
			body = new ModelRenderer(this);
			body.setPos(0.0F, 24.0F, 0.0F);
			body.texOffs(0, 60).addBox(-8.0F, -32.0F, -8.0F, 16.0F, 4.0F, 16.0F, 0.0F, false);
			body.texOffs(0, 0).addBox(-9.495F, -28.01F, -9.515F, 19.0F, 18.0F, 19.0F, 0.0F, false);
			body.texOffs(0, 37).addBox(-9.995F, -13.01F, -10.015F, 20.0F, 3.0F, 20.0F, 0.0F, false);
		}


		@Override
		public ModelRenderer getTotalModel() {
			return this.body;
		}
	}
}