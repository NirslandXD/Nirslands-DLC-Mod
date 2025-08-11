
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.nirsland.nirslandsminecraftdlcmod.init;

import org.lwjgl.glfw.GLFW;

import net.nirsland.nirslandsminecraftdlcmod.network.StarForceKeyMessage;
import net.nirsland.nirslandsminecraftdlcmod.NirslandsMinecraftDlcModMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class NirslandsMinecraftDlcModModKeyMappings {
	public static final KeyMapping STAR_FORCE_KEY = new KeyMapping("key.nirslands_minecraft_dlc_mod.star_force_key", GLFW.GLFW_KEY_R, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				NirslandsMinecraftDlcModMod.PACKET_HANDLER.sendToServer(new StarForceKeyMessage(0, 0));
				StarForceKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(STAR_FORCE_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				STAR_FORCE_KEY.consumeClick();
			}
		}
	}
}
