package com.jerielb.additional_weapons.item;

import com.jerielb.additional_weapons.AdditionalWeapons;
import com.jerielb.additional_weapons.entity.ModEntities;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
	// Kingdom Hearts 1 - keyblades
	public static final Item KINGDOM_KEY = registerItem("kingdom_key", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item JUNGLE_KING = registerItem("jungle_king", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item THREE_WISHES = registerItem("three_wishes", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item CRABCLAW = registerItem("crabclaw", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item PUMPKINHEAD = registerItem("pumpkinhead", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item FAIRY_HARP = registerItem("fairy_harp", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item WISHING_STAR = registerItem("wishing_star", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item SPELLBINDER = registerItem("spellbinder", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item METAL_CHOCOBO = registerItem("metal_chocobo", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item OLYMPIA = registerItem("olympia", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item LIONHEART = registerItem("lionheart", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item OATHKEEPER = registerItem("oathkeeper", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item OBLIVION = registerItem("oblivion", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item LADY_LUCK = registerItem("lady_luck", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item DIVINE_ROSE = registerItem("divine_rose", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item DIAMOND_DUST = registerItem("diamond_dust", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item ONE_WINGED_ANGEL = registerItem("one_winged_angel", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item ULTIMA_WEAPON = registerItem("ultima_weapon", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item KINGDOM_KEY_DARKSIDE = registerItem("kingdom_key_darkside", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	public static final Item SOUL_EATER = registerItem("soul_eater", new SwordItem(ToolMaterials.NETHERITE, (new Item.Settings()).fireproof()
			.attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4F))));
	
	// shield(s)
	public static final Item KNIGHTS_SHIELD = registerItem("knights_shield", new ShieldItem(new Item.Settings().maxDamage(336)));
	public static final Item DREAM_SHIELD = registerItem("dream_shield", new ShieldItem(new Item.Settings().maxDamage(336)));
	
	public static final Item STOUT_SHIELD = registerItem("stout_shield", new ShieldItem(new Item.Settings().maxDamage(336)));
	public static final Item GOLEM_SHIELD = registerItem("golem_shield", new ShieldItem(new Item.Settings().maxDamage(336)));
	public static final Item ADAMANT_SHIELD = registerItem("adamant_shield", new ShieldItem(new Item.Settings().maxDamage(336)));
	
	public static final Item MYTHRIL_SHIELD = registerItem("mythril_shield", new ShieldItem(new Item.Settings().maxDamage(336)));
	public static final Item ONYX_SHIELD = registerItem("onyx_shield", new ShieldItem(new Item.Settings().maxDamage(336)));
	
	public static final Item SMASHER_SHIELD = registerItem("smasher_shield", new ShieldItem(new Item.Settings().maxDamage(336)));
	public static final Item GIGAS_FIST_SHIELD = registerItem("gigas_fist_shield", new ShieldItem(new Item.Settings().maxDamage(336)));
	
	public static final Item HERCS_SHIELD = registerItem("hercs_shield", new ShieldItem(new Item.Settings().maxDamage(336)));
	public static final Item SAVE_THE_KING_SHIELD = registerItem("save_the_king_shield", new ShieldItem(new Item.Settings().maxDamage(336)));
	public static final Item MIGHTY_SHIELD = registerItem("mighty_shield", new ShieldItem(new Item.Settings().maxDamage(336)));
	public static final Item SEVEN_ELEMENTS_SHIELD = registerItem("seven_elements_shield", new ShieldItem(new Item.Settings().maxDamage(336)));
	
	// munny
	public static final Item MUNNY = registerItem("munny", new Item(new Item.Settings()));
	
	// keychains
	public static final Item KEYCHAIN_KINGDOM_KEY = registerItem("keychain_kingdom_key", new Item(new Item.Settings()));
	public static final Item KEYCHAIN_JUNGLE_KING = registerItem("keychain_jungle_king", new Item(new Item.Settings()));
	public static final Item KEYCHAIN_THREE_WISHES = registerItem("keychain_three_wishes", new Item(new Item.Settings()));
	public static final Item KEYCHAIN_CRABCLAW = registerItem("keychain_crabclaw", new Item(new Item.Settings()));
	public static final Item KEYCHAIN_PUMPKINHEAD = registerItem("keychain_pumpkinhead", new Item(new Item.Settings()));
	public static final Item KEYCHAIN_FAIRY_HARP = registerItem("keychain_fairy_harp", new Item(new Item.Settings()));
	public static final Item KEYCHAIN_WISHING_STAR = registerItem("keychain_wishing_star", new Item(new Item.Settings()));
	public static final Item KEYCHAIN_SPELLBINDER = registerItem("keychain_spellbinder", new Item(new Item.Settings()));
	public static final Item KEYCHAIN_METAL_CHOCOBO = registerItem("keychain_metal_chocobo", new Item(new Item.Settings()));
	public static final Item KEYCHAIN_OLYMPIA = registerItem("keychain_olympia", new Item(new Item.Settings()));
	public static final Item KEYCHAIN_LIONHEART = registerItem("keychain_lionheart", new Item(new Item.Settings()));
	public static final Item KEYCHAIN_OATHKEEPER = registerItem("keychain_oathkeeper", new Item(new Item.Settings()));
	public static final Item KEYCHAIN_OBLIVION = registerItem("keychain_oblivion", new Item(new Item.Settings()));
	public static final Item KEYCHAIN_LADY_LUCK = registerItem("keychain_lady_luck", new Item(new Item.Settings()));
	public static final Item KEYCHAIN_DIVINE_ROSE = registerItem("keychain_divine_rose", new Item(new Item.Settings()));
	public static final Item KEYCHAIN_DIAMOND_DUST = registerItem("keychain_diamond_dust", new Item(new Item.Settings()));
	public static final Item KEYCHAIN_ONE_WINGED_ANGEL = registerItem("keychain_one_winged_angel", new Item(new Item.Settings()));
	public static final Item KEYCHAIN_ULTIMA_WEAPON = registerItem("keychain_ultima_weapon", new Item(new Item.Settings()));
	
//	public static final Item KEYCHAIN_KINGDOM_KEY_DARKSIDE = registerItem("keychain_kingdom_key_darkside", new Item(new Item.Settings()));
//	public static final Item KEYCHAIN_SOUL_EATER = registerItem("keychain_soul_eater", new Item(new Item.Settings()));
	
	// entity spawn eggs
	public static final Item SOLDIER_SPAWN_EGG = registerItem("soldier_spawn_egg",
			new SpawnEggItem(ModEntities.SOLDIER, 0x1E274E, 0xBBC0C6, new Item.Settings()));
	public static final Item BANDIT_SPAWN_EGG = registerItem("bandit_spawn_egg",
			new SpawnEggItem(ModEntities.BANDIT, 0x3A3522, 0xB6BB92, new Item.Settings()));
	public static final Item PIRATE_SPAWN_EGG = registerItem("pirate_spawn_egg",
			new SpawnEggItem(ModEntities.PIRATE, 0x1F2429, 0xB90613, new Item.Settings()));
	public static final Item POWER_WILD_SPAWN_EGG = registerItem("power_wild_spawn_egg",
			new SpawnEggItem(ModEntities.POWER_WILD, 0x6EA3C5, 0x374B63, new Item.Settings()));
	public static final Item WHITE_MUSHROOM_SPAWN_EGG = registerItem("white_mushroom_spawn_egg",
			new SpawnEggItem(ModEntities.WHITE_MUSHROOM, 0xCCC483, 0xB92A2E, new Item.Settings()));
	public static final Item SHADOW_SPAWN_EGG = registerItem("shadow_spawn_egg",
			new SpawnEggItem(ModEntities.SHADOW, 0x070707, 0xA28B2D, new Item.Settings()));
	
	// helper method
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(AdditionalWeapons.MOD_ID, name), item);
	}
	
	// gets called by the Main class onInitialize() method
	public static void registerModItems() {
		AdditionalWeapons.LOGGER.info("Registering Mod Items for " + AdditionalWeapons.MOD_ID);
	}
}