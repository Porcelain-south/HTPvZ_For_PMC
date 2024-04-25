package com.hungteen.pvz.client.model.entity.plant.explosion;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.explosion.CherryBombEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class CherryBombModel extends PVZPlantModel<CherryBombEntity> {
	private final ModelRenderer body;
	private final ModelRenderer bone;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer head1;
	private final ModelRenderer head3_r1;
	private final ModelRenderer head2_r1;
	private final ModelRenderer head1_r1;
	private final ModelRenderer head2;
	private final ModelRenderer head4_r1;
	private final ModelRenderer head3_r2;
	private final ModelRenderer getPlantWholeBody;

	public CherryBombModel() {
		texWidth = 128;
		texHeight = 128;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 24.0F, 0.0F);


		bone = new ModelRenderer(this);
		bone.setPos(-9.0F, -11.0F, 0.0F);
		body.addChild(bone);
		bone.texOffs(40, 24).addBox(-2.0F, -13.0F, -1.0F, 16.0F, 16.0F, 0.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setPos(7.0F, -12.0F, 0.0F);
		bone.addChild(bone3);
		setRotationAngle(bone3, 0.2182F, -0.3491F, 0.6981F);
		bone3.texOffs(10, 38).addBox(-1.0F, -8.0F, -3.0F, 0.0F, 8.0F, 6.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setPos(9.0F, -18.0F, 0.0F);
		body.addChild(bone2);
		bone2.texOffs(40, 40).addBox(-11.0F, -6.0F, -1.0F, 12.0F, 16.0F, 0.0F, 0.0F, false);

		head1 = new ModelRenderer(this);
		head1.setPos(-10.491F, -6.5F, 1.4165F);
		body.addChild(head1);
		setRotationAngle(head1, 0.0F, 0.2618F, 0.0F);


		head3_r1 = new ModelRenderer(this);
		head3_r1.setPos(6.8032F, 1.7679F, -7.25F);
		head1.addChild(head3_r1);
		setRotationAngle(head3_r1, 0.0F, -1.5708F, -0.4363F);
		head3_r1.texOffs(0, 44).addBox(-0.5F, -5.25F, -5.5F, 1.0F, 6.0F, 8.0F, 0.0F, false);

		head2_r1 = new ModelRenderer(this);
		head2_r1.setPos(-1.125F, -0.5F, -7.25F);
		head1.addChild(head2_r1);
		setRotationAngle(head2_r1, 0.0F, -1.5708F, 0.5236F);
		head2_r1.texOffs(36, 0).addBox(-0.5F, -3.25F, -2.75F, 1.0F, 4.0F, 6.0F, 0.0F, false);

		head1_r1 = new ModelRenderer(this);
		head1_r1.setPos(2.875F, 0.5F, -1.5F);
		head1.addChild(head1_r1);
		setRotationAngle(head1_r1, 0.0F, -1.5708F, 0.0F);
		head1_r1.texOffs(0, 0).addBox(-6.0F, -6.0F, -6.0F, 12.0F, 12.0F, 12.0F, 0.0F, false);

		head2 = new ModelRenderer(this);
		head2.setPos(11.0F, -19.0F, 0.0F);
		body.addChild(head2);
		setRotationAngle(head2, 0.0F, -0.2618F, 0.0F);
		head2.texOffs(0, 24).addBox(-9.0F, 8.0F, -5.0F, 10.0F, 10.0F, 10.0F, 0.0F, false);

		head4_r1 = new ModelRenderer(this);
		head4_r1.setPos(0.0F, 11.5F, -4.75F);
		head2.addChild(head4_r1);
		setRotationAngle(head4_r1, 0.0F, 0.0F, -0.5672F);
		head4_r1.texOffs(22, 44).addBox(-3.0F, -1.25F, -0.5F, 6.0F, 3.0F, 1.0F, 0.0F, false);

		head3_r2 = new ModelRenderer(this);
		head3_r2.setPos(-6.0F, 11.0F, -4.75F);
		head2.addChild(head3_r2);
		setRotationAngle(head3_r2, 0.0F, 0.0F, 0.48F);
		head3_r2.texOffs(44, 0).addBox(-3.0F, -1.5F, -0.5F, 6.0F, 4.0F, 1.0F, 0.0F, false);

		getPlantWholeBody = new ModelRenderer(this);
		getPlantWholeBody.setPos(0.0F, 0.0F, 0.0F);

	}

	@Override
	public void setupAnim(CherryBombEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.body;
	}

	@Override
	public EntityModel<CherryBombEntity> getPlantModel() {
		return this;
	}
}