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

    public static final RegistryObject<Block> BALD_EAGLE_PLUSHIE = registerCommonBasicPlushie("bald_eagle");
    public static final RegistryObject<Block> BEE_HUMMINGBIRD_PLUSHIE = registerCommonBasicPlushie("bee_hummingbird");
    public static final RegistryObject<Block> BLUE_JAY_PLUSHIE = registerCommonBasicPlushie("blue_jay");
    public static final RegistryObject<Block> CHICKADEE_PLUSHIE = registerCommonBasicPlushie("chickadee");
    public static final RegistryObject<Block> EUROPEAN_ROBIN_PLUSHIE = registerCommonBasicPlushie("european_robin");
    public static final RegistryObject<Block> FLAMINGO_PLUSHIE = registerCommonBasicPlushie("flamingo");
    public static final RegistryObject<Block> GOULDIAN_FINCH_PLUSHIE = registerCommonBasicPlushie("gouldian_finch");
    public static final RegistryObject<Block> HORNBILL_PLUSHIE = registerCommonBasicPlushie("hornbill");
    public static final RegistryObject<Block> KINGFISHER_PLUSHIE = registerCommonBasicPlushie("kingfisher");
    public static final RegistryObject<Block> ORIOLE_PLUSHIE = registerCommonBasicPlushie("oriole");
    public static final RegistryObject<Block> OSTRICH_PLUSHIE = registerCommonBasicPlushie("ostrich");
    public static final RegistryObject<Block> PENGUIN_PLUSHIE = registerCommonBasicPlushie("penguin");
    public static final RegistryObject<Block> PIGEON_PLUSHIE = registerCommonBasicPlushie("pigeon");
    public static final RegistryObject<Block> QUETZAL_PLUSHIE = registerCommonBasicPlushie("quetzal");
    public static final RegistryObject<Block> RAINBOW_LORIKEET_PLUSHIE = registerCommonBasicPlushie("rainbow_lorikeet");
    public static final RegistryObject<Block> RED_CARDINAL_PLUSHIE = registerCommonBasicPlushie("red_cardinal");
    public static final RegistryObject<Block> SHOEBILL_PLUSHIE = registerCommonBasicPlushie("shoebill");
    public static final RegistryObject<Block> SPARROW_PLUSHIE = registerCommonBasicPlushie("sparrow");
    public static final RegistryObject<Block> TOUCAN_PLUSHIE = registerCommonBasicPlushie("toucan");
    public static final RegistryObject<Block> VIOLET_CUCKOO_PLUSHIE = registerCommonBasicPlushie("violet_cuckoo");

    public static final RegistryObject<Block> ALBATROSS_PLUSHIE = registerCommonBasicPlushie("albatross");
    public static final RegistryObject<Block> BEARDED_VULTURE_PLUSHIE = registerCommonBasicPlushie("bearded_vulture");
    public static final RegistryObject<Block> CALLIOPE_HUMMINGBIRD_PLUSHIE = registerCommonBasicPlushie("calliope_hummingbird");
    public static final RegistryObject<Block> CROW_PLUSHIE = registerCommonBasicPlushie("crow");
    public static final RegistryObject<Block> DODO_PLUSHIE = registerCommonBasicPlushie("dodo");
    public static final RegistryObject<Block> GREAT_TIT_PLUSHIE = registerCommonBasicPlushie("great_tit");
    public static final RegistryObject<Block> HARLEQUIN_DUCK_PLUSHIE = registerCommonBasicPlushie("harlequin_duck");
    public static final RegistryObject<Block> KAKAPO_PLUSHIE = registerCommonBasicPlushie("kakapo");
    public static final RegistryObject<Block> KESTREL_PLUSHIE = registerCommonBasicPlushie("kestrel");
    public static final RegistryObject<Block> LILAC_BREASTED_ROLLER_PLUSHIE = registerCommonBasicPlushie("lilac_breasted_roller");
    public static final RegistryObject<Block> LOVEBIRD_PLUSHIE = registerCommonBasicPlushie("lovebird");
    public static final RegistryObject<Block> MACAW_PLUSHIE = registerCommonBasicPlushie("macaw");
    public static final RegistryObject<Block> OSPREY_PLUSHIE = registerCommonBasicPlushie("osprey");
    public static final RegistryObject<Block> PEACOCK_PLUSHIE = registerCommonBasicPlushie("peacock");
    public static final RegistryObject<Block> PHEASANT_PLUSHIE = registerCommonBasicPlushie("pheasant");
    public static final RegistryObject<Block> QUAIL_PLUSHIE = registerCommonBasicPlushie("quail");
    public static final RegistryObject<Block> RIFLEBIRD_PLUSHIE = registerCommonBasicPlushie("riflebird");
    public static final RegistryObject<Block> TROPICAL_PARULA_PLUSHIE = registerCommonBasicPlushie("tropical_parula");
    public static final RegistryObject<Block> UMBRELLA_BIRD_PLUSHIE = registerCommonBasicPlushie("umbrella_bird");
    public static final RegistryObject<Block> WREN_PLUSHIE = registerCommonBasicPlushie("wren");

    public static final RegistryObject<Block> BLUE_FOOTED_BOOBY = registerCommonBasicPlushie("blue_footed_booby");
    public static final RegistryObject<Block> CISTICOLA = registerCommonBasicPlushie("cisticola");
    public static final RegistryObject<Block> BEARDED_REEDLING = registerCommonBasicPlushie("bearded_reedling");

    public static RegistryObject<Block> registerCommonBasicPlushie(String name) {
        return registerBasicPlushie(name, Rarity.COMMON);
    }

    public static RegistryObject<Block> registerBasicPlushie(String name, Rarity rarity) {
        RegistryObject<Block> block = BLOCKS.register(name + "_plushie", PlushieBlock::new);
        ItemInit.ITEMS.register(name + "_plushie", () -> new BlockItem(block.get(), new Item.Properties().rarity(rarity)));
        plushieBlocks.add(block);

        return block;
    }

    public static void loadClass() {
    }
}
