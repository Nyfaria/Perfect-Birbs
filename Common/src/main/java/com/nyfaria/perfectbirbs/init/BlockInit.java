package com.nyfaria.perfectbirbs.init;

import com.nyfaria.perfectbirbs.Constants;
import com.nyfaria.perfectbirbs.registration.RegistrationProvider;
import com.nyfaria.perfectbirbs.registration.RegistryObject;
import com.nyfaria.perfectplushieapi.block.PlushieBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static List<RegistryObject<? extends Block>> plushieBlocks = new ArrayList<>();
    public static final RegistrationProvider<Block> BLOCKS = RegistrationProvider.get(Registries.BLOCK, Constants.MODID);
    public static final RegistrationProvider<BlockEntityType<?>> BLOCK_ENTITIES = RegistrationProvider.get(Registries.BLOCK_ENTITY_TYPE, Constants.MODID);

    public static final RegistryObject<Block> BALD_EAGLE_PLUSHIE = registerCommonBasicPlushie("bald_eagle_plushie");
    public static final RegistryObject<Block> BEE_HUMMINGBIRD_PLUSHIE = registerCommonBasicPlushie("bee_hummingbird_plushie");
    public static final RegistryObject<Block> BLUE_JAY_PLUSHIE = registerCommonBasicPlushie("blue_jay_plushie");
    public static final RegistryObject<Block> CHICKADEE_PLUSHIE = registerCommonBasicPlushie("chickadee_plushie");
    public static final RegistryObject<Block> EUROPEAN_ROBIN_PLUSHIE = registerCommonBasicPlushie("european_robin_plushie");
    public static final RegistryObject<Block> FLAMINGO_PLUSHIE = registerCommonBasicPlushie("flamingo_plushie");
    public static final RegistryObject<Block> GOULDIAN_FINCH_PLUSHIE = registerCommonBasicPlushie("gouldian_finch_plushie");
    public static final RegistryObject<Block> HORNBILL_PLUSHIE = registerCommonBasicPlushie("hornbill_plushie");
    public static final RegistryObject<Block> KINGFISHER_PLUSHIE = registerCommonBasicPlushie("kingfisher_plushie");
    public static final RegistryObject<Block> ORIOLE_PLUSHIE = registerCommonBasicPlushie("oriole_plushie");
    public static final RegistryObject<Block> OSTRICH_PLUSHIE = registerCommonBasicPlushie("ostrich_plushie");
    public static final RegistryObject<Block> PENGUIN_PLUSHIE = registerCommonBasicPlushie("penguin_plushie");
    public static final RegistryObject<Block> PIGEON_PLUSHIE = registerCommonBasicPlushie("pigeon_plushie");
    public static final RegistryObject<Block> QUETZAL_PLUSHIE = registerCommonBasicPlushie("quetzal_plushie");
    public static final RegistryObject<Block> RAINBOW_LORIKEET_PLUSHIE = registerCommonBasicPlushie("rainbow_lorikeet_plushie");
    public static final RegistryObject<Block> RED_CARDINAL_PLUSHIE = registerCommonBasicPlushie("red_cardinal_plushie");
    public static final RegistryObject<Block> SHOEBILL_PLUSHIE = registerCommonBasicPlushie("shoebill_plushie");
    public static final RegistryObject<Block> SPARROW_PLUSHIE = registerCommonBasicPlushie("sparrow_plushie");
    public static final RegistryObject<Block> TOUCAN_PLUSHIE = registerCommonBasicPlushie("toucan_plushie");
    public static final RegistryObject<Block> VIOLET_CUCKOO_PLUSHIE = registerCommonBasicPlushie("violet_cuckoo_plushie");

    public static RegistryObject<Block> registerCommonBasicPlushie(String name) {
        return registerBasicPlushie(name, Rarity.COMMON);
    }

    public static RegistryObject<Block> registerBasicPlushie(String name, Rarity rarity) {
        RegistryObject<Block> block = BLOCKS.register(name, PlushieBlock::new);
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().rarity(rarity)));
        plushieBlocks.add(block);

        return block;
    }

    public static void loadClass() {
    }
}