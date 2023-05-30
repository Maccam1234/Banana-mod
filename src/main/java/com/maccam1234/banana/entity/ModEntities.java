package com.maccam1234.banana.entity;

import com.maccam1234.banana.BananaMod;
import com.maccam1234.banana.entity.custom.GorillaEntity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities{
    public static final EntityType<GorillaEntity> GORILLA = Registry.register(
        Registry.ENTITY_TYPE, new Identifier(BananaMod.MOD_ID, "gorilla"),
        FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GorillaEntity::new).dimensions(EntityDimensions.fixed(0.4f, 0.3f)).build());

}