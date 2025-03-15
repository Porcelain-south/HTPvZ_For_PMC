package com.hungteen.pvz.client.gui.screen;

import com.hungteen.pvz.common.container.EssenceFurnaceContainer;
import com.hungteen.pvz.utils.StringUtil;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class EssenceFurnaceScreen extends PVZContainerScreen<EssenceFurnaceContainer> {

    private static final ResourceLocation TEXTURE = StringUtil.prefix("textures/gui/container/essence_furnace.png");

    private boolean widthTooNarrow;
    private final ResourceLocation texture;

    public EssenceFurnaceScreen(EssenceFurnaceContainer container, PlayerInventory p_i51104_3_, ITextComponent p_i51104_4_) {
        super(container, p_i51104_3_, p_i51104_4_);
        this.texture = TEXTURE;
    }

    public void init() {
        super.init();
        this.widthTooNarrow = this.width < 379;

        this.titleLabelX = (this.imageWidth - this.font.width(this.title)) / 2;
    }

    public void render(MatrixStack p_230430_1_, int p_230430_2_, int p_230430_3_, float p_230430_4_) {
        this.renderBackground(p_230430_1_);
        if (this.widthTooNarrow) {
            this.renderBg(p_230430_1_, p_230430_4_, p_230430_2_, p_230430_3_);
        } else {
            super.render(p_230430_1_, p_230430_2_, p_230430_3_, p_230430_4_);
        }

        this.renderTooltip(p_230430_1_, p_230430_2_, p_230430_3_);
    }

    protected void renderBg(MatrixStack p_230450_1_, float p_230450_2_, int p_230450_3_, int p_230450_4_) {
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.minecraft.getTextureManager().bind(this.texture);
        int lvt_5_1_ = this.leftPos;
        int lvt_6_1_ = this.topPos;
        this.blit(p_230450_1_, lvt_5_1_, lvt_6_1_, 0, 0, this.imageWidth, this.imageHeight);
        int lvt_7_2_;
        if (this.menu.isLit()) {
            lvt_7_2_ = this.menu.getLitProgress();
            this.blit(p_230450_1_, lvt_5_1_ + 56, lvt_6_1_ + 36 + 12 - lvt_7_2_, 176, 12 - lvt_7_2_, 14, lvt_7_2_ + 1);
        }

        lvt_7_2_ = this.menu.getBurnProgress();
        this.blit(p_230450_1_, lvt_5_1_ + 79, lvt_6_1_ + 34, 176, 14, lvt_7_2_ + 1, 16);
    }

}
