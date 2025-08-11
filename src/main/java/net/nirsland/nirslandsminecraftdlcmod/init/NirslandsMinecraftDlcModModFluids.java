
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.nirsland.nirslandsminecraftdlcmod.init;

import net.nirsland.nirslandsminecraftdlcmod.fluid.AcidFluid;
import net.nirsland.nirslandsminecraftdlcmod.NirslandsMinecraftDlcModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

public class NirslandsMinecraftDlcModModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, NirslandsMinecraftDlcModMod.MODID);
	public static final RegistryObject<FlowingFluid> ACID = REGISTRY.register("acid", () -> new AcidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_ACID = REGISTRY.register("flowing_acid", () -> new AcidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(ACID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_ACID.get(), RenderType.translucent());
		}
	}
}
