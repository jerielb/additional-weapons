package com.jerielb.additional_weapons.datagen;

import com.jerielb.additional_weapons.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

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
	}
}
