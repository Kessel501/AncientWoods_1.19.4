package kessel.ancientwoods;

import kessel.ancientwoods.entity.ModEntities;
import kessel.ancientwoods.entity.custom.TigerEntity;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib.animatable.GeoEntity;

public class AncientWoods implements ModInitializer {
	public static final String MOD_ID = "ancientwoods";
	public static final Logger LOGGER = LoggerFactory.getLogger("ancientwoods");

	@Override
	public void onInitialize() {

		FabricDefaultAttributeRegistry.register(ModEntities.TIGER, TigerEntity.setAttributes());


		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}