package com.maccam1234.banana.entity.client;

import com.maccam1234.banana.BananaMod;
import com.maccam1234.banana.entity.custom.GorillaEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GorillaModel extends AnimatedGeoModel<GorillaEntity>{

    @Override
    public Identifier getAnimationResource(GorillaEntity animatable) {
        return new Identifier(BananaMod.MOD_ID, "animations/gorilla.animation.json");
    }

    @Override
    public Identifier getModelResource(GorillaEntity object) {
       return new Identifier(BananaMod.MOD_ID, "geo/gorilla.geo.json");
    }

    @Override
    public Identifier getTextureResource(GorillaEntity object) {
        return new Identifier(BananaMod.MOD_ID, "textures/entity/gorilla/gorilla.png");
        
    }

}

