package com.xinluo.hoarding;

import com.mojang.logging.LogUtils;
import com.xinluo.hoarding.common.registry.HoardingBlocks;
import com.xinluo.hoarding.common.registry.HoardingCreativeModeTabs;
import com.xinluo.hoarding.common.registry.HoardingItems;
import com.xinluo.hoarding.data.Datagen;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Hoarding.MODID)
public class Hoarding {
    public static final String MODID = "hoarding";
    private static final Logger LOGGER = LogUtils.getLogger();


    public Hoarding() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(Datagen::init);
        modEventBus.addListener(this::addCreative);

        HoardingItems.init(modEventBus);
        HoardingBlocks.init(modEventBus);
        HoardingCreativeModeTabs.init(modEventBus);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == HoardingCreativeModeTabs.HOARDING_MAIN_TAB.getKey())
            HoardingItems.CREATIVE_TAB_ITEMS.forEach(event::accept);
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MODID, path);
    }
}
