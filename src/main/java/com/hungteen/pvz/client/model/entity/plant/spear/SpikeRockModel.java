package com.hungteen.pvz.client.model.entity.plant.spear;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.spear.SpikeRockEntity;
import com.hungteen.pvz.utils.AnimationUtil;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class SpikeRockModel extends PVZPlantModel<SpikeRockEntity> {
	private final ModelRenderer total;
	private final ModelRenderer bone;
	private final ModelRenderer t1;
	private final ModelRenderer spike1;
	private final ModelRenderer t2;
	private final ModelRenderer spike2;
	private final ModelRenderer t3;
	private final ModelRenderer spike3;
	private final ModelRenderer getPlantWholeBody;

	public SpikeRockModel() {
		texWidth = 64;
		texHeight = 64;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);
		total.texOffs(0, 19).addBox(-8.0F, -3.0F, -8.0F, 16.0F, 3.0F, 16.0F, 0.0F, false);
		total.texOffs(0, 0).addBox(-8.0F, -3.2F, -8.0F, 16.0F, 3.0F, 16.0F, 0.3F, false);

		bone = new ModelRenderer(this);
		bone.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(bone);
		bone.texOffs(32, 42).addBox(-8.0F, -6.0F, -4.0F, 16.0F, 4.0F, 0.0F, 0.0F, false);
		bone.texOffs(32, 38).addBox(-8.0F, -6.0F, 4.0F, 16.0F, 4.0F, 0.0F, 0.0F, false);
		bone.texOffs(0, 26).addBox(-4.0F, -6.0F, -8.0F, 0.0F, 4.0F, 16.0F, 0.0F, false);
		bone.texOffs(0, 22).addBox(4.0F, -6.0F, -8.0F, 0.0F, 4.0F, 16.0F, 0.0F, false);

		t1 = new ModelRenderer(this);
		t1.setPos(0.0F, 0.0F, 0.0F);
		total.addChild(t1);


		spike1 = new ModelRenderer(this);
		spike1.setPos(0.0F, 0.0F, 0.0F);
		t1.addChild(spike1);
		spike1.texOffs(0, 0).addBox(-1.5F, -6.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		spike1.texOffs(0, 5).addBox(-1.5F, -7.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		t2 = new ModelRenderer(this);
		t2.setPos(6.0F, 1.0F, 0.0F);
		total.addChild(t2);
		setRotationAngle(t2, 0.0F, 0.0F, 0.1745F);


		spike2 = new ModelRenderer(this);
		spike2.setPos(0.0F, 0.0F, 0.0F);
		t2.addChild(spike2);
		spike2.texOffs(0, 0).addBox(-1.5F, -6.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, true);
		spike2.texOffs(0, 5).addBox(-1.5F, -7.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		t3 = new ModelRenderer(this);
		t3.setPos(-6.0F, 1.0F, 0.0F);
		total.addChild(t3);
		setRotationAngle(t3, 0.0F, 0.0F, -0.1745F);


		spike3 = new ModelRenderer(this);
		spike3.setPos(0.0F, 0.0F, 0.0F);
		t3.addChild(spike3);
		spike3.texOffs(0, 0).addBox(-1.5F, -6.0F, -1.0F, 3.0F, 3.0F, 2.0F, 0.0F, false);
		spike3.texOffs(0, 5).addBox(-1.5F, -7.0F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		getPlantWholeBody = new ModelRenderer(this);
		getPlantWholeBody.setPos(0.0F, 0.0F, 0.0F);

	}


	@Override
	public void setupAnim(SpikeRockEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.t2.visible = (entity.getSpikeNum() * 1F / entity.getSpikesCount() > 2F / 3);
		this.t3.visible = (entity.getSpikeNum() * 1F / entity.getSpikesCount() > 1F / 3);
		this.t1.visible = (entity.getSpikeNum() * 1F / entity.getSpikesCount() > 0);
		final int tot = SpikeRockEntity.ATTACK_ANIM_CD;
		final int now = tot - entity.getAttackTime();
		final float angle = 25F;
		this.t3.zRot = AnimationUtil.getUpDown(now, tot, angle);
		this.t2.zRot = AnimationUtil.getUpDown(now, tot, - angle);
		this.t1.xRot = AnimationUtil.getUpDownUpDown(now, tot, angle);
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<SpikeRockEntity> getPlantModel() {
		return this;
	}
}