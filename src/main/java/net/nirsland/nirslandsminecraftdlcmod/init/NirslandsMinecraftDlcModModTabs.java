
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nirsland.nirslandsminecraftdlcmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class NirslandsMinecraftDlcModModTabs {
	public static CreativeModeTab TAB_NIRSLANDS_DLC_MOD;

	public static void load() {
		TAB_NIRSLANDS_DLC_MOD = new CreativeModeTab("tabnirslands_dlc_mod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(NirslandsMinecraftDlcModModItems.STAR_SHARD.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
