package com.xinluo.hoarding.common.registry;

import com.xinluo.hoarding.Hoarding;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.xinluo.hoarding.common.registry.HoardingItems.*;

public class HoardingCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Hoarding.MODID);

    public static final RegistryObject<CreativeModeTab> HOARDING_MAIN_TAB = CREATIVE_MODE_TABS.register("main_tab", () -> CreativeModeTab.builder()
            .icon(() -> PUMPKIN_SLICE.get().getDefaultInstance())
            .displayItems((parameters, output) -> output.accept(PUMPKIN_SLICE.get()))
            .title(Component.translatable("itemGroup.hoarding.main"))
            .build());

    public static void init(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
