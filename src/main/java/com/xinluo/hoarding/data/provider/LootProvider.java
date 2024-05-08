package com.xinluo.hoarding.data.provider;

import com.google.common.collect.Iterables;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static com.xinluo.hoarding.common.registry.HoardingBlocks.BLOCKS;

public class LootProvider extends LootTableProvider {
    public LootProvider(PackOutput pOutput) {
        super(pOutput, BLOCKS.getEntries().stream().map(RegistryObject::getId).collect(Collectors.toSet()), List.of(new SubProviderEntry(ModBlockLoot::new, LootContextParamSets.BLOCK)));
    }

    @Override
    protected void validate(Map<ResourceLocation, LootTable> map, @NotNull ValidationContext context) {
        map.forEach((key, value) -> value.validate(context));
    }

    public static class ModBlockLoot extends BlockLootSubProvider {
        protected ModBlockLoot() {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags());
        }

        @Override
        protected void generate() {
            BLOCKS.getEntries().forEach(block -> dropSelf(block.get()));
        }

        @NotNull
        @Override
        protected Iterable<Block> getKnownBlocks() {
            return Iterables.transform(BLOCKS.getEntries(), RegistryObject::get);
        }
    }
}
