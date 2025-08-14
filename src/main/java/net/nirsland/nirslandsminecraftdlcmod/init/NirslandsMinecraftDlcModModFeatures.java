
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
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class NirslandsMinecraftDlcModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, NirslandsMinecraftDlcModMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> STAR_SHARDS_ORE = register("star_shards_ore", StarShardsOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, StarShardsOreFeature.GENERATE_BIOMES, StarShardsOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ENDERITE_ORE = register("enderite_ore", EnderiteOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, EnderiteOreFeature.GENERATE_BIOMES, EnderiteOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> POISONED_NETHER_FORTREST = register("poisoned_nether_fortrest", PoisonedNetherFortrestFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, PoisonedNetherFortrestFeature.GENERATE_BIOMES, PoisonedNetherFortrestFeature::placedFeature));
	public static final RegistryObject<Feature<?>> CRACKED_NETHER_ROOF = register("cracked_nether_roof", CrackedNetherRoofFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, CrackedNetherRoofFeature.GENERATE_BIOMES, CrackedNetherRoofFeature::placedFeature));
	public static final RegistryObject<Feature<?>> POISONED_WITCH_HUT = register("poisoned_witch_hut", PoisonedWitchHutFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_STRUCTURES, PoisonedWitchHutFeature.GENERATE_BIOMES, PoisonedWitchHutFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes, Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
