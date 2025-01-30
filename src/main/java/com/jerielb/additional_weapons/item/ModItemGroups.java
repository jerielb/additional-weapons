package com.jerielb.additional_weapons.item;

import com.jerielb.additional_weapons.AdditionalWeapons;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
	// tab group for ITEMS
	public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(AdditionalWeapons.MOD_ID, "additional_items"),
			FabricItemGroup.builder()
					.icon(() -> new ItemStack(Items.CHARCOAL)) // icon of the creative tab
					.displayName(Text.translatable("itemgroup.additions.additional_items")) // to be changed in /lang/en_us.json
					.entries((displayContext, entries) -> {
						// add items
						entries.add(ModItems.KINGDOM_KEY);
						entries.add(ModItems.JUNGLE_KING);
						entries.add(ModItems.THREE_WISHES);
						entries.add(ModItems.CRABCLAW);
						entries.add(ModItems.PUMPKINHEAD);
						entries.add(ModItems.FAIRY_HARP);
						entries.add(ModItems.WISHING_STAR);
						entries.add(ModItems.SPELLBINDER);
						entries.add(ModItems.METAL_CHOCOBO);
						entries.add(ModItems.OLYMPIA);
						entries.add(ModItems.LIONHEART);
						entries.add(ModItems.OATHKEEPER);
						entries.add(ModItems.OBLIVION);
						entries.add(ModItems.LADY_LUCK);
						entries.add(ModItems.DIVINE_ROSE);
						entries.add(ModItems.DIAMOND_DUST);
						entries.add(ModItems.ONE_WINGED_ANGEL);
						entries.add(ModItems.ULTIMA_WEAPON);
						entries.add(ModItems.KINGDOM_KEY_DARKSIDE);
						entries.add(ModItems.SOUL_EATER);
						
						entries.add(ModItems.KNIGHTS_SHIELD);
						entries.add(ModItems.DREAM_SHIELD);
					})
					.build());
	
	// gets called by the Main class onInitialize() method
	public static void registerItemGroups() {
		AdditionalWeapons.LOGGER.info("Registering Item Groups for " + AdditionalWeapons.MOD_ID);
	}
}
