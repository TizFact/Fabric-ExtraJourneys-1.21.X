package net.tizfacts.extrajourneys.block;

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
import net.tizfacts.extrajourneys.ExtraJourneys;

public class ModBlocks {

    public static final Block TRAIL_MARKER_BLOCK = registerBlock("trail_marker_block",
            new Block(AbstractBlock.Settings.create().strength(0.6f)
                    .requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static final Block SURVEYORS_STONE_BLOCK = registerBlock("surveyors_stone_block",
            new Block(AbstractBlock.Settings.create().strength(1.2f).resistance(4)
                    .requires().sounds(BlockSoundGroup.STONE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ExtraJourneys.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ExtraJourneys.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        ExtraJourneys.LOGGER.info("Registering Mod Blocks For " + ExtraJourneys.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(fabricItemGroupEntries ->  {
            fabricItemGroupEntries.add(ModBlocks.TRAIL_MARKER_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.SURVEYORS_STONE_BLOCK);
        });
    }

}
