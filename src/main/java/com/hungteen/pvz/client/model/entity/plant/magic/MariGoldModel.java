package com.hungteen.pvz.client.model.entity.plant.magic;

import com.hungteen.pvz.client.model.entity.plant.PVZPlantModel;
import com.hungteen.pvz.common.entity.plant.magic.MariGoldEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports


public class MariGoldModel<T extends MariGoldEntity> extends PVZPlantModel<T> {
	private final ModelRenderer total;
	private final ModelRenderer leaves;
	private final ModelRenderer YEZI_2;
	private final ModelRenderer YEZI_3;
	private final ModelRenderer YEZI_1;
	private final ModelRenderer YEZI_4;
	private final ModelRenderer body;
	private final ModelRenderer stickd_r1;
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer petals;
	private final ModelRenderer petal12;
	private final ModelRenderer petal2;
	private final ModelRenderer petal3;
	private final ModelRenderer petal4;
	private final ModelRenderer petal5;
	private final ModelRenderer petal6;
	private final ModelRenderer petal7;
	private final ModelRenderer petal8;
	private final ModelRenderer petal10;
	private final ModelRenderer petal9;
	private final ModelRenderer petal11;
	private final ModelRenderer getPlantWholeBody;

	public MariGoldModel() {
		texWidth = 64;
		texHeight = 64;

		total = new ModelRenderer(this);
		total.setPos(8.0F, 24.0F, -8.0F);


		leaves = new ModelRenderer(this);
		leaves.setPos(-8.0F, 1.0F, 8.0F);
		total.addChild(leaves);


		YEZI_2 = new ModelRenderer(this);
		YEZI_2.setPos(0.0F, -0.5F, 0.0F);
		leaves.addChild(YEZI_2);
		setRotationAngle(YEZI_2, 0.1745F, 0.0F, 0.0F);
		YEZI_2.texOffs(18, 6).addBox(-2.0F, -0.5F, 0.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);

		YEZI_3 = new ModelRenderer(this);
		YEZI_3.setPos(0.0F, -0.5F, 0.0F);
		leaves.addChild(YEZI_3);
		setRotationAngle(YEZI_3, -0.1745F, 0.0F, 0.0F);
		YEZI_3.texOffs(14, 16).addBox(-2.0F, -0.5F, -7.0F, 4.0F, 1.0F, 6.0F, 0.0F, false);

		YEZI_1 = new ModelRenderer(this);
		YEZI_1.setPos(0.0F, -0.5F, -1.0F);
		leaves.addChild(YEZI_1);
		setRotationAngle(YEZI_1, 0.0F, 0.0F, -0.1745F);
		YEZI_1.texOffs(20, 23).addBox(1.0F, -0.5F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		YEZI_4 = new ModelRenderer(this);
		YEZI_4.setPos(0.0F, -0.5F, -1.0F);
		leaves.addChild(YEZI_4);
		setRotationAngle(YEZI_4, 0.0F, 0.0F, 0.1745F);
		YEZI_4.texOffs(0, 23).addBox(-7.0F, -0.5F, -2.0F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setPos(-8.0F, 0.0F, 7.0F);
		total.addChild(body);
		body.texOffs(8, 28).addBox(-1.0F, -13.5939F, 0.7078F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		stickd_r1 = new ModelRenderer(this);
		stickd_r1.setPos(0.0F, 0.0F, 0.0F);
		body.addChild(stickd_r1);
		setRotationAngle(stickd_r1, -0.2182F, 0.0F, 0.0F);
		stickd_r1.texOffs(0, 28).addBox(-1.0F, -8.0F, -1.0F, 2.0F, 8.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setPos(0.0F, -12.0F, 1.0F);
		body.addChild(head);
		head.texOffs(0, 12).addBox(-3.0F, -3.0F, 0.0F, 6.0F, 6.0F, 4.0F, 0.0F, false);
		head.texOffs(0, 0).addBox(-4.5F, -6.0F, -3.0F, 9.0F, 9.0F, 3.0F, 0.0F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(-2.0F, -4.0F, -3.5F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, -0.4363F);
		head_r1.texOffs(16, 13).addBox(-1.75F, -2.25F, 0.375F, 4.0F, 2.0F, 1.0F, 0.0F, true);

		head_r2 = new ModelRenderer(this);
		head_r2.setPos(2.0F, -4.0F, -3.5F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, 0.4363F);
		head_r2.texOffs(16, 13).addBox(-2.25F, -2.25F, 0.375F, 4.0F, 2.0F, 1.0F, 0.0F, false);

		petals = new ModelRenderer(this);
		petals.setPos(0.0F, -1.275F, 0.75F);
		head.addChild(petals);


		petal12 = new ModelRenderer(this);
		petal12.setPos(0.425F, -3.0F, -1.5F);
		petals.addChild(petal12);
		setRotationAngle(petal12, 0.0852F, 0.0189F, 0.1317F);
		petal12.texOffs(54, 0).addBox(-0.7831F, -4.0272F, -0.0819F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		petal12.texOffs(56, 62).addBox(-0.2831F, -5.0272F, -0.0819F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		petal2 = new ModelRenderer(this);
		petal2.setPos(-0.425F, -3.0F, -1.5F);
		petals.addChild(petal2);
		setRotationAngle(petal2, 0.0852F, -0.0189F, -0.1317F);
		petal2.texOffs(54, 0).addBox(-3.2169F, -4.0272F, -0.0819F, 4.0F, 5.0F, 1.0F, 0.0F, true);
		petal2.texOffs(56, 62).addBox(-2.7169F, -5.0272F, -0.0819F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		petal3 = new ModelRenderer(this);
		petal3.setPos(2.75F, -2.0F, -1.75F);
		petals.addChild(petal3);
		setRotationAngle(petal3, 0.0791F, -0.0368F, 0.7839F);
		petal3.texOffs(54, 0).addBox(-1.7077F, -4.2941F, -0.0298F, 4.0F, 5.0F, 1.0F, 0.0F, true);
		petal3.texOffs(56, 62).addBox(-1.2077F, -5.2941F, -0.0298F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		petal4 = new ModelRenderer(this);
		petal4.setPos(-2.75F, -2.0F, -1.75F);
		petals.addChild(petal4);
		setRotationAngle(petal4, 0.0791F, 0.0368F, -0.7839F);
		petal4.texOffs(54, 0).addBox(-2.2923F, -4.2941F, -0.0298F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		petal4.texOffs(56, 62).addBox(-1.7923F, -5.2941F, -0.0298F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		petal5 = new ModelRenderer(this);
		petal5.setPos(3.5F, -2.0F, -1.5F);
		petals.addChild(petal5);
		setRotationAngle(petal5, 0.0263F, -0.0832F, 1.6133F);
		petal5.texOffs(54, 0).addBox(-0.9576F, -4.0013F, -0.0298F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		petal5.texOffs(56, 62).addBox(-0.4576F, -5.0013F, -0.0298F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		petal6 = new ModelRenderer(this);
		petal6.setPos(-3.5F, -2.0F, -1.5F);
		petals.addChild(petal6);
		setRotationAngle(petal6, 0.0263F, 0.0832F, -1.6133F);
		petal6.texOffs(54, 0).addBox(-3.0424F, -4.0013F, -0.0298F, 4.0F, 5.0F, 1.0F, 0.0F, true);
		petal6.texOffs(56, 62).addBox(-2.5424F, -5.0013F, -0.0298F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		petal7 = new ModelRenderer(this);
		petal7.setPos(3.95F, -0.475F, -2.0F);
		petals.addChild(petal7);
		setRotationAngle(petal7, -0.027F, -0.083F, 2.2351F);
		petal7.texOffs(54, 0).addBox(-0.3584F, -4.2335F, -0.0298F, 4.0F, 5.0F, 1.0F, 0.0F, false);
		petal7.texOffs(56, 62).addBox(0.1416F, -5.2335F, -0.0298F, 3.0F, 1.0F, 1.0F, 0.0F, false);

		petal8 = new ModelRenderer(this);
		petal8.setPos(-3.95F, -0.475F, -2.0F);
		petals.addChild(petal8);
		setRotationAngle(petal8, -0.027F, 0.083F, -2.2351F);
		petal8.texOffs(54, 0).addBox(-3.6416F, -4.2335F, -0.0298F, 4.0F, 5.0F, 1.0F, 0.0F, true);
		petal8.texOffs(56, 62).addBox(-3.1416F, -5.2335F, -0.0298F, 3.0F, 1.0F, 1.0F, 0.0F, true);

		petal10 = new ModelRenderer(this);
		petal10.setPos(2.55F, 3.25F, -1.5F);
		petals.addChild(petal10);
		setRotationAngle(petal10, -0.087F, -0.0072F, -0.388F);
		petal10.texOffs(15, 22).addBox(-1.6993F, -0.9501F, -0.0831F, 3.0F, 4.0F, 1.0F, 0.0F, true);

		petal9 = new ModelRenderer(this);
		petal9.setPos(-2.55F, 3.25F, -1.5F);
		petals.addChild(petal9);
		setRotationAngle(petal9, -0.087F, 0.0072F, 0.388F);
		petal9.texOffs(15, 22).addBox(-1.3007F, -0.9501F, -0.0831F, 3.0F, 4.0F, 1.0F, 0.0F, false);

		petal11 = new ModelRenderer(this);
		petal11.setPos(0.0F, 3.85F, -1.75F);
		petals.addChild(petal11);
		setRotationAngle(petal11, -0.1309F, 0.0F, 0.0F);
		petal11.texOffs(15, 22).addBox(-1.5F, -0.9914F, -0.1305F, 3.0F, 4.0F, 1.0F, 0.0F, true);

		getPlantWholeBody = new ModelRenderer(this);
		getPlantWholeBody.setPos(0.0F, 0.0F, 0.0F);

	}

	@Override
	public void setupAnim(MariGoldEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
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