package net.nirsland.nirslandsminecraftdlcmod.procedures;

import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModMobEffects;
import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class AncientStarRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(NirslandsMinecraftDlcModModItems.ANCIENT_STAR.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(NirslandsMinecraftDlcModModMobEffects.STAR_FORCE.get(), 6000, 0));
	}
}
