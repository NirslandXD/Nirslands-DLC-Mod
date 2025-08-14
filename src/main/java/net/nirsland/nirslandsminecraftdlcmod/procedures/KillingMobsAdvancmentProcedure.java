package net.nirsland.nirslandsminecraftdlcmod.procedures;

import net.nirsland.nirslandsminecraftdlcmod.network.NirslandsMinecraftDlcModModVariables;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import javax.annotation.Nullable;

import java.util.Iterator;

@Mod.EventBusSubscriber
public class KillingMobsAdvancmentProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(NirslandsMinecraftDlcModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new NirslandsMinecraftDlcModModVariables.PlayerVariables())).MobsKilled + 1;
			entity.getCapability(NirslandsMinecraftDlcModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.MobsKilled = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity.getCapability(NirslandsMinecraftDlcModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new NirslandsMinecraftDlcModModVariables.PlayerVariables())).MobsKilled == 100) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("nirslands_minecraft_dlc_mod:mobs_killer"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		}
		if ((entity.getCapability(NirslandsMinecraftDlcModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new NirslandsMinecraftDlcModModVariables.PlayerVariables())).MobsKilled == 1000) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("nirslands_minecraft_dlc_mod:killing_machine"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					Iterator _iterator = _ap.getRemainingCriteria().iterator();
					while (_iterator.hasNext())
						_player.getAdvancements().award(_adv, (String) _iterator.next());
				}
			}
		}
	}
}
