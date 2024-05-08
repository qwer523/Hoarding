package com.xinluo.hoarding.data.provider;

import com.xinluo.hoarding.Hoarding;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import static com.xinluo.hoarding.common.registry.HoardingBlocks.*;
import static com.xinluo.hoarding.common.registry.HoardingItems.*;

public class EnglishLanguageProvider extends LanguageProvider {
    public EnglishLanguageProvider(PackOutput packOutput) {
        super(packOutput, Hoarding.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.hoarding.main", "Hoarding");
        addItem(PUMPKIN_SLICE, "Pumpkin Slice");
        addBlock(LILY_CRATE, "Lily Crate");
        addBlock(AZURE_BLUET_CRATE, "Azure Bluet Crate");
        addBlock(BLUE_ORCHID_CRATE, "Blue Orchid Crate");
        addBlock(DANDELION_CRATE, "Dandelion Crate");
        addBlock(CORNFLOWER_CRATE, "Cornflower Crate");
        addBlock(POPPY_CRATE, "Poppy Crate");
        addBlock(OXEYE_DAISY_CRATE, "Oxeye Daisy Crate");
        addBlock(SOURCE_BERRY_CRATE, "Source Berry Crate");
        addBlock(BAKED_POTATO_CRATE, "Baked Potato Crate");
        addBlock(ORANGE_TULIP_CRATE, "Orange Tulip Crate");
        addBlock(PINK_TULIP_CRATE, "Pink Tulip Crate");
        addBlock(RED_TULIP_CRATE, "Red Tulip Crate");
        addBlock(WHITE_TULIP_CRATE, "White Tulip Crate");
        addBlock(WITHER_ROSE_CRATE, "Wither Rose Crate");
        addBlock(ALLIUM_CRATE, "Allium Crate");
        addBlock(MAGEBLOOM_CRATE, "Magebloom Crate");
        addBlock(CACTUS_BUNDLE, "Cactus Bundle");
        addBlock(COTTON_BAG, "Cotton Bag");
        addBlock(GLISTERING_MELON, "Glistering Melon");
        addBlock(RICE_BAG, "Rice Bag");
        addBlock(RICE_BALE, "Rice Bale");
    }
}
