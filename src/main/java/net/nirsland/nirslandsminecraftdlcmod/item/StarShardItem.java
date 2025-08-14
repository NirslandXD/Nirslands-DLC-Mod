
package net.nirsland.nirslandsminecraftdlcmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StarShardItem extends Item {
	public StarShardItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
