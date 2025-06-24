package taylorrubi.stellarite.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent STELLARITE_CHORUS_FRUIT = new FoodComponent.Builder().nutrition(6).saturationModifier(3.6f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1000, 0), 1.0F).alwaysEdible().build();
}
