package com.minecraftpog.mireamod.common.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BEER = (new FoodProperties.Builder()).fast().nutrition(2).saturationMod(0.2F).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0), 0.5F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 0), 0.8F).effect(new MobEffectInstance(MobEffects.CONFUSION, 600, 0), 0.3F).build();
    public static final FoodProperties SHAWA = (new FoodProperties.Builder()).fast().nutrition(6).saturationMod(0.6F).effect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 0.1F).effect(new MobEffectInstance(MobEffects.POISON, 100, 2), 0.2F).build();
    public static final FoodProperties SIGA = (new FoodProperties.Builder()).fast().nutrition(0).saturationMod(0.0F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 2), 1.0F).effect(new MobEffectInstance(MobEffects.WEAKNESS, 300, 1), 0.6F).effect(new MobEffectInstance(MobEffects.HUNGER, 300, 1), 0.3F).build();
    public static final FoodProperties ENERGOS = (new FoodProperties.Builder()).fast().nutrition(1).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.DIG_SPEED, 400, 3), 1.0F).effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 300, 1), 1.0F).effect(new MobEffectInstance(MobEffects.WITHER, 100, 0), 0.2F).build();

}
