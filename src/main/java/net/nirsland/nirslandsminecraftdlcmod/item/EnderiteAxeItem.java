
package net.nirsland.nirslandsminecraftdlcmod.item;

import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

public class EnderiteAxeItem extends AxeItem {
	public EnderiteAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2780;
			}

			public float getSpeed() {
				return 10.5f;
			}

			public float getAttackDamageBonus() {
				return 9f;
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
		}, 1, -3f, new Item.Properties());
	}
}
