package com.grimbo.dinosauria.events;

import com.grimbo.dinosauria.block.ModBlocks;
import com.grimbo.dinosauria.effect.ModEffects;
import com.grimbo.dinosauria.item.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
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
import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.*;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.world.Explosion;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.ExplosionEvent;
import net.minecraftforge.eventbus.EventSubclassTransformer;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

public class ModEvents {
    Random random = new Random();


    @SubscribeEvent
    public void spinosaurSpearAttackSpeedIncreasementInWater(TickEvent.PlayerTickEvent event)
    {
        if(event.player.getHeldItemMainhand().getItem() == ModItems.SPINOSAUR_TOOTH_SPEAR.get())
        {

            PlayerEntity player = (PlayerEntity)event.player;

            if(player.isInWater()){

                player.addPotionEffect(new EffectInstance(ModEffects.FISHER_STRIKE.get(), 999999999));

            }else{
                player.removePotionEffect(ModEffects.FISHER_STRIKE.get());
            }
        }

    }

    @SubscribeEvent
    public void spinosaurSpearAttackSpeedIncreasementInWater(BlockEvent.BlockToolInteractEvent event)
    {
        if(event.getState().getBlock() == ModBlocks.ARAUCARIA_LOG.get()){
            Direction.Axis pedro = event.getState().get(BlockStateProperties.AXIS);
            Block block = event.getState().getBlock();
            PlayerEntity player = event.getPlayer();

            //block.replaceBlock(block.getDefaultState(),ModBlocks.ARAUCARIA_STRIPPED_LOG.get().getDefaultState(), event.getWorld(),event.getPos(),1);


            block.replaceBlockState(block.getDefaultState(), ModBlocks.ARAUCARIA_STRIPPED_LOG.get().getDefaultState().with(BlockStateProperties.AXIS, pedro), player.world,event.getPos(),1,1);

            //Blocks

            //SOUND
            event.getWorld().playSound(player, event.getPos(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.PLAYERS, 0.5F,  (random.nextFloat() * 0.4F + 0.8F));
        }

    }

}
