package com.hungteen.pvz.client.model.entity.plant.explosion;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.explosion.DoomShroomEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class DoomShroomModel extends PVZPlantModel<DoomShroomEntity> {
	private final ModelRenderer total;
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer getPlantWholeBody;

	public DoomShroomModel() {
		texWidth = 128;
		texHeight = 128;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);
		total.texOffs(0, 28).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -9.0F, 0.0F);
		total.addChild(head);
		head.texOffs(0, 0).addBox(-9.0F, -10.0F, -9.0F, 18.0F, 10.0F, 18.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(5.0F, -7.5F, -8.5F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, -0.2559F, -0.056F, -0.211F);
		head_r1.texOffs(0, 0).addBox(-5.25F, 0.0F, -0.5F, 8.0F, 3.0F, 1.0F, 0.0F, true);

		head_r2 = new ModelRenderer(this);
		head_r2.setPos(-5.0F, -7.5F, -8.5F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, -0.2559F, 0.056F, 0.211F);
		head_r2.texOffs(0, 0).addBox(-2.75F, 0.0F, -0.5F, 8.0F, 3.0F, 1.0F, 0.0F, false);

		getPlantWholeBody = new ModelRenderer(this);
		getPlantWholeBody.setPos(0.0F, 0.0F, 0.0F);

	}

	@Override
	public void setupAnim(DoomShroomEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<DoomShroomEntity> getPlantModel() {
		return this;
	}
}