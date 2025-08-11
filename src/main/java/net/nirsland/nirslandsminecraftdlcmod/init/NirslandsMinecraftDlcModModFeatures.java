
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nirsland.nirslandsminecraftdlcmod.init;

import net.nirsland.nirslandsminecraftdlcmod.world.features.ores.StarShardsOreFeature;
import net.nirsland.nirslandsminecraftdlcmod.world.features.ores.EnderiteOreFeature;
import net.nirsland.nirslandsminecraftdlcmod.world.features.PoisonedWitchHutFeature;
import net.nirsland.nirslandsminecraftdlcmod.world.features.PoisonedNetherFortrestFeature;
import net.nirsland.nirslandsminecraftdlcmod.world.features.CrackedNetherRoofFeature;
import net.nirsland.nirslandsminecraftdlcmod.NirslandsMinecraftDlcModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class NirslandsMinecraftDlcModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, NirslandsMinecraftDlcModMod.MODID);
	public static final RegistryObject<Feature<?>> STAR_SHARDS_ORE = REGISTRY.register("star_shards_ore", StarShardsOreFeature::feature);
	public static final RegistryObject<Feature<?>> ENDERITE_ORE = REGISTRY.register("enderite_ore", EnderiteOreFeature::feature);
	public static final RegistryObject<Feature<?>> POISONED_NETHER_FORTREST = REGISTRY.register("poisoned_nether_fortrest", PoisonedNetherFortrestFeature::feature);
	public static final RegistryObject<Feature<?>> CRACKED_NETHER_ROOF = REGISTRY.register("cracked_nether_roof", CrackedNetherRoofFeature::feature);
	public static final RegistryObject<Feature<?>> POISONED_WITCH_HUT = REGISTRY.register("poisoned_witch_hut", PoisonedWitchHutFeature::feature);
}
