package com.maccam1234.banana.entity.client;

import com.maccam1234.banana.BananaMod;
import com.maccam1234.banana.entity.custom.GorillaEntity;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GorillaRenderer extends GeoEntityRenderer<GorillaEntity>{

    public GorillaRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new GorillaModel());
        this.shadowRadius = 0.4f;
    }

    public Identifier getTextureResource(GorillaEntity instance){
        return new Identifier(BananaMod.MOD_ID, "textures/entity/gorilla/gorilla.png");
    }

    public RenderLayer getRenderType(GorillaEntity animatable, float partialTicks, MatrixStack stack, VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, Identifier textureLocation){
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }

}

