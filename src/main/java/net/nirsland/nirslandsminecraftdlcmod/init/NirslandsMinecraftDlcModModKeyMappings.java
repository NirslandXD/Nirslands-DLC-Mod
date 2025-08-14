
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nirsland.nirslandsminecraftdlcmod.init;

import org.lwjgl.glfw.GLFW;

import net.nirsland.nirslandsminecraftdlcmod.network.StarForceKeyMessage;
import net.nirsland.nirslandsminecraftdlcmod.NirslandsMinecraftDlcModMod;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class NirslandsMinecraftDlcModModKeyMappings {
	public static final KeyMapping STAR_FORCE_KEY = new KeyMapping("key.nirslands_minecraft_dlc_mod.star_force_key", GLFW.GLFW_KEY_R, "key.categories.misc");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(STAR_FORCE_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == STAR_FORCE_KEY.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						NirslandsMinecraftDlcModMod.PACKET_HANDLER.sendToServer(new StarForceKeyMessage(0, 0));
						StarForceKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
