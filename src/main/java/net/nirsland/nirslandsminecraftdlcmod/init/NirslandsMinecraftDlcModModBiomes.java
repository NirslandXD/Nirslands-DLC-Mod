
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nirsland.nirslandsminecraftdlcmod.init;

import net.nirsland.nirslandsminecraftdlcmod.world.biome.PoisonedNetherWastesBiome;
import net.nirsland.nirslandsminecraftdlcmod.NirslandsMinecraftDlcModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

public class NirslandsMinecraftDlcModModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, NirslandsMinecraftDlcModMod.MODID);
	public static final RegistryObject<Biome> POISONED_NETHER_WASTES = REGISTRY.register("poisoned_nether_wastes", PoisonedNetherWastesBiome::createBiome);
}
