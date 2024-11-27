package com.hungteen.pvz.client.model.armor;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class ConeHeadModel extends BipedModel<LivingEntity> {

	public ConeHeadModel(float scale) {
		super(scale, 0, 64, 64);

		ModelRenderer body = new ModelRenderer(this);
		body.setPos(0.0F, - 8F, 0.0F);
		body.texOffs(0, 32).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
		body.texOffs(0, 43).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F, false);
		body.texOffs(20, 50).addBox(-2.0F, -10.0F, -2.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		this.head.addChild(body);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}