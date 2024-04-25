package com.hungteen.pvz.client.model.entity.plant.arma;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.arma.ButterPultEntity;
import com.hungteen.pvz.common.entity.plant.arma.KernelPultEntity;
import com.hungteen.pvz.common.entity.plant.arma.KernelPultEntity.CornTypes;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class KernelPultModel<T extends KernelPultEntity> extends PVZPlantModel<T> {
	private final ModelRenderer total;
	private final ModelRenderer head;
	private final ModelRenderer leaves;
	private final ModelRenderer leaves_r1;
	private final ModelRenderer bone;
	private final ModelRenderer leave1;
	private final ModelRenderer cube_r5_r1;
	private final ModelRenderer cube_r4_r1;
	private final ModelRenderer cube_r3_r1;
	private final ModelRenderer bone5;
	private final ModelRenderer leave5;
	private final ModelRenderer cube_r6_r1;
	private final ModelRenderer cube_r5_r2;
	private final ModelRenderer cube_r4_r2;
	private final ModelRenderer bone6;
	private final ModelRenderer leave6;
	private final ModelRenderer cube_r7_r1;
	private final ModelRenderer cube_r6_r2;
	private final ModelRenderer cube_r5_r3;
	private final ModelRenderer bone2;
	private final ModelRenderer leave2;
	private final ModelRenderer cube_r6_r3;
	private final ModelRenderer cube_r5_r4;
	private final ModelRenderer cube_r4_r3;
	private final ModelRenderer bone3;
	private final ModelRenderer leave3;
	private final ModelRenderer cube_r7_r2;
	private final ModelRenderer cube_r6_r4;
	private final ModelRenderer cube_r5_r5;
	private final ModelRenderer bone4;
	private final ModelRenderer leave4;
	private final ModelRenderer cube_r8_r1;
	private final ModelRenderer cube_r7_r3;
	private final ModelRenderer cube_r6_r5;
	private final ModelRenderer pult;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r27_r1;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r28_r1;
	private final ModelRenderer cube_r29;
	private final ModelRenderer basket;
	private final ModelRenderer butter;
	private final ModelRenderer kernel;

	public KernelPultModel() {
		texWidth = 64;
		texHeight = 64;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 23.8F, 0.0F);


		head = new ModelRenderer(this);
		head.setPos(0.0F, -1.0F, 0.0F);
		total.addChild(head);
		head.texOffs(0, 0).addBox(-4.5F, -8.0F, -4.5F, 9.0F, 9.0F, 9.0F, 0.0F, false);
		head.texOffs(27, 24).addBox(-4.5F, -8.0071F, -4.5F, 3.0F, 2.0F, 1.0F, 0.2F, false);
		head.texOffs(27, 24).addBox(1.5F, -8.0071F, -4.5F, 3.0F, 2.0F, 1.0F, 0.2F, true);
		head.texOffs(0, 28).addBox(-3.5F, -11.0F, -3.5F, 7.0F, 3.0F, 7.0F, 0.0F, false);

		leaves = new ModelRenderer(this);
		leaves.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(leaves);
		setRotationAngle(leaves, 0.0F, -0.5236F, 0.0F);


		leaves_r1 = new ModelRenderer(this);
		leaves_r1.setPos(0.0F, -0.375F, 0.0F);
		leaves.addChild(leaves_r1);
		setRotationAngle(leaves_r1, 0.0F, 0.5236F, 0.0F);
		leaves_r1.texOffs(0, 18).addBox(-4.5F, -0.5F, -4.5F, 9.0F, 1.0F, 9.0F, 0.2F, false);

		bone = new ModelRenderer(this);
		bone.setPos(0.0F, 0.0F, 0.0F);
		leaves.addChild(bone);
		setRotationAngle(bone, 0.0F, -1.0472F, 0.0F);


		leave1 = new ModelRenderer(this);
		leave1.setPos(0.0F, 0.0F, 1.0F);
		bone.addChild(leave1);
		setRotationAngle(leave1, 0.0436F, 0.0F, 0.0F);


		cube_r5_r1 = new ModelRenderer(this);
		cube_r5_r1.setPos(-3.0F, -0.8933F, -11.5646F);
		leave1.addChild(cube_r5_r1);
		setRotationAngle(cube_r5_r1, -0.3491F, 0.0F, 0.0F);
		cube_r5_r1.texOffs(33, 25).addBox(0.0F, 0.001F, -3.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r4_r1 = new ModelRenderer(this);
		cube_r4_r1.setPos(-3.0F, -0.8933F, -11.5646F);
		leave1.addChild(cube_r4_r1);
		setRotationAngle(cube_r4_r1, 0.5672F, 0.0F, 0.0F);
		cube_r4_r1.texOffs(34, 32).addBox(0.0F, 0.001F, 0.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r3_r1 = new ModelRenderer(this);
		cube_r3_r1.setPos(0.0F, -0.5043F, -5.5708F);
		leave1.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, -0.5236F, 0.0F, 0.0F);
		cube_r3_r1.texOffs(27, 18).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);

		bone5 = new ModelRenderer(this);
		bone5.setPos(0.0F, 0.0F, 0.0F);
		leaves.addChild(bone5);


		leave5 = new ModelRenderer(this);
		leave5.setPos(0.0F, 0.0F, 1.0F);
		bone5.addChild(leave5);
		setRotationAngle(leave5, 0.0436F, 0.0F, 0.0F);


		cube_r6_r1 = new ModelRenderer(this);
		cube_r6_r1.setPos(-3.0F, -0.8933F, -11.5646F);
		leave5.addChild(cube_r6_r1);
		setRotationAngle(cube_r6_r1, -0.3491F, 0.0F, 0.0F);
		cube_r6_r1.texOffs(33, 25).addBox(0.0F, 0.001F, -3.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r5_r2 = new ModelRenderer(this);
		cube_r5_r2.setPos(-3.0F, -0.8933F, -11.5646F);
		leave5.addChild(cube_r5_r2);
		setRotationAngle(cube_r5_r2, 0.5672F, 0.0F, 0.0F);
		cube_r5_r2.texOffs(34, 32).addBox(0.0F, 0.001F, 0.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r4_r2 = new ModelRenderer(this);
		cube_r4_r2.setPos(0.0F, -0.5043F, -5.5708F);
		leave5.addChild(cube_r4_r2);
		setRotationAngle(cube_r4_r2, -0.5236F, 0.0F, 0.0F);
		cube_r4_r2.texOffs(27, 18).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);

		bone6 = new ModelRenderer(this);
		bone6.setPos(0.0F, 0.0F, 0.0F);
		leaves.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 3.1416F, 0.0F);


		leave6 = new ModelRenderer(this);
		leave6.setPos(0.0F, 0.0F, 1.0F);
		bone6.addChild(leave6);
		setRotationAngle(leave6, 0.0436F, 0.0F, 0.0F);


		cube_r7_r1 = new ModelRenderer(this);
		cube_r7_r1.setPos(-3.0F, -0.8933F, -11.5646F);
		leave6.addChild(cube_r7_r1);
		setRotationAngle(cube_r7_r1, -0.3491F, 0.0F, 0.0F);
		cube_r7_r1.texOffs(33, 25).addBox(0.0F, 0.001F, -3.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r6_r2 = new ModelRenderer(this);
		cube_r6_r2.setPos(-3.0F, -0.8933F, -11.5646F);
		leave6.addChild(cube_r6_r2);
		setRotationAngle(cube_r6_r2, 0.5672F, 0.0F, 0.0F);
		cube_r6_r2.texOffs(34, 32).addBox(0.0F, 0.001F, 0.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r5_r3 = new ModelRenderer(this);
		cube_r5_r3.setPos(0.0F, -0.5043F, -5.5708F);
		leave6.addChild(cube_r5_r3);
		setRotationAngle(cube_r5_r3, -0.5236F, 0.0F, 0.0F);
		cube_r5_r3.texOffs(27, 18).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);

		bone2 = new ModelRenderer(this);
		bone2.setPos(0.0F, 0.0F, 0.0F);
		leaves.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 1.0472F, 0.0F);


		leave2 = new ModelRenderer(this);
		leave2.setPos(0.0F, 0.0F, 1.0F);
		bone2.addChild(leave2);
		setRotationAngle(leave2, 0.0436F, 0.0F, 0.0F);


		cube_r6_r3 = new ModelRenderer(this);
		cube_r6_r3.setPos(-3.0F, -0.8933F, -11.5646F);
		leave2.addChild(cube_r6_r3);
		setRotationAngle(cube_r6_r3, -0.3491F, 0.0F, 0.0F);
		cube_r6_r3.texOffs(33, 25).addBox(0.0F, 0.001F, -3.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r5_r4 = new ModelRenderer(this);
		cube_r5_r4.setPos(-3.0F, -0.8933F, -11.5646F);
		leave2.addChild(cube_r5_r4);
		setRotationAngle(cube_r5_r4, 0.5672F, 0.0F, 0.0F);
		cube_r5_r4.texOffs(34, 32).addBox(0.0F, 0.001F, 0.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r4_r3 = new ModelRenderer(this);
		cube_r4_r3.setPos(0.0F, -0.5043F, -5.5708F);
		leave2.addChild(cube_r4_r3);
		setRotationAngle(cube_r4_r3, -0.5236F, 0.0F, 0.0F);
		cube_r4_r3.texOffs(27, 18).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);

		bone3 = new ModelRenderer(this);
		bone3.setPos(0.0F, 0.0F, 0.0F);
		leaves.addChild(bone3);
		setRotationAngle(bone3, 0.0F, -2.0944F, 0.0F);


		leave3 = new ModelRenderer(this);
		leave3.setPos(0.0F, 0.0F, 1.0F);
		bone3.addChild(leave3);
		setRotationAngle(leave3, 0.0436F, 0.0F, 0.0F);


		cube_r7_r2 = new ModelRenderer(this);
		cube_r7_r2.setPos(-3.0F, -0.8933F, -11.5646F);
		leave3.addChild(cube_r7_r2);
		setRotationAngle(cube_r7_r2, -0.3491F, 0.0F, 0.0F);
		cube_r7_r2.texOffs(33, 25).addBox(0.0F, 0.001F, -3.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r6_r4 = new ModelRenderer(this);
		cube_r6_r4.setPos(-3.0F, -0.8933F, -11.5646F);
		leave3.addChild(cube_r6_r4);
		setRotationAngle(cube_r6_r4, 0.5672F, 0.0F, 0.0F);
		cube_r6_r4.texOffs(34, 32).addBox(0.0F, 0.001F, 0.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r5_r5 = new ModelRenderer(this);
		cube_r5_r5.setPos(0.0F, -0.5043F, -5.5708F);
		leave3.addChild(cube_r5_r5);
		setRotationAngle(cube_r5_r5, -0.5236F, 0.0F, 0.0F);
		cube_r5_r5.texOffs(27, 18).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);

		bone4 = new ModelRenderer(this);
		bone4.setPos(0.0F, 0.0F, 0.0F);
		leaves.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 2.0944F, 0.0F);


		leave4 = new ModelRenderer(this);
		leave4.setPos(0.0F, 0.0F, 1.0F);
		bone4.addChild(leave4);
		setRotationAngle(leave4, 0.0436F, 0.0F, 0.0F);


		cube_r8_r1 = new ModelRenderer(this);
		cube_r8_r1.setPos(-3.0F, -0.8933F, -11.5646F);
		leave4.addChild(cube_r8_r1);
		setRotationAngle(cube_r8_r1, -0.3491F, 0.0F, 0.0F);
		cube_r8_r1.texOffs(33, 25).addBox(0.0F, 0.001F, -3.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r7_r3 = new ModelRenderer(this);
		cube_r7_r3.setPos(-3.0F, -0.8933F, -11.5646F);
		leave4.addChild(cube_r7_r3);
		setRotationAngle(cube_r7_r3, 0.5672F, 0.0F, 0.0F);
		cube_r7_r3.texOffs(34, 32).addBox(0.0F, 0.001F, 0.0F, 6.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r6_r5 = new ModelRenderer(this);
		cube_r6_r5.setPos(0.0F, -0.5043F, -5.5708F);
		leave4.addChild(cube_r6_r5);
		setRotationAngle(cube_r6_r5, -0.5236F, 0.0F, 0.0F);
		cube_r6_r5.texOffs(27, 18).addBox(-3.0F, 0.0F, -4.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);

		pult = new ModelRenderer(this);
		pult.setPos(0.0F, -12.0F, 0.0F);
		total.addChild(pult);


		cube_r27 = new ModelRenderer(this);
		cube_r27.setPos(0.0F, -1.6192F, 9.0169F);
		pult.addChild(cube_r27);
		setRotationAngle(cube_r27, -1.6144F, 0.0F, 0.0F);


		cube_r27_r1 = new ModelRenderer(this);
		cube_r27_r1.setPos(0.0F, -0.3846F, 0.6958F);
		cube_r27.addChild(cube_r27_r1);
		setRotationAngle(cube_r27_r1, 0.1309F, 0.0F, 0.0F);
		cube_r27_r1.texOffs(0, 18).addBox(-1.0F, -0.5F, -1.0F, 2.0F, 5.0F, 2.0F, -0.4F, false);

		cube_r28 = new ModelRenderer(this);
		cube_r28.setPos(0.0F, -3.8077F, 1.2387F);
		pult.addChild(cube_r28);
		setRotationAngle(cube_r28, -1.8326F, 0.0F, 0.0F);


		cube_r28_r1 = new ModelRenderer(this);
		cube_r28_r1.setPos(0.0F, -4.0142F, 1.8391F);
		cube_r28.addChild(cube_r28_r1);
		setRotationAngle(cube_r28_r1, -0.2182F, 0.0F, 0.0F);
		cube_r28_r1.texOffs(0, 0).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 6.0F, 2.0F, -0.4F, false);

		cube_r29 = new ModelRenderer(this);
		cube_r29.setPos(0.0F, 0.0F, 0.0F);
		pult.addChild(cube_r29);
		setRotationAngle(cube_r29, -0.5236F, 0.0F, 0.0F);
		cube_r29.texOffs(0, 38).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 5.0F, 2.0F, -0.4F, false);

		basket = new ModelRenderer(this);
		basket.setPos(0.0F, -0.5F, 9.0F);
		pult.addChild(basket);
		setRotationAngle(basket, 0.1745F, 0.0F, 0.0F);
		basket.texOffs(27, 0).addBox(-2.5F, -2.0F, 0.0F, 5.0F, 3.0F, 5.0F, 0.0F, false);
		basket.texOffs(34, 36).addBox(-1.5F, -2.0F, 1.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);

		butter = new ModelRenderer(this);
		butter.setPos(1.0F, 0.0F, 0.0F);
		basket.addChild(butter);
		butter.texOffs(21, 28).addBox(-3.0F, -4.0F, 0.5F, 4.0F, 3.0F, 4.0F, 0.2F, false);
		butter.texOffs(24, 35).addBox(-4.0F, -2.25F, 0.5F, 1.0F, 5.0F, 4.0F, 0.0F, false);

		kernel = new ModelRenderer(this);
		kernel.setPos(1.0F, 0.0F, 0.0F);
		basket.addChild(kernel);
		kernel.texOffs(36, 8).addBox(-2.5F, -4.5F, 1.0F, 3.0F, 4.0F, 3.0F, 0.0F, false);

	}
	@Override
	public void setupAnim(KernelPultEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		if(entity.getAttackTime() > 0) {
			float percent = 1 - entity.getAttackTime() * 1.0F / entity.getPultAnimTime();
			pult.xRot = (1F - MathHelper.abs(MathHelper.cos(percent * 3.14159F))) * 1.5F;
			this.kernel.visible = (percent < 0.5) && entity.getCurrentBullet() == CornTypes.KERNEL;
			this.butter.visible = (percent < 0.5) && entity.getCurrentBullet() == CornTypes.BUTTER;
		} else {
			pult.xRot = MathHelper.sin(ageInTicks / 10) / 8;
			this.butter.visible = (entity instanceof ButterPultEntity);
			this.kernel.visible = ! this.butter.visible;
		}
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<T> getPlantModel() {
		return this;
	}
}