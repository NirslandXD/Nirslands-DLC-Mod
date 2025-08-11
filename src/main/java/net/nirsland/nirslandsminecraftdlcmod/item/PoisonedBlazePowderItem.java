
package net.nirsland.nirslandsminecraftdlcmod.item;

import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PoisonedBlazePowderItem extends Item {
	public PoisonedBlazePowderItem() {
		super(new Item.Properties().tab(NirslandsMinecraftDlcModModTabs.TAB_NIRSLANDS_DLC_MOD).stacksTo(64).rarity(Rarity.COMMON));
	}
}
