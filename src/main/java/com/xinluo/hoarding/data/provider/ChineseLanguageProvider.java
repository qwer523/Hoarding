package com.xinluo.hoarding.data.provider;

import com.xinluo.hoarding.Hoarding;
import com.xinluo.hoarding.common.registry.HoardingItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ChineseLanguageProvider extends LanguageProvider {
    public ChineseLanguageProvider(PackOutput packOutput) {
        super(packOutput, Hoarding.MODID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        this.addItem(HoardingItems.PUMPKIN_SLICE, "南瓜片");
        this.add("itemGroup.hoarding.main", "屯物");
    }
}
