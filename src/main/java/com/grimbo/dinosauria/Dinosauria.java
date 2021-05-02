package com.grimbo.dinosauria;

import com.grimbo.dinosauria.block.ModBlocks;
import com.grimbo.dinosauria.entity.*;
import com.grimbo.dinosauria.item.ModItems;
import com.grimbo.dinosauria.setup.ClientProxy;
import com.grimbo.dinosauria.setup.IProxy;
import com.grimbo.dinosauria.setup.ServerProxy;
import com.grimbo.dinosauria.util.Registration;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Dinosauria.MOD_ID)
public class Dinosauria
{
    public static final String MOD_ID = "dinosauria";

    public static final ItemGroup DINOSAURIA = new ItemGroup("dinosauriaTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.DILOPHOSAURUS_SKULL.get());
        }
    };



    public static IProxy proxy;



    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();


    public Dinosauria() {

        proxy = DistExecutor.safeRunForDist(() -> ClientProxy::new, () -> ServerProxy::new);


        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Registration.register();
        ModItems.register();
        ModBlocks.register();
        eventBus.addListener(this::doClientStuff);
        ModEntityTypes.ENTITY_TYPES.register(eventBus);
        MinecraftForge.EVENT_BUS.register(this);



        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in

    }


    private void setup(final FMLCommonSetupEvent event)
    {

        proxy.init();


        event.enqueueWork(() -> {

          GlobalEntityTypeAttributes.put(ModEntityTypes.BALAUR.get(), BalaurEntity.setCustomAttributes().create());

          GlobalEntityTypeAttributes.put(ModEntityTypes.DILOPHOSAURUS.get(), DilophosaurusEntity.setCustomAttributes().create());

          GlobalEntityTypeAttributes.put(ModEntityTypes.IRRITATOR.get(), IrritatorEntity.setCustomAttributes().create());

          GlobalEntityTypeAttributes.put(ModEntityTypes.MONOLOPHOSAURUS.get(), MonolophosaurusEntity.setCustomAttributes().create());

          GlobalEntityTypeAttributes.put(ModEntityTypes.DRYOSAURUS.get(), DryosaurusEntity.setCustomAttributes().create());

          GlobalEntityTypeAttributes.put(ModEntityTypes.PLATYKOTTA.get(), PlatykottaEntity.setCustomAttributes().create());
        });


        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

    }



    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }


    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo(Dinosauria.MOD_ID, "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }



    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }


}
