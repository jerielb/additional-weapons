package com.jerielb.additional_weapons.datagen;

import com.jerielb.additional_weapons.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;
import java.util.Optional;

/** Instead of adding tags to the JSON file use this class instead 
 * <p> 
 *  generates:
 *      /resources/assets/<tutorialmod>/blockstates/*.json
 *      /resources/assets/<tutorialmod>/models/block/*.json
 *      /resources/assets/<tutorialmod>/models/item/*.json
 * <p> 
 * */
public class ModModelProvider extends FabricModelProvider {
	public ModModelProvider(FabricDataOutput output) {
		super(output);
	}
	
	@Override
	public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
		
	}
	
	@Override
	public void generateItemModels(ItemModelGenerator itemModelGenerator) {
		// keyblades
		itemModelGenerator.register(ModItems.KINGDOM_KEY, Models.HANDHELD);
		itemModelGenerator.register(ModItems.JUNGLE_KING, Models.HANDHELD);
		itemModelGenerator.register(ModItems.THREE_WISHES, Models.HANDHELD);
		itemModelGenerator.register(ModItems.CRABCLAW, Models.HANDHELD);
		itemModelGenerator.register(ModItems.PUMPKINHEAD, Models.HANDHELD);
		itemModelGenerator.register(ModItems.FAIRY_HARP, Models.HANDHELD);
		itemModelGenerator.register(ModItems.WISHING_STAR, Models.HANDHELD);
		itemModelGenerator.register(ModItems.SPELLBINDER, Models.HANDHELD);
		itemModelGenerator.register(ModItems.METAL_CHOCOBO, Models.HANDHELD);
		itemModelGenerator.register(ModItems.OLYMPIA, Models.HANDHELD);
		itemModelGenerator.register(ModItems.LIONHEART, Models.HANDHELD);
		itemModelGenerator.register(ModItems.OATHKEEPER, Models.HANDHELD);
		itemModelGenerator.register(ModItems.OBLIVION, Models.HANDHELD);
		itemModelGenerator.register(ModItems.LADY_LUCK, Models.HANDHELD);
		itemModelGenerator.register(ModItems.DIVINE_ROSE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.DIAMOND_DUST, Models.HANDHELD);
		itemModelGenerator.register(ModItems.ONE_WINGED_ANGEL, Models.HANDHELD);
		itemModelGenerator.register(ModItems.ULTIMA_WEAPON, Models.HANDHELD);
		itemModelGenerator.register(ModItems.KINGDOM_KEY_DARKSIDE, Models.HANDHELD);
		itemModelGenerator.register(ModItems.SOUL_EATER, Models.HANDHELD);
		
		// keychains
		itemModelGenerator.register(ModItems.KEYCHAIN_KINGDOM_KEY, Models.GENERATED);
		itemModelGenerator.register(ModItems.KEYCHAIN_JUNGLE_KING, Models.GENERATED);
		itemModelGenerator.register(ModItems.KEYCHAIN_THREE_WISHES, Models.GENERATED);
		itemModelGenerator.register(ModItems.KEYCHAIN_CRABCLAW, Models.GENERATED);
		itemModelGenerator.register(ModItems.KEYCHAIN_PUMPKINHEAD, Models.GENERATED);
		itemModelGenerator.register(ModItems.KEYCHAIN_FAIRY_HARP, Models.GENERATED);
		itemModelGenerator.register(ModItems.KEYCHAIN_WISHING_STAR, Models.GENERATED);
		itemModelGenerator.register(ModItems.KEYCHAIN_SPELLBINDER, Models.GENERATED);
		itemModelGenerator.register(ModItems.KEYCHAIN_METAL_CHOCOBO, Models.GENERATED);
		itemModelGenerator.register(ModItems.KEYCHAIN_OLYMPIA, Models.GENERATED);
		itemModelGenerator.register(ModItems.KEYCHAIN_LIONHEART, Models.GENERATED);
		itemModelGenerator.register(ModItems.KEYCHAIN_OATHKEEPER, Models.GENERATED);
		itemModelGenerator.register(ModItems.KEYCHAIN_OBLIVION, Models.GENERATED);
		itemModelGenerator.register(ModItems.KEYCHAIN_LADY_LUCK, Models.GENERATED);
		itemModelGenerator.register(ModItems.KEYCHAIN_DIVINE_ROSE, Models.GENERATED);
		itemModelGenerator.register(ModItems.KEYCHAIN_DIAMOND_DUST, Models.GENERATED);
		itemModelGenerator.register(ModItems.KEYCHAIN_ONE_WINGED_ANGEL, Models.GENERATED);
		itemModelGenerator.register(ModItems.KEYCHAIN_ULTIMA_WEAPON, Models.GENERATED);
//		itemModelGenerator.register(ModItems.KEYCHAIN_KINGDOM_KEY_DARKSIDE, Models.GENERATED);
//		itemModelGenerator.register(ModItems.KEYCHAIN_SOUL_EATER, Models.GENERATED);
		
		// entity spawn eggs
		itemModelGenerator.register(ModItems.SOLDIER_SPAWN_EGG,
				new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
		itemModelGenerator.register(ModItems.BANDIT_SPAWN_EGG, 
				new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
		itemModelGenerator.register(ModItems.PIRATE_SPAWN_EGG, 
				new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
		itemModelGenerator.register(ModItems.POWER_WILD_SPAWN_EGG, 
				new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
		itemModelGenerator.register(ModItems.WHITE_MUSHROOM_SPAWN_EGG, 
				new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
		itemModelGenerator.register(ModItems.SHADOW_SPAWN_EGG, 
				new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
	}
}
