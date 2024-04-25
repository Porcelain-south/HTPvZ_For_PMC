package com.hungteen.pvz.client.model.entity.bullet;

import com.hungteen.pvz.common.entity.bullet.CornEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class CornModel extends EntityModel<CornEntity> {
	private final ModelRenderer total;
	private final ModelRenderer corn;

	public CornModel() {
		texWidth = 128;
		texHeight = 128;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		corn = new ModelRenderer(this);
		corn.setPos(0.0F, -0.5F, -3.0F);
		total.addChild(corn);
		corn.texOffs(0, 79).addBox(-4.5F, -28.0F, -1.5F, 9.0F, 29.0F, 9.0F, 0.0F, false);
		corn.texOffs(74, 0).addBox(-4.0F, -30.75F, -1.0F, 8.0F, 3.0F, 8.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(CornEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){

	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		total.render(matrixStack, buffer, packedLight, packedOverlay);
		total.zRot=-1.570797f;
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}