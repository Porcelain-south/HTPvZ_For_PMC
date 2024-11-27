package com.hungteen.pvz.client.model.armor;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class BucketHeadModel extends BipedModel<LivingEntity> {
	private final ModelRenderer total;
	private final ModelRenderer break_point_r1;

	public BucketHeadModel(float scale) {
		super(scale, 0, 64, 64);

		total = new ModelRenderer(this);
		total.setPos(0.0F, -8.0F, 0.0F);
		total.texOffs(0, 39).addBox(-4.5F, -2.0F, -4.5F, 9.0F, 8.0F, 9.0F, 0.0F, false);
		total.texOffs(32, 48).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		break_point_r1 = new ModelRenderer(this);
		break_point_r1.setPos(0.005F, 0.045F, 0.0512F);
		total.addChild(break_point_r1);
		setRotationAngle(break_point_r1, 0.1309F, 0.0F, 0.0F);
		break_point_r1.texOffs(29, 34).addBox(-4.0F, -9.5F, -3.562F, 8.0F, 6.0F, 8.0F, 0.01F, false);

		this.head.addChild(total);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}