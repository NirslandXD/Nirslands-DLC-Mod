package net.nirsland.nirslandsminecraftdlcmod.procedures;

import net.nirsland.nirslandsminecraftdlcmod.network.NirslandsMinecraftDlcModModVariables;
import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModMobEffects;
import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class ArmorEffectsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 0;
			entity.getCapability(NirslandsMinecraftDlcModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.StarArmoreffects = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == NirslandsMinecraftDlcModModItems.STAR_HELMET.get()) {
			{
				double _setval = (entity.getCapability(NirslandsMinecraftDlcModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new NirslandsMinecraftDlcModModVariables.PlayerVariables())).StarArmoreffects + 1;
				entity.getCapability(NirslandsMinecraftDlcModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.StarArmoreffects = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == NirslandsMinecraftDlcModModItems.STAR_CHESTPLATE.get()) {
			{
				double _setval = (entity.getCapability(NirslandsMinecraftDlcModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new NirslandsMinecraftDlcModModVariables.PlayerVariables())).StarArmoreffects + 1;
				entity.getCapability(NirslandsMinecraftDlcModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.StarArmoreffects = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == NirslandsMinecraftDlcModModItems.STAR_LEGGINGS.get()) {
			{
				double _setval = (entity.getCapability(NirslandsMinecraftDlcModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new NirslandsMinecraftDlcModModVariables.PlayerVariables())).StarArmoreffects + 1;
				entity.getCapability(NirslandsMinecraftDlcModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.StarArmoreffects = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == NirslandsMinecraftDlcModModItems.STAR_BOOTS.get()) {
			{
				double _setval = (entity.getCapability(NirslandsMinecraftDlcModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new NirslandsMinecraftDlcModModVariables.PlayerVariables())).StarArmoreffects + 1;
				entity.getCapability(NirslandsMinecraftDlcModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.StarArmoreffects = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(NirslandsMinecraftDlcModModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new NirslandsMinecraftDlcModModVariables.PlayerVariables())).StarArmoreffects >= 3) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(NirslandsMinecraftDlcModModMobEffects.STAR_FORCE.get(), 60, 0, true, true));
		}
	}
}
