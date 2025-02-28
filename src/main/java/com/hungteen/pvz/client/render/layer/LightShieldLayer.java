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
import net.minecraft.util.math.vector.Vector3f;
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
            EdgarRobotEntity robot = (EdgarRobotEntity) entitylivingbaseIn; // 提前获取实体
            IVertexBuilder vertexBuilder = bufferIn.getBuffer(RenderType.lines());
            matrixStackIn.pushPose();

            breathingTime += partialTicks * 0.05f; // 调整这个值以加快或减慢呼吸效果

            // 旋转效果
            matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(ageInTicks));

            final int radialSegments = 16;
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

                    for (double[] vertex : circleVertices1) {
                        vertex[1] -= 1.5;
                    }

                    for (double[] vertex : circleVertices2) {
                        vertex[1] -= 1.5;
                    }

                    for (int k = 0; k < radialSegments; k++) {
                        addVertex(robot, vertexBuilder, matrix4f, circleVertices1[k]);
                        addVertex(robot, vertexBuilder, matrix4f, circleVertices2[k]);
                    }

                    // 连接圆的顶点，形成面
                    for (int k = 0; k < radialSegments; k++) {
                        addVertex(robot, vertexBuilder, matrix4f, circleVertices1[k]);
                        addVertex(robot, vertexBuilder, matrix4f, circleVertices1[(k + 1) % radialSegments]);
                        addVertex(robot, vertexBuilder, matrix4f, circleVertices2[k]);
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


    private void addVertex(EdgarRobotEntity robot, IVertexBuilder buffer, Matrix4f matrix, double[] vertex) {
        float nx = (float) vertex[0];
        float ny = (float) vertex[1];
        float nz = (float) vertex[2];
        float length = (float) Math.sqrt(nx * nx + ny * ny + nz * nz);

        if (length != 0) {
            nx /= length;
            ny /= length;
            nz /= length;
        }

        // 确保机器人的状态在有效范围内，如果为 None 时不渲染护盾
        if (robot.getFieldState() == EdgarRobotEntity.FieldStates.None || robot.getFieldState() == null) {
            return;
        }

        // 处理护盾颜色
        int shieldColorRed;
        int shieldColorGreen;
        int shieldColorBlue;
        int shieldAlpha = 125;

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
                shieldColorRed = 255;
                shieldColorGreen = 255;
                shieldColorBlue = 255; // 默认白色
                shieldAlpha = 0;
                break;
        }

        // 处理颜色渐变
        float pulsate = (float) (Math.sin(breathingTime) * 0.25 + 1.0);
        pulsate = Math.max(pulsate, 0.75f);
        int maxColorValue = 75;
        shieldColorRed = (int) (shieldColorRed * pulsate + (maxColorValue * (1 - pulsate)));
        shieldColorGreen = (int) (shieldColorGreen * pulsate + (maxColorValue * (1 - pulsate)));
        shieldColorBlue = (int) (shieldColorBlue * pulsate + (maxColorValue * (1 - pulsate)));
        // 确保数值范围
        shieldColorRed = Math.min(shieldColorRed, 255);
        shieldColorGreen = Math.min(shieldColorGreen, 255);
        shieldColorBlue = Math.min(shieldColorBlue, 255);

        // 添加顶点
        buffer.vertex(matrix, (float) vertex[0], (float) vertex[1], (float) vertex[2])
                .color(shieldColorRed, shieldColorGreen, shieldColorBlue, shieldAlpha) // 使用渐变色
                .uv(0, 0)
                .overlayCoords(OverlayTexture.NO_OVERLAY)
                .normal(nx, ny, nz)
                .endVertex();
    }

}
