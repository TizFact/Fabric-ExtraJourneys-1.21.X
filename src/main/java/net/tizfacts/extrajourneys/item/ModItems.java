package net.tizfacts.extrajourneys.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tizfacts.extrajourneys.ExtraJourneys;

public class ModItems {

    public static final Item TRAVELERS_COMPASS = registerItem("travelers_compass", new Item(new Item.Settings()));
    public static final Item WAYFARERS_FEATHER = registerItem("wayfarers_feather", new Item(new Item.Settings()));
    public static final Item JOURNEY_TOKEN = registerItem("journey_token", new Item(new Item.Settings()));
    public static Item BOUND_JOURNAL = registerItem("bound_journal", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ExtraJourneys.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ExtraJourneys.LOGGER.info("Registering Information For " + ExtraJourneys.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(TRAVELERS_COMPASS);
            fabricItemGroupEntries.add(WAYFARERS_FEATHER);
            fabricItemGroupEntries.add(JOURNEY_TOKEN);
            fabricItemGroupEntries.add(BOUND_JOURNAL);
        });
    }

}
