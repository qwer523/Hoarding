package com.xinluo.hoarding.common.registry;

import com.xinluo.hoarding.Hoarding;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HoardingBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Hoarding.MODID);

    public static final RegistryObject<Block> LILY_CRATE = BLOCKS.register("lily_crate", () -> new Block(Block.Properties.copy(Blocks.OAK_WOOD)
            .strength(2.0F, 3.0F)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> AZURE_BLUET_CRATE = BLOCKS.register("azure_bluet_crate", () -> new Block(Block.Properties.copy(Blocks.OAK_WOOD)
            .strength(2.0F, 3.0F)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_ORCHID_CRATE = BLOCKS.register("blue_orchid_crate", () -> new Block(Block.Properties.copy(Blocks.OAK_WOOD)
            .strength(2.0F, 3.0F)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> DANDELION_CRATE = BLOCKS.register("dandelion_crate", () -> new Block(Block.Properties.copy(Blocks.OAK_WOOD)
            .strength(2.0F, 3.0F)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CORNFLOWER_CRATE = BLOCKS.register("cornflower_crate", () -> new Block(Block.Properties.copy(Blocks.OAK_WOOD)
            .strength(2.0F, 3.0F)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> POPPY_CRATE = BLOCKS.register("poppy_crate", () -> new Block(Block.Properties.copy(Blocks.OAK_WOOD)
            .strength(2.0F, 3.0F)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> OXEYE_DAISY_CRATE = BLOCKS.register("oxeye_daisy_crate", () -> new Block(Block.Properties.copy(Blocks.OAK_WOOD)
            .strength(2.0F, 3.0F)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SOURCE_BERRY_CRATE = BLOCKS.register("source_berry_crate", () -> new Block(Block.Properties.copy(Blocks.OAK_WOOD)
            .strength(2.0F, 3.0F)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BAKED_POTATO_CRATE = BLOCKS.register("baked_potato_crate", () -> new Block(Block.Properties.copy(Blocks.OAK_WOOD)
            .strength(2.0F, 3.0F)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ORANGE_TULIP_CRATE = BLOCKS.register("orange_tulip_crate", () -> new Block(Block.Properties.copy(Blocks.OAK_WOOD)
            .strength(2.0F, 3.0F)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_TULIP_CRATE = BLOCKS.register("pink_tulip_crate", () -> new Block(Block.Properties.copy(Blocks.OAK_WOOD)
            .strength(2.0F, 3.0F)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_TULIP_CRATE = BLOCKS.register("red_tulip_crate", () -> new Block(Block.Properties.copy(Blocks.OAK_WOOD)
            .strength(2.0F, 3.0F)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WHITE_TULIP_CRATE = BLOCKS.register("white_tulip_crate", () -> new Block(Block.Properties.copy(Blocks.OAK_WOOD)
            .strength(2.0F, 3.0F)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WITHER_ROSE_CRATE = BLOCKS.register("wither_rose_crate", () -> new Block(Block.Properties.copy(Blocks.OAK_WOOD)
            .strength(2.0F, 3.0F)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ALLIUM_CRATE = BLOCKS.register("allium_crate", () -> new Block(Block.Properties.copy(Blocks.OAK_WOOD)
            .strength(2.0F, 3.0F)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> MAGEBLOOM_CRATE = BLOCKS.register("magebloom_crate", () -> new Block(Block.Properties.copy(Blocks.OAK_WOOD)
            .strength(2.0F, 3.0F)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CACTUS_BUNDLE = BLOCKS.register("cactus_bundle", () -> new Block(Block.Properties.copy(Blocks.OAK_WOOD)
            .strength(2.0F, 3.0F)
            .sound(SoundType.WOOD)));
    public static final RegistryObject<Block> COTTON_BAG = BLOCKS.register("cotton_bag", () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> GLISTERING_MELON = BLOCKS.register("glistering_melon", () -> new Block(Block.Properties.copy(Blocks.MELON)));

    public static RegistryObject<Block> RICE_BAG;
    public static RegistryObject<Block> RICE_BALE;

    public static void init(IEventBus eventBus) {
        BLOCKS.register(eventBus);

        RICE_BAG = BLOCKS.register("rice_bag", () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));
        RICE_BALE = BLOCKS.register("rice_bale", () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));
    }
}
