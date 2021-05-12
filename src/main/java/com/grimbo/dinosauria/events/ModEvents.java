package com.grimbo.dinosauria.events;

import com.grimbo.dinosauria.effect.ModEffects;
import com.grimbo.dinosauria.item.ModItems;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.passive.StriderEntity;
import net.minecraft.entity.passive.fish.CodEntity;
import net.minecraft.entity.passive.fish.PufferfishEntity;
import net.minecraft.entity.passive.fish.SalmonEntity;
import net.minecraft.entity.passive.fish.TropicalFishEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.AxeItem;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModEvents {

    @SubscribeEvent
    public void spinosaurSpearAttackSpeedIncreasementInWater(TickEvent.PlayerTickEvent event)
    {
        if(event.player.getHeldItemMainhand().getItem() == ModItems.SPINOSAUR_TOOTH_SPEAR.get())
        {
            PlayerEntity player = (PlayerEntity)event.player;
            if(player.isInWater()){
                player.addPotionEffect(new EffectInstance(ModEffects.FISHER_STRIKE.get(), 1));
            }else{
                player.removePotionEffect(ModEffects.FISHER_STRIKE.get());
            }
        }

    }


}
