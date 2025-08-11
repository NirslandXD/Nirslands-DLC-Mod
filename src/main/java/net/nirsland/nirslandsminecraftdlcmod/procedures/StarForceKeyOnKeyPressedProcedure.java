package net.nirsland.nirslandsminecraftdlcmod.procedures;

import net.nirsland.nirslandsminecraftdlcmod.network.NirslandsMinecraftDlcModModVariables;
import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModMobEffects;
import net.nirsland.nirslandsminecraftdlcmod.NirslandsMinecraftDlcModMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class StarForceKeyOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(NirslandsMinecraftDlcModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new NirslandsMinecraftDlcModModVariables.PlayerVariables())).Cooldown == false && entity instanceof LivingEntity _livEnt0
				&& _livEnt0.hasEffect(NirslandsMinecraftDlcModModMobEffects.STAR_FORCE.get())) {
			entity.setDeltaMovement(
					new Vec3((entity.getDeltaMovement().x() + entity.getLookAngle().x * 0.85), (entity.getDeltaMovement().y() + 0.4 + entity.getLookAngle().y * 0.125), (entity.getDeltaMovement().z() + entity.getLookAngle().z * 0.85)));
			{
				boolean _setval = true;
				entity.getCapability(NirslandsMinecraftDlcModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Cooldown = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			NirslandsMinecraftDlcModMod.queueServerWork(30, () -> {
				{
					boolean _setval = false;
					entity.getCapability(NirslandsMinecraftDlcModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Cooldown = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			});
		}
	}
}
