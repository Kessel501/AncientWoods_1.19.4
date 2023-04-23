package kessel.ancientwoods;

import kessel.ancientwoods.entity.Client.TigerRenderer;
import kessel.ancientwoods.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class AncientWoodsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(ModEntities.TIGER, TigerRenderer::new);

    }
}
