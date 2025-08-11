
package net.nirsland.nirslandsminecraftdlcmod.item;

import net.nirsland.nirslandsminecraftdlcmod.procedures.AncientStarRightclickedProcedure;
import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModTabs;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

public class AncientStarItem extends Item {
	public AncientStarItem() {
		super(new Item.Properties().tab(NirslandsMinecraftDlcModModTabs.TAB_NIRSLANDS_DLC_MOD).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AncientStarRightclickedProcedure.execute(entity);
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		AncientStarRightclickedProcedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
