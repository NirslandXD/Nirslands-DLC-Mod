
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nirsland.nirslandsminecraftdlcmod.init;

import net.nirsland.nirslandsminecraftdlcmod.item.WaterWandItem;
import net.nirsland.nirslandsminecraftdlcmod.item.StarStickItem;
import net.nirsland.nirslandsminecraftdlcmod.item.StarShardItem;
import net.nirsland.nirslandsminecraftdlcmod.item.StarPowderItem;
import net.nirsland.nirslandsminecraftdlcmod.item.StarItem;
import net.nirsland.nirslandsminecraftdlcmod.item.RawEnderiteItem;
import net.nirsland.nirslandsminecraftdlcmod.item.PoisonedNetherItem;
import net.nirsland.nirslandsminecraftdlcmod.item.PoisonedBlazePowderItem;
import net.nirsland.nirslandsminecraftdlcmod.item.PoisonWandItem;
import net.nirsland.nirslandsminecraftdlcmod.item.FireWandItem;
import net.nirsland.nirslandsminecraftdlcmod.item.EnderiteSwordItem;
import net.nirsland.nirslandsminecraftdlcmod.item.EnderiteShovelItem;
import net.nirsland.nirslandsminecraftdlcmod.item.EnderitePickaxeItem;
import net.nirsland.nirslandsminecraftdlcmod.item.EnderiteItem;
import net.nirsland.nirslandsminecraftdlcmod.item.EnderiteIngotItem;
import net.nirsland.nirslandsminecraftdlcmod.item.EnderiteHoeItem;
import net.nirsland.nirslandsminecraftdlcmod.item.EnderiteAxeItem;
import net.nirsland.nirslandsminecraftdlcmod.item.EarthWandItem;
import net.nirsland.nirslandsminecraftdlcmod.item.AncientStarItem;
import net.nirsland.nirslandsminecraftdlcmod.item.AcidItem;
import net.nirsland.nirslandsminecraftdlcmod.NirslandsMinecraftDlcModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class NirslandsMinecraftDlcModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NirslandsMinecraftDlcModMod.MODID);
	public static final RegistryObject<Item> STAR_SHARD = REGISTRY.register("star_shard", () -> new StarShardItem());
	public static final RegistryObject<Item> STAR_POWDER = REGISTRY.register("star_powder", () -> new StarPowderItem());
	public static final RegistryObject<Item> ANCIENT_STAR = REGISTRY.register("ancient_star", () -> new AncientStarItem());
	public static final RegistryObject<Item> STAR_STICK = REGISTRY.register("star_stick", () -> new StarStickItem());
	public static final RegistryObject<Item> EARTH_WAND = REGISTRY.register("earth_wand", () -> new EarthWandItem());
	public static final RegistryObject<Item> WATER_WAND = REGISTRY.register("water_wand", () -> new WaterWandItem());
	public static final RegistryObject<Item> FIRE_WAND = REGISTRY.register("fire_wand", () -> new FireWandItem());
	public static final RegistryObject<Item> POISON_WAND = REGISTRY.register("poison_wand", () -> new PoisonWandItem());
	public static final RegistryObject<Item> STAR_HELMET = REGISTRY.register("star_helmet", () -> new StarItem.Helmet());
	public static final RegistryObject<Item> STAR_CHESTPLATE = REGISTRY.register("star_chestplate", () -> new StarItem.Chestplate());
	public static final RegistryObject<Item> STAR_LEGGINGS = REGISTRY.register("star_leggings", () -> new StarItem.Leggings());
	public static final RegistryObject<Item> STAR_BOOTS = REGISTRY.register("star_boots", () -> new StarItem.Boots());
	public static final RegistryObject<Item> STAR_SHARDS_BLOCK = block(NirslandsMinecraftDlcModModBlocks.STAR_SHARDS_BLOCK);
	public static final RegistryObject<Item> STAR_SHARDS_ORE = block(NirslandsMinecraftDlcModModBlocks.STAR_SHARDS_ORE);
	public static final RegistryObject<Item> STAR_BRICKS = block(NirslandsMinecraftDlcModModBlocks.STAR_BRICKS);
	public static final RegistryObject<Item> STAR_BRICKS_STAIRS = block(NirslandsMinecraftDlcModModBlocks.STAR_BRICKS_STAIRS);
	public static final RegistryObject<Item> STAR_BRICKS_SLABS = block(NirslandsMinecraftDlcModModBlocks.STAR_BRICKS_SLABS);
	public static final RegistryObject<Item> STAT_BRICK_WALL = block(NirslandsMinecraftDlcModModBlocks.STAT_BRICK_WALL);
	public static final RegistryObject<Item> POISONED_NETHER = REGISTRY.register("poisoned_nether", () -> new PoisonedNetherItem());
	public static final RegistryObject<Item> POISONED_BLAZE_POWDER = REGISTRY.register("poisoned_blaze_powder", () -> new PoisonedBlazePowderItem());
	public static final RegistryObject<Item> POISONED_NETHERACK = block(NirslandsMinecraftDlcModModBlocks.POISONED_NETHERACK);
	public static final RegistryObject<Item> ACID_BUCKET = REGISTRY.register("acid_bucket", () -> new AcidItem());
	public static final RegistryObject<Item> POISONED_NETHER_BRICKS = block(NirslandsMinecraftDlcModModBlocks.POISONED_NETHER_BRICKS);
	public static final RegistryObject<Item> POISONED_NETHERRACK_BRICKS_STAIRS = block(NirslandsMinecraftDlcModModBlocks.POISONED_NETHERRACK_BRICKS_STAIRS);
	public static final RegistryObject<Item> POISONED_NETHERACK_BRICKS_FENCE = block(NirslandsMinecraftDlcModModBlocks.POISONED_NETHERACK_BRICKS_FENCE);
	public static final RegistryObject<Item> RAW_ENDERITE = REGISTRY.register("raw_enderite", () -> new RawEnderiteItem());
	public static final RegistryObject<Item> ENDERITE_INGOT = REGISTRY.register("enderite_ingot", () -> new EnderiteIngotItem());
	public static final RegistryObject<Item> ENDERITE_HELMET = REGISTRY.register("enderite_helmet", () -> new EnderiteItem.Helmet());
	public static final RegistryObject<Item> ENDERITE_CHESTPLATE = REGISTRY.register("enderite_chestplate", () -> new EnderiteItem.Chestplate());
	public static final RegistryObject<Item> ENDERITE_LEGGINGS = REGISTRY.register("enderite_leggings", () -> new EnderiteItem.Leggings());
	public static final RegistryObject<Item> ENDERITE_BOOTS = REGISTRY.register("enderite_boots", () -> new EnderiteItem.Boots());
	public static final RegistryObject<Item> ENDERITE_SWORD = REGISTRY.register("enderite_sword", () -> new EnderiteSwordItem());
	public static final RegistryObject<Item> ENDERITE_PICKAXE = REGISTRY.register("enderite_pickaxe", () -> new EnderitePickaxeItem());
	public static final RegistryObject<Item> ENDERITE_AXE = REGISTRY.register("enderite_axe", () -> new EnderiteAxeItem());
	public static final RegistryObject<Item> ENDERITE_SHOVEL = REGISTRY.register("enderite_shovel", () -> new EnderiteShovelItem());
	public static final RegistryObject<Item> ENDERITE_HOE = REGISTRY.register("enderite_hoe", () -> new EnderiteHoeItem());
	public static final RegistryObject<Item> ENDERITE_BLOCK = block(NirslandsMinecraftDlcModModBlocks.ENDERITE_BLOCK);
	public static final RegistryObject<Item> RAW_ENDERITE_BLOCK = block(NirslandsMinecraftDlcModModBlocks.RAW_ENDERITE_BLOCK);
	public static final RegistryObject<Item> ENDERITE_ORE = block(NirslandsMinecraftDlcModModBlocks.ENDERITE_ORE);
	public static final RegistryObject<Item> ENDERITE_BRICKS = block(NirslandsMinecraftDlcModModBlocks.ENDERITE_BRICKS);
	public static final RegistryObject<Item> ENDERITE_BRICKS_STAIRS = block(NirslandsMinecraftDlcModModBlocks.ENDERITE_BRICKS_STAIRS);
	public static final RegistryObject<Item> ENDERITE_BRICKS_SLABS = block(NirslandsMinecraftDlcModModBlocks.ENDERITE_BRICKS_SLABS);
	public static final RegistryObject<Item> ENDERITE_BRICK_WALL = block(NirslandsMinecraftDlcModModBlocks.ENDERITE_BRICK_WALL);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
