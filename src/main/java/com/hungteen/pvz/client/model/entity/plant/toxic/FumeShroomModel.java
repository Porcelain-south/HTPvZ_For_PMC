package com.hungteen.pvz.client.model.entity.plant.toxic;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.toxic.FumeShroomEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class FumeShroomModel extends PVZPlantModel<FumeShroomEntity> {
	private final ModelRenderer total;
	private final ModelRenderer total_r1;
	private final ModelRenderer total_r2;
	private final ModelRenderer total_r3;
	private final ModelRenderer total_r4;
	private final ModelRenderer getPlantWholeBody;

	public FumeShroomModel() {
		texWidth = 64;
		texHeight = 64;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);
		total.texOffs(0, 26).addBox(-6.5F, -9.0F, -6.5F, 13.0F, 9.0F, 13.0F, 0.0F, false);
		total.texOffs(0, 0).addBox(-8.0F, -18.0F, -8.0F, 16.0F, 10.0F, 16.0F, 0.0F, false);
		total.texOffs(0, 8).addBox(-2.0F, -15.0F, -11.0F, 4.0F, 4.0F, 3.0F, 0.0F, false);
		total.texOffs(0, 0).addBox(-3.0F, -16.0F, -13.0F, 6.0F, 6.0F, 2.0F, 0.0F, false);

		total_r1 = new ModelRenderer(this);
		total_r1.setPos(-3.0562F, -1.3175F, -6.525F);
		total.addChild(total_r1);
		setRotationAngle(total_r1, 0.0F, 0.0F, -0.0436F);
		total_r1.texOffs(0, 28).addBox(-1.0F, -1.0F, -0.375F, 2.0F, 2.0F, 1.0F, -0.3F, false);

		total_r2 = new ModelRenderer(this);
		total_r2.setPos(0.1379F, -2.0988F, -6.025F);
		total.addChild(total_r2);
		setRotationAngle(total_r2, 0.0F, 0.0F, -0.0873F);
		total_r2.texOffs(39, 26).addBox(-3.25F, -1.0F, -0.85F, 6.0F, 3.0F, 1.0F, -0.3F, false);

		total_r3 = new ModelRenderer(this);
		total_r3.setPos(-3.5F, -6.5F, -6.25F);
		total.addChild(total_r3);
		setRotationAngle(total_r3, 0.0F, 0.0F, 0.2618F);
		total_r3.texOffs(0, 26).addBox(-1.5F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, false);

		total_r4 = new ModelRenderer(this);
		total_r4.setPos(3.5F, -6.5F, -6.25F);
		total.addChild(total_r4);
		setRotationAngle(total_r4, 0.0F, 0.0F, -0.2618F);
		total_r4.texOffs(0, 26).addBox(-2.5F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F, 0.0F, true);

		getPlantWholeBody = new ModelRenderer(this);
		getPlantWholeBody.setPos(0.0F, 0.0F, 0.0F);

	}
	@Override
	public void setupAnim(FumeShroomEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<FumeShroomEntity> getPlantModel() {
		return this;
	}
}