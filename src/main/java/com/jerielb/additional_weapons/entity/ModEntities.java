package com.jerielb.additional_weapons.entity;

import com.jerielb.additional_weapons.AdditionalWeapons;
import com.jerielb.additional_weapons.entity.custom.BanditEntity;
import com.jerielb.additional_weapons.entity.custom.PirateEntity;
import com.jerielb.additional_weapons.entity.custom.SoldierEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
	public static final EntityType<SoldierEntity> SOLDIER = Registry.register(
			Registries.ENTITY_TYPE,
			Identifier.of(AdditionalWeapons.MOD_ID, "soldier"),
			EntityType.Builder.create(SoldierEntity::new, SpawnGroup.MONSTER)
					.dimensions(0.6F, 1.95F)
					.build()
	);
	
	public static final EntityType<BanditEntity> BANDIT = Registry.register(
			Registries.ENTITY_TYPE, 
			Identifier.of(AdditionalWeapons.MOD_ID, "bandit"),
			EntityType.Builder.create(BanditEntity::new, SpawnGroup.MONSTER)
					.dimensions(0.6F, 1.95F)
					.build()
	);
	
	public static final EntityType<PirateEntity> PIRATE = Registry.register(
			Registries.ENTITY_TYPE,
			Identifier.of(AdditionalWeapons.MOD_ID, "pirate"),
			EntityType.Builder.create(PirateEntity::new, SpawnGroup.MONSTER)
					.dimensions(0.6F, 1.95F)
					.build()
	);
	
	public static void registerModEntities() {
		AdditionalWeapons.LOGGER.info("Registering Mod Entities for " + AdditionalWeapons.MOD_ID);
		
		FabricDefaultAttributeRegistry.register(SOLDIER, SoldierEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(BANDIT, BanditEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(PIRATE, PirateEntity.createAttributes());
	}
}
