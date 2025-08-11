
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nirsland.nirslandsminecraftdlcmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NirslandsMinecraftDlcModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(NirslandsMinecraftDlcModModEntities.EARTH_WAND.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(NirslandsMinecraftDlcModModEntities.WATER_WAND.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(NirslandsMinecraftDlcModModEntities.FIRE_WAND.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(NirslandsMinecraftDlcModModEntities.POISON_WAND.get(), ThrownItemRenderer::new);
	}
}
