
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nirsland.nirslandsminecraftdlcmod.init;

import net.nirsland.nirslandsminecraftdlcmod.NirslandsMinecraftDlcModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class NirslandsMinecraftDlcModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NirslandsMinecraftDlcModMod.MODID);
	public static final RegistryObject<CreativeModeTab> NIRSLANDS_DLC_MOD = REGISTRY.register("nirslands_dlc_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.nirslands_minecraft_dlc_mod.nirslands_dlc_mod")).icon(() -> new ItemStack(NirslandsMinecraftDlcModModItems.STAR_SHARD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(NirslandsMinecraftDlcModModItems.STAR_SHARD.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.STAR_POWDER.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.ANCIENT_STAR.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.STAR_STICK.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.EARTH_WAND.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.WATER_WAND.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.FIRE_WAND.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.POISON_WAND.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.STAR_HELMET.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.STAR_CHESTPLATE.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.STAR_LEGGINGS.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.STAR_BOOTS.get());
				tabData.accept(NirslandsMinecraftDlcModModBlocks.STAR_SHARDS_BLOCK.get().asItem());
				tabData.accept(NirslandsMinecraftDlcModModBlocks.STAR_SHARDS_ORE.get().asItem());
				tabData.accept(NirslandsMinecraftDlcModModBlocks.STAR_BRICKS.get().asItem());
				tabData.accept(NirslandsMinecraftDlcModModBlocks.STAR_BRICKS_STAIRS.get().asItem());
				tabData.accept(NirslandsMinecraftDlcModModBlocks.STAR_BRICKS_SLABS.get().asItem());
				tabData.accept(NirslandsMinecraftDlcModModBlocks.STAT_BRICK_WALL.get().asItem());
				tabData.accept(NirslandsMinecraftDlcModModItems.POISONED_NETHER.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.POISONED_BLAZE_POWDER.get());
				tabData.accept(NirslandsMinecraftDlcModModBlocks.POISONED_NETHERACK.get().asItem());
				tabData.accept(NirslandsMinecraftDlcModModItems.ACID_BUCKET.get());
				tabData.accept(NirslandsMinecraftDlcModModBlocks.POISONED_NETHER_BRICKS.get().asItem());
				tabData.accept(NirslandsMinecraftDlcModModBlocks.POISONED_NETHERRACK_BRICKS_STAIRS.get().asItem());
				tabData.accept(NirslandsMinecraftDlcModModBlocks.POISONED_NETHERACK_BRICKS_FENCE.get().asItem());
				tabData.accept(NirslandsMinecraftDlcModModItems.RAW_ENDERITE.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.ENDERITE_INGOT.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.ENDERITE_HELMET.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.ENDERITE_CHESTPLATE.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.ENDERITE_LEGGINGS.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.ENDERITE_BOOTS.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.ENDERITE_SWORD.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.ENDERITE_PICKAXE.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.ENDERITE_AXE.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.ENDERITE_SHOVEL.get());
				tabData.accept(NirslandsMinecraftDlcModModItems.ENDERITE_HOE.get());
				tabData.accept(NirslandsMinecraftDlcModModBlocks.ENDERITE_BLOCK.get().asItem());
				tabData.accept(NirslandsMinecraftDlcModModBlocks.RAW_ENDERITE_BLOCK.get().asItem());
				tabData.accept(NirslandsMinecraftDlcModModBlocks.ENDERITE_ORE.get().asItem());
				tabData.accept(NirslandsMinecraftDlcModModBlocks.ENDERITE_BRICKS.get().asItem());
				tabData.accept(NirslandsMinecraftDlcModModBlocks.ENDERITE_BRICKS_STAIRS.get().asItem());
				tabData.accept(NirslandsMinecraftDlcModModBlocks.ENDERITE_BRICKS_SLABS.get().asItem());
				tabData.accept(NirslandsMinecraftDlcModModBlocks.ENDERITE_BRICK_WALL.get().asItem());
			})

					.build());
}
