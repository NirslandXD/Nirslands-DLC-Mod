
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nirsland.nirslandsminecraftdlcmod.init;

import net.nirsland.nirslandsminecraftdlcmod.entity.WaterWandEntity;
import net.nirsland.nirslandsminecraftdlcmod.entity.PoisonWandEntity;
import net.nirsland.nirslandsminecraftdlcmod.entity.FireWandEntity;
import net.nirsland.nirslandsminecraftdlcmod.entity.EarthWandEntity;
import net.nirsland.nirslandsminecraftdlcmod.NirslandsMinecraftDlcModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NirslandsMinecraftDlcModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, NirslandsMinecraftDlcModMod.MODID);
	public static final RegistryObject<EntityType<EarthWandEntity>> EARTH_WAND = register("projectile_earth_wand",
			EntityType.Builder.<EarthWandEntity>of(EarthWandEntity::new, MobCategory.MISC).setCustomClientFactory(EarthWandEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WaterWandEntity>> WATER_WAND = register("projectile_water_wand",
			EntityType.Builder.<WaterWandEntity>of(WaterWandEntity::new, MobCategory.MISC).setCustomClientFactory(WaterWandEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FireWandEntity>> FIRE_WAND = register("projectile_fire_wand",
			EntityType.Builder.<FireWandEntity>of(FireWandEntity::new, MobCategory.MISC).setCustomClientFactory(FireWandEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PoisonWandEntity>> POISON_WAND = register("projectile_poison_wand",
			EntityType.Builder.<PoisonWandEntity>of(PoisonWandEntity::new, MobCategory.MISC).setCustomClientFactory(PoisonWandEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
