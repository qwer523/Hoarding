package com.xinluo.hoarding.data;

import com.xinluo.hoarding.data.provider.*;
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

        gen.addProvider(event.includeServer(), new LootProvider(packOutput));
    }
}
