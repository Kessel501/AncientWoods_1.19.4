package kessel.ancientwoods.entity.Client;

import kessel.ancientwoods.AncientWoods;
import kessel.ancientwoods.entity.custom.TigerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class TigerRenderer extends GeoEntityRenderer<TigerEntity> {
    public TigerRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new TigerModel());
    }

    @Override
    public Identifier getTextureLocation(TigerEntity animatable) {
        return new Identifier(AncientWoods.MOD_ID, "textures/entity/tiger.png");
    }

    @Override
    public void render(TigerEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        if (entity.isBaby()){
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
