package com.nyfaria.perfectbirbs.datagen;

import com.nyfaria.perfectbirbs.Constants;
import com.nyfaria.perfectbirbs.init.BlockInit;
import com.nyfaria.perfectbirbs.registration.RegistryObject;
import com.nyfaria.perfectplushieapi.init.PlushieTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class ModTagProvider {

    public static class Items extends TagsProvider<Item>{

        public Items(PackOutput p_256596_, CompletableFuture<HolderLookup.Provider> p_256513_, @Nullable ExistingFileHelper existingFileHelper) {
            super(p_256596_, Registries.ITEM, p_256513_, Constants.MODID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider pProvider) {
            populateTag(PlushieTags.VILLAGE_PLUSHIES_ITEMS,
                    BlockInit.plushieBlocks.stream().filter(
                            block -> block != BlockInit.DODO_PLUSHIE
                    ).toList().toArray(new RegistryObject[0])
            );
            populateTag(PlushieTags.ARCHAEOLOGY_PLUSHIES_ITEMS,
                    BlockInit.DODO_PLUSHIE::get
            );
        }

        public void populateTag(TagKey<Item> tag, Supplier<ItemLike>... items){
            for (Supplier<ItemLike> item : items) {
                tag(tag).add(ForgeRegistries.ITEMS.getResourceKey(item.get().asItem()).get());
            }
        }
    }

    public static class Blocks extends TagsProvider<Block>{

        public Blocks(PackOutput pGenerator, CompletableFuture<HolderLookup.Provider> p_256513_, @Nullable ExistingFileHelper existingFileHelper) {
            super(pGenerator, Registries.BLOCK, p_256513_, Constants.MODID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider pProvider) {
            populateTag(PlushieTags.VILLAGE_PLUSHIES_BLOCKS,
                    BlockInit.plushieBlocks.toArray(new RegistryObject[0])
            );
        }
        public  <T extends Block>void populateTag(TagKey<Block> tag, Supplier<?>... items){
            for (Supplier<?> item : items) {
                tag(tag).add(ForgeRegistries.BLOCKS.getResourceKey((Block)item.get()).get());
            }
        }
    }
}
