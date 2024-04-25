package com.hungteen.pvz.client.model.entity.plant.appease;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.appease.AngelStarFruitEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class AngelStarFruitModel extends PVZPlantModel<AngelStarFruitEntity> {

	private final ModelRenderer total;
	private final ModelRenderer base;
	private final ModelRenderer leave;
	private final ModelRenderer cube_r1;
	private final ModelRenderer leave2;
	private final ModelRenderer cube_r2;
	private final ModelRenderer leave3;
	private final ModelRenderer cube_r3;
	private final ModelRenderer leave4;
	private final ModelRenderer cube_r4;
	private final ModelRenderer leave5;
	private final ModelRenderer cube_r5;
	private final ModelRenderer mainbody;
	private final ModelRenderer bone;
	private final ModelRenderer body;
	private final ModelRenderer cube_r6;
	private final ModelRenderer body2;
	private final ModelRenderer cube_r7;
	private final ModelRenderer bone3;
	private final ModelRenderer body5;
	private final ModelRenderer cube_r8;
	private final ModelRenderer body6;
	private final ModelRenderer cube_r9;
	private final ModelRenderer bone4;
	private final ModelRenderer body7;
	private final ModelRenderer cube_r10;
	private final ModelRenderer body8;
	private final ModelRenderer cube_r11;
	private final ModelRenderer bone5;
	private final ModelRenderer body9;
	private final ModelRenderer cube_r12;
	private final ModelRenderer body10;
	private final ModelRenderer cube_r13;
	private final ModelRenderer bone2;
	private final ModelRenderer body3;
	private final ModelRenderer cube_r14;
	private final ModelRenderer body4;
	private final ModelRenderer cube_r15;
	private final ModelRenderer face;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer getPlantWholeBody;

	public AngelStarFruitModel() {
		texWidth = 32;
		texHeight = 32;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);


		base = new ModelRenderer(this);
		base.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(base);
		setRotationAngle(base, 0.0F, -0.3054F, 0.0F);


		leave = new ModelRenderer(this);
		leave.setPos(0.0F, 0.0F, 0.0F);
		base.addChild(leave);


		cube_r1 = new ModelRenderer(this);
		cube_r1.setPos(0.0F, 0.0F, 0.0F);
		leave.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.1309F);
		cube_r1.texOffs(0, 0).addBox(-11.0F, 0.0F, -4.0F, 12.0F, 0.0F, 8.0F, 0.0F, false);

		leave2 = new ModelRenderer(this);
		leave2.setPos(0.0F, 0.0F, 0.0F);
		base.addChild(leave2);
		setRotationAngle(leave2, 0.0F, -1.2566F, 0.0F);


		cube_r2 = new ModelRenderer(this);
		cube_r2.setPos(0.0F, 0.0F, 0.0F);
		leave2.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.1309F);
		cube_r2.texOffs(0, 0).addBox(-11.0F, 0.0F, -4.0F, 12.0F, 0.0F, 8.0F, 0.0F, false);

		leave3 = new ModelRenderer(this);
		leave3.setPos(0.0F, 0.0F, 0.0F);
		base.addChild(leave3);
		setRotationAngle(leave3, 0.0F, 1.2566F, 0.0F);


		cube_r3 = new ModelRenderer(this);
		cube_r3.setPos(0.0F, 0.0F, 0.0F);
		leave3.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.1309F);
		cube_r3.texOffs(0, 0).addBox(-11.0F, 0.0F, -4.0F, 12.0F, 0.0F, 8.0F, 0.0F, false);

		leave4 = new ModelRenderer(this);
		leave4.setPos(0.0F, 0.0F, 0.0F);
		base.addChild(leave4);
		setRotationAngle(leave4, 0.0F, -2.5133F, 0.0F);


		cube_r4 = new ModelRenderer(this);
		cube_r4.setPos(0.0F, 0.0F, 0.0F);
		leave4.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.1309F);
		cube_r4.texOffs(0, 0).addBox(-11.0F, 0.0F, -4.0F, 12.0F, 0.0F, 8.0F, 0.0F, false);

		leave5 = new ModelRenderer(this);
		leave5.setPos(0.0F, 0.0F, 0.0F);
		base.addChild(leave5);
		setRotationAngle(leave5, 0.0F, 2.5133F, 0.0F);


		cube_r5 = new ModelRenderer(this);
		cube_r5.setPos(0.0F, 0.0F, 0.0F);
		leave5.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.1309F);
		cube_r5.texOffs(0, 0).addBox(-11.0F, 0.0F, -4.0F, 12.0F, 0.0F, 8.0F, 0.0F, false);

		mainbody = new ModelRenderer(this);
		mainbody.setPos(0.0F, -1.0F, 0.0F);
		total.addChild(mainbody);
		setRotationAngle(mainbody, 0.0F, 0.3054F, 0.0F);


		bone = new ModelRenderer(this);
		bone.setPos(0.0F, -2.425F, 0.0F);
		mainbody.addChild(bone);


		body = new ModelRenderer(this);
		body.setPos(0.01F, -0.0034F, 0.0F);
		bone.addChild(body);
		setRotationAngle(body, 0.6109F, 0.0F, -0.0873F);
		body.texOffs(0, 8).addBox(-10.01F, 0.01F, -2.01F, 10.0F, 2.0F, 2.0F, 0.01F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setPos(-4.546F, 1.01F, -3.1909F);
		body.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.3927F, 0.0F);
		cube_r6.texOffs(0, 0).addBox(1.5F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r6.texOffs(19, 12).addBox(-1.5F, -1.0F, 1.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r6.texOffs(0, 16).addBox(-5.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F, 0.0F, false);

		body2 = new ModelRenderer(this);
		body2.setPos(0.01F, -0.0034F, 0.0F);
		bone.addChild(body2);
		setRotationAngle(body2, 2.5307F, 0.0F, -0.0873F);
		body2.texOffs(0, 8).addBox(-10.01F, -2.01F, -2.01F, 10.0F, 2.0F, 2.0F, 0.01F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setPos(-4.546F, -1.01F, -3.1909F);
		body2.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.3927F, 0.0F);
		cube_r7.texOffs(0, 0).addBox(1.5F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r7.texOffs(19, 12).addBox(-1.5F, -1.0F, 1.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r7.texOffs(0, 16).addBox(-5.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setPos(0.0F, -2.425F, 0.0F);
		mainbody.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 1.2566F, 0.0F);


		body5 = new ModelRenderer(this);
		body5.setPos(0.01F, -0.0034F, 0.0F);
		bone3.addChild(body5);
		setRotationAngle(body5, 0.6109F, 0.0F, -0.0873F);
		body5.texOffs(0, 8).addBox(-10.01F, 0.01F, -2.01F, 10.0F, 2.0F, 2.0F, 0.01F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setPos(-4.546F, 1.01F, -3.1909F);
		body5.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.3927F, 0.0F);
		cube_r8.texOffs(0, 0).addBox(1.5F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r8.texOffs(19, 12).addBox(-1.5F, -1.0F, 1.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r8.texOffs(0, 16).addBox(-5.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F, 0.0F, false);

		body6 = new ModelRenderer(this);
		body6.setPos(0.01F, -0.0034F, 0.0F);
		bone3.addChild(body6);
		setRotationAngle(body6, 2.5307F, 0.0F, -0.0873F);
		body6.texOffs(0, 8).addBox(-10.01F, -2.01F, -2.01F, 10.0F, 2.0F, 2.0F, 0.01F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setPos(-4.546F, -1.01F, -3.1909F);
		body6.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.3927F, 0.0F);
		cube_r9.texOffs(0, 0).addBox(1.5F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r9.texOffs(19, 12).addBox(-1.5F, -1.0F, 1.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r9.texOffs(0, 16).addBox(-5.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setPos(0.0F, -2.425F, 0.0F);
		mainbody.addChild(bone4);
		setRotationAngle(bone4, 0.0F, -2.5133F, 0.0F);


		body7 = new ModelRenderer(this);
		body7.setPos(0.01F, -0.0034F, 0.0F);
		bone4.addChild(body7);
		setRotationAngle(body7, 0.6109F, 0.0F, -0.0873F);
		body7.texOffs(0, 8).addBox(-10.01F, 0.01F, -2.01F, 10.0F, 2.0F, 2.0F, 0.01F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setPos(-4.546F, 1.01F, -3.1909F);
		body7.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.3927F, 0.0F);
		cube_r10.texOffs(0, 0).addBox(1.5F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r10.texOffs(19, 12).addBox(-1.5F, -1.0F, 1.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r10.texOffs(0, 16).addBox(-5.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F, 0.0F, false);

		body8 = new ModelRenderer(this);
		body8.setPos(0.01F, -0.0034F, 0.0F);
		bone4.addChild(body8);
		setRotationAngle(body8, 2.5307F, 0.0F, -0.0873F);
		body8.texOffs(0, 8).addBox(-10.01F, -2.01F, -2.01F, 10.0F, 2.0F, 2.0F, 0.01F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setPos(-4.546F, -1.01F, -3.1909F);
		body8.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.3927F, 0.0F);
		cube_r11.texOffs(0, 0).addBox(1.5F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r11.texOffs(19, 12).addBox(-1.5F, -1.0F, 1.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r11.texOffs(0, 16).addBox(-5.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setPos(0.0F, -2.425F, 0.0F);
		mainbody.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 2.5133F, 0.0F);


		body9 = new ModelRenderer(this);
		body9.setPos(0.01F, -0.0034F, 0.0F);
		bone5.addChild(body9);
		setRotationAngle(body9, 0.6109F, 0.0F, -0.0873F);
		body9.texOffs(0, 8).addBox(-10.01F, 0.01F, -2.01F, 10.0F, 2.0F, 2.0F, 0.01F, false);

		cube_r12 = new ModelRenderer(this);
		cube_r12.setPos(-4.546F, 1.01F, -3.1909F);
		body9.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.3927F, 0.0F);
		cube_r12.texOffs(0, 0).addBox(1.5F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r12.texOffs(19, 12).addBox(-1.5F, -1.0F, 1.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r12.texOffs(0, 16).addBox(-5.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F, 0.0F, false);

		body10 = new ModelRenderer(this);
		body10.setPos(0.01F, -0.0034F, 0.0F);
		bone5.addChild(body10);
		setRotationAngle(body10, 2.5307F, 0.0F, -0.0873F);
		body10.texOffs(0, 8).addBox(-10.01F, -2.01F, -2.01F, 10.0F, 2.0F, 2.0F, 0.01F, false);

		cube_r13 = new ModelRenderer(this);
		cube_r13.setPos(-4.546F, -1.01F, -3.1909F);
		body10.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.3927F, 0.0F);
		cube_r13.texOffs(0, 0).addBox(1.5F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r13.texOffs(19, 12).addBox(-1.5F, -1.0F, 1.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r13.texOffs(0, 16).addBox(-5.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setPos(0.0F, -2.425F, 0.0F);
		mainbody.addChild(bone2);
		setRotationAngle(bone2, 0.0F, -1.2566F, 0.0F);


		body3 = new ModelRenderer(this);
		body3.setPos(0.01F, -0.0034F, 0.0F);
		bone2.addChild(body3);
		setRotationAngle(body3, 0.6109F, 0.0F, -0.0873F);
		body3.texOffs(0, 8).addBox(-10.01F, 0.01F, -2.01F, 10.0F, 2.0F, 2.0F, 0.01F, false);

		cube_r14 = new ModelRenderer(this);
		cube_r14.setPos(-4.546F, 1.01F, -3.1909F);
		body3.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.3927F, 0.0F);
		cube_r14.texOffs(0, 0).addBox(1.5F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r14.texOffs(19, 12).addBox(-1.5F, -1.0F, 1.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r14.texOffs(0, 16).addBox(-5.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F, 0.0F, false);

		body4 = new ModelRenderer(this);
		body4.setPos(0.01F, -0.0034F, 0.0F);
		bone2.addChild(body4);
		setRotationAngle(body4, 2.5307F, 0.0F, -0.0873F);
		body4.texOffs(0, 8).addBox(-10.01F, -2.01F, -2.01F, 10.0F, 2.0F, 2.0F, 0.01F, false);

		cube_r15 = new ModelRenderer(this);
		cube_r15.setPos(-4.546F, -1.01F, -3.1909F);
		body4.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.3927F, 0.0F);
		cube_r15.texOffs(0, 0).addBox(1.5F, -1.0F, 2.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r15.texOffs(19, 12).addBox(-1.5F, -1.0F, 1.0F, 5.0F, 2.0F, 1.0F, 0.0F, false);
		cube_r15.texOffs(0, 16).addBox(-5.5F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F, 0.0F, false);

		face = new ModelRenderer(this);
		face.setPos(0.0F, -2.0F, 0.0F);
		total.addChild(face);


		cube_r16 = new ModelRenderer(this);
		cube_r16.setPos(0.0F, -0.75F, -2.5F);
		face.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.132F, -0.1298F, -0.0172F);
		cube_r16.texOffs(0, 12).addBox(-3.25F, -0.5F, -0.5F, 8.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r17 = new ModelRenderer(this);
		cube_r17.setPos(2.0F, -1.0F, 0.5F);
		face.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0324F, 0.1341F, 0.2668F);
		cube_r17.texOffs(18, 16).addBox(-1.25F, -0.5F, -0.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r18 = new ModelRenderer(this);
		cube_r18.setPos(-2.0F, -1.0F, 0.5F);
		face.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0324F, -0.1341F, -0.2668F);
		cube_r18.texOffs(18, 16).addBox(-0.75F, -0.5F, -0.5F, 2.0F, 2.0F, 4.0F, 0.0F, false);

		getPlantWholeBody = new ModelRenderer(this);
		getPlantWholeBody.setPos(0.0F, 0.0F, 0.0F);

	}
	@Override
	public void setupAnim(AngelStarFruitEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.total.yRot = 3.14159F;
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<AngelStarFruitEntity> getPlantModel() {
		return this;
	}
	
}