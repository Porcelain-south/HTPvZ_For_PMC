package com.hungteen.pvz.client.model.entity.plant.spear;

import java.util.Optional;

import com.hungteen.pvz.client.model.entity.plant.PlantShooterModel;
import com.hungteen.pvz.common.entity.plant.spear.CactusEntity;

import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class CactusModel extends PlantShooterModel<CactusEntity> {
	private final ModelRenderer total;
	private final ModelRenderer body;
	private final ModelRenderer branch;
	private final ModelRenderer blue_eyes;
	private final ModelRenderer mouse;
	private final ModelRenderer hat;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer hat2;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer bone;
	private final ModelRenderer bone3;
	private final ModelRenderer bone2;
	private final ModelRenderer spikes3;
	private final ModelRenderer blue_spikes3;
	private final ModelRenderer right_hand;
	private final ModelRenderer right_hand_r1;
	private final ModelRenderer spikes1;
	private final ModelRenderer right_hand_r2;
	private final ModelRenderer right_hand_r3;
	private final ModelRenderer right_hand_r4;
	private final ModelRenderer blue_spikes1;
	private final ModelRenderer right_hand_r5;
	private final ModelRenderer right_hand_r6;
	private final ModelRenderer right_hand_r7;
	private final ModelRenderer right_hand_r8;
	private final ModelRenderer left_hand;
	private final ModelRenderer left_hand_r1;
	private final ModelRenderer spikes2;
	private final ModelRenderer left_hand_r2;
	private final ModelRenderer left_hand_r3;
	private final ModelRenderer left_hand_r4;
	private final ModelRenderer blue_spikes2;
	private final ModelRenderer left_hand_r5;
	private final ModelRenderer left_hand_r6;
	private final ModelRenderer left_hand_r7;
	private final ModelRenderer left_hand_r8;
	private final ModelRenderer body2;
	private final ModelRenderer spikes4;
	private final ModelRenderer blue_spikes4;
	private final ModelRenderer body3;
	private final ModelRenderer spikes5;
	private final ModelRenderer blue_spikes5;
	private final ModelRenderer body4;
	private final ModelRenderer spikes6;
	private final ModelRenderer blue_spikes6;
	private final ModelRenderer body5;
	private final ModelRenderer spikes7;
	private final ModelRenderer blue_spikes7;
	private final ModelRenderer getPlantWholeBody;

	public CactusModel() {
		texWidth = 256;
		texHeight = 256;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(body);


		branch = new ModelRenderer(this);
		branch.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(branch);
		branch.texOffs(0, 64).addBox(-6.5F, -32.0F, -6.5F, 13.0F, 32.0F, 13.0F, 0.0F, false);
		branch.texOffs(52, 23).addBox(-6.5F, -29.75F, -6.5F, 13.0F, 2.0F, 1.0F, 0.2F, false);

		blue_eyes = new ModelRenderer(this);
		blue_eyes.setPos(-0.5F, 0.0F, 0.0F);
		branch.addChild(blue_eyes);
		blue_eyes.texOffs(39, 0).addBox(-4.0F, -28.0F, -6.5F, 2.0F, 2.0F, 2.0F, 0.1F, false);
		blue_eyes.texOffs(39, 0).addBox(3.0F, -28.0F, -6.5F, 2.0F, 2.0F, 2.0F, 0.1F, true);

		mouse = new ModelRenderer(this);
		mouse.setPos(0.0F, -0.5F, 3.0F);
		body.addChild(mouse);
		mouse.texOffs(78, 33).addBox(-2.5F, -24.5F, -12.5F, 5.0F, 5.0F, 4.0F, 0.0F, false);
		mouse.texOffs(91, 0).addBox(-3.0F, -25.0F, -13.5F, 6.0F, 6.0F, 1.0F, 0.2F, false);

		hat = new ModelRenderer(this);
		hat.setPos(-0.25F, -31.75F, -0.5F);
		body.addChild(hat);
		setRotationAngle(hat, 0.0F, 0.2182F, 0.0F);
		hat.texOffs(0, 5).addBox(-1.25F, -0.5F, -1.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.25F, 0.0F, 0.5F);
		hat.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2618F, -0.8727F, 0.0F);
		cube_r1.texOffs(39, 0).addBox(-2.5F, 0.1294F, -8.483F, 5.0F, 1.0F, 8.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.25F, 0.0F, 0.5F);
		hat.addChild(cube_r2);
		setRotationAngle(cube_r2, 2.8798F, -1.4399F, -3.1416F);
		cube_r2.texOffs(39, 0).addBox(-2.5F, 0.1294F, -8.483F, 5.0F, 1.0F, 8.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.25F, 0.0F, 0.5F);
		hat.addChild(cube_r3);
		setRotationAngle(cube_r3, 2.8798F, -0.4363F, 3.1416F);
		cube_r3.texOffs(39, 0).addBox(-2.5F, 0.1294F, -8.483F, 5.0F, 1.0F, 8.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.25F, 0.0F, 0.5F);
		hat.addChild(cube_r4);
		setRotationAngle(cube_r4, 2.8798F, 0.5236F, 3.1416F);
		cube_r4.texOffs(39, 0).addBox(-2.5F, 0.1294F, -8.483F, 5.0F, 1.0F, 8.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.25F, 0.0F, 0.5F);
		hat.addChild(cube_r5);
		setRotationAngle(cube_r5, 2.8798F, 1.4399F, 3.1416F);
		cube_r5.texOffs(39, 0).addBox(-2.5F, 0.1294F, -8.483F, 5.0F, 1.0F, 8.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(0.25F, 0.0F, 0.5F);
		hat.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.2618F, 0.8727F, 0.0F);
		cube_r6.texOffs(39, 0).addBox(-2.5F, 0.1294F, -8.483F, 5.0F, 1.0F, 8.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(0.25F, 0.0F, 0.5F);
		hat.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.2618F, 0.0F, 0.0F);
		cube_r7.texOffs(39, 0).addBox(-2.5F, 0.1294F, -8.483F, 5.0F, 1.0F, 8.0F, 0.0F, false);

		hat2 = new ModelRenderer(this);
		hat2.setPos(0.0F, -2.0F, 0.0F);
		hat.addChild(hat2);
		setRotationAngle(hat2, 0.0F, -0.5236F, 0.0F);
		hat2.texOffs(0, 0).addBox(-1.25F, -0.5F, -1.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(0.25F, 0.0F, 0.5F);
		hat2.addChild(cube_r8);
		setRotationAngle(cube_r8, 2.5744F, -1.5272F, 3.1415F);
		cube_r8.texOffs(0, 57).addBox(-2.5F, 1.1294F, -6.483F, 5.0F, 1.0F, 6.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setPos(0.25F, 0.0F, 0.5F);
		hat2.addChild(cube_r9);
		setRotationAngle(cube_r9, 2.5744F, -0.5236F, 3.1416F);
		cube_r9.texOffs(0, 57).addBox(-2.5F, 1.1294F, -6.483F, 5.0F, 1.0F, 6.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setPos(0.25F, 0.0F, 0.5F);
		hat2.addChild(cube_r10);
		setRotationAngle(cube_r10, 2.5744F, 0.7418F, 3.1416F);
		cube_r10.texOffs(0, 57).addBox(-2.5F, 1.1294F, -6.483F, 5.0F, 1.0F, 6.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setPos(0.25F, 0.0F, 0.5F);
		hat2.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.5672F, 1.1781F, 0.0F);
		cube_r11.texOffs(0, 57).addBox(-2.5F, 1.1294F, -6.483F, 5.0F, 1.0F, 6.0F, 0.0F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setPos(0.25F, 0.0F, 0.5F);
		hat2.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.5672F, -0.6545F, 0.0F);
		cube_r12.texOffs(0, 57).addBox(-2.5F, 1.1294F, -6.483F, 5.0F, 1.0F, 6.0F, 0.0F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setPos(0.25F, 0.0F, 0.5F);
		hat2.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.5672F, 0.2618F, 0.0F);
		cube_r13.texOffs(0, 57).addBox(-2.5F, 1.1294F, -6.483F, 5.0F, 1.0F, 6.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setPos(0.75F, 0.0F, 0.75F);
		hat2.addChild(bone);
		setRotationAngle(bone, 0.049F, 0.5865F, -0.347F);
		bone.texOffs(0, 45).addBox(-1.0F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone.texOffs(9, 0).addBox(-1.0F, -5.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.1F, false);

		bone3 = new ModelRenderer(this);
		bone3.setPos(0.75F, 0.0F, 0.75F);
		hat2.addChild(bone3);
		setRotationAngle(bone3, -3.0272F, -0.0041F, -2.8545F);
		bone3.texOffs(0, 45).addBox(-1.0F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		bone3.texOffs(9, 0).addBox(-1.0F, -5.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.1F, false);

		bone2 = new ModelRenderer(this);
		bone2.setPos(0.0F, 0.0F, 0.75F);
		hat2.addChild(bone2);
		setRotationAngle(bone2, 0.5721F, -0.323F, 0.1579F);
		bone2.texOffs(0, 45).addBox(0.0F, -5.0F, -1.0F, 1.0F, 5.0F, 1.0F, 0.0F, true);
		bone2.texOffs(9, 0).addBox(0.0F, -5.5F, -1.5F, 1.0F, 1.0F, 1.0F, 0.1F, true);

		spikes3 = new ModelRenderer(this);
		spikes3.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(spikes3);
		spikes3.texOffs(39, 32).addBox(-6.5F, -32.0F, -6.5F, 13.0F, 32.0F, 13.0F, 0.3F, false);
		spikes3.texOffs(8, 121).addBox(6.775F, -32.0F, -7.8F, 1.0F, 32.0F, 1.0F, 0.3F, false);
		spikes3.texOffs(0, 121).addBox(6.775F, -32.0F, 6.8F, 1.0F, 32.0F, 1.0F, 0.3F, false);
		spikes3.texOffs(72, 112).addBox(-7.775F, -32.0F, 6.8F, 1.0F, 32.0F, 1.0F, 0.3F, false);
		spikes3.texOffs(4, 121).addBox(-7.775F, -32.0F, -7.8F, 1.0F, 32.0F, 1.0F, 0.3F, false);

		blue_spikes3 = new ModelRenderer(this);
		blue_spikes3.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(blue_spikes3);
		blue_spikes3.texOffs(0, 0).addBox(-6.5F, -32.0F, -6.5F, 13.0F, 32.0F, 13.0F, 0.31F, false);
		blue_spikes3.texOffs(68, 112).addBox(7.12F, -32.0F, -8.12F, 1.0F, 32.0F, 1.0F, 0.31F, false);
		blue_spikes3.texOffs(64, 112).addBox(7.12F, -32.0F, 7.12F, 1.0F, 32.0F, 1.0F, 0.31F, false);
		blue_spikes3.texOffs(60, 112).addBox(-8.12F, -32.0F, 7.12F, 1.0F, 32.0F, 1.0F, 0.31F, false);
		blue_spikes3.texOffs(56, 112).addBox(-8.12F, -32.0F, -8.12F, 1.0F, 32.0F, 1.0F, 0.31F, false);

		right_hand = new ModelRenderer(this);
		right_hand.setPos(-5.0F, -17.0F, 0.0F);
		total.addChild(right_hand);
		right_hand.texOffs(0, 109).addBox(-10.0F, -2.0F, -3.5F, 10.0F, 6.0F, 6.0F, 0.0F, false);

		right_hand_r1 = new ModelRenderer(this);
		right_hand_r1.setPos(-10.01F, 4.01F, -3.51F);
		right_hand.addChild(right_hand_r1);
		setRotationAngle(right_hand_r1, 0.0F, 0.0F, -0.1745F);
		right_hand_r1.texOffs(102, 109).addBox(0.01F, -13.01F, 0.01F, 6.0F, 13.0F, 6.0F, -0.1F, false);

		spikes1 = new ModelRenderer(this);
		spikes1.setPos(0.0F, 0.0F, 0.0F);
		right_hand.addChild(spikes1);
		spikes1.texOffs(52, 100).addBox(-10.0F, -2.0F, -3.5F, 10.0F, 6.0F, 6.0F, 0.3F, false);
		spikes1.texOffs(16, 57).addBox(-10.0F, 4.6F, -5.1F, 10.0F, 1.0F, 1.0F, 0.3F, false);
		spikes1.texOffs(52, 30).addBox(-10.0F, -3.6F, -5.1F, 10.0F, 1.0F, 1.0F, 0.3F, false);
		spikes1.texOffs(52, 28).addBox(-10.0F, 4.6F, 3.1F, 10.0F, 1.0F, 1.0F, 0.3F, false);

		right_hand_r2 = new ModelRenderer(this);
		right_hand_r2.setPos(-3.7072F, 2.8987F, -4.91F);
		spikes1.addChild(right_hand_r2);
		setRotationAngle(right_hand_r2, 0.0F, 0.0F, -0.1745F);
		right_hand_r2.texOffs(24, 121).addBox(0.01F, -13.01F, 0.01F, 1.0F, 13.0F, 1.0F, 0.2F, false);
		right_hand_r2.texOffs(28, 121).addBox(0.01F, -13.01F, 7.81F, 1.0F, 13.0F, 1.0F, 0.2F, false);

		right_hand_r3 = new ModelRenderer(this);
		right_hand_r3.setPos(-11.3887F, 4.2531F, 2.89F);
		spikes1.addChild(right_hand_r3);
		setRotationAngle(right_hand_r3, 0.0F, 0.0F, -0.1745F);
		right_hand_r3.texOffs(126, 109).addBox(0.01F, -13.01F, 0.01F, 1.0F, 13.0F, 1.0F, 0.2F, false);

		right_hand_r4 = new ModelRenderer(this);
		right_hand_r4.setPos(-10.01F, 4.01F, -3.51F);
		spikes1.addChild(right_hand_r4);
		setRotationAngle(right_hand_r4, 0.0F, 0.0F, -0.1745F);
		right_hand_r4.texOffs(78, 109).addBox(0.01F, -13.01F, 0.01F, 6.0F, 13.0F, 6.0F, 0.2F, false);

		blue_spikes1 = new ModelRenderer(this);
		blue_spikes1.setPos(0.0F, 0.0F, 0.0F);
		right_hand.addChild(blue_spikes1);
		blue_spikes1.texOffs(0, 45).addBox(-10.0F, -2.0F, -3.5F, 10.0F, 6.0F, 6.0F, 0.31F, false);
		blue_spikes1.texOffs(52, 26).addBox(-10.0F, 4.6F, -5.1F, 10.0F, 1.0F, 1.0F, 0.31F, false);
		blue_spikes1.texOffs(39, 11).addBox(-10.0F, -3.6F, -5.1F, 10.0F, 1.0F, 1.0F, 0.31F, false);
		blue_spikes1.texOffs(39, 9).addBox(-10.0F, 4.6F, 3.1F, 10.0F, 1.0F, 1.0F, 0.31F, false);

		right_hand_r5 = new ModelRenderer(this);
		right_hand_r5.setPos(-3.6875F, 2.8952F, -4.93F);
		blue_spikes1.addChild(right_hand_r5);
		setRotationAngle(right_hand_r5, 0.0F, 0.0F, -0.1745F);
		right_hand_r5.texOffs(12, 121).addBox(0.01F, -13.01F, 0.01F, 1.0F, 13.0F, 1.0F, 0.21F, false);

		right_hand_r6 = new ModelRenderer(this);
		right_hand_r6.setPos(-3.7072F, 2.8987F, 2.89F);
		blue_spikes1.addChild(right_hand_r6);
		setRotationAngle(right_hand_r6, 0.0F, 0.0F, -0.1745F);
		right_hand_r6.texOffs(16, 121).addBox(0.01F, -13.01F, 0.01F, 1.0F, 13.0F, 1.0F, 0.21F, false);

		right_hand_r7 = new ModelRenderer(this);
		right_hand_r7.setPos(-11.4084F, 4.2566F, 2.91F);
		blue_spikes1.addChild(right_hand_r7);
		setRotationAngle(right_hand_r7, 0.0F, 0.0F, -0.1745F);
		right_hand_r7.texOffs(20, 121).addBox(0.01F, -13.01F, 0.01F, 1.0F, 13.0F, 1.0F, 0.21F, false);

		right_hand_r8 = new ModelRenderer(this);
		right_hand_r8.setPos(-10.01F, 4.01F, -3.51F);
		blue_spikes1.addChild(right_hand_r8);
		setRotationAngle(right_hand_r8, 0.0F, 0.0F, -0.1745F);
		right_hand_r8.texOffs(32, 109).addBox(0.01F, -13.01F, 0.01F, 6.0F, 13.0F, 6.0F, 0.21F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setPos(5.0F, -17.0F, 0.0F);
		total.addChild(left_hand);
		left_hand.texOffs(0, 109).addBox(0.0F, -2.0F, -3.5F, 10.0F, 6.0F, 6.0F, 0.0F, true);

		left_hand_r1 = new ModelRenderer(this);
		left_hand_r1.setPos(10.01F, 4.01F, -3.51F);
		left_hand.addChild(left_hand_r1);
		setRotationAngle(left_hand_r1, 0.0F, 0.0F, 0.1745F);
		left_hand_r1.texOffs(102, 109).addBox(-6.01F, -13.01F, 0.01F, 6.0F, 13.0F, 6.0F, -0.1F, true);

		spikes2 = new ModelRenderer(this);
		spikes2.setPos(0.0F, 0.0F, 0.0F);
		left_hand.addChild(spikes2);
		spikes2.texOffs(52, 100).addBox(0.0F, -2.0F, -3.5F, 10.0F, 6.0F, 6.0F, 0.3F, true);
		spikes2.texOffs(16, 57).addBox(0.0F, 4.6F, -5.1F, 10.0F, 1.0F, 1.0F, 0.3F, true);
		spikes2.texOffs(52, 30).addBox(0.0F, -3.6F, -5.1F, 10.0F, 1.0F, 1.0F, 0.3F, true);
		spikes2.texOffs(52, 28).addBox(0.0F, 4.6F, 3.1F, 10.0F, 1.0F, 1.0F, 0.3F, true);

		left_hand_r2 = new ModelRenderer(this);
		left_hand_r2.setPos(3.7072F, 2.8987F, -4.91F);
		spikes2.addChild(left_hand_r2);
		setRotationAngle(left_hand_r2, 0.0F, 0.0F, 0.1745F);
		left_hand_r2.texOffs(24, 121).addBox(-1.01F, -13.01F, 0.01F, 1.0F, 13.0F, 1.0F, 0.2F, true);
		left_hand_r2.texOffs(28, 121).addBox(-1.01F, -13.01F, 7.81F, 1.0F, 13.0F, 1.0F, 0.2F, true);

		left_hand_r3 = new ModelRenderer(this);
		left_hand_r3.setPos(11.3887F, 4.2531F, 2.89F);
		spikes2.addChild(left_hand_r3);
		setRotationAngle(left_hand_r3, 0.0F, 0.0F, 0.1745F);
		left_hand_r3.texOffs(126, 109).addBox(-1.01F, -13.01F, 0.01F, 1.0F, 13.0F, 1.0F, 0.2F, true);

		left_hand_r4 = new ModelRenderer(this);
		left_hand_r4.setPos(10.01F, 4.01F, -3.51F);
		spikes2.addChild(left_hand_r4);
		setRotationAngle(left_hand_r4, 0.0F, 0.0F, 0.1745F);
		left_hand_r4.texOffs(78, 109).addBox(-6.01F, -13.01F, 0.01F, 6.0F, 13.0F, 6.0F, 0.2F, true);

		blue_spikes2 = new ModelRenderer(this);
		blue_spikes2.setPos(0.0F, 0.0F, 0.0F);
		left_hand.addChild(blue_spikes2);
		blue_spikes2.texOffs(0, 45).addBox(0.0F, -2.0F, -3.5F, 10.0F, 6.0F, 6.0F, 0.31F, true);
		blue_spikes2.texOffs(52, 26).addBox(0.0F, 4.6F, -5.1F, 10.0F, 1.0F, 1.0F, 0.31F, true);
		blue_spikes2.texOffs(39, 11).addBox(0.0F, -3.6F, -5.1F, 10.0F, 1.0F, 1.0F, 0.31F, true);
		blue_spikes2.texOffs(39, 9).addBox(0.0F, 4.6F, 3.1F, 10.0F, 1.0F, 1.0F, 0.31F, true);

		left_hand_r5 = new ModelRenderer(this);
		left_hand_r5.setPos(3.6875F, 2.8952F, -4.93F);
		blue_spikes2.addChild(left_hand_r5);
		setRotationAngle(left_hand_r5, 0.0F, 0.0F, 0.1745F);
		left_hand_r5.texOffs(12, 121).addBox(-1.01F, -13.01F, 0.01F, 1.0F, 13.0F, 1.0F, 0.21F, true);

		left_hand_r6 = new ModelRenderer(this);
		left_hand_r6.setPos(3.7072F, 2.8987F, 2.89F);
		blue_spikes2.addChild(left_hand_r6);
		setRotationAngle(left_hand_r6, 0.0F, 0.0F, 0.1745F);
		left_hand_r6.texOffs(16, 121).addBox(-1.01F, -13.01F, 0.01F, 1.0F, 13.0F, 1.0F, 0.21F, true);

		left_hand_r7 = new ModelRenderer(this);
		left_hand_r7.setPos(11.4084F, 4.2566F, 2.91F);
		blue_spikes2.addChild(left_hand_r7);
		setRotationAngle(left_hand_r7, 0.0F, 0.0F, 0.1745F);
		left_hand_r7.texOffs(20, 121).addBox(-1.01F, -13.01F, 0.01F, 1.0F, 13.0F, 1.0F, 0.21F, true);

		left_hand_r8 = new ModelRenderer(this);
		left_hand_r8.setPos(10.01F, 4.01F, -3.51F);
		blue_spikes2.addChild(left_hand_r8);
		setRotationAngle(left_hand_r8, 0.0F, 0.0F, 0.1745F);
		left_hand_r8.texOffs(32, 109).addBox(-6.01F, -13.01F, 0.01F, 6.0F, 13.0F, 6.0F, 0.21F, true);

		body2 = new ModelRenderer(this);
		body2.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(body2);
		body2.texOffs(91, 87).addBox(-6.5F, 0.0F, -6.5F, 13.0F, 9.0F, 13.0F, 0.0F, false);

		spikes4 = new ModelRenderer(this);
		spikes4.setPos(0.0F, 11.0F, 0.0F);
		body2.addChild(spikes4);
		spikes4.texOffs(91, 55).addBox(-6.5F, -11.0F, -6.5F, 13.0F, 9.0F, 13.0F, 0.3F, false);
		spikes4.texOffs(99, 55).addBox(-8.1F, -11.0F, -8.1F, 1.0F, 9.0F, 1.0F, 0.3F, false);
		spikes4.texOffs(96, 33).addBox(7.1F, -11.0F, -8.1F, 1.0F, 9.0F, 1.0F, 0.3F, false);
		spikes4.texOffs(95, 77).addBox(7.1F, -11.0F, 7.1F, 1.0F, 9.0F, 1.0F, 0.3F, false);
		spikes4.texOffs(95, 55).addBox(-8.1F, -11.0F, 7.1F, 1.0F, 9.0F, 1.0F, 0.3F, false);

		blue_spikes4 = new ModelRenderer(this);
		blue_spikes4.setPos(0.0F, 11.0F, 0.0F);
		body2.addChild(blue_spikes4);
		blue_spikes4.texOffs(91, 33).addBox(-6.5F, -11.0F, -6.5F, 13.0F, 9.0F, 13.0F, 0.31F, false);
		blue_spikes4.texOffs(91, 77).addBox(-8.12F, -11.0F, -8.12F, 1.0F, 9.0F, 1.0F, 0.31F, false);
		blue_spikes4.texOffs(91, 55).addBox(7.12F, -11.0F, -8.12F, 1.0F, 9.0F, 1.0F, 0.31F, false);
		blue_spikes4.texOffs(86, 23).addBox(7.12F, -11.0F, 7.12F, 1.0F, 9.0F, 1.0F, 0.31F, false);
		blue_spikes4.texOffs(82, 23).addBox(-8.12F, -11.0F, 7.12F, 1.0F, 9.0F, 1.0F, 0.31F, false);

		body3 = new ModelRenderer(this);
		body3.setPos(0.0F, 9.0F, 0.0F);
		total.addChild(body3);
		body3.texOffs(91, 10).addBox(-6.5F, 0.0F, -6.5F, 13.0F, 10.0F, 13.0F, 0.0F, false);

		spikes5 = new ModelRenderer(this);
		spikes5.setPos(0.0F, 12.0F, 0.0F);
		body3.addChild(spikes5);
		spikes5.texOffs(52, 77).addBox(-6.5F, -12.0F, -6.5F, 13.0F, 10.0F, 13.0F, 0.3F, false);
		spikes5.texOffs(78, 26).addBox(-8.1F, -12.0F, -8.1F, 1.0F, 10.0F, 1.0F, 0.3F, false);
		spikes5.texOffs(60, 77).addBox(7.1F, -12.0F, -8.1F, 1.0F, 10.0F, 1.0F, 0.3F, false);
		spikes5.texOffs(56, 77).addBox(7.1F, -12.0F, 7.1F, 1.0F, 10.0F, 1.0F, 0.3F, false);
		spikes5.texOffs(52, 77).addBox(-8.1F, -12.0F, 7.1F, 1.0F, 10.0F, 1.0F, 0.3F, false);

		blue_spikes5 = new ModelRenderer(this);
		blue_spikes5.setPos(0.0F, 11.0F, 0.0F);
		body3.addChild(blue_spikes5);
		blue_spikes5.texOffs(52, 0).addBox(-6.5F, -11.0F, -6.5F, 13.0F, 10.0F, 13.0F, 0.31F, false);
		blue_spikes5.texOffs(8, 64).addBox(-8.12F, -11.0F, -8.12F, 1.0F, 10.0F, 1.0F, 0.31F, false);
		blue_spikes5.texOffs(4, 64).addBox(7.12F, -11.0F, -8.12F, 1.0F, 10.0F, 1.0F, 0.31F, false);
		blue_spikes5.texOffs(0, 64).addBox(7.12F, -11.0F, 7.12F, 1.0F, 10.0F, 1.0F, 0.31F, false);
		blue_spikes5.texOffs(32, 45).addBox(-8.12F, -11.0F, 7.12F, 1.0F, 10.0F, 1.0F, 0.31F, false);

		body4 = new ModelRenderer(this);
		body4.setPos(0.0F, 19.0F, 0.0F);
		total.addChild(body4);
		body4.texOffs(91, 10).addBox(-6.5F, 0.0F, -6.5F, 13.0F, 10.0F, 13.0F, 0.0F, false);

		spikes6 = new ModelRenderer(this);
		spikes6.setPos(0.0F, 12.0F, 0.0F);
		body4.addChild(spikes6);
		spikes6.texOffs(52, 77).addBox(-6.5F, -12.0F, -6.5F, 13.0F, 10.0F, 13.0F, 0.3F, false);
		spikes6.texOffs(78, 26).addBox(-8.1F, -12.0F, -8.1F, 1.0F, 10.0F, 1.0F, 0.3F, false);
		spikes6.texOffs(60, 77).addBox(7.1F, -12.0F, -8.1F, 1.0F, 10.0F, 1.0F, 0.3F, false);
		spikes6.texOffs(56, 77).addBox(7.1F, -12.0F, 7.1F, 1.0F, 10.0F, 1.0F, 0.3F, false);
		spikes6.texOffs(52, 77).addBox(-8.1F, -12.0F, 7.1F, 1.0F, 10.0F, 1.0F, 0.3F, false);

		blue_spikes6 = new ModelRenderer(this);
		blue_spikes6.setPos(0.0F, 11.0F, 0.0F);
		body4.addChild(blue_spikes6);
		blue_spikes6.texOffs(52, 0).addBox(-6.5F, -11.0F, -6.5F, 13.0F, 10.0F, 13.0F, 0.31F, false);
		blue_spikes6.texOffs(8, 64).addBox(-8.12F, -11.0F, -8.12F, 1.0F, 10.0F, 1.0F, 0.31F, false);
		blue_spikes6.texOffs(4, 64).addBox(7.12F, -11.0F, -8.12F, 1.0F, 10.0F, 1.0F, 0.31F, false);
		blue_spikes6.texOffs(0, 64).addBox(7.12F, -11.0F, 7.12F, 1.0F, 10.0F, 1.0F, 0.31F, false);
		blue_spikes6.texOffs(32, 45).addBox(-8.12F, -11.0F, 7.12F, 1.0F, 10.0F, 1.0F, 0.31F, false);

		body5 = new ModelRenderer(this);
		body5.setPos(0.0F, 29.0F, 0.0F);
		total.addChild(body5);
		body5.texOffs(91, 10).addBox(-6.5F, 0.0F, -6.5F, 13.0F, 10.0F, 13.0F, 0.0F, false);

		spikes7 = new ModelRenderer(this);
		spikes7.setPos(0.0F, 12.0F, 0.0F);
		body5.addChild(spikes7);
		spikes7.texOffs(52, 77).addBox(-6.5F, -12.0F, -6.5F, 13.0F, 10.0F, 13.0F, 0.3F, false);
		spikes7.texOffs(78, 26).addBox(-8.1F, -12.0F, -8.1F, 1.0F, 10.0F, 1.0F, 0.3F, false);
		spikes7.texOffs(60, 77).addBox(7.1F, -12.0F, -8.1F, 1.0F, 10.0F, 1.0F, 0.3F, false);
		spikes7.texOffs(56, 77).addBox(7.1F, -12.0F, 7.1F, 1.0F, 10.0F, 1.0F, 0.3F, false);
		spikes7.texOffs(52, 77).addBox(-8.1F, -12.0F, 7.1F, 1.0F, 10.0F, 1.0F, 0.3F, false);

		blue_spikes7 = new ModelRenderer(this);
		blue_spikes7.setPos(0.0F, 11.0F, 0.0F);
		body5.addChild(blue_spikes7);
		blue_spikes7.texOffs(52, 0).addBox(-6.5F, -11.0F, -6.5F, 13.0F, 10.0F, 13.0F, 0.31F, false);
		blue_spikes7.texOffs(8, 64).addBox(-8.12F, -11.0F, -8.12F, 1.0F, 10.0F, 1.0F, 0.31F, false);
		blue_spikes7.texOffs(4, 64).addBox(7.12F, -11.0F, -8.12F, 1.0F, 10.0F, 1.0F, 0.31F, false);
		blue_spikes7.texOffs(0, 64).addBox(7.12F, -11.0F, 7.12F, 1.0F, 10.0F, 1.0F, 0.31F, false);
		blue_spikes7.texOffs(32, 45).addBox(-8.12F, -11.0F, 7.12F, 1.0F, 10.0F, 1.0F, 0.31F, false);

		getPlantWholeBody = new ModelRenderer(this);
		getPlantWholeBody.setPos(0.0F, 0.0F, 0.0F);

	}


	@Override
	public void setupAnim(CactusEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		final float height = entity.getCactusHeight();
		final boolean powered = entity.isCactusPowered();
		//body
		this.body2.visible = height > 0;
		this.body3.visible = height > CactusEntity.SEGMENT_HEIGHT;
		this.body4.visible = height > 2 * CactusEntity.SEGMENT_HEIGHT;
		this.body5.visible = height > 3 * CactusEntity.SEGMENT_HEIGHT;
		//spikes
		this.spikes1.visible = ! powered;
		this.blue_spikes1.visible = powered;
		this.spikes2.visible = ! powered;
		this.blue_spikes2.visible = powered;
		this.spikes3.visible = ! powered;
		this.blue_spikes3.visible = powered;
		if(this.body2.visible) {
			this.spikes4.visible = ! powered;
			this.blue_spikes4.visible = powered;
		}
		if(this.body3.visible) {
			this.spikes5.visible = ! powered;
			this.blue_spikes5.visible = powered;
		}
		if(this.body4.visible) {
			this.spikes6.visible = ! powered;
			this.blue_spikes6.visible = powered;
		}
		if(this.body5.visible) {
			this.spikes7.visible = ! powered;
			this.blue_spikes7.visible = powered;
		}
		this.blue_eyes.visible = powered;
//		super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.total;
	}
	
	@Override
	public Optional<ModelRenderer> getBodyModel() {
		return Optional.ofNullable(this.total);
	}
	
	@Override
	public float getMaxRotAngle() {
		return 10F;
	}
	
}