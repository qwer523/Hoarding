package com.xinluo.hoarding.data.provider;

import com.xinluo.hoarding.Hoarding;
import com.xinluo.hoarding.common.registry.HoardingItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class EnglishLanguageProvider extends LanguageProvider {
    public EnglishLanguageProvider(PackOutput packOutput) {
        super(packOutput, Hoarding.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.addItem(HoardingItems.PUMPKIN_SLICE, "Pumpkin Slice");
        this.add("itemGroup.hoarding.main", "Hoarding");
    }
}
