package com.jerielb.additional_weapons;

import com.jerielb.additional_weapons.item.ModItemGroups;
import com.jerielb.additional_weapons.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdditionalWeapons implements ModInitializer {
	public static final String MOD_ID = "additional-weapons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		
		ModItems.registerModItems();
	}
}