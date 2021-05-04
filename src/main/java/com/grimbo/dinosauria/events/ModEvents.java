package com.grimbo.dinosauria.events;

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
        public void spinosaurSpearFishInstakill(AttackEntityEvent event)
    {
        if(event.getPlayer().getHeldItemMainhand().getItem() == ModItems.SPINOSAUR_TOOTH_SPEAR.get())
        {
            PlayerEntity player = (PlayerEntity)event.getPlayer();
            LivingEntity target = (LivingEntity)event.getEntityLiving();

            if(target instanceof SalmonEntity || target instanceof PufferfishEntity ||
                    target instanceof CodEntity || target instanceof TropicalFishEntity) {

                player.addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 100, 2));
            }

        }
    }

    @SubscribeEvent
    public void spinosaurSpearAttackSpeedIncreasement(TickEvent.PlayerTickEvent event)
    {
        if(event.player.getHeldItemMainhand().getItem() == ModItems.SPINOSAUR_TOOTH_SPEAR.get())
        {
            PlayerEntity player = (PlayerEntity)event.player;
            if(player.isInWater()){
                player.addPotionEffect(new EffectInstance(Effects.HASTE, 1, 4));
            }else{
                player.removePotionEffect(Effects.HASTE);
            }
        }

    }


}
