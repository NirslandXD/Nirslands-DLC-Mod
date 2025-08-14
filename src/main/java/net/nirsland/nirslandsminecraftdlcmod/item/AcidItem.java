
package net.nirsland.nirslandsminecraftdlcmod.item;

import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

public class AcidItem extends BucketItem {
	public AcidItem() {
		super(NirslandsMinecraftDlcModModFluids.ACID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
