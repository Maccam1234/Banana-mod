package com.maccam1234.banana;

import com.maccam1234.banana.entity.ModEntities;
import com.maccam1234.banana.entity.client.GorillaRenderer;
import com.maccam1234.banana.entity.custom.GorillaEntity;
import com.maccam1234.banana.registry.ModItems;
import com.maccam1234.banana.util.ModRegistries;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import software.bernie.geckolib3.GeckoLib;

public class BananaMod implements ModInitializer{
    
    //convenient if mod id were to be edited
    public static final String MOD_ID = "banana";
    
    @Override
    //runs at game launch
    public void onInitialize(){
        //registers the items
        ModItems.registerItems();
        ModRegistries.registerModStuffs();
        EntityRendererRegistry.register(ModEntities.GORILLA, GorillaRenderer::new);
        GeckoLib.initialize();
    }
}
