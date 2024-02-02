package com.xinluo.hoarding.data;

import com.xinluo.hoarding.data.provider.ChineseLanguageProvider;
import com.xinluo.hoarding.data.provider.EnglishLanguageProvider;
import com.xinluo.hoarding.data.provider.ModelProvider;
import com.xinluo.hoarding.data.provider.StateProvider;
import net.minecraftforge.data.event.GatherDataEvent;

public class Datagen {
    public static void init(GatherDataEvent event) {
        var gen = event.getGenerator();
        var packOutput = gen.getPackOutput();
        var helper = event.getExistingFileHelper();
        gen.addProvider(event.includeClient(), new EnglishLanguageProvider(packOutput));
        gen.addProvider(event.includeClient(), new ChineseLanguageProvider(packOutput));
        gen.addProvider(event.includeClient(), new ModelProvider(packOutput, helper));
        gen.addProvider(event.includeClient(), new StateProvider(packOutput, helper));
    }
}
