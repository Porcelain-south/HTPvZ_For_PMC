package com.hungteen.pvz.client.model.entity.plant.defence;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.defence.WaterGuardEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class WaterGuardModel extends PVZPlantModel<WaterGuardEntity> {
	private final ModelRenderer total;
	private final ModelRenderer body;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer head;
	private final ModelRenderer cube_r3;
	private final ModelRenderer petal;
	private final ModelRenderer petal2;
	private final ModelRenderer petal3;
	private final ModelRenderer petal4;
	private final ModelRenderer petal5;
	private final ModelRenderer petal6;
	private final ModelRenderer petal7;
	private final ModelRenderer petal8;
	private final ModelRenderer petal9;
	private final ModelRenderer petal10;
	private final ModelRenderer petal25;
	private final ModelRenderer petal26;
	private final ModelRenderer petal27;
	private final ModelRenderer petal28;
	private final ModelRenderer petal29;
	private final ModelRenderer petal30;
	private final ModelRenderer petal39;
	private final ModelRenderer petal40;
	private final ModelRenderer petal31;
	private final ModelRenderer petal32;
	private final ModelRenderer petal33;
	private final ModelRenderer petal34;
	private final ModelRenderer petal35;
	private final ModelRenderer petal36;
	private final ModelRenderer petal37;
	private final ModelRenderer petal38;
	private final ModelRenderer petal19;
	private final ModelRenderer petal20;
	private final ModelRenderer petal23;
	private final ModelRenderer petal24;
	private final ModelRenderer petal21;
	private final ModelRenderer petal22;
	private final ModelRenderer petal13;
	private final ModelRenderer petal14;
	private final ModelRenderer petal17;
	private final ModelRenderer petal18;
	private final ModelRenderer petal15;
	private final ModelRenderer petal16;
	private final ModelRenderer petal11;
	private final ModelRenderer petal12;
	private final ModelRenderer eyes;
	private final ModelRenderer eye;
	private final ModelRenderer eye2;
	private final ModelRenderer leaves;
	private final ModelRenderer leaf1;
	private final ModelRenderer leaf2;
	private final ModelRenderer leaf3;
	private final ModelRenderer leaf4;
	private final ModelRenderer cube_r4;
	private final ModelRenderer getPlantWholeBody;

	public WaterGuardModel() {
		texWidth = 128;
		texHeight = 128;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		body = new ModelRenderer(this);
		body.setPos(0.0F, -6.5F, 0.0F);
		total.addChild(body);
		body.texOffs(16, 33).addBox(-1.5F, -7.5F, -1.5F, 3.0F, 18.0F, 3.0F, 0.0F, false);
		body.texOffs(12, 49).addBox(-2.5F, -7.5F, 1.5F, 1.0F, 18.0F, 1.0F, 0.0F, false);
		body.texOffs(8, 49).addBox(-2.5F, -7.5F, -2.5F, 1.0F, 18.0F, 1.0F, 0.0F, false);
		body.texOffs(4, 49).addBox(1.5F, -7.5F, -2.5F, 1.0F, 18.0F, 1.0F, 0.0F, false);
		body.texOffs(0, 49).addBox(1.5F, -7.5F, 1.5F, 1.0F, 18.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 18.5F, 0.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.7854F, 0.0F);
		cube_r1.texOffs(28, 34).addBox(0.0F, -8.5F, -1.5F, 1.0F, 21.0F, 3.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 18.5F, 0.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.7854F, 0.0F);
		cube_r2.texOffs(28, 34).addBox(0.0F, -8.5F, -1.5F, 1.0F, 21.0F, 3.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -9.0F, 0.0F);
		body.addChild(head);
		head.texOffs(36, 34).addBox(-2.5F, -0.5F, -2.5F, 5.0F, 2.0F, 5.0F, 0.0F, false);
		head.texOffs(36, 41).addBox(-2.0F, -7.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, -1.0F, 0.0F);
		head.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.7854F, 0.0F);
		cube_r3.texOffs(32, 18).addBox(-3.0F, -1.5F, -3.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);

		petal = new ModelRenderer(this);
		petal.setPos(0.0F, -1.0F, 0.0F);
		head.addChild(petal);
		setRotationAngle(petal, 0.4326F, -0.678F, -0.6346F);
		petal.texOffs(34, 0).addBox(-7.0F, 0.0F, -2.5F, 6.0F, 1.0F, 5.0F, 0.0F, false);

		petal2 = new ModelRenderer(this);
		petal2.setPos(-7.0F, 0.0F, 0.0F);
		petal.addChild(petal2);
		setRotationAngle(petal2, 0.0F, 0.0F, 0.48F);
		petal2.texOffs(34, 6).addBox(-5.0F, 0.0F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);

		petal3 = new ModelRenderer(this);
		petal3.setPos(0.0F, -1.0F, 0.0F);
		head.addChild(petal3);
		setRotationAngle(petal3, 2.709F, -0.678F, -2.507F);
		petal3.texOffs(34, 0).addBox(-7.0F, 0.0F, -2.5F, 6.0F, 1.0F, 5.0F, 0.0F, false);

		petal4 = new ModelRenderer(this);
		petal4.setPos(-7.0F, 0.0F, 0.0F);
		petal3.addChild(petal4);
		setRotationAngle(petal4, 0.0F, 0.0F, 0.48F);
		petal4.texOffs(34, 6).addBox(-5.0F, 0.0F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);

		petal5 = new ModelRenderer(this);
		petal5.setPos(0.0F, -1.0F, 0.0F);
		head.addChild(petal5);
		setRotationAngle(petal5, -2.709F, 0.678F, -2.507F);
		petal5.texOffs(34, 0).addBox(-7.0F, 0.0F, -2.5F, 6.0F, 1.0F, 5.0F, 0.0F, false);

		petal6 = new ModelRenderer(this);
		petal6.setPos(-7.0F, 0.0F, 0.0F);
		petal5.addChild(petal6);
		setRotationAngle(petal6, 0.0F, 0.0F, 0.48F);
		petal6.texOffs(34, 6).addBox(-5.0F, 0.0F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);

		petal7 = new ModelRenderer(this);
		petal7.setPos(0.0F, -1.0F, 0.0F);
		head.addChild(petal7);
		setRotationAngle(petal7, -0.4326F, 0.678F, -0.6346F);
		petal7.texOffs(34, 0).addBox(-7.0F, 0.0F, -2.5F, 6.0F, 1.0F, 5.0F, 0.0F, false);

		petal8 = new ModelRenderer(this);
		petal8.setPos(-7.0F, 0.0F, 0.0F);
		petal7.addChild(petal8);
		setRotationAngle(petal8, 0.0F, 0.0F, 0.48F);
		petal8.texOffs(34, 6).addBox(-5.0F, 0.0F, -2.0F, 5.0F, 1.0F, 4.0F, 0.0F, false);

		petal9 = new ModelRenderer(this);
		petal9.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(petal9);
		petal9.texOffs(30, 11).addBox(-8.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal10 = new ModelRenderer(this);
		petal10.setPos(-8.0F, 0.0F, 0.0F);
		petal9.addChild(petal10);
		setRotationAngle(petal10, 0.0F, 0.0F, 1.3526F);
		petal10.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal25 = new ModelRenderer(this);
		petal25.setPos(0.0F, -1.0F, 0.0F);
		head.addChild(petal25);
		setRotationAngle(petal25, -0.0361F, -0.3911F, 0.0944F);
		petal25.texOffs(30, 11).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal26 = new ModelRenderer(this);
		petal26.setPos(-7.0F, 0.0F, 0.0F);
		petal25.addChild(petal26);
		setRotationAngle(petal26, 0.0F, 0.0F, 1.4835F);
		petal26.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal27 = new ModelRenderer(this);
		petal27.setPos(0.0F, -1.0F, 0.0F);
		head.addChild(petal27);
		setRotationAngle(petal27, -0.5607F, -1.1418F, 0.6601F);
		petal27.texOffs(30, 11).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal28 = new ModelRenderer(this);
		petal28.setPos(-7.0F, 0.0F, 0.0F);
		petal27.addChild(petal28);
		setRotationAngle(petal28, 0.0F, 0.0F, 1.4835F);
		petal28.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal29 = new ModelRenderer(this);
		petal29.setPos(0.0F, -1.0F, 0.0F);
		head.addChild(petal29);
		setRotationAngle(petal29, -2.8245F, -0.7798F, 2.7049F);
		petal29.texOffs(30, 11).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal30 = new ModelRenderer(this);
		petal30.setPos(-7.0F, 0.0F, 0.0F);
		petal29.addChild(petal30);
		setRotationAngle(petal30, 0.0F, 0.0F, 1.4835F);
		petal30.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal39 = new ModelRenderer(this);
		petal39.setPos(0.0F, -1.0F, 1.0F);
		head.addChild(petal39);
		setRotationAngle(petal39, -0.2954F, -0.6105F, 0.3624F);
		petal39.texOffs(30, 11).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal40 = new ModelRenderer(this);
		petal40.setPos(-7.0F, 0.0F, 0.0F);
		petal39.addChild(petal40);
		setRotationAngle(petal40, 0.0F, 0.0F, 1.4835F);
		petal40.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal31 = new ModelRenderer(this);
		petal31.setPos(0.0F, -1.0F, 0.0F);
		head.addChild(petal31);
		setRotationAngle(petal31, 3.1301F, 0.1304F, 3.0536F);
		petal31.texOffs(30, 11).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal32 = new ModelRenderer(this);
		petal32.setPos(-7.0F, 0.0F, 0.0F);
		petal31.addChild(petal32);
		setRotationAngle(petal32, 0.0F, 0.0F, 1.4835F);
		petal32.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal33 = new ModelRenderer(this);
		petal33.setPos(0.0F, -1.25F, -0.75F);
		head.addChild(petal33);
		setRotationAngle(petal33, 2.6802F, 1.029F, 2.6158F);
		petal33.texOffs(30, 11).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal34 = new ModelRenderer(this);
		petal34.setPos(-7.0F, 0.0F, 0.0F);
		petal33.addChild(petal34);
		setRotationAngle(petal34, 0.0F, 0.0F, 1.4835F);
		petal34.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal35 = new ModelRenderer(this);
		petal35.setPos(0.0F, -1.0F, 0.0F);
		head.addChild(petal35);
		setRotationAngle(petal35, 0.1659F, 1.0836F, 0.1873F);
		petal35.texOffs(30, 11).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal36 = new ModelRenderer(this);
		petal36.setPos(-7.0F, 0.0F, 0.0F);
		petal35.addChild(petal36);
		setRotationAngle(petal36, 0.0F, 0.0F, 1.4835F);
		petal36.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal37 = new ModelRenderer(this);
		petal37.setPos(1.0F, -1.0F, 0.0F);
		head.addChild(petal37);
		setRotationAngle(petal37, 0.1318F, 0.5034F, 0.3473F);
		petal37.texOffs(30, 11).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal38 = new ModelRenderer(this);
		petal38.setPos(-7.0F, 0.0F, 0.0F);
		petal37.addChild(petal38);
		setRotationAngle(petal38, 0.0F, 0.0F, 1.4835F);
		petal38.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal19 = new ModelRenderer(this);
		petal19.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(petal19);
		setRotationAngle(petal19, 0.0F, 1.5708F, 0.0F);
		petal19.texOffs(30, 11).addBox(-8.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal20 = new ModelRenderer(this);
		petal20.setPos(-8.0F, 0.0F, 0.0F);
		petal19.addChild(petal20);
		setRotationAngle(petal20, 0.0F, 0.0F, 1.3526F);
		petal20.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal23 = new ModelRenderer(this);
		petal23.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(petal23);
		setRotationAngle(petal23, -3.098F, 0.7844F, -3.0799F);
		petal23.texOffs(30, 11).addBox(-8.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal24 = new ModelRenderer(this);
		petal24.setPos(-8.0F, 0.0F, 0.0F);
		petal23.addChild(petal24);
		setRotationAngle(petal24, 0.0F, 0.0F, 1.3526F);
		petal24.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal21 = new ModelRenderer(this);
		petal21.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(petal21);
		setRotationAngle(petal21, -0.0436F, 0.7844F, -0.0617F);
		petal21.texOffs(30, 11).addBox(-8.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal22 = new ModelRenderer(this);
		petal22.setPos(-8.0F, 0.0F, 0.0F);
		petal21.addChild(petal22);
		setRotationAngle(petal22, 0.0F, 0.0F, 1.3526F);
		petal22.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal13 = new ModelRenderer(this);
		petal13.setPos(0.0F, 0.0F, 1.25F);
		head.addChild(petal13);
		setRotationAngle(petal13, 0.0F, -1.5708F, 0.0F);
		petal13.texOffs(30, 11).addBox(-8.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal14 = new ModelRenderer(this);
		petal14.setPos(-8.0F, 0.0F, 0.0F);
		petal13.addChild(petal14);
		setRotationAngle(petal14, 0.0F, 0.0F, 1.3526F);
		petal14.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal17 = new ModelRenderer(this);
		petal17.setPos(0.0F, 0.0F, 0.0F);
		head.addChild(petal17);
		setRotationAngle(petal17, 0.0F, 3.1416F, 0.0F);
		petal17.texOffs(30, 11).addBox(-8.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal18 = new ModelRenderer(this);
		petal18.setPos(-8.0F, 0.0F, 0.0F);
		petal17.addChild(petal18);
		setRotationAngle(petal18, 0.0F, 0.0F, 1.3526F);
		petal18.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal15 = new ModelRenderer(this);
		petal15.setPos(0.0F, 0.0F, 1.25F);
		head.addChild(petal15);
		setRotationAngle(petal15, 3.098F, -0.7844F, -3.0799F);
		petal15.texOffs(30, 11).addBox(-8.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal16 = new ModelRenderer(this);
		petal16.setPos(-8.0F, 0.0F, 0.0F);
		petal15.addChild(petal16);
		setRotationAngle(petal16, 0.0F, 0.0F, 1.3526F);
		petal16.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal11 = new ModelRenderer(this);
		petal11.setPos(1.25F, 0.0F, 0.75F);
		head.addChild(petal11);
		setRotationAngle(petal11, 0.0436F, -0.7844F, -0.0617F);
		petal11.texOffs(30, 11).addBox(-8.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		petal12 = new ModelRenderer(this);
		petal12.setPos(-8.0F, 0.0F, 0.0F);
		petal11.addChild(petal12);
		setRotationAngle(petal12, 0.0F, 0.0F, 1.3526F);
		petal12.texOffs(26, 27).addBox(-7.0F, 0.0F, -3.0F, 7.0F, 1.0F, 6.0F, 0.0F, false);

		eyes = new ModelRenderer(this);
		eyes.setPos(0.0F, 1.0F, 0.0F);
		head.addChild(eyes);


		eye = new ModelRenderer(this);
		eye.setPos(-4.4136F, -4.2519F, -7.0F);
		eyes.addChild(eye);
		setRotationAngle(eye, 0.023F, 0.173F, 0.3947F);
		eye.texOffs(46, 26).addBox(-3.5F, -2.0F, -0.5F, 7.0F, 4.0F, 1.0F, 0.0F, false);

		eye2 = new ModelRenderer(this);
		eye2.setPos(4.4136F, -4.2519F, -7.0F);
		eyes.addChild(eye2);
		setRotationAngle(eye2, 0.023F, -0.173F, -0.3947F);
		eye2.texOffs(46, 26).addBox(-3.5F, -2.0F, -0.5F, 7.0F, 4.0F, 1.0F, 0.0F, true);

		leaves = new ModelRenderer(this);
		leaves.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(leaves);


		leaf1 = new ModelRenderer(this);
		leaf1.setPos(0.0F, 3.0F, -1.0F);
		leaves.addChild(leaf1);
		leaf1.texOffs(0, 25).addBox(0.0F, -14.0F, 1.0F, 0.0F, 16.0F, 8.0F, 0.0F, false);
		leaf1.texOffs(0, 17).addBox(-7.0F, -18.0F, 9.0F, 14.0F, 14.0F, 2.0F, 0.0F, false);
		leaf1.texOffs(0, 0).addBox(-8.0F, -19.0F, 9.0F, 16.0F, 16.0F, 1.0F, 0.0F, false);

		leaf2 = new ModelRenderer(this);
		leaf2.setPos(-1.0F, 3.0F, 0.0F);
		leaves.addChild(leaf2);
		setRotationAngle(leaf2, 0.0F, 1.5708F, 0.0F);
		leaf2.texOffs(0, 25).addBox(0.0F, -14.0F, 1.0F, 0.0F, 16.0F, 8.0F, 0.0F, false);
		leaf2.texOffs(0, 17).addBox(-7.0F, -18.0F, 9.0F, 14.0F, 14.0F, 2.0F, 0.0F, false);
		leaf2.texOffs(0, 0).addBox(-8.0F, -19.0F, 9.0F, 16.0F, 16.0F, 1.0F, 0.0F, false);

		leaf3 = new ModelRenderer(this);
		leaf3.setPos(1.0F, 3.0F, 0.0F);
		leaves.addChild(leaf3);
		setRotationAngle(leaf3, 0.0F, -1.5708F, 0.0F);
		leaf3.texOffs(0, 25).addBox(0.0F, -14.0F, 1.0F, 0.0F, 16.0F, 8.0F, 0.0F, true);
		leaf3.texOffs(0, 17).addBox(-7.0F, -18.0F, 9.0F, 14.0F, 14.0F, 2.0F, 0.0F, true);
		leaf3.texOffs(0, 0).addBox(-8.0F, -19.0F, 9.0F, 16.0F, 16.0F, 1.0F, 0.0F, true);

		leaf4 = new ModelRenderer(this);
		leaf4.setPos(0.0F, 3.0F, 1.0F);
		leaves.addChild(leaf4);
		setRotationAngle(leaf4, 0.0F, 3.1416F, 0.0F);
		leaf4.texOffs(0, 25).addBox(0.0F, -14.0F, 1.0F, 0.0F, 16.0F, 8.0F, 0.0F, true);
		leaf4.texOffs(0, 0).addBox(-8.0F, -19.0F, 9.0F, 16.0F, 16.0F, 1.0F, 0.0F, true);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0F, -3.0F, 2.0F);
		leaf4.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.016F, -0.0013F, -0.0406F);
		cube_r4.texOffs(0, 17).addBox(-7.0F, -15.0F, 7.0F, 14.0F, 14.0F, 2.0F, 0.0F, true);

		getPlantWholeBody = new ModelRenderer(this);
		getPlantWholeBody.setPos(0.0F, 0.0F, 0.0F);

	}
	@Override
	public void setupAnim(WaterGuardEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
        this.leaves.yRot = ageInTicks / 5;
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<WaterGuardEntity> getPlantModel() {
		return this;
	}
}