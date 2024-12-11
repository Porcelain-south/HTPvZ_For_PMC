package com.hungteen.pvz.client.render.layer;

import com.hungteen.pvz.common.entity.zombie.base.EdgarRobotEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.vector.Matrix4f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class LightShieldLayer<T extends Entity> extends LayerRenderer<T, EntityModel<T>> {

    private float breathingTime = 0.0f;

    public LightShieldLayer(IEntityRenderer<T, EntityModel<T>> entityRendererIn) {
        super(entityRendererIn);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn,
                       float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw,
                       float headPitch) {
        if (entitylivingbaseIn.isAlive() && !entitylivingbaseIn.isInvisible() && entitylivingbaseIn instanceof EdgarRobotEntity) {
            IVertexBuilder vertexBuilder = bufferIn.getBuffer(RenderType.lines());
            matrixStackIn.pushPose();

            // 更新时间，用于呼吸效果
            breathingTime += 0.05f; // 调整这个值以加快或减慢呼吸效果

            final int radialSegments = 16; // 增大以获得更平滑的圆形
            final int heightSegments = 8;
            float radius = 3.5F;

            Matrix4f matrix4f = matrixStackIn.last().pose();

            for (int i = 0; i < heightSegments; i++) {
                double phi1 = Math.PI * (i / (double) heightSegments);
                double phi2 = Math.PI * ((i + 1) / (double) heightSegments);

                for (int j = 0; j < radialSegments; j++) {
                    double theta1 = 2 * Math.PI * (j / (double) radialSegments);

                    // 计算两个圆的顶点
                    double[][] circleVertices1 = calculateCircle(radius, phi1, theta1 + (phi1 / 2), radialSegments);
                    double[][] circleVertices2 = calculateCircle(radius, phi2, theta1 + (phi2 / 2), radialSegments);

                    // 将每个圆的顶点偏移
                    shiftVerticesY(circleVertices1, -1.5);
                    shiftVerticesY(circleVertices2, -1.5);

                    for (int k = 0; k < radialSegments; k++) {
                        addVertex(entitylivingbaseIn, vertexBuilder, matrix4f, circleVertices1[k]);
                        addVertex(entitylivingbaseIn, vertexBuilder, matrix4f, circleVertices2[k]);
                    }

                    // 连接圆的顶点，形成面
                    for (int k = 0; k < radialSegments; k++) {
                        addVertex(entitylivingbaseIn, vertexBuilder, matrix4f, circleVertices1[k]);
                        addVertex(entitylivingbaseIn, vertexBuilder, matrix4f, circleVertices1[(k + 1) % radialSegments]);
                        addVertex(entitylivingbaseIn, vertexBuilder, matrix4f, circleVertices2[k]);
                    }
                }
            }

            matrixStackIn.popPose();
        }
    }

    private double[][] calculateCircle(float radius, double phi, double theta, int radialSegments) {
        double[][] vertices = new double[radialSegments][3];
        for (int i = 0; i < radialSegments; i++) {
            double angle = 2 * Math.PI * i / radialSegments; // 圆的顶点
            double x = radius * Math.sin(phi) * Math.cos(theta + angle);
            double y = radius * Math.cos(phi);
            double z = radius * Math.sin(phi) * Math.sin(theta + angle);
            vertices[i] = new double[]{x, y, z};
        }
        return vertices;
    }

    private void shiftVerticesY(double[][] vertices, double offset) {
        for (double[] vertex : vertices) {
            vertex[1] += offset;
        }
    }

    private boolean flashing = false; // 用于指示闪烁状态
    private int flashTimer = 0;  // 闪烁计时器

    private void addVertex(T entityIn, IVertexBuilder buffer, Matrix4f matrix, double[] vertex) {
        if (entityIn instanceof EdgarRobotEntity) {
            EdgarRobotEntity robot = (EdgarRobotEntity) entityIn;

            float nx = (float) vertex[0];
            float ny = (float) vertex[1];
            float nz = (float) vertex[2];
            float length = (float) Math.sqrt(nx * nx + ny * ny + nz * nz);

            if (length != 0) {
                nx /= length;
                ny /= length;
                nz /= length;
            }

            int shieldColorRed = 255;
            int shieldColorGreen = 255;
            int shieldColorBlue = 255;
            int shieldAlpha = 125;

            // 护盾为none时不渲染护盾
            if (robot.getFieldState() == EdgarRobotEntity.FieldStates.None || robot.getFieldState() == null)
                return;

            // 处理护盾颜色和闪烁效果
            float pulsate = (float)(Math.sin(breathingTime) * 0.1 + 0.9);

            if (robot.hasFieldStateChanged()) {
                flashing = true;  // 开启闪烁
                flashTimer = 5; // 设置闪烁持续时间

                switch (robot.getFieldState()) {
                    case Defensive: // 蓝，护甲
                        shieldColorRed = 94;
                        shieldColorGreen = 149;
                        shieldColorBlue = 187;
                        break;
                    case Resistance: // 红，无敌
                    case BallResistance: // 红，无敌
                        shieldColorRed = 104;
                        shieldColorGreen = 17;
                        shieldColorBlue = 26;
                        break;
                    case Rune: // 黄，减免
                        shieldColorRed = 255;
                        shieldColorGreen = 255;
                        shieldColorBlue = 0;
                        break;
                    default:
                        return;
                }
            }

            // 如果开启闪烁，调整透明度
            if (flashing) {
                float flashIntensity = (float)(Math.sin(flashTimer * Math.PI / 5) * 0.5 + 0.5); // 0到1的闪烁
                shieldAlpha = (int)(125 * flashIntensity); // 根据闪烁强度调整透明度

                // 减少计时器
                flashTimer--; // 减少tick数以控制闪烁持续时间
                if (flashTimer <= 0) {
                    flashing = false; // 关闭闪烁
                    robot.setHasFieldChanged(false); // 重置状态
                }
            }

            // 计算颜色的渐变，不再在状态下应用pulsate
            shieldColorRed = (int)(shieldColorRed * pulsate);
            shieldColorGreen = (int)(shieldColorGreen * pulsate);
            shieldColorBlue = (int)(shieldColorBlue * pulsate);

            buffer.vertex(matrix, (float) vertex[0], (float) vertex[1], (float) vertex[2])
                    .color(shieldColorRed, shieldColorGreen, shieldColorBlue, shieldAlpha) // 使用渐变色
                    .uv(0, 0)
                    .overlayCoords(OverlayTexture.NO_OVERLAY)
                    .normal(nx, ny, nz)
                    .endVertex();
        }
    }


}
