package com.xinluo.hoarding.data.provider;

import com.xinluo.hoarding.Hoarding;
import com.xinluo.hoarding.common.registry.HoardingItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModelProvider extends ItemModelProvider {
    public ModelProvider(PackOutput gen, ExistingFileHelper helper) {
        super(gen, Hoarding.MODID, helper);
    }

    @Override
    protected void registerModels() {
        this.singleTexture(HoardingItems.PUMPKIN_SLICE.getId().getPath(), new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Hoarding.MODID, "item/" + HoardingItems.PUMPKIN_SLICE.getId().getPath()));
    }
}
