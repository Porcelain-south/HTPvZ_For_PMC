package com.hungteen.pvz.client.model.entity.plant.toxic;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.toxic.GloomShroomEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class GloomShroomModel extends PVZPlantModel<GloomShroomEntity> {
	private final ModelRenderer total;
	private final ModelRenderer head;
	private final ModelRenderer face;
	private final ModelRenderer shoot;
	private final ModelRenderer shoot1;
	private final ModelRenderer shoot5;
	private final ModelRenderer shoot2;
	private final ModelRenderer shoot4;
	private final ModelRenderer shoot3_r1;
	private final ModelRenderer shoot6;
	private final ModelRenderer shoot4_r1;
	private final ModelRenderer shoot3;
	private final ModelRenderer shoot7;
	private final ModelRenderer shoot8;
	private final ModelRenderer getPlantWholeBody;

	public GloomShroomModel() {
		texWidth = 64;
		texHeight = 64;

		total = new ModelRenderer(this);
		total.setPos(0.0F, 24.0F, 0.0F);
		total.texOffs(0, 22).addBox(-6.0F, -5.0F, -6.0F, 12.0F, 5.0F, 12.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -3.0F, 0.5F);
		total.addChild(head);
		setRotationAngle(head, 0.2182F, 0.0F, 0.0F);
		head.texOffs(0, 40).addBox(-6.5F, -8.0F, -6.5F, 13.0F, 7.0F, 13.0F, -0.3F, false);
		head.texOffs(0, 0).addBox(-7.5F, -7.75F, -7.5F, 15.0F, 7.0F, 15.0F, 0.0F, false);

		face = new ModelRenderer(this);
		face.setPos(0.0F, 4.0F, 0.0F);
		head.addChild(face);
		face.texOffs(36, 22).addBox(-6.0F, -12.0F, 0.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		face.texOffs(36, 22).addBox(2.0F, -12.0F, 0.0F, 4.0F, 1.0F, 4.0F, 0.0F, true);

		shoot = new ModelRenderer(this);
		shoot.setPos(0.0F, 4.0F, 0.0F);
		head.addChild(shoot);


		shoot1 = new ModelRenderer(this);
		shoot1.setPos(0.0F, -8.5F, -7.25F);
		shoot.addChild(shoot1);
		shoot1.texOffs(0, 7).addBox(-1.5F, -1.5F, -1.75F, 3.0F, 3.0F, 3.0F, 0.2F, false);
		shoot1.texOffs(0, 0).addBox(-2.5F, -2.5F, -3.25F, 5.0F, 5.0F, 2.0F, 0.0F, false);

		shoot5 = new ModelRenderer(this);
		shoot5.setPos(0.0F, -8.5F, 7.25F);
		shoot.addChild(shoot5);
		shoot5.texOffs(0, 7).addBox(-1.5F, -1.5F, -1.25F, 3.0F, 3.0F, 3.0F, 0.2F, false);
		shoot5.texOffs(0, 0).addBox(-2.5F, -2.5F, 1.25F, 5.0F, 5.0F, 2.0F, 0.0F, false);

		shoot2 = new ModelRenderer(this);
		shoot2.setPos(-6.0F, -8.5F, -6.25F);
		shoot.addChild(shoot2);
		setRotationAngle(shoot2, 0.0F, 0.7854F, 0.0F);
		shoot2.texOffs(0, 7).addBox(-1.5F, -1.5F, -1.75F, 3.0F, 3.0F, 3.0F, 0.2F, false);
		shoot2.texOffs(0, 0).addBox(-2.5F, -2.5F, -3.25F, 5.0F, 5.0F, 2.0F, 0.0F, false);

		shoot4 = new ModelRenderer(this);
		shoot4.setPos(-6.0F, -8.5F, -6.25F);
		shoot.addChild(shoot4);
		setRotationAngle(shoot4, 0.0F, 0.7854F, 0.0F);


		shoot3_r1 = new ModelRenderer(this);
		shoot3_r1.setPos(0.0F, 8.5F, 7.25F);
		shoot4.addChild(shoot3_r1);
		setRotationAngle(shoot3_r1, 0.0F, 1.5708F, 0.0F);
		shoot3_r1.texOffs(0, 0).addBox(-4.0F, -11.0F, -12.0F, 5.0F, 5.0F, 2.0F, 0.0F, false);
		shoot3_r1.texOffs(0, 7).addBox(-3.0F, -10.0F, -10.5F, 3.0F, 3.0F, 3.0F, 0.2F, false);

		shoot6 = new ModelRenderer(this);
		shoot6.setPos(6.0F, -8.5F, -6.25F);
		shoot.addChild(shoot6);
		setRotationAngle(shoot6, 0.0F, -0.7854F, 0.0F);


		shoot4_r1 = new ModelRenderer(this);
		shoot4_r1.setPos(0.0F, 8.5F, 7.25F);
		shoot6.addChild(shoot4_r1);
		setRotationAngle(shoot4_r1, 0.0F, -1.5708F, 0.0F);
		shoot4_r1.texOffs(0, 0).addBox(-1.0F, -11.0F, -12.0F, 5.0F, 5.0F, 2.0F, 0.0F, true);
		shoot4_r1.texOffs(0, 7).addBox(0.0F, -10.0F, -10.5F, 3.0F, 3.0F, 3.0F, 0.2F, true);

		shoot3 = new ModelRenderer(this);
		shoot3.setPos(-7.5F, -8.5F, -0.25F);
		shoot.addChild(shoot3);
		setRotationAngle(shoot3, 0.0F, 1.5708F, 0.0F);
		shoot3.texOffs(0, 7).addBox(-1.5F, -1.5F, -1.75F, 3.0F, 3.0F, 3.0F, 0.2F, false);
		shoot3.texOffs(0, 0).addBox(-2.5F, -2.5F, -3.25F, 5.0F, 5.0F, 2.0F, 0.0F, false);

		shoot7 = new ModelRenderer(this);
		shoot7.setPos(7.5F, -8.5F, -0.25F);
		shoot.addChild(shoot7);
		setRotationAngle(shoot7, 0.0F, -1.5708F, 0.0F);
		shoot7.texOffs(0, 7).addBox(-1.5F, -1.5F, -1.75F, 3.0F, 3.0F, 3.0F, 0.2F, true);
		shoot7.texOffs(0, 0).addBox(-2.5F, -2.5F, -3.25F, 5.0F, 5.0F, 2.0F, 0.0F, true);

		shoot8 = new ModelRenderer(this);
		shoot8.setPos(6.0F, -8.5F, -6.25F);
		shoot.addChild(shoot8);
		setRotationAngle(shoot8, 0.0F, -0.7854F, 0.0F);
		shoot8.texOffs(0, 7).addBox(-1.5F, -1.5F, -1.75F, 3.0F, 3.0F, 3.0F, 0.2F, true);
		shoot8.texOffs(0, 0).addBox(-2.5F, -2.5F, -3.25F, 5.0F, 5.0F, 2.0F, 0.0F, true);

		getPlantWholeBody = new ModelRenderer(this);
		getPlantWholeBody.setPos(0.0F, 0.0F, 0.0F);

	}

	@Override
	public void setupAnim(GloomShroomEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public ModelRenderer getPlantWholeBody() {
		return this.total;
	}

	@Override
	public EntityModel<GloomShroomEntity> getPlantModel() {
		return this;
	}
}