package com.hungteen.pvz.client.render.layer;

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

    public LightShieldLayer(IEntityRenderer<T, EntityModel<T>> entityRendererIn) {
        super(entityRendererIn);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn,
                       float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw,
                       float headPitch) {
        if (!entitylivingbaseIn.isAlive() || entitylivingbaseIn.isInvisible()) {
            return;
        }

        IVertexBuilder vertexBuilder = bufferIn.getBuffer(RenderType.lines());
        matrixStackIn.pushPose();

        final int radialSegments = 32;
        final int heightSegments = 32;
        float radius = 3.5F;

        Matrix4f matrix4f = matrixStackIn.last().pose();

        for (int i = 0; i < heightSegments; i++) {
            double phi1 = Math.PI * (i / (double) heightSegments);
            double phi2 = Math.PI * ((i + 1) / (double) heightSegments);

            for (int j = 0; j < radialSegments; j++) {
                double theta1 = 2 * Math.PI * (j / (double) radialSegments);
                double theta2 = 2 * Math.PI * ((j + 1) / (double) radialSegments);

                double[] vertex1 = calculateVertex(radius, phi1, theta1);
                double[] vertex2 = calculateVertex(radius, phi1, theta2);
                double[] vertex3 = calculateVertex(radius, phi2, theta2);
                double[] vertex4 = calculateVertex(radius, phi2, theta1);

                vertex1[1] -= 1.5;
                vertex2[1] -= 1.5;
                vertex3[1] -= 1.5;
                vertex4[1] -= 1.5;

                // 顺序调整正确，确保每个区域都被两个三角形覆盖
                addVertex(vertexBuilder, matrix4f, packedLightIn, vertex1);
                addVertex(vertexBuilder, matrix4f, packedLightIn, vertex3);
                addVertex(vertexBuilder, matrix4f, packedLightIn, vertex2);

                addVertex(vertexBuilder, matrix4f, packedLightIn, vertex1);
                addVertex(vertexBuilder, matrix4f, packedLightIn, vertex4);
                addVertex(vertexBuilder, matrix4f, packedLightIn, vertex3);
            }
        }

        matrixStackIn.popPose();
    }

    private double[] calculateVertex(float radius, double phi, double theta) {
        double x = radius * Math.sin(phi) * Math.cos(theta);
        double y = radius * Math.cos(phi);
        double z = radius * Math.sin(phi) * Math.sin(theta);
        return new double[]{x, y, z};
    }

    private void addVertex(IVertexBuilder buffer, Matrix4f matrix, int light, double[] vertex) {
        float nx = (float) vertex[0];
        float ny = (float) vertex[1];
        float nz = (float) vertex[2];
        float length = (float) Math.sqrt(nx * nx + ny * ny + nz * nz);

        if (length != 0) {
            nx /= length;
            ny /= length;
            nz /= length;
        }

        buffer.vertex(matrix, (float) vertex[0], (float) vertex[1], (float) vertex[2])
                .color(255, 255, 0, 225)
                .uv(0, 0)
                .overlayCoords(OverlayTexture.NO_OVERLAY)
                .normal(nx, ny, nz)
                .endVertex();
    }

}


