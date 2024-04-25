package com.hungteen.pvz.client.render.layer.component;

import com.hungteen.pvz.client.model.entity.plant.defence.TallNutModel;
import com.hungteen.pvz.common.entity.plant.defence.TallNutEntity;
import com.hungteen.pvz.common.entity.plant.defence.WallNutEntity;
import com.hungteen.pvz.utils.StringUtil;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.util.ResourceLocation;

/**
 * @program: pvzmod-1.16.5
 * @author: HungTeen
 * @create: 2022-03-02 17:08
 **/
public class TallNutArmorLayer extends ComponentLayer<TallNutEntity> {

    private final ResourceLocation ARMOR1 = StringUtil.prefix("textures/entity/plant/defence/tall_nut_armor.png");
    private final ResourceLocation ARMOR2 = StringUtil.prefix("textures/entity/plant/defence/tall_nut_armor_1.png");
    private final ResourceLocation ARMOR3 = StringUtil.prefix("textures/entity/plant/defence/tall_nut_armor_2.png");

    public TallNutArmorLayer(IEntityRenderer<TallNutEntity, EntityModel<TallNutEntity>> entityRendererIn) {
        super(entityRendererIn, new TallNutModel.TallNutArmorModel());
    }

    @Override
    public boolean canRender(TallNutEntity entity) {
        return entity.getInnerDefenceLife() > 0 && entity.getSuperLife()>0;
    }

    @Override
    public ResourceLocation getRenderTexture(TallNutEntity entity) {
        final double percent = entity.getInnerDefenceLife() / entity.getSuperLife();
        return percent > 2 / 3F ? ARMOR1 : percent > 1 / 3F ? ARMOR2 : ARMOR3;
    }

}
