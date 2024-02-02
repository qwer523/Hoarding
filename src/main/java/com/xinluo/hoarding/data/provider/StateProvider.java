package com.xinluo.hoarding.data.provider;

import com.xinluo.hoarding.Hoarding;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import static com.xinluo.hoarding.common.registry.HoardingBlocks.*;
import static com.xinluo.hoarding.common.registry.HoardingBlocks.MAGEBLOOM_CRATE;

public class StateProvider extends BlockStateProvider {
    public StateProvider(PackOutput gen, ExistingFileHelper helper) {
        super(gen, Hoarding.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.simpleBlock(CACTUS_BUNDLE.get(), cubeTop(CACTUS_BUNDLE.get()));
        this.simpleBlockItem(CACTUS_BUNDLE.get(), cubeTop(CACTUS_BUNDLE.get()));

        this.simpleBlock(GLISTERING_MELON.get(), cubeTop(GLISTERING_MELON.get()));
        this.simpleBlockItem(GLISTERING_MELON.get(), cubeTop(GLISTERING_MELON.get()));

        this.simpleBlock(COTTON_BAG.get(), models().cubeBottomTop(name(COTTON_BAG.get()), Hoarding.id("block/rice_bag_side"), Hoarding.id("block/rice_bag_bottom"), blockTexture(COTTON_BAG.get()).withSuffix("_top")));
        this.simpleBlockItem(COTTON_BAG.get(), models().cubeBottomTop(name(COTTON_BAG.get()), Hoarding.id("block/rice_bag_side"), Hoarding.id("block/rice_bag_bottom"), blockTexture(COTTON_BAG.get()).withSuffix("_top")));

        this.simpleBlock(WITHER_ROSE_CRATE.get(), models().cubeBottomTop(name(WITHER_ROSE_CRATE.get()), blockTexture(WITHER_ROSE_CRATE.get()).withSuffix( "_side"),  Hoarding.id("block/nether_crate_bottom"), blockTexture(WITHER_ROSE_CRATE.get()).withSuffix("_top")));
        this.simpleBlockItem(WITHER_ROSE_CRATE.get(), models().cubeBottomTop(name(WITHER_ROSE_CRATE.get()), blockTexture(WITHER_ROSE_CRATE.get()).withSuffix( "_side"),  Hoarding.id("block/nether_crate_bottom"), blockTexture(WITHER_ROSE_CRATE.get()).withSuffix("_top")));

        this.simpleCrate(LILY_CRATE.get());
        this.simpleCrate(AZURE_BLUET_CRATE.get());
        this.simpleCrate(BLUE_ORCHID_CRATE.get());
        this.simpleCrate(DANDELION_CRATE.get());
        this.simpleCrate(CORNFLOWER_CRATE.get());
        this.simpleCrate(POPPY_CRATE.get());
        this.simpleCrate(OXEYE_DAISY_CRATE.get());
        this.simpleCrate(SOURCE_BERRY_CRATE.get());
        this.simpleCrate(BAKED_POTATO_CRATE.get());
        this.simpleCrate(ORANGE_TULIP_CRATE.get());
        this.simpleCrate(PINK_TULIP_CRATE.get());
        this.simpleCrate(RED_TULIP_CRATE.get());
        this.simpleCrate(WHITE_TULIP_CRATE.get());
        this.simpleCrate(ALLIUM_CRATE.get());
        this.simpleCrate(MAGEBLOOM_CRATE.get());
    }

    public ModelFile cubeBottomTop(Block block) {
        return models().cubeBottomTop(name(block), blockTexture(block).withSuffix( "_side"), blockTexture(block).withSuffix("_bottom"), blockTexture(block).withSuffix("_top"));
    }

    public ModelFile cubeTop(Block block) {
        return models().cubeBottomTop(name(block), blockTexture(block).withSuffix( "_side"), blockTexture(block).withSuffix("_top"), blockTexture(block).withSuffix("_top"));
    }

    public void simpleCrate(Block block) {
        this.simpleBlock(block, this.simpleCrateModel(block));
        this.simpleBlockItem(block, this.simpleCrateModel(block));
    }

    public ModelFile simpleCrateModel(Block block) {
        return models().cubeBottomTop(name(block), blockTexture(block).withSuffix( "_side"), Hoarding.id("block/crate_bottom"), blockTexture(block).withSuffix("_top"));
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }

    private String name(Block block) {
        return key(block).getPath();
    }
}
