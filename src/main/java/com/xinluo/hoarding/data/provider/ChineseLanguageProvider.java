package com.xinluo.hoarding.data.provider;

import com.xinluo.hoarding.Hoarding;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import static com.xinluo.hoarding.common.registry.HoardingBlocks.*;
import static com.xinluo.hoarding.common.registry.HoardingItems.*;

public class ChineseLanguageProvider extends LanguageProvider {
    public ChineseLanguageProvider(PackOutput packOutput) {
        super(packOutput, Hoarding.MODID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.hoarding.main", "屯物");
        addItem(PUMPKIN_SLICE, "南瓜片");
        addBlock(LILY_CRATE, "箱装铃兰");
        addBlock(AZURE_BLUET_CRATE, "箱装蓝花美耳草");
        addBlock(BLUE_ORCHID_CRATE, "箱装兰花");
        addBlock(DANDELION_CRATE, "箱装蒲公英");
        addBlock(CORNFLOWER_CRATE, "箱装矢车菊");
        addBlock(POPPY_CRATE, "箱装虞美人");
        addBlock(OXEYE_DAISY_CRATE, "箱装滨菊");
        addBlock(SOURCE_BERRY_CRATE, "箱装魔源浆果");
        addBlock(BAKED_POTATO_CRATE, "箱装烤马铃薯");
        addBlock(ORANGE_TULIP_CRATE, "箱装橙色郁金香");
        addBlock(PINK_TULIP_CRATE, "箱装粉红色郁金香");
        addBlock(RED_TULIP_CRATE, "箱装红色郁金香");
        addBlock(WHITE_TULIP_CRATE, "箱装白色郁金香");
        addBlock(WITHER_ROSE_CRATE, "箱装凋零玫瑰");
        addBlock(ALLIUM_CRATE, "箱装绒球葱");
        addBlock(MAGEBLOOM_CRATE, "箱装法师之花");
        addBlock(CACTUS_BUNDLE, "仙人掌捆");
        addBlock(COTTON_BAG, "袋装棉花");
        addBlock(GLISTERING_MELON, "闪烁的西瓜");
        addBlock(RICE_BAG, "稻米袋");
        addBlock(RICE_BALE, "稻米块");
    }
}
