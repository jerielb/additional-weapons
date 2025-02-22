package com.jerielb.additional_weapons.world.gen;

import com.jerielb.additional_weapons.entity.ModEntities;
import com.jerielb.additional_weapons.entity.custom.BanditEntity;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnLocationTypes;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;

public class ModEntitySpawns {
	
	public static void addSpawns() {
		// Heartless Soldier
		BiomeModifications.addSpawn(BiomeSelectors.includeByKey(
						BiomeKeys.PLAINS,
						BiomeKeys.FOREST, BiomeKeys.BIRCH_FOREST, BiomeKeys.OLD_GROWTH_BIRCH_FOREST, BiomeKeys.DARK_FOREST
//						BiomeKeys.TAIGA, BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA,
//						BiomeKeys.JUNGLE, BiomeKeys.SPARSE_JUNGLE, BiomeKeys.BAMBOO_JUNGLE
				),
				SpawnGroup.MONSTER, ModEntities.SOLDIER, 100, 1, 2);
		
		SpawnRestriction.register(ModEntities.SOLDIER, SpawnLocationTypes.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BanditEntity::canSpawnInDark);
		
		// Heartless Bandit
		BiomeModifications.addSpawn(BiomeSelectors.includeByKey(
					BiomeKeys.DESERT, 
					BiomeKeys.SAVANNA, BiomeKeys.SAVANNA_PLATEAU, BiomeKeys.WINDSWEPT_SAVANNA,
					BiomeKeys.BADLANDS, BiomeKeys.WOODED_BADLANDS, BiomeKeys.ERODED_BADLANDS
				),
				SpawnGroup.MONSTER, ModEntities.BANDIT, 100, 1, 2);
		
		SpawnRestriction.register(ModEntities.BANDIT, SpawnLocationTypes.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BanditEntity::canSpawnInDark);
	}
}
