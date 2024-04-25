package com.hungteen.pvz.client.model.entity.plant.appease;

import com.hungteen.pvz.client.model.entity.plant.PlantShooterModel;
import com.hungteen.pvz.common.entity.plant.appease.ThreePeaterEntity;
import com.hungteen.pvz.common.entity.plant.base.PlantShooterEntity;
import com.hungteen.pvz.utils.AnimationUtil;

import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class ThreePeaterModel extends PlantShooterModel<ThreePeaterEntity> {
	private final ModelRenderer total;
	private final ModelRenderer body;
	private final ModelRenderer mid_up;
	private final ModelRenderer mid_body;
	private final ModelRenderer stick_r2_r1;
	private final ModelRenderer stick_r1_r1;
	private final ModelRenderer mid_head;
	private final ModelRenderer hair;
	private final ModelRenderer leafl_r1;
	private final ModelRenderer hair2;
	private final ModelRenderer leafl_r2;
	private final ModelRenderer left_up;
	private final ModelRenderer left_body;
	private final ModelRenderer stick_r3_r1;
	private final ModelRenderer stick_r2_r2;
	private final ModelRenderer left_head;
	private final ModelRenderer hair3;
	private final ModelRenderer leafl_r3;
	private final ModelRenderer hair4;
	private final ModelRenderer leafl_r4;
	private final ModelRenderer hair5;
	private final ModelRenderer leafl_r5;
	private final ModelRenderer right_up;
	private final ModelRenderer right_body;
	private final ModelRenderer stick_r4_r1;
	private final ModelRenderer stick_r3_r2;
	private final ModelRenderer right_head;
	private final ModelRenderer hair8;
	private final ModelRenderer leafl_r8;
	private final ModelRenderer leaves;
	private final ModelRenderer n_r1;
	private final ModelRenderer w_r1;
	private final ModelRenderer e_r1;
	private final ModelRenderer s_r1;
	private final ModelRenderer getPlantWholeBody;

	public ThreePeaterModel() {
		texWidth = 64;
		texHeight = 64;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(body);


		mid_up = new ModelRenderer(this);
		mid_up.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(mid_up);


		mid_body = new ModelRenderer(this);
		mid_body.setPos(0.0F, 0.0F, 0.0F);
		mid_up.addChild(mid_body);
		setRotationAngle(mid_body, -0.0873F, 0.0F, 0.0F);


		stick_r2_r1 = new ModelRenderer(this);
		stick_r2_r1.setPos(0.0F, -9.3168F, 2.0468F);
		mid_body.addChild(stick_r2_r1);
		setRotationAngle(stick_r2_r1, 0.3491F, 0.0F, 0.0F);
		stick_r2_r1.texOffs(14, 27).addBox(-1.0F, -9.1008F, -0.5716F, 2.0F, 10.0F, 2.0F, -0.2F, false);

		stick_r1_r1 = new ModelRenderer(this);
		stick_r1_r1.setPos(0.0F, 0.0F, 0.0F);
		mid_body.addChild(stick_r1_r1);
		setRotationAngle(stick_r1_r1, -0.3054F, 0.0F, 0.0F);
		stick_r1_r1.texOffs(14, 27).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);

		mid_head = new ModelRenderer(this);
		mid_head.setPos(-1.0F, -5.0F, 0.0F);
		mid_up.addChild(mid_head);
		mid_head.texOffs(0, 27).addBox(-1.0F, -15.75F, -4.5F, 4.0F, 4.0F, 3.0F, -0.4F, false);
		mid_head.texOffs(28, 5).addBox(-1.0F, -15.825F, -5.75F, 4.0F, 4.0F, 2.0F, 0.0F, false);
		mid_head.texOffs(0, 0).addBox(-2.5F, -18.0F, -2.5F, 7.0F, 7.0F, 7.0F, 0.0F, false);
		mid_head.texOffs(20, 22).addBox(-1.0F, -11.0F, -1.0F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		hair = new ModelRenderer(this);
		hair.setPos(-0.75F, -15.5F, 5.0F);
		mid_head.addChild(hair);
		setRotationAngle(hair, 0.0436F, -0.48F, 0.0F);


		leafl_r1 = new ModelRenderer(this);
		leafl_r1.setPos(0.0F, 0.0F, 5.0F);
		hair.addChild(leafl_r1);
		setRotationAngle(leafl_r1, 0.1745F, 0.0F, 0.0F);
		leafl_r1.texOffs(28, 11).addBox(-1.0F, -0.1F, -4.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		leafl_r1.texOffs(22, 29).addBox(0.0F, -0.5F, -6.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		hair2 = new ModelRenderer(this);
		hair2.setPos(2.75F, -15.5F, 5.0F);
		mid_head.addChild(hair2);
		setRotationAngle(hair2, 0.0436F, 0.48F, 0.0F);


		leafl_r2 = new ModelRenderer(this);
		leafl_r2.setPos(0.0F, 0.0F, 5.0F);
		hair2.addChild(leafl_r2);
		setRotationAngle(leafl_r2, 0.1745F, 0.0F, 0.0F);
		leafl_r2.texOffs(28, 11).addBox(-3.0F, -0.1F, -4.0F, 4.0F, 6.0F, 1.0F, 0.0F, true);
		leafl_r2.texOffs(22, 29).addBox(-2.0F, -0.5F, -6.0F, 2.0F, 1.0F, 3.0F, 0.0F, true);

		left_up = new ModelRenderer(this);
		left_up.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(left_up);
		setRotationAngle(left_up, -0.2182F, 0.0F, 0.7418F);


		left_body = new ModelRenderer(this);
		left_body.setPos(0.0F, 0.0F, 0.0F);
		left_up.addChild(left_body);
		setRotationAngle(left_body, -0.087F, 0.0076F, 0.0869F);


		stick_r3_r1 = new ModelRenderer(this);
		stick_r3_r1.setPos(0.0F, -9.3168F, 2.0468F);
		left_body.addChild(stick_r3_r1);
		setRotationAngle(stick_r3_r1, 0.7171F, 0.1313F, -0.3712F);
		stick_r3_r1.texOffs(14, 27).addBox(-1.0F, -9.1008F, -0.5716F, 2.0F, 10.0F, 2.0F, -0.2F, false);

		stick_r2_r2 = new ModelRenderer(this);
		stick_r2_r2.setPos(0.0F, 0.0F, 0.0F);
		left_body.addChild(stick_r2_r2);
		setRotationAngle(stick_r2_r2, -0.3054F, 0.0F, 0.0F);
		stick_r2_r2.texOffs(14, 27).addBox(-1.0F, -10.0F, -1.0F, 2.0F, 10.0F, 2.0F, 0.0F, false);

		left_head = new ModelRenderer(this);
		left_head.setPos(-3.0F, -16.8938F, -4.4375F);
		left_up.addChild(left_head);
		setRotationAngle(left_head, 0.1745F, 0.0F, -0.7418F);
		left_head.texOffs(0, 27).addBox(-2.0F, -2.8562F, -3.0625F, 4.0F, 4.0F, 3.0F, -0.4F, false);
		left_head.texOffs(28, 5).addBox(-2.0F, -2.9312F, -4.3125F, 4.0F, 4.0F, 2.0F, 0.0F, false);
		left_head.texOffs(0, 0).addBox(-3.5F, -5.1062F, -1.0625F, 7.0F, 7.0F, 7.0F, 0.0F, false);
		left_head.texOffs(20, 22).addBox(-2.0F, 1.8938F, 0.4375F, 4.0F, 3.0F, 4.0F, 0.0F, false);

		hair3 = new ModelRenderer(this);
		hair3.setPos(-1.75F, -2.6062F, 6.4375F);
		left_head.addChild(hair3);
		setRotationAngle(hair3, 0.0436F, -0.48F, 0.0F);


		leafl_r3 = new ModelRenderer(this);
		leafl_r3.setPos(0.0F, 0.0F, 5.0F);
		hair3.addChild(leafl_r3);
		setRotationAngle(leafl_r3, 0.1745F, 0.0F, 0.0F);
		leafl_r3.texOffs(28, 11).addBox(-1.0F, -0.1F, -4.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		leafl_r3.texOffs(22, 29).addBox(0.0F, -0.5F, -6.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		hair4 = new ModelRenderer(this);
		hair4.setPos(1.75F, -2.6062F, 6.4375F);
		left_head.addChild(hair4);
		setRotationAngle(hair4, 0.0436F, 0.48F, 0.0F);


		leafl_r4 = new ModelRenderer(this);
		leafl_r4.setPos(0.0F, 0.0F, 5.0F);
		hair4.addChild(leafl_r4);
		setRotationAngle(leafl_r4, 0.1745F, 0.0F, 0.0F);
		leafl_r4.texOffs(28, 11).addBox(-3.0F, -0.1F, -4.0F, 4.0F, 6.0F, 1.0F, 0.0F, true);
		leafl_r4.texOffs(22, 29).addBox(-2.0F, -0.5F, -6.0F, 2.0F, 1.0F, 3.0F, 0.0F, true);

		hair5 = new ModelRenderer(this);
		hair5.setPos(1.0F, -1.8562F, 6.4375F);
		left_head.addChild(hair5);
		setRotationAngle(hair5, -0.2182F, 0.0F, 0.0F);


		leafl_r5 = new ModelRenderer(this);
		leafl_r5.setPos(0.0F, 0.0F, 5.0F);
		hair5.addChild(leafl_r5);
		setRotationAngle(leafl_r5, 0.1745F, 0.0F, 0.0F);
		leafl_r5.texOffs(28, 11).addBox(-3.0F, -0.1F, -4.0F, 4.0F, 6.0F, 1.0F, 0.0F, true);
		leafl_r5.texOffs(22, 29).addBox(-2.0F, -0.5F, -6.0F, 2.0F, 1.0F, 3.0F, 0.0F, true);

		right_up = new ModelRenderer(this);
		right_up.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(right_up);
		setRotationAngle(right_up, 0.2618F, 0.0F, -0.7418F);


		right_body = new ModelRenderer(this);
		right_body.setPos(0.0F, 0.0F, 0.0F);
		right_up.addChild(right_body);
		setRotationAngle(right_body, -0.0866F, -0.0114F, -0.1304F);


		stick_r4_r1 = new ModelRenderer(this);
		stick_r4_r1.setPos(0.0F, -9.3168F, 2.0468F);
		right_body.addChild(stick_r4_r1);
		setRotationAngle(stick_r4_r1, 0.4553F, -0.1313F, 0.3712F);
		stick_r4_r1.texOffs(14, 27).addBox(0.0F, -7.1008F, -1.8216F, 2.0F, 10.0F, 2.0F, -0.2F, true);

		stick_r3_r2 = new ModelRenderer(this);
		stick_r3_r2.setPos(0.0F, 0.0F, 0.0F);
		right_body.addChild(stick_r3_r2);
		setRotationAngle(stick_r3_r2, -0.3054F, 0.0F, 0.0F);
		stick_r3_r2.texOffs(14, 27).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, true);

		right_head = new ModelRenderer(this);
		right_head.setPos(2.0F, -14.8938F, -1.4375F);
		right_up.addChild(right_head);
		setRotationAngle(right_head, -0.1329F, 0.173F, 0.7188F);
		right_head.texOffs(0, 27).addBox(-2.0F, -2.8562F, -3.0625F, 4.0F, 4.0F, 3.0F, -0.4F, true);
		right_head.texOffs(28, 5).addBox(-2.0F, -2.9312F, -4.3125F, 4.0F, 4.0F, 2.0F, 0.0F, true);
		right_head.texOffs(0, 0).addBox(-3.5F, -5.1062F, -1.0625F, 7.0F, 7.0F, 7.0F, 0.0F, true);
		right_head.texOffs(20, 22).addBox(-2.0F, 1.8938F, 0.4375F, 4.0F, 3.0F, 4.0F, 0.0F, true);

		hair8 = new ModelRenderer(this);
		hair8.setPos(-1.0F, -1.8562F, 6.4375F);
		right_head.addChild(hair8);
		setRotationAngle(hair8, -0.2182F, 0.0F, 0.0F);


		leafl_r8 = new ModelRenderer(this);
		leafl_r8.setPos(1.0F, 2.1224F, 1.3125F);
		hair8.addChild(leafl_r8);
		setRotationAngle(leafl_r8, 0.3927F, 0.0F, 0.0F);
		leafl_r8.texOffs(28, 11).addBox(-2.0F, -1.55F, 0.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		leafl_r8.texOffs(22, 29).addBox(-1.0F, -1.95F, -2.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		leaves = new ModelRenderer(this);
		leaves.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(leaves);


		n_r1 = new ModelRenderer(this);
		n_r1.setPos(0.0F, 0.8F, 0.0F);
		leaves.addChild(n_r1);
		setRotationAngle(n_r1, -0.1745F, -0.7854F, 0.0F);
		n_r1.texOffs(14, 15).addBox(-2.0F, -1.0F, -7.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);

		w_r1 = new ModelRenderer(this);
		w_r1.setPos(0.0F, 0.8F, 0.0F);
		leaves.addChild(w_r1);
		setRotationAngle(w_r1, 0.1745F, -0.7854F, -0.1745F);
		w_r1.texOffs(0, 22).addBox(1.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		e_r1 = new ModelRenderer(this);
		e_r1.setPos(0.0F, 0.8F, 0.0F);
		leaves.addChild(e_r1);
		setRotationAngle(e_r1, -0.1745F, -0.7854F, 0.1745F);
		e_r1.texOffs(21, 0).addBox(-7.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		s_r1 = new ModelRenderer(this);
		s_r1.setPos(0.0F, 0.8F, 0.0F);
		leaves.addChild(s_r1);
		setRotationAngle(s_r1, 0.1745F, -0.7854F, 0.0F);
		s_r1.texOffs(0, 14).addBox(-2.0F, -1.0F, 1.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);

		getPlantWholeBody = new ModelRenderer(this);
		getPlantWholeBody.setPos(0.0F, 0.0F, 0.0F);

	}

	@Override
	public void setupAnim(ThreePeaterEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		final float OFFSET = 0.78F;
		this.left_head.xRot = 0;
		this.mid_head.xRot = 0;
		this.right_head.xRot = 0;
		this.body.xRot = 0;
		this.right_up.zRot = - OFFSET;
		this.right_head.zRot = OFFSET;
		this.left_up.zRot = OFFSET;
		this.left_head.zRot = - OFFSET;
		if(entity.isPlantInSuperMode()) {
			final int T = PlantShooterEntity.SHOOT_ANIM_CD;
			final int tick = entity.getSuperTime() % T;
			if(tick >= 0) {
				this.left_head.xRot = AnimationUtil.getUpDownUpDown(tick, T, getMaxRotAngle() / 5);
				this.mid_head.xRot = AnimationUtil.getUpDownUpDown(tick, T, getMaxRotAngle() / 5);
				this.right_head.xRot = AnimationUtil.getUpDownUpDown(tick, T, getMaxRotAngle() / 5);
				this.body.xRot = AnimationUtil.getUpDownUpDown(tick, T, - getMaxRotAngle() / 5);
			} 
		} else {
			final int T = PlantShooterEntity.SHOOT_ANIM_CD;
			final int tick = entity.getShootTick() + T - entity.getShootCD();
			if(tick >= 0) {
				this.left_head.xRot = AnimationUtil.getUpDownUpDown(tick, T, getMaxRotAngle());
				this.mid_head.xRot = AnimationUtil.getUpDownUpDown(tick, T, getMaxRotAngle());
				this.right_head.xRot = AnimationUtil.getUpDownUpDown(tick, T, getMaxRotAngle());
				this.body.xRot = AnimationUtil.getUpDownUpDown(tick, T, - getMaxRotAngle());
			} else {//idle
				final int TT = 40;
				final int tt = entity.getExistTick() % TT;
				final float CHANGE = 3;
				this.mid_up.zRot = AnimationUtil.getUpDownUpDown(tt, TT, CHANGE / 4);
				this.left_up.zRot = AnimationUtil.getUpDownUpDown(tt, TT, CHANGE) + OFFSET;
				this.left_head.zRot = - AnimationUtil.getUpDownUpDown(tt, TT, CHANGE) - OFFSET;
				this.right_up.zRot = - AnimationUtil.getUpDownUpDown(tt, TT, CHANGE) - OFFSET;
				this.right_head.zRot = AnimationUtil.getUpDownUpDown(tt, TT, CHANGE) + OFFSET;
			}
		}
	}
	
	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.total;
	}

}