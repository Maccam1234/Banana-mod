package com.maccam1234.banana.util;

import com.maccam1234.banana.entity.ModEntities;
import com.maccam1234.banana.entity.custom.GorillaEntity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class ModRegistries {
    public static void registerModStuffs(){
        registerAttributes();
    }

    private static void registerAttributes(){
        FabricDefaultAttributeRegistry.register(ModEntities.GORILLA, GorillaEntity.setAttributes());
    }
}
