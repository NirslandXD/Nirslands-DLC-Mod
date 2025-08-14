
package net.nirsland.nirslandsminecraftdlcmod.item;

import net.nirsland.nirslandsminecraftdlcmod.procedures.StarArmorDoubleProcedure;
import net.nirsland.nirslandsminecraftdlcmod.procedures.AdvancementsProcedureProcedure;
import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModTabs;
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

public abstract class StarItem extends ArmorItem {
	public StarItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 31;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 4, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(NirslandsMinecraftDlcModModItems.STAR_SHARD.get()));
			}

			@Override
			public String getName() {
				return "star";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends StarItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(NirslandsMinecraftDlcModModTabs.TAB_NIRSLANDS_DLC_MOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "nirslands_minecraft_dlc_mod:textures/models/armor/stararmor_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			StarArmorDoubleProcedure.execute(entity);
		}
	}

	public static class Chestplate extends StarItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(NirslandsMinecraftDlcModModTabs.TAB_NIRSLANDS_DLC_MOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "nirslands_minecraft_dlc_mod:textures/models/armor/stararmor_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			StarArmorDoubleProcedure.execute(entity);
		}
	}

	public static class Leggings extends StarItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(NirslandsMinecraftDlcModModTabs.TAB_NIRSLANDS_DLC_MOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "nirslands_minecraft_dlc_mod:textures/models/armor/stararmor_layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			AdvancementsProcedureProcedure.execute(entity);
		}
	}

	public static class Boots extends StarItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(NirslandsMinecraftDlcModModTabs.TAB_NIRSLANDS_DLC_MOD));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "nirslands_minecraft_dlc_mod:textures/models/armor/stararmor_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			AdvancementsProcedureProcedure.execute(entity);
		}
	}
}
