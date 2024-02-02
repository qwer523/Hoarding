package com.xinluo.hoarding.common.registry;

import com.google.common.collect.Sets;
import com.xinluo.hoarding.Hoarding;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashSet;
import java.util.function.Supplier;

import static com.xinluo.hoarding.common.registry.HoardingBlocks.*;

public class HoardingItems {
    public static LinkedHashSet<RegistryObject<Item>> CREATIVE_TAB_ITEMS = Sets.newLinkedHashSet();
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Hoarding.MODID);

    public static final RegistryObject<Item> PUMPKIN_SLICE = ITEMS.register("pumpkin_slice", () -> new Item(new Item.Properties()
            .food(new FoodProperties.Builder().alwaysEat()
                    .nutrition(1)
                    .saturationMod(2f)
                    .build())));

    public static final RegistryObject<Item> LILY_CRATE_ITEM = registerWithTab("lily_crate", () -> new BlockItem(LILY_CRATE.get(), basicItem()));
    public static final RegistryObject<Item> AZURE_BLUET_CRATE_ITEM = registerWithTab("azure_bluet_crate", () -> new BlockItem(AZURE_BLUET_CRATE.get(), basicItem()));
    public static final RegistryObject<Item> BLUE_ORCHID_CRATE_ITEM = registerWithTab("blue_orchid_crate", () -> new BlockItem(BLUE_ORCHID_CRATE.get(), basicItem()));
    public static final RegistryObject<Item> DANDELION_CRATE_ITEM = registerWithTab("dandelion_crate", () -> new BlockItem(DANDELION_CRATE.get(), basicItem()));
    public static final RegistryObject<Item> CORNFLOWER_CRATE_ITEM = registerWithTab("cornflower_crate", () -> new BlockItem(CORNFLOWER_CRATE.get(), basicItem()));
    public static final RegistryObject<Item> POPPY_CRATE_ITEM = registerWithTab("poppy_crate", () -> new BlockItem(POPPY_CRATE.get(), basicItem()));
    public static final RegistryObject<Item> OXEYE_DAISY_CRATE_ITEM = registerWithTab("oxeye_daisy_crate", () -> new BlockItem(OXEYE_DAISY_CRATE.get(), basicItem()));
    public static final RegistryObject<Item> SOURCE_BERRY_CRATE_ITEM = registerWithTab("source_berry_crate", () -> new BlockItem(SOURCE_BERRY_CRATE.get(), basicItem()));
    public static final RegistryObject<Item> BAKED_POTATO_CRATE_ITEM = registerWithTab("baked_potato_crate", () -> new BlockItem(BAKED_POTATO_CRATE.get(), basicItem()));
    public static final RegistryObject<Item> ORANGE_TULIP_CRATE_ITEM = registerWithTab("orange_tulip_crate", () -> new BlockItem(ORANGE_TULIP_CRATE.get(), basicItem()));
    public static final RegistryObject<Item> PINK_TULIP_CRATE_ITEM = registerWithTab("pink_tulip_crate", () -> new BlockItem(PINK_TULIP_CRATE.get(), basicItem()));
    public static final RegistryObject<Item> RED_TULIP_CRATE_ITEM = registerWithTab("red_tulip_crate", () -> new BlockItem(RED_TULIP_CRATE.get(), basicItem()));
    public static final RegistryObject<Item> WHITE_TULIP_CRATE_ITEM = registerWithTab("white_tulip_crate", () -> new BlockItem(WHITE_TULIP_CRATE.get(), basicItem()));
    public static final RegistryObject<Item> WITHER_ROSE_CRATE_ITEM = registerWithTab("wither_rose_crate", () -> new BlockItem(WITHER_ROSE_CRATE.get(), basicItem()));
    public static final RegistryObject<Item> ALLIUM_CRATE_ITEM = registerWithTab("allium_crate", () -> new BlockItem(ALLIUM_CRATE.get(), basicItem()));
    public static final RegistryObject<Item> MAGEBLOOM_CRATE_ITEM = registerWithTab("magebloom_crate", () -> new BlockItem(MAGEBLOOM_CRATE.get(), basicItem()));
    public static final RegistryObject<Item> CACTUS_BUNDLE_ITEM = registerWithTab("cactus_bundle", () -> new BlockItem(CACTUS_BUNDLE.get(), basicItem()));
    public static final RegistryObject<Item> COTTON_BAG_ITEM = registerWithTab("cotton_bag", () -> new BlockItem(COTTON_BAG.get(), basicItem()));
    public static final RegistryObject<Item> GLISTERING_MELON_ITEM = registerWithTab("glistering_melon", () -> new BlockItem(GLISTERING_MELON.get(), basicItem()));
    
    public static void init(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static Item.Properties basicItem() {
        return new Item.Properties();
    }

    public static RegistryObject<Item> registerWithTab(final String name, final Supplier<Item> supplier) {
        RegistryObject<Item> block = ITEMS.register(name, supplier);
        CREATIVE_TAB_ITEMS.add(block);
        return block;
    }
}
