package taylorrubi.stellarite.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import taylorrubi.stellarite.Stellarite;

public class ModBlocks {
    public static final Block STELLARITE_ORE = registerBlock( "stellarite_ore", new Block(AbstractBlock.Settings.create().strength(4f)
            .requiresTool().sounds(BlockSoundGroup.NETHER_GOLD_ORE)
    ));
    public static final Block STELLARITE_BLOCK = registerBlock( "stellarite_block", new Block(AbstractBlock.Settings.create().strength(4.2f)
            .requiresTool().sounds(BlockSoundGroup.METAL)
    ));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Stellarite.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Stellarite.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    private static void registerModBlockItem(String name, Block block) {

    }

    public static void registerModBlocks() {
        Stellarite.LOGGER.info("Registering Mod Blocks for " + Stellarite.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.STELLARITE_ORE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.STELLARITE_BLOCK);

        });

    }

    }

