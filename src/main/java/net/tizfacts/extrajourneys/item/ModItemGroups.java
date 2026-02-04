package net.tizfacts.extrajourneys.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tizfacts.extrajourneys.ExtraJourneys;
import net.tizfacts.extrajourneys.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup EXTRA_JOURNEYS_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ExtraJourneys.MOD_ID, "extra_journeys_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TRAVELERS_COMPASS))
                    .displayName(Text.translatable("itemgroup.extrajourneys.extra_journeys_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TRAVELERS_COMPASS);
                        entries.add(ModItems.WAYFARERS_FEATHER);
                        entries.add(ModItems.BOUND_JOURNAL);
                    }).build());

    public static final ItemGroup EXTRA_JOURNEYS_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ExtraJourneys.MOD_ID, "extra_journeys_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.TRAIL_MARKER_BLOCK))
                    .displayName(Text.translatable("itemgroup.extrajourneys.extra_journeys_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.TRAIL_MARKER_BLOCK);
                        entries.add(ModBlocks.SURVEYORS_STONE_BLOCK);
                    }).build());

    public static void registerModItemGroups() {
        ExtraJourneys.LOGGER.info("Registering Info For " + ExtraJourneys.MOD_ID);
    }

}
