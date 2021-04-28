package com.grimbo.dinosauria;

import com.grimbo.dinosauria.block.ModBlocks;
import com.grimbo.dinosauria.entity.BalaurEntity;
import com.grimbo.dinosauria.entity.DilophosaurusEntity;
import com.grimbo.dinosauria.entity.ModEntityTypes;
import com.grimbo.dinosauria.entity.render.BalaurRenderer;
import com.grimbo.dinosauria.item.ModItems;
import com.grimbo.dinosauria.setup.ClientProxy;
import com.grimbo.dinosauria.setup.IProxy;
import com.grimbo.dinosauria.setup.ServerProxy;
import com.grimbo.dinosauria.util.Registration;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.transformer.Config;
import software.bernie.geckolib3.GeckoLib;
import sun.misc.ObjectInputFilter;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Dinosauria.MOD_ID)
public class Dinosauria
{
    public static final String MOD_ID = "dinosauria";

    public static final ItemGroup DINOSAURIA = new ItemGroup("dinosauriaTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.COOKED_EGG.get());
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

        //uncomment this if you are going to do inter-mod things
        /*
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
       */

        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in

    }


    private void setup(final FMLCommonSetupEvent event)
    {

        proxy.init();


        DeferredWorkQueue.runLater(() -> {

          GlobalEntityTypeAttributes.put(ModEntityTypes.BALAUR.get(), BalaurEntity.setCustomAttributes().create());

          GlobalEntityTypeAttributes.put(ModEntityTypes.DILOPHOSAURUS.get(), DilophosaurusEntity.setCustomAttributes().create());
          

        });


        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());

    }



    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }

    //uncomment this if you are going to do inter-mod things
    /*

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("examplemod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
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
    */


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
