package com.maccam1234.banana.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.LookAtEntityGoal;
import net.minecraft.entity.ai.goal.WanderAroundPointOfInterestGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;

import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

public class GorillaEntity extends AnimalEntity implements IAnimatable{

    private AnimationFactory factory = new AnimationFactory(this);
    
    public GorillaEntity(EntityType<? extends AnimalEntity> entityType, World world) {
        super(entityType, world);
    }

    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity){
        return null;
    }

    public static DefaultAttributeContainer.Builder setAttributes() {
        return AnimalEntity.createMobAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0D)
            .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 10.0f);
    }

    protected void initGoals(){
        this.goalSelector.add(0,new LookAtEntityGoal(this, PlayerEntity.class, 8.0f));
        this.goalSelector.add(2,new WanderAroundPointOfInterestGoal(this, 0.75f, false));

    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event){
        if(event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.gorilla.walk", true));
            return PlayState.CONTINUE;
        }

        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.gorilla.idle", true));
        return PlayState.CONTINUE;
    }

    public void registerControllers(AnimationData animationData){
        animationData.addAnimationController(new AnimationController(this,"controller",0,this::predicate));

    }

    public AnimationFactory getFactory() {
        return factory;
    }


}
