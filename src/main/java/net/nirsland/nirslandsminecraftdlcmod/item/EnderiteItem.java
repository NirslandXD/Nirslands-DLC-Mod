
package net.nirsland.nirslandsminecraftdlcmod.item;

import net.nirsland.nirslandsminecraftdlcmod.procedures.AdvancementsProcedureProcedure;
import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModItems;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public abstract class EnderiteItem extends ArmorItem {
	public EnderiteItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 40;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{5, 10, 12, 5}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(NirslandsMinecraftDlcModModItems.ENDERITE_INGOT.get()));
			}

			@Override
			public String getName() {
				return "enderite";
			}

			@Override
			public float getToughness() {
				return 4f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.05f;
			}
		}, type, properties);
	}

	public static class Helmet extends EnderiteItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "nirslands_minecraft_dlc_mod:textures/models/armor/enderite_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			AdvancementsProcedureProcedure.execute(entity);
		}
	}

	public static class Chestplate extends EnderiteItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "nirslands_minecraft_dlc_mod:textures/models/armor/enderite_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			AdvancementsProcedureProcedure.execute(entity);
		}
	}

	public static class Leggings extends EnderiteItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "nirslands_minecraft_dlc_mod:textures/models/armor/enderite_layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			AdvancementsProcedureProcedure.execute(entity);
		}
	}

	public static class Boots extends EnderiteItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "nirslands_minecraft_dlc_mod:textures/models/armor/enderite_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			AdvancementsProcedureProcedure.execute(entity);
		}
	}
}
