
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nirsland.nirslandsminecraftdlcmod.init;

import net.nirsland.nirslandsminecraftdlcmod.NirslandsMinecraftDlcModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class NirslandsMinecraftDlcModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, NirslandsMinecraftDlcModMod.MODID);
	public static final RegistryObject<SoundEvent> STARFIGHT = REGISTRY.register("starfight", () -> new SoundEvent(new ResourceLocation("nirslands_minecraft_dlc_mod", "starfight")));
}
