package fr.mysticraft.mystimod.item.customItems;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFood {

    public static final FoodProperties DIAMOND_APPLE = new FoodProperties.Builder()
            .nutrition(2).saturationMod(0.2f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 4200), 1)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 400, 2), 1)
            .build();
}
