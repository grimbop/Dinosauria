package com.grimbo.dinosauria.effect;

import com.grimbo.dinosauria.Dinosauria;
import com.grimbo.dinosauria.util.Registration;
import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.scene.BoundsAccessor;
import javafx.scene.Node;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.potion.Effects;
import net.minecraft.potion.Potions;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.fml.RegistryObject;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Difficulty;
import net.minecraft.world.server.ServerWorld;


public class ModEffects {



    public static final RegistryObject<Effect> FISHER_STRIKE = Registration.POTIONS.register("fisher_strike", () -> new CustomEffect(EffectType.BENEFICIAL, 5786898)
    .addAttributesModifier(Attributes.ATTACK_SPEED, "AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3", (double)0.7F, AttributeModifier.Operation.MULTIPLY_TOTAL));



    public static void register() {
    }

}
