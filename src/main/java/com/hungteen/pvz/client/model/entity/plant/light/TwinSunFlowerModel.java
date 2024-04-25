package com.hungteen.pvz.client.model.entity.plant.light;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.light.TwinSunFlowerEntity;
import com.hungteen.pvz.utils.AnimationUtil;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class TwinSunFlowerModel extends PVZPlantModel<TwinSunFlowerEntity> {
	private final ModelRenderer total;
	private final ModelRenderer leaves;
	private final ModelRenderer w_r1;
	private final ModelRenderer w_r2;
	private final ModelRenderer e_r1;
	private final ModelRenderer e_r2;
	private final ModelRenderer left_flower;
	private final ModelRenderer body_r1;
	private final ModelRenderer stickd_r1;
	private final ModelRenderer stickd_r2;
	private final ModelRenderer stickd_r2_r1;
	private final ModelRenderer head;
	private final ModelRenderer right_hand;
	private final ModelRenderer leafw_r1;
	private final ModelRenderer left_hand;
	private final ModelRenderer leafe_r1;
	private final ModelRenderer right_flower;
	private final ModelRenderer body_r2;
	private final ModelRenderer stickd_r3;
	private final ModelRenderer stickd_r4;
	private final ModelRenderer head2;
	private final ModelRenderer right_hand2;
	private final ModelRenderer leafw_r2;
	private final ModelRenderer left_hand2;
	private final ModelRenderer leafe_r2;
	private final ModelRenderer getPlantWholeBody;

	public TwinSunFlowerModel() {
		texWidth = 64;
		texHeight = 64;

		total = new ModelRenderer(this);
		total.setPos(8.0F, 24.0F, -8.0F);


		leaves = new ModelRenderer(this);
		leaves.setPos(-8.0F, 1.0F, 8.0F);
		total.addChild(leaves);


		w_r1 = new ModelRenderer(this);
		w_r1.setPos(0.0F, -0.5F, 0.0F);
		leaves.addChild(w_r1);
		setRotationAngle(w_r1, 0.1745F, 0.0F, 0.0F);
		w_r1.texOffs(24, 7).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);

		w_r2 = new ModelRenderer(this);
		w_r2.setPos(0.0F, -0.5F, 0.0F);
		leaves.addChild(w_r2);
		setRotationAngle(w_r2, -0.1745F, 0.0F, 0.0F);
		w_r2.texOffs(0, 24).addBox(-2.0F, -0.5F, -7.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);

		e_r1 = new ModelRenderer(this);
		e_r1.setPos(0.0F, -0.5F, -1.0F);
		leaves.addChild(e_r1);
		setRotationAngle(e_r1, 0.0F, 0.0F, -0.1745F);
		e_r1.texOffs(30, 0).addBox(1.0F, -0.5F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		e_r2 = new ModelRenderer(this);
		e_r2.setPos(0.0F, -0.5F, -1.0F);
		leaves.addChild(e_r2);
		setRotationAngle(e_r2, 0.0F, 0.0F, 0.1745F);
		e_r2.texOffs(26, 14).addBox(-7.0F, -0.5F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		left_flower = new ModelRenderer(this);
		left_flower.setPos(-8.0F, 0.0F, 7.0F);
		total.addChild(left_flower);
		setRotationAngle(left_flower, 0.0F, 0.0F, 0.3491F);


		body_r1 = new ModelRenderer(this);
		body_r1.setPos(0.0F, 0.7359F, 0.5894F);
		left_flower.addChild(body_r1);
		setRotationAngle(body_r1, 0.0F, 0.0F, -0.3054F);
		body_r1.texOffs(0, 31).addBox(4.25F, -19.5F, 0.75F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		stickd_r1 = new ModelRenderer(this);
		stickd_r1.setPos(0.0F, 0.0F, 0.0F);
		left_flower.addChild(stickd_r1);
		setRotationAngle(stickd_r1, -0.258F, 0.045F, 0.1687F);
		stickd_r1.texOffs(18, 30).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		stickd_r2 = new ModelRenderer(this);
		stickd_r2.setPos(1.0F, -8.0F, 1.0F);
		stickd_r1.addChild(stickd_r2);
		setRotationAngle(stickd_r2, 0.0F, 0.0F, -0.2182F);


		stickd_r2_r1 = new ModelRenderer(this);
		stickd_r2_r1.setPos(-1.0F, 0.0F, 0.0F);
		stickd_r2.addChild(stickd_r2_r1);
		setRotationAngle(stickd_r2_r1, 0.2182F, 0.0F, 0.0F);
		stickd_r2_r1.texOffs(8, 31).addBox(-1.0F, -6.0F, -2.0F, 2.0F, 6.0F, 2.0F, -0.1F, false);

		head = new ModelRenderer(this);
		head.setPos(-1.0F, -20.0F, 1.75F);
		left_flower.addChild(head);
		setRotationAngle(head, 0.0F, 0.0F, -0.3491F);
		head.texOffs(22, 20).addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
		head.texOffs(0, 13).addBox(-5.0F, -5.0F, -3.0F, 10.0F, 8.0F, 3.0F, 0.0F, false);
		head.texOffs(0, 0).addBox(-7.0F, -7.0F, -2.0F, 14.0F, 12.0F, 1.0F, 0.0F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setPos(0.75F, -11.75F, 2.25F);
		left_flower.addChild(right_hand);


		leafw_r1 = new ModelRenderer(this);
		leafw_r1.setPos(0.0F, 0.0F, 0.0F);
		right_hand.addChild(leafw_r1);
		setRotationAngle(leafw_r1, 0.1745F, 0.0F, 0.1745F);
		leafw_r1.texOffs(34, 33).addBox(-3.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setPos(1.5F, -11.5F, 2.5F);
		left_flower.addChild(left_hand);


		leafe_r1 = new ModelRenderer(this);
		leafe_r1.setPos(0.0F, 0.0F, 0.0F);
		left_hand.addChild(leafe_r1);
		setRotationAngle(leafe_r1, 0.1745F, 0.0F, -0.1745F);
		leafe_r1.texOffs(34, 30).addBox(0.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, false);

		right_flower = new ModelRenderer(this);
		right_flower.setPos(-8.0F, 0.0F, 7.0F);
		total.addChild(right_flower);
		setRotationAngle(right_flower, 0.0F, 0.0F, -0.6109F);


		body_r2 = new ModelRenderer(this);
		body_r2.setPos(-0.2429F, -9.3017F, 2.3394F);
		right_flower.addChild(body_r2);
		setRotationAngle(body_r2, 0.0F, 0.0F, 0.3054F);
		body_r2.texOffs(14, 24).addBox(-0.75F, -6.5F, -1.75F, 2.0F, 3.0F, 2.0F, 0.0F, false);
		body_r2.texOffs(0, 31).addBox(-0.75F, -3.5F, -1.75F, 2.0F, 7.0F, 2.0F, 0.0F, true);

		stickd_r3 = new ModelRenderer(this);
		stickd_r3.setPos(0.0F, 0.0F, 0.0F);
		right_flower.addChild(stickd_r3);
		setRotationAngle(stickd_r3, -0.258F, -0.045F, -0.1687F);
		stickd_r3.texOffs(26, 30).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		stickd_r4 = new ModelRenderer(this);
		stickd_r4.setPos(-0.525F, -8.0F, 0.75F);
		stickd_r3.addChild(stickd_r4);
		setRotationAngle(stickd_r4, 0.0F, 0.0F, 0.5672F);


		head2 = new ModelRenderer(this);
		head2.setPos(2.0F, -15.0F, 1.75F);
		right_flower.addChild(head2);
		setRotationAngle(head2, 0.0F, 0.0F, 0.5672F);
		head2.texOffs(22, 20).addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 4.0F, 0.0F, true);
		head2.texOffs(0, 13).addBox(-5.0F, -5.0F, -3.0F, 10.0F, 8.0F, 3.0F, 0.0F, true);
		head2.texOffs(0, 0).addBox(-7.0F, -7.0F, -2.0F, 14.0F, 12.0F, 1.0F, 0.0F, true);

		right_hand2 = new ModelRenderer(this);
		right_hand2.setPos(-0.75F, -5.75F, 1.25F);
		right_flower.addChild(right_hand2);
		setRotationAngle(right_hand2, 0.0F, 0.0F, 0.1745F);


		leafw_r2 = new ModelRenderer(this);
		leafw_r2.setPos(0.0F, 0.0F, 0.0F);
		right_hand2.addChild(leafw_r2);
		setRotationAngle(leafw_r2, 0.1745F, 0.0F, -0.1745F);
		leafw_r2.texOffs(34, 33).addBox(0.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, true);

		left_hand2 = new ModelRenderer(this);
		left_hand2.setPos(-1.5F, -5.5F, 1.5F);
		right_flower.addChild(left_hand2);
		setRotationAngle(left_hand2, 0.0F, 0.0F, 0.5672F);


		leafe_r2 = new ModelRenderer(this);
		leafe_r2.setPos(0.0F, 0.0F, 0.0F);
		left_hand2.addChild(leafe_r2);
		setRotationAngle(leafe_r2, 0.1745F, 0.0F, 0.1745F);
		leafe_r2.texOffs(34, 30).addBox(-3.5F, -0.5F, -1.0F, 3.0F, 1.0F, 2.0F, 0.0F, true);

		getPlantWholeBody = new ModelRenderer(this);
		getPlantWholeBody.setPos(0.0F, 0.0F, 0.0F);

	}
	@Override
	public void setupAnim(TwinSunFlowerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		final int tick = entity.getAttackTime();
		if(tick > 0 && tick < entity.getAnimGenCD() || entity.isPlantInSuperMode()) {
			final int T = 10;
			this.left_hand.zRot = AnimationUtil.getUpDownUpDown(ageInTicks % T, T, - 30);
			this.right_hand.zRot = AnimationUtil.getUpDownUpDown(ageInTicks % T, T, - 30);
			this.left_hand2.zRot = AnimationUtil.getUpDownUpDown(ageInTicks % T, T, - 30);
			this.right_hand2.zRot = AnimationUtil.getUpDownUpDown(ageInTicks % T, T, - 30);
		} else {
			this.left_hand.zRot = 0;
			this.right_hand.zRot = 0;
			this.left_hand2.zRot = 0;
			this.right_hand2.zRot = 0;
		}
		final int T = 60;
		final int time = entity.getExistTick() % 60;
		final float degree = 5F;
		//this.left_flower.zRot = AnimationUtil.getUpDown(time, T, degree);
		//this.right_flower.zRot = AnimationUtil.getUpDown(time, T, - degree);
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<TwinSunFlowerEntity> getPlantModel() {
		return this;
	}
}