package com.hungteen.pvz.client.model.entity.plant.explosion;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.explosion.CobCannonEntity;
import com.hungteen.pvz.utils.AnimationUtil;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class CobCannonModel extends PVZPlantModel<CobCannonEntity> {
	private final ModelRenderer total;
	private final ModelRenderer wheels;
	private final ModelRenderer wheel1;
	private final ModelRenderer wheel8_r1;
	private final ModelRenderer wheel7_r1;
	private final ModelRenderer wheel6_r1;
	private final ModelRenderer wheel5_r1;
	private final ModelRenderer wheel4_r1;
	private final ModelRenderer wheel3_r1;
	private final ModelRenderer wheel2_r1;
	private final ModelRenderer wheel1_r1;
	private final ModelRenderer wheel2;
	private final ModelRenderer wheel9_r1;
	private final ModelRenderer wheel8_r2;
	private final ModelRenderer wheel7_r2;
	private final ModelRenderer wheel6_r2;
	private final ModelRenderer wheel5_r2;
	private final ModelRenderer wheel4_r2;
	private final ModelRenderer wheel3_r2;
	private final ModelRenderer wheel2_r2;
	private final ModelRenderer wheel3;
	private final ModelRenderer wheel9_r2;
	private final ModelRenderer wheel8_r3;
	private final ModelRenderer wheel7_r3;
	private final ModelRenderer wheel6_r3;
	private final ModelRenderer wheel5_r3;
	private final ModelRenderer wheel4_r3;
	private final ModelRenderer wheel3_r3;
	private final ModelRenderer wheel2_r3;
	private final ModelRenderer wheel4;
	private final ModelRenderer wheel10_r1;
	private final ModelRenderer wheel9_r3;
	private final ModelRenderer wheel8_r4;
	private final ModelRenderer wheel7_r4;
	private final ModelRenderer wheel6_r4;
	private final ModelRenderer wheel5_r4;
	private final ModelRenderer wheel4_r4;
	private final ModelRenderer wheel3_r4;
	private final ModelRenderer base;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer base_r1;
	private final ModelRenderer body;
	private final ModelRenderer corn;
	private final ModelRenderer outer;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer leaves;
	private final ModelRenderer tail;


	public CobCannonModel() {
		texWidth = 128;
		texHeight = 128;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		wheels = new ModelRenderer(this);
		wheels.setPos(0.0F, -4.0F, 0.0F);
		total.addChild(wheels);


		wheel1 = new ModelRenderer(this);
		wheel1.setPos(8.0F, 0.0F, -8.0F);
		wheels.addChild(wheel1);
		wheel1.texOffs(0, 15).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		wheel8_r1 = new ModelRenderer(this);
		wheel8_r1.setPos(0.0F, 0.0F, 0.0F);
		wheel1.addChild(wheel8_r1);
		setRotationAngle(wheel8_r1, -0.7835F, 0.0617F, 0.0618F);
		wheel8_r1.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);

		wheel7_r1 = new ModelRenderer(this);
		wheel7_r1.setPos(0.0F, 0.0F, 0.0F);
		wheel1.addChild(wheel7_r1);
		setRotationAngle(wheel7_r1, 0.7835F, -0.0617F, 0.0618F);
		wheel7_r1.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);

		wheel6_r1 = new ModelRenderer(this);
		wheel6_r1.setPos(0.0F, 0.0F, 0.0F);
		wheel1.addChild(wheel6_r1);
		setRotationAngle(wheel6_r1, 2.3581F, -0.0617F, -0.0618F);
		wheel6_r1.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);

		wheel5_r1 = new ModelRenderer(this);
		wheel5_r1.setPos(0.0F, 0.0F, 0.0F);
		wheel1.addChild(wheel5_r1);
		setRotationAngle(wheel5_r1, -2.3581F, 0.0617F, -0.0618F);
		wheel5_r1.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);

		wheel4_r1 = new ModelRenderer(this);
		wheel4_r1.setPos(0.0F, 0.0F, 0.0F);
		wheel1.addChild(wheel4_r1);
		setRotationAngle(wheel4_r1, -1.5708F, 0.0873F, 0.0F);
		wheel4_r1.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);

		wheel3_r1 = new ModelRenderer(this);
		wheel3_r1.setPos(0.0F, 0.0F, 0.0F);
		wheel1.addChild(wheel3_r1);
		setRotationAngle(wheel3_r1, 1.5708F, -0.0873F, 0.0F);
		wheel3_r1.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);

		wheel2_r1 = new ModelRenderer(this);
		wheel2_r1.setPos(0.0F, 0.0F, 0.0F);
		wheel1.addChild(wheel2_r1);
		setRotationAngle(wheel2_r1, 3.1416F, 0.0F, -0.0873F);
		wheel2_r1.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);

		wheel1_r1 = new ModelRenderer(this);
		wheel1_r1.setPos(0.0F, 0.0F, 0.0F);
		wheel1.addChild(wheel1_r1);
		setRotationAngle(wheel1_r1, 0.0F, 0.0F, 0.0873F);
		wheel1_r1.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, false);

		wheel2 = new ModelRenderer(this);
		wheel2.setPos(-8.0F, 0.0F, -8.0F);
		wheels.addChild(wheel2);
		wheel2.texOffs(0, 11).addBox(-1.5F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		wheel9_r1 = new ModelRenderer(this);
		wheel9_r1.setPos(0.0F, 0.0F, 0.0F);
		wheel2.addChild(wheel9_r1);
		setRotationAngle(wheel9_r1, -0.7835F, -0.0617F, -0.0618F);
		wheel9_r1.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, true);

		wheel8_r2 = new ModelRenderer(this);
		wheel8_r2.setPos(0.0F, 0.0F, 0.0F);
		wheel2.addChild(wheel8_r2);
		setRotationAngle(wheel8_r2, 0.7835F, 0.0617F, -0.0618F);
		wheel8_r2.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, true);

		wheel7_r2 = new ModelRenderer(this);
		wheel7_r2.setPos(0.0F, 0.0F, 0.0F);
		wheel2.addChild(wheel7_r2);
		setRotationAngle(wheel7_r2, 2.3581F, 0.0617F, 0.0618F);
		wheel7_r2.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, true);

		wheel6_r2 = new ModelRenderer(this);
		wheel6_r2.setPos(0.0F, 0.0F, 0.0F);
		wheel2.addChild(wheel6_r2);
		setRotationAngle(wheel6_r2, -2.3581F, -0.0617F, 0.0618F);
		wheel6_r2.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, true);

		wheel5_r2 = new ModelRenderer(this);
		wheel5_r2.setPos(0.0F, 0.0F, 0.0F);
		wheel2.addChild(wheel5_r2);
		setRotationAngle(wheel5_r2, -1.5708F, -0.0873F, 0.0F);
		wheel5_r2.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, true);

		wheel4_r2 = new ModelRenderer(this);
		wheel4_r2.setPos(0.0F, 0.0F, 0.0F);
		wheel2.addChild(wheel4_r2);
		setRotationAngle(wheel4_r2, 1.5708F, 0.0873F, 0.0F);
		wheel4_r2.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, true);

		wheel3_r2 = new ModelRenderer(this);
		wheel3_r2.setPos(0.0F, 0.0F, 0.0F);
		wheel2.addChild(wheel3_r2);
		setRotationAngle(wheel3_r2, 3.1416F, 0.0F, 0.0873F);
		wheel3_r2.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, true);

		wheel2_r2 = new ModelRenderer(this);
		wheel2_r2.setPos(0.0F, 0.0F, 0.0F);
		wheel2.addChild(wheel2_r2);
		setRotationAngle(wheel2_r2, 0.0F, 0.0F, -0.0873F);
		wheel2_r2.texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 4.0F, 3.0F, 0.0F, true);

		wheel3 = new ModelRenderer(this);
		wheel3.setPos(8.25F, -1.0F, 7.0F);
		wheels.addChild(wheel3);
		wheel3.texOffs(18, 11).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		wheel9_r2 = new ModelRenderer(this);
		wheel9_r2.setPos(0.0F, 0.0F, 0.0F);
		wheel3.addChild(wheel9_r2);
		setRotationAngle(wheel9_r2, -0.7835F, 0.0617F, 0.0618F);
		wheel9_r2.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, false);

		wheel8_r3 = new ModelRenderer(this);
		wheel8_r3.setPos(0.0F, 0.0F, 0.0F);
		wheel3.addChild(wheel8_r3);
		setRotationAngle(wheel8_r3, 0.7835F, -0.0617F, 0.0618F);
		wheel8_r3.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, false);

		wheel7_r3 = new ModelRenderer(this);
		wheel7_r3.setPos(0.0F, 0.0F, 0.0F);
		wheel3.addChild(wheel7_r3);
		setRotationAngle(wheel7_r3, 2.3581F, -0.0617F, -0.0618F);
		wheel7_r3.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, false);

		wheel6_r3 = new ModelRenderer(this);
		wheel6_r3.setPos(0.0F, 0.0F, 0.0F);
		wheel3.addChild(wheel6_r3);
		setRotationAngle(wheel6_r3, -2.3581F, 0.0617F, -0.0618F);
		wheel6_r3.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, false);

		wheel5_r3 = new ModelRenderer(this);
		wheel5_r3.setPos(0.0F, 0.0F, 0.0F);
		wheel3.addChild(wheel5_r3);
		setRotationAngle(wheel5_r3, -1.5708F, 0.0873F, 0.0F);
		wheel5_r3.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, false);

		wheel4_r3 = new ModelRenderer(this);
		wheel4_r3.setPos(0.0F, 0.0F, 0.0F);
		wheel3.addChild(wheel4_r3);
		setRotationAngle(wheel4_r3, 1.5708F, -0.0873F, 0.0F);
		wheel4_r3.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, false);

		wheel3_r3 = new ModelRenderer(this);
		wheel3_r3.setPos(0.0F, 0.0F, 0.0F);
		wheel3.addChild(wheel3_r3);
		setRotationAngle(wheel3_r3, -3.1416F, 0.0F, -0.0873F);
		wheel3_r3.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, false);

		wheel2_r3 = new ModelRenderer(this);
		wheel2_r3.setPos(0.0F, 0.0F, 0.0F);
		wheel3.addChild(wheel2_r3);
		setRotationAngle(wheel2_r3, 0.0F, 0.0F, 0.0873F);
		wheel2_r3.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, false);

		wheel4 = new ModelRenderer(this);
		wheel4.setPos(-8.25F, -1.0F, 7.0F);
		wheels.addChild(wheel4);
		wheel4.texOffs(18, 11).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 3.0F, 3.0F, 0.0F, true);

		wheel10_r1 = new ModelRenderer(this);
		wheel10_r1.setPos(0.0F, 0.0F, 0.0F);
		wheel4.addChild(wheel10_r1);
		setRotationAngle(wheel10_r1, -0.7835F, -0.0617F, -0.0618F);
		wheel10_r1.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, true);

		wheel9_r3 = new ModelRenderer(this);
		wheel9_r3.setPos(0.0F, 0.0F, 0.0F);
		wheel4.addChild(wheel9_r3);
		setRotationAngle(wheel9_r3, 0.7835F, 0.0617F, -0.0618F);
		wheel9_r3.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, true);

		wheel8_r4 = new ModelRenderer(this);
		wheel8_r4.setPos(0.0F, 0.0F, 0.0F);
		wheel4.addChild(wheel8_r4);
		setRotationAngle(wheel8_r4, 2.3581F, 0.0617F, 0.0618F);
		wheel8_r4.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, true);

		wheel7_r4 = new ModelRenderer(this);
		wheel7_r4.setPos(0.0F, 0.0F, 0.0F);
		wheel4.addChild(wheel7_r4);
		setRotationAngle(wheel7_r4, -2.3581F, -0.0617F, 0.0618F);
		wheel7_r4.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, true);

		wheel6_r4 = new ModelRenderer(this);
		wheel6_r4.setPos(0.0F, 0.0F, 0.0F);
		wheel4.addChild(wheel6_r4);
		setRotationAngle(wheel6_r4, -1.5708F, -0.0873F, 0.0F);
		wheel6_r4.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, true);

		wheel5_r4 = new ModelRenderer(this);
		wheel5_r4.setPos(0.0F, 0.0F, 0.0F);
		wheel4.addChild(wheel5_r4);
		setRotationAngle(wheel5_r4, 1.5708F, 0.0873F, 0.0F);
		wheel5_r4.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, true);

		wheel4_r4 = new ModelRenderer(this);
		wheel4_r4.setPos(0.0F, 0.0F, 0.0F);
		wheel4.addChild(wheel4_r4);
		setRotationAngle(wheel4_r4, -3.1416F, 0.0F, 0.0873F);
		wheel4_r4.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, true);

		wheel3_r4 = new ModelRenderer(this);
		wheel3_r4.setPos(0.0F, 0.0F, 0.0F);
		wheel4.addChild(wheel3_r4);
		setRotationAngle(wheel3_r4, 0.0F, 0.0F, -0.0873F);
		wheel3_r4.texOffs(18, 0).addBox(-1.0F, -5.0F, -2.0F, 2.0F, 5.0F, 4.0F, 0.0F, true);

		base = new ModelRenderer(this);
		base.setPos(0.0F, -7.0F, 0.0F);
		total.addChild(base);
		base.texOffs(36, 28).addBox(-7.0F, 1.0F, -13.0F, 3.0F, 4.0F, 26.0F, 0.0F, true);
		base.texOffs(36, 28).addBox(4.0F, 1.0F, -13.0F, 3.0F, 4.0F, 26.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(-5.0F, 2.0F, 11.0F);
		base.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1725F, 0.0189F, -0.4792F);
		cube_r1.texOffs(0, 0).addBox(-1.0F, -10.0F, -21.0F, 1.0F, 10.0F, 30.0F, 0.0F, true);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(5.0F, 2.0F, 11.0F);
		base.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1725F, -0.0189F, 0.4792F);
		cube_r2.texOffs(0, 0).addBox(0.0F, -10.0F, -21.0F, 1.0F, 10.0F, 30.0F, 0.0F, false);

		base_r1 = new ModelRenderer(this);
		base_r1.setPos(0.0F, 3.25F, 0.0F);
		base.addChild(base_r1);
		setRotationAngle(base_r1, 0.0698F, 0.0F, 0.0F);
		base_r1.texOffs(32, 0).addBox(-4.0F, -1.2F, -12.95F, 8.0F, 2.0F, 26.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, -10.5F, 6.0F);
		total.addChild(body);
		setRotationAngle(body, 1.5708F, 0.0F, 0.0F);


		corn = new ModelRenderer(this);
		corn.setPos(0.0F, 4.0F, -2.0F);
		body.addChild(corn);
		corn.texOffs(0, 79).addBox(-4.5F, -28.0F, -1.5F, 9.0F, 29.0F, 9.0F, 0.0F, false);
		corn.texOffs(74, 0).addBox(-4.0F, -30.75F, -1.0F, 8.0F, 3.0F, 8.0F, 0.0F, false);

		outer = new ModelRenderer(this);
		outer.setPos(0.0F, 1.0F, 0.5F);
		body.addChild(outer);
		outer.texOffs(0, 46).addBox(-6.0F, -14.0F, -5.0F, 12.0F, 21.0F, 12.0F, 0.0F, false);
		outer.texOffs(48, 58).addBox(-4.5F, -20.0F, -4.25F, 9.0F, 26.0F, 10.0F, 0.1F, false);
		outer.texOffs(68, 28).addBox(-5.0F, -21.0F, -5.0F, 10.0F, 7.0F, 11.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(-4.0F, -23.8191F, 7.0261F);
		outer.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.5672F, 0.0F, 0.0F);
		cube_r3.texOffs(0, 22).addBox(0.0F, -1.0F, 0.0F, 8.0F, 1.0F, 5.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(4.0F, -21.0F, 6.0F);
		outer.addChild(cube_r4);
		setRotationAngle(cube_r4, 1.2217F, 0.0F, 0.0F);
		cube_r4.texOffs(32, 9).addBox(-8.0F, -1.0F, 0.0F, 8.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.0F, -27.1495F, -7.2272F);
		outer.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.6109F, 0.0F, 0.0F);
		cube_r5.texOffs(32, 5).addBox(-5.0F, -0.5F, -0.5F, 10.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(5.0F, -21.0F, -5.0F);
		outer.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.3054F, 0.0F, 0.0F);
		cube_r6.texOffs(32, 0).addBox(-10.0F, -4.0F, 0.0F, 10.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(-4.5516F, -20.2329F, 5.5F);
		outer.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 1.1345F);
		cube_r7.texOffs(0, 0).addBox(-4.0F, -1.0F, -9.75F, 4.0F, 1.0F, 10.0F, 0.1F, true);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(4.5516F, -20.2329F, 5.5F);
		outer.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -1.1345F);
		cube_r8.texOffs(0, 0).addBox(0.0F, -1.0F, -9.75F, 4.0F, 1.0F, 10.0F, 0.1F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setPos(-6.4116F, -24.0431F, 5.5F);
		outer.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.5236F);
		cube_r9.texOffs(0, 11).addBox(-4.0F, -1.0F, -9.75F, 4.0F, 1.0F, 10.0F, 0.1F, true);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setPos(6.4116F, -24.0431F, 5.5F);
		outer.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.5236F);
		cube_r10.texOffs(0, 11).addBox(0.0F, -1.0F, -9.75F, 4.0F, 1.0F, 10.0F, 0.1F, false);

		leaves = new ModelRenderer(this);
		leaves.setPos(0.0F, 1.0F, 0.0F);
		outer.addChild(leaves);


		tail = new ModelRenderer(this);
		tail.setPos(0.0F, 7.0F, 2.0F);
		body.addChild(tail);
		setRotationAngle(tail, -0.3054F, 0.0F, 0.0F);
		tail.texOffs(32, 13).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 7.0F, 5.0F, 0.0F, false);

	}
	@Override
	public void setupAnim(CobCannonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.isPlayerRiding()) {
			this.wheel1.xRot = ageInTicks / 2;
			this.wheel2.xRot = ageInTicks / 2;
			this.wheel3.xRot = ageInTicks / 2;
			this.wheel4.xRot = ageInTicks / 2;
		} else {
			this.wheel1.xRot = 0;
			this.wheel2.xRot = 0;
			this.wheel3.xRot = 0;
			this.wheel4.xRot = 0;
		}
		if(entity.getAttackTime() > 0) {
			int time = entity.getAnimCD() - entity.getAttackTime() + 1;
			this.body.xRot = 1.5708F - AnimationUtil.getUpDown(time, entity.getAnimCD(), 90);
			this.corn.visible = (time < entity.getAnimCD() / 2);
		} else {
			this.corn.visible = (entity.getCornNum() > 0);
			this.body.xRot = 1.5708F;
		}
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<CobCannonEntity> getPlantModel() {
		return this;
	}
}