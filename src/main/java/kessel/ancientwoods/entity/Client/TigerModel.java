package kessel.ancientwoods.entity.Client;

import kessel.ancientwoods.AncientWoods;
import kessel.ancientwoods.entity.custom.TigerEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class TigerModel extends GeoModel<TigerEntity> {
    @Override
    public Identifier getModelResource(TigerEntity animatable) {
        return new Identifier(AncientWoods.MOD_ID, "geo/tiger.geo.json");
    }

    @Override
    public Identifier getTextureResource(TigerEntity animatable) {
        return new Identifier(AncientWoods.MOD_ID, "textures/entity/tiger.png");
    }

    @Override
    public Identifier getAnimationResource(TigerEntity animatable) {
        return new Identifier(AncientWoods.MOD_ID, "animations/tiger.animation.json");
    }
    //ffalta la cabeza xD
}
