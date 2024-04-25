package com.hungteen.pvz.client.model.entity.plant.defence;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.defence.GarlicEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class GarlicModel extends PVZPlantModel<GarlicEntity> {
	private final ModelRenderer total;
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public GarlicModel() {
		texWidth = 64;
		texHeight = 64;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		body = new ModelRenderer(this);
		body.setPos(-0.976F, -6.3188F, -1.4359F);
		total.addChild(body);
		body.texOffs(0, 0).addBox(-4.024F, -0.6812F, -3.5641F, 10.0F, 7.0F, 10.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(3.452F, -1.0F, -3.25F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2964F, -0.2615F, -0.7025F);
		cube_r1.texOffs(0, 4).addBox(-1.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(-1.5F, -1.0F, -3.25F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2964F, 0.2615F, 0.7025F);
		cube_r2.texOffs(0, 4).addBox(-0.5F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(4.5116F, -0.6812F, 4.9714F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0436F, 0.7854F, 0.0F);
		cube_r3.texOffs(0, 7).addBox(0.0F, -5.0F, -10.0F, 0.0F, 5.0F, 10.0F, 0.0F, true);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(-3.024F, -0.1812F, 5.4359F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0873F, -0.7854F, 0.0F);
		cube_r4.texOffs(0, 7).addBox(0.0F, -5.5F, -10.6569F, 0.0F, 5.0F, 10.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(3.476F, 1.5688F, -3.2891F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.3054F);
		cube_r5.texOffs(0, 0).addBox(-1.25F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, -0.2F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(-1.524F, 1.5688F, -3.2891F);
		body.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.3054F);
		cube_r6.texOffs(0, 0).addBox(-1.75F, -1.5F, -0.5F, 3.0F, 3.0F, 1.0F, -0.2F, false);

	}

	@Override
	public void setupAnim(GarlicEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<GarlicEntity> getPlantModel() {
		return this;
	}
}