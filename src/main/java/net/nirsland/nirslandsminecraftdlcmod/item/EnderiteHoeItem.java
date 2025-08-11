
package net.nirsland.nirslandsminecraftdlcmod.item;

import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class EnderiteHoeItem extends HoeItem {
	public EnderiteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2780;
			}

			public float getSpeed() {
				return 10.5f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(NirslandsMinecraftDlcModModItems.ENDERITE_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties());
	}
}
