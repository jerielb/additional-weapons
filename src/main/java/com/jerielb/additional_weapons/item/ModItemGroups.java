package com.jerielb.additional_weapons.item;

import com.jerielb.additional_weapons.AdditionalWeapons;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
	public static final ItemGroup KEYBLADES = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(AdditionalWeapons.MOD_ID, "keyblades"),
			FabricItemGroup.builder()
					.icon(() -> new ItemStack(ModItems.KINGDOM_KEY)) // icon of the creative tab
					.displayName(Text.translatable("itemgroup.additional-weapons.additional_keyblades")) // to be changed in /lang/en_us.json
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
					})
					.build());
	
	public static final ItemGroup SHIELDS = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(AdditionalWeapons.MOD_ID, "shields"),
			FabricItemGroup.builder()
					.icon(() -> new ItemStack(ModItems.KNIGHTS_SHIELD)) // icon of the creative tab
					.displayName(Text.translatable("itemgroup.additional-weapons.additional_shields")) // to be changed in /lang/en_us.json
					.entries((displayContext, entries) -> {
						entries.add(ModItems.KNIGHTS_SHIELD);
						entries.add(ModItems.DREAM_SHIELD);
						
						entries.add(ModItems.STOUT_SHIELD);
						entries.add(ModItems.GOLEM_SHIELD);
						entries.add(ModItems.ADAMANT_SHIELD);
						
						entries.add(ModItems.MYTHRIL_SHIELD);
						entries.add(ModItems.ONYX_SHIELD);
						
						entries.add(ModItems.SMASHER_SHIELD);
						entries.add(ModItems.GIGAS_FIST_SHIELD);
						
						entries.add(ModItems.HERCS_SHIELD);
						entries.add(ModItems.GENJI_SHIELD);
						entries.add(ModItems.DEFENDER_SHIELD);
						entries.add(ModItems.SAVE_THE_KING_SHIELD);
						entries.add(ModItems.MIGHTY_SHIELD);
						entries.add(ModItems.SEVEN_ELEMENTS_SHIELD);
					})
					.build());
	
	public static final ItemGroup MISC = Registry.register(Registries.ITEM_GROUP,
			Identifier.of(AdditionalWeapons.MOD_ID, "misc"),
			FabricItemGroup.builder()
					.icon(() -> new ItemStack(ModItems.MUNNY)) // icon of the creative tab
					.displayName(Text.translatable("itemgroup.additional-weapons.misc")) // to be changed in /lang/en_us.json
					.entries((displayContext, entries) -> {
						entries.add(ModItems.MUNNY);
						entries.add(ModItems.KEYCHAIN_KINGDOM_KEY);
						entries.add(ModItems.KEYCHAIN_JUNGLE_KING);
						entries.add(ModItems.KEYCHAIN_THREE_WISHES);
						entries.add(ModItems.KEYCHAIN_CRABCLAW);
						entries.add(ModItems.KEYCHAIN_PUMPKINHEAD);
						entries.add(ModItems.KEYCHAIN_FAIRY_HARP);
						entries.add(ModItems.KEYCHAIN_WISHING_STAR);
						entries.add(ModItems.KEYCHAIN_SPELLBINDER);
						entries.add(ModItems.KEYCHAIN_METAL_CHOCOBO);
						entries.add(ModItems.KEYCHAIN_OLYMPIA);
						entries.add(ModItems.KEYCHAIN_LIONHEART);
						entries.add(ModItems.KEYCHAIN_OATHKEEPER);
						entries.add(ModItems.KEYCHAIN_OBLIVION);
						entries.add(ModItems.KEYCHAIN_LADY_LUCK);
						entries.add(ModItems.KEYCHAIN_DIVINE_ROSE);
						entries.add(ModItems.KEYCHAIN_DIAMOND_DUST);
						entries.add(ModItems.KEYCHAIN_ONE_WINGED_ANGEL);
						entries.add(ModItems.KEYCHAIN_ULTIMA_WEAPON);
//						entries.add(ModItems.KEYCHAIN_KINGDOM_KEY_DARKSIDE);
//						entries.add(ModItems.KEYCHAIN_SOUL_EATER);
						
						entries.add(ModItems.SOLDIER_SPAWN_EGG);
						entries.add(ModItems.BANDIT_SPAWN_EGG);
						entries.add(ModItems.PIRATE_SPAWN_EGG);
						entries.add(ModItems.POWER_WILD_SPAWN_EGG);
						entries.add(ModItems.WHITE_MUSHROOM_SPAWN_EGG);
						entries.add(ModItems.SHADOW_SPAWN_EGG);
					})
					.build());
	
	// gets called by the Main class onInitialize() method
	public static void registerItemGroups() {
		AdditionalWeapons.LOGGER.info("Registering Item Groups for " + AdditionalWeapons.MOD_ID);
	}
}
