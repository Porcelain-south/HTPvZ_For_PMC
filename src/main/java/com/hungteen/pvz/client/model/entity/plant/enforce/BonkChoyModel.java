package com.hungteen.pvz.client.model.entity.plant.enforce;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.enforce.BonkChoyEntity;
import com.hungteen.pvz.utils.AnimationUtil;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class BonkChoyModel extends PVZPlantModel<BonkChoyEntity> {
	private final ModelRenderer getPlantWholeBody;
	private final ModelRenderer total;
	private final ModelRenderer hair;
	private final ModelRenderer cube_r1;
	private final ModelRenderer leaf;
	private final ModelRenderer leaf2;
	private final ModelRenderer leaf3;
	private final ModelRenderer leaf4;
	private final ModelRenderer leaf5;
	private final ModelRenderer leaf6;
	private final ModelRenderer body;
	private final ModelRenderer body2;
	private final ModelRenderer mouth;
	private final ModelRenderer tooth;
	private final ModelRenderer eyegeneral;
	private final ModelRenderer eyebrow;
	private final ModelRenderer eyebrow2;
	private final ModelRenderer eyebrow3;
	private final ModelRenderer eyebrow4;
	private final ModelRenderer eye;
	private final ModelRenderer eyeball;
	private final ModelRenderer eye2;
	private final ModelRenderer eyeball2;
	private final ModelRenderer left_arm;
	private final ModelRenderer left1;
	private final ModelRenderer left2;
	private final ModelRenderer left3;
	private final ModelRenderer left4;
	private final ModelRenderer left5;
	private final ModelRenderer fist7;
	private final ModelRenderer fist8;
	private final ModelRenderer fist9;
	private final ModelRenderer right_arm;
	private final ModelRenderer right1;
	private final ModelRenderer right2;
	private final ModelRenderer right3;
	private final ModelRenderer right4;
	private final ModelRenderer right5;
	private final ModelRenderer fist16;
	private final ModelRenderer fist17;
	private final ModelRenderer fist18;
	private final ModelRenderer special;

	public BonkChoyModel() {
		texWidth = 64;
		texHeight = 64;

		getPlantWholeBody = new ModelRenderer(this);
		getPlantWholeBody.setPos(0.0F, 0.0F, 0.0F);


		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);
		setRotationAngle(total, 0.0F, 0.4363F, 0.0F);


		hair = new ModelRenderer(this);
		hair.setPos(0.0F, -9.0F, -2.0F);
		total.addChild(hair);
		setRotationAngle(hair, -0.2618F, 0.0F, 0.0F);


		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(-0.5F, -2.0F, 1.0F);
		hair.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3927F, 0.0F, 0.0F);
		cube_r1.texOffs(15, 25).addBox(-2.0F, -2.0F, -1.0F, 5.0F, 4.0F, 4.0F, 0.0F, false);

		leaf = new ModelRenderer(this);
		leaf.setPos(0.0F, -1.0F, 1.0F);
		hair.addChild(leaf);
		leaf.texOffs(0, 42).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 4.0F, 0.0F, 0.0F, false);

		leaf2 = new ModelRenderer(this);
		leaf2.setPos(0.0F, -4.0F, 0.0F);
		leaf.addChild(leaf2);
		setRotationAngle(leaf2, -0.5672F, 0.0F, 0.0F);
		leaf2.texOffs(33, 40).addBox(-4.0F, -4.0F, 0.0F, 8.0F, 4.0F, 0.0F, 0.0F, false);

		leaf3 = new ModelRenderer(this);
		leaf3.setPos(0.0F, -1.0F, 2.0F);
		hair.addChild(leaf3);
		leaf3.texOffs(22, 35).addBox(-5.0F, -3.0F, 0.0F, 10.0F, 4.0F, 0.0F, 0.0F, false);

		leaf4 = new ModelRenderer(this);
		leaf4.setPos(0.0F, -3.0F, 0.0F);
		leaf3.addChild(leaf4);
		setRotationAngle(leaf4, -0.3491F, 0.0F, 0.0F);
		leaf4.texOffs(13, 39).addBox(-5.0F, -3.0F, 0.0F, 10.0F, 3.0F, 0.0F, 0.0F, false);

		leaf5 = new ModelRenderer(this);
		leaf5.setPos(0.0F, 0.0F, 3.0F);
		hair.addChild(leaf5);
		setRotationAngle(leaf5, 0.0873F, 0.0F, 0.0F);
		leaf5.texOffs(0, 34).addBox(-5.5F, -3.0F, 0.0F, 11.0F, 3.0F, 0.0F, 0.0F, false);

		leaf6 = new ModelRenderer(this);
		leaf6.setPos(0.0F, -3.0F, 0.0F);
		leaf5.addChild(leaf6);
		setRotationAngle(leaf6, -0.2182F, 0.0F, 0.0F);
		leaf6.texOffs(20, 14).addBox(-5.5F, -3.0F, 0.0F, 11.0F, 3.0F, 0.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(body);
		setRotationAngle(body, 0.1309F, 0.0F, 0.0F);
		body.texOffs(19, 17).addBox(-3.5F, -1.0F, -3.5F, 7.0F, 1.0F, 7.0F, 0.0F, false);
		body.texOffs(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8.0F, 6.0F, 8.0F, 0.0F, false);

		body2 = new ModelRenderer(this);
		body2.setPos(0.0F, -6.0F, -2.0F);
		body.addChild(body2);
		setRotationAngle(body2, -0.3054F, 0.0F, 0.0F);
		body2.texOffs(0, 14).addBox(-3.5F, -4.0F, -1.0F, 7.0F, 4.0F, 6.0F, 0.0F, false);

		mouth = new ModelRenderer(this);
		mouth.setPos(-1.25F, -1.75F, -3.825F);
		body.addChild(mouth);
		setRotationAngle(mouth, 0.0F, 0.0F, 0.3491F);
		mouth.texOffs(22, 33).addBox(-1.5F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, -0.3F, false);

		tooth = new ModelRenderer(this);
		tooth.setPos(-0.5F, 0.525F, 0.425F);
		mouth.addChild(tooth);
		tooth.texOffs(0, 16).addBox(-0.75F, -0.75F, -1.01F, 2.0F, 1.5F, 1.0F, -0.4F, false);

		eyegeneral = new ModelRenderer(this);
		eyegeneral.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(eyegeneral);


		eyebrow = new ModelRenderer(this);
		eyebrow.setPos(-1.9891F, -6.4355F, -3.8188F);
		eyegeneral.addChild(eyebrow);
		setRotationAngle(eyebrow, -0.1745F, 0.0F, 0.3054F);
		eyebrow.texOffs(16, 42).addBox(-1.625F, -1.0F, -0.5F, 3.25F, 2.0F, 1.0F, -0.1F, false);

		eyebrow2 = new ModelRenderer(this);
		eyebrow2.setPos(1.9891F, -6.4355F, -3.8188F);
		eyegeneral.addChild(eyebrow2);
		setRotationAngle(eyebrow2, -0.1745F, 0.0F, -0.3054F);
		eyebrow2.texOffs(0, 5).addBox(-1.625F, -1.0F, -0.5F, 3.25F, 2.0F, 1.0F, -0.1F, false);

		eyebrow3 = new ModelRenderer(this);
		eyebrow3.setPos(-2.0F, -2.9708F, -3.7306F);
		eyegeneral.addChild(eyebrow3);
		setRotationAngle(eyebrow3, 0.1745F, 0.0F, 0.0F);
		eyebrow3.texOffs(0, 14).addBox(-1.125F, -0.5F, -0.5F, 2.25F, 1.0F, 1.0F, 0.0F, false);

		eyebrow4 = new ModelRenderer(this);
		eyebrow4.setPos(2.0F, -2.9708F, -3.7306F);
		eyegeneral.addChild(eyebrow4);
		setRotationAngle(eyebrow4, 0.1745F, 0.0F, 0.0F);
		eyebrow4.texOffs(0, 14).addBox(-1.125F, -0.5F, -0.5F, 2.25F, 1.0F, 1.0F, 0.0F, true);

		eye = new ModelRenderer(this);
		eye.setPos(-1.75F, -4.5F, -3.05F);
		eyegeneral.addChild(eye);
		eye.texOffs(0, 0).addBox(-1.25F, -1.5F, -1.175F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		eyeball = new ModelRenderer(this);
		eyeball.setPos(0.5F, 0.5F, -0.1F);
		eye.addChild(eyeball);
		eyeball.texOffs(20, 17).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.1F, false);

		eye2 = new ModelRenderer(this);
		eye2.setPos(1.75F, -4.5F, -3.05F);
		eyegeneral.addChild(eye2);
		eye2.texOffs(0, 0).addBox(-0.75F, -1.5F, -1.175F, 2.0F, 3.0F, 2.0F, 0.0F, true);

		eyeball2 = new ModelRenderer(this);
		eyeball2.setPos(0.0F, 0.5F, -0.1F);
		eye2.addChild(eyeball2);
		eyeball2.texOffs(20, 17).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, 0.1F, true);

		left_arm = new ModelRenderer(this);
		left_arm.setPos(0.0F, -0.25F, 0.0F);
		total.addChild(left_arm);
		setRotationAngle(left_arm, 0.1745F, 0.3491F, -0.0873F);
		left_arm.texOffs(20, 0).addBox(0.0F, 0.0F, -2.5F, 9.0F, 0.0F, 4.0F, 0.0F, false);

		left1 = new ModelRenderer(this);
		left1.setPos(9.0F, 0.0F, 0.0F);
		left_arm.addChild(left1);
		setRotationAngle(left1, 0.0F, 0.0F, -0.8727F);
		left1.texOffs(28, 30).addBox(0.0F, 0.0F, -3.0F, 5.0F, 0.0F, 5.0F, 0.0F, false);

		left2 = new ModelRenderer(this);
		left2.setPos(5.0F, 0.0F, 0.0F);
		left1.addChild(left2);
		setRotationAngle(left2, 0.0F, 0.0F, -0.6981F);
		left2.texOffs(0, 24).addBox(0.0F, 0.0F, -3.0F, 7.0F, 0.0F, 5.0F, 0.0F, false);

		left3 = new ModelRenderer(this);
		left3.setPos(7.0F, 0.0F, 0.0F);
		left2.addChild(left3);
		setRotationAngle(left3, 0.0F, 0.0F, -1.309F);
		left3.texOffs(0, 29).addBox(0.0F, 0.0F, -3.0F, 5.0F, 0.0F, 5.0F, 0.0F, false);

		left4 = new ModelRenderer(this);
		left4.setPos(5.0F, 0.0F, 0.0F);
		left3.addChild(left4);
		setRotationAngle(left4, 0.0F, 0.0F, -1.7017F);
		left4.texOffs(27, 8).addBox(0.0F, 0.0F, -3.0F, 5.0F, 0.0F, 5.0F, 0.0F, false);

		left5 = new ModelRenderer(this);
		left5.setPos(5.0F, 0.0F, 0.0F);
		left4.addChild(left5);
		setRotationAngle(left5, 0.0F, 0.0F, -1.4835F);
		left5.texOffs(37, 5).addBox(0.0F, 0.0F, -3.0F, 4.0F, 0.0F, 5.0F, 0.0F, false);

		fist7 = new ModelRenderer(this);
		fist7.setPos(4.0F, 0.0F, 0.0F);
		left5.addChild(fist7);
		setRotationAngle(fist7, 0.0F, 0.0F, -1.7453F);
		fist7.texOffs(35, 17).addBox(0.0F, 0.0F, -3.0F, 4.0F, 0.0F, 5.0F, 0.0F, false);

		fist8 = new ModelRenderer(this);
		fist8.setPos(4.0F, 1.0F, 0.0F);
		fist7.addChild(fist8);
		setRotationAngle(fist8, 0.0F, 0.0F, -1.5708F);
		fist8.texOffs(38, 25).addBox(1.0F, 0.0F, -3.0F, 2.0F, 0.0F, 5.0F, 0.0F, false);

		fist9 = new ModelRenderer(this);
		fist9.setPos(3.0F, 0.0F, 0.0F);
		fist8.addChild(fist9);
		setRotationAngle(fist9, 0.0F, 0.0F, -1.5708F);
		fist9.texOffs(37, 10).addBox(0.0F, 0.0F, -3.0F, 3.0F, 0.0F, 5.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(right_arm);
		setRotationAngle(right_arm, 0.1309F, -0.0873F, 0.0873F);
		right_arm.texOffs(20, 4).addBox(-8.0F, 0.0F, -2.5F, 8.0F, 0.0F, 4.0F, 0.0F, false);

		right1 = new ModelRenderer(this);
		right1.setPos(-8.0F, 0.0F, 0.0F);
		right_arm.addChild(right1);
		setRotationAngle(right1, 0.0F, 0.0F, 0.8727F);
		right1.texOffs(37, 0).addBox(-4.0F, 0.0F, -3.0F, 4.0F, 0.0F, 5.0F, 0.0F, false);

		right2 = new ModelRenderer(this);
		right2.setPos(-4.0F, 0.0F, 0.0F);
		right1.addChild(right2);
		setRotationAngle(right2, 0.0F, 0.0F, 0.6981F);
		right2.texOffs(28, 25).addBox(-5.0F, 0.0F, -3.0F, 5.0F, 0.0F, 5.0F, 0.0F, false);

		right3 = new ModelRenderer(this);
		right3.setPos(-5.0F, 0.0F, 0.0F);
		right2.addChild(right3);
		setRotationAngle(right3, 0.0F, 0.0F, 1.309F);
		right3.texOffs(0, 37).addBox(-4.0F, 0.0F, -3.0F, 4.0F, 0.0F, 5.0F, 0.0F, false);

		right4 = new ModelRenderer(this);
		right4.setPos(-4.0F, 0.0F, 0.0F);
		right3.addChild(right4);
		setRotationAngle(right4, 0.0F, 0.0F, 1.7017F);
		right4.texOffs(27, 8).addBox(-5.0F, 0.0F, -3.0F, 5.0F, 0.0F, 5.0F, 0.0F, false);

		right5 = new ModelRenderer(this);
		right5.setPos(-5.0F, 0.0F, 0.0F);
		right4.addChild(right5);
		setRotationAngle(right5, 0.0F, 0.0F, 1.4835F);
		right5.texOffs(37, 35).addBox(-3.0F, 0.0F, -3.0F, 3.0F, 0.0F, 5.0F, 0.0F, false);

		fist16 = new ModelRenderer(this);
		fist16.setPos(-3.0F, 0.0F, 0.0F);
		right5.addChild(fist16);
		setRotationAngle(fist16, 0.0F, 0.0F, 1.7453F);
		fist16.texOffs(35, 17).addBox(-4.0F, 0.0F, -3.0F, 4.0F, 0.0F, 5.0F, 0.0F, false);

		fist17 = new ModelRenderer(this);
		fist17.setPos(-4.0F, 1.0F, 0.0F);
		fist16.addChild(fist17);
		setRotationAngle(fist17, 0.0F, 0.0F, 1.5708F);
		fist17.texOffs(38, 30).addBox(-2.5F, 0.0F, -3.0F, 1.5F, 0.0F, 5.0F, 0.0F, false);

		fist18 = new ModelRenderer(this);
		fist18.setPos(-2.5F, 0.0F, 0.0F);
		fist17.addChild(fist18);
		setRotationAngle(fist18, 0.0F, 0.0F, 1.5708F);
		fist18.texOffs(37, 10).addBox(-3.0F, 0.0F, -3.0F, 3.0F, 0.0F, 5.0F, 0.0F, true);

		special = new ModelRenderer(this);
		special.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(special);

	}

	@Override
	public void setupAnim(BonkChoyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.getAttackTime() == 0) {
			this.left_arm.xRot = 0;
			this.left_arm.yRot = 0;
			this.left_arm.zRot = 0;
			this.right_arm.xRot = 0;
			this.right_arm.yRot = 0;
			this.right_arm.zRot = 0;
		} else if(entity.getAttackTime() < 0) {
			int now = entity.getAttackTime();
			int tot = entity.getAttackCD();
			this.right_arm.xRot = AnimationUtil.getUpDown(now, tot, 60);
			this.right_arm.yRot = AnimationUtil.getUpDown(now, tot, - 60);
		} else {
			int now = - entity.getAttackTime();
			int tot = entity.getAttackCD();
			this.left_arm.xRot = AnimationUtil.getUpDown(now, tot, - 60);
			//this.left_arm.yRot = - (3.1416F - AnimationUtil.getUpDown(now, tot, 60));
		}
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<BonkChoyEntity> getPlantModel() {
		return this;
	}
}