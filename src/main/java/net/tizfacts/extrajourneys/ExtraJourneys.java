package net.tizfacts.extrajourneys;

import net.fabricmc.api.ModInitializer;

import net.tizfacts.extrajourneys.block.ModBlocks;
import net.tizfacts.extrajourneys.item.ModItemGroups;
import net.tizfacts.extrajourneys.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtraJourneys implements ModInitializer {
	public static final String MOD_ID = "extrajourneys";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing ExtraJourneys");

        ModBlocks.registerModBlocks();
        ModItems.registerModItems();
        ModItemGroups.registerModItemGroups();

        LOGGER.info("ExtraJourneys initialized successfully!");
    }}
