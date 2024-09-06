package com.pyrocoder.basemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties BONE_IN_STEAK = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(1F)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400), 1.0F)
            .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 400), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 1.0F)
            .effect(new MobEffectInstance(MobEffects.JUMP, 400, 144), 1.0F)
            .effect(new MobEffectInstance(MobEffects.HARM, 10), 0.01F)
            .alwaysEdible()
            .usingConvertsTo(ModItems.CUSTOM_BONE.get())
            .build();

}
