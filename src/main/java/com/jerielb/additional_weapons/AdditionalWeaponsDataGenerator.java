package com.jerielb.additional_weapons;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import com.jerielb.additional_weapons.datagen.ModItemTagProvider;
import com.jerielb.additional_weapons.datagen.ModBlockTagProvider;
import com.jerielb.additional_weapons.datagen.ModLootTableProvider;
import com.jerielb.additional_weapons.datagen.ModModelProvider;
import com.jerielb.additional_weapons.datagen.ModRecipeProvider;

public class AdditionalWeaponsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
