package com.grimbo.dinosauria.effect;

import com.grimbo.dinosauria.util.Registration;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraftforge.fml.RegistryObject;

public class ModEffects {

    public static final RegistryObject<Effect> FISHER_STRIKE = Registration.POTIONS.register("fisher_strike", () -> new CustomEffect(EffectType.BENEFICIAL, 5786898).addAttributesModifier(Attributes.ATTACK_SPEED, "AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3", (double)0.7F, AttributeModifier.Operation.MULTIPLY_TOTAL));



    public static void register() {
    }

}
