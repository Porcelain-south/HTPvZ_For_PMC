package com.hungteen.pvz.client.model.entity.plant.magic;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.magic.StrangeCatEntity;
import com.hungteen.pvz.utils.AnimationUtil;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class StrangeCatModel extends PVZPlantModel<StrangeCatEntity> {
	private final ModelRenderer bone;
	private final ModelRenderer buttom;
	private final ModelRenderer head;
	private final ModelRenderer hat_r1;
	private final ModelRenderer left_ear;
	private final ModelRenderer in_r1;
	private final ModelRenderer lear_r1;
	private final ModelRenderer right_ear;
	private final ModelRenderer in_r2;
	private final ModelRenderer rear_r1;
	private final ModelRenderer tail;
	private final ModelRenderer spike_r1;
	private final ModelRenderer sec_r1;
	private final ModelRenderer fir_r1;
	private final ModelRenderer getPlantWholeBody;

	public StrangeCatModel() {
		texWidth = 64;
		texHeight = 64;

		bone = new ModelRenderer(this);
		bone.setPos(0.0F, 24.0F, 0.0F);


		buttom = new ModelRenderer(this);
		buttom.setPos(0.0F, 0.0F, 0.0F);
		bone.addChild(buttom);
		buttom.texOffs(24, 12).addBox(-6.0F, -2.0F, -8.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);
		buttom.texOffs(26, 29).addBox(0.0F, -2.0F, 1.0F, 5.0F, 2.0F, 5.0F, 0.0F, false);
		buttom.texOffs(0, 28).addBox(1.0F, -1.0F, -7.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);
		buttom.texOffs(26, 22).addBox(-7.0F, -1.0F, 0.0F, 6.0F, 1.0F, 6.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		bone.addChild(head);
		head.texOffs(0, 12).addBox(-4.0F, -9.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
		head.texOffs(0, 7).addBox(-2.0F, -3.0F, -5.5F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		head.texOffs(0, 12).addBox(-1.0F, -3.05F, -5.7F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		hat_r1 = new ModelRenderer(this);
		hat_r1.setPos(0.0F, -6.0F, -1.0F);
		head.addChild(hat_r1);
		setRotationAngle(hat_r1, -0.2618F, 0.0F, 0.0F);
		hat_r1.texOffs(0, 0).addBox(-5.0F, -1.0F, -5.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);

		left_ear = new ModelRenderer(this);
		left_ear.setPos(0.0F, -6.0F, -1.0F);
		head.addChild(left_ear);


		in_r1 = new ModelRenderer(this);
		in_r1.setPos(2.5F, -4.5F, 2.5F);
		left_ear.addChild(in_r1);
		setRotationAngle(in_r1, 0.1745F, 0.0F, 0.1745F);
		in_r1.texOffs(0, 41).addBox(-1.4F, -1.9F, -6.6F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		in_r1.texOffs(21, 39).addBox(-1.3F, -1.9F, -6.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		lear_r1 = new ModelRenderer(this);
		lear_r1.setPos(0.0F, 0.0F, 0.0F);
		left_ear.addChild(lear_r1);
		setRotationAngle(lear_r1, -0.2618F, 0.5236F, 0.0F);
		lear_r1.texOffs(41, 4).addBox(3.0F, -5.0F, -2.0F, 2.0F, 4.0F, 3.0F, 0.0F, false);

		right_ear = new ModelRenderer(this);
		right_ear.setPos(0.0F, -6.0F, -1.0F);
		head.addChild(right_ear);


		in_r2 = new ModelRenderer(this);
		in_r2.setPos(-2.5F, -4.5F, 2.5F);
		right_ear.addChild(in_r2);
		setRotationAngle(in_r2, 0.1745F, 0.0F, -0.1745F);
		in_r2.texOffs(9, 38).addBox(-1.6F, -1.9F, -6.6F, 3.0F, 3.0F, 3.0F, 0.0F, false);
		in_r2.texOffs(32, 36).addBox(-1.7F, -1.9F, -6.5F, 3.0F, 3.0F, 3.0F, 0.0F, false);

		rear_r1 = new ModelRenderer(this);
		rear_r1.setPos(0.0F, 0.0F, 0.0F);
		right_ear.addChild(rear_r1);
		setRotationAngle(rear_r1, -0.2618F, -0.5236F, 0.0F);
		rear_r1.texOffs(0, 0).addBox(-5.0F, -5.0F, -2.0F, 2.0F, 4.0F, 3.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setPos(0.0F, -1.5F, 3.0F);
		bone.addChild(tail);


		spike_r1 = new ModelRenderer(this);
		spike_r1.setPos(0.0F, -2.18F, 3.95F);
		tail.addChild(spike_r1);
		setRotationAngle(spike_r1, 2.2253F, 0.0F, 0.0F);
		spike_r1.texOffs(30, 0).addBox(-1.0F, 1.18F, 6.05F, 2.0F, 2.0F, 5.0F, 0.0F, false);
		spike_r1.texOffs(15, 28).addBox(-0.5F, 1.68F, 3.05F, 1.0F, 1.0F, 9.0F, 0.0F, false);

		sec_r1 = new ModelRenderer(this);
		sec_r1.setPos(0.0F, -0.59F, 2.05F);
		tail.addChild(sec_r1);
		setRotationAngle(sec_r1, 1.4399F, 0.0F, 0.0F);
		sec_r1.texOffs(0, 35).addBox(-0.5F, 0.39F, 0.95F, 1.0F, 1.0F, 5.0F, 0.0F, false);

		fir_r1 = new ModelRenderer(this);
		fir_r1.setPos(0.0F, 1.5F, -3.0F);
		tail.addChild(fir_r1);
		setRotationAngle(fir_r1, 0.2618F, 0.0F, 0.0F);
		fir_r1.texOffs(40, 38).addBox(-0.5F, -2.0F, 3.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);

		getPlantWholeBody = new ModelRenderer(this);
		getPlantWholeBody.setPos(0.0F, 0.0F, 0.0F);

	}

	@Override
	public void setupAnim(StrangeCatEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		final int time = entity.getAttackTime();
		if(entity.isResting()) {
			this.tail.xRot = 0;
		} else if(time == 0) {
			final int T = 20;
			final int now = entity.getExistTick() % T;
			this.tail.xRot = AnimationUtil.getUpDownUpDown(now, T, 30);
		} else {
			final int tick = StrangeCatEntity.ANIM_CD - time;
		    final float v = 3.14159F / StrangeCatEntity.ANIM_CD / 2;
		    this.tail.xRot = 0.8F - 0.8F * Math.abs(MathHelper.cos(v * tick));
		}
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.bone;
	}

	@Override
	public EntityModel<StrangeCatEntity> getPlantModel() {
		return this;
	}
}