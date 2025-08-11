
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.nirsland.nirslandsminecraftdlcmod.init;

import net.nirsland.nirslandsminecraftdlcmod.block.StatBrickWallBlock;
import net.nirsland.nirslandsminecraftdlcmod.block.StarShardsOreBlock;
import net.nirsland.nirslandsminecraftdlcmod.block.StarShardsBlockBlock;
import net.nirsland.nirslandsminecraftdlcmod.block.StarBricksStairsBlock;
import net.nirsland.nirslandsminecraftdlcmod.block.StarBricksSlabsBlock;
import net.nirsland.nirslandsminecraftdlcmod.block.StarBricksBlock;
import net.nirsland.nirslandsminecraftdlcmod.block.RawEnderiteBlockBlock;
import net.nirsland.nirslandsminecraftdlcmod.block.PoisonedNetherrackBricksStairsBlock;
import net.nirsland.nirslandsminecraftdlcmod.block.PoisonedNetherackBricksFenceBlock;
import net.nirsland.nirslandsminecraftdlcmod.block.PoisonedNetherackBlock;
import net.nirsland.nirslandsminecraftdlcmod.block.PoisonedNetherPortalBlock;
import net.nirsland.nirslandsminecraftdlcmod.block.PoisonedNetherBricksBlock;
import net.nirsland.nirslandsminecraftdlcmod.block.EnderiteOreBlock;
import net.nirsland.nirslandsminecraftdlcmod.block.EnderiteBricksStairsBlock;
import net.nirsland.nirslandsminecraftdlcmod.block.EnderiteBricksSlabsBlock;
import net.nirsland.nirslandsminecraftdlcmod.block.EnderiteBricksBlock;
import net.nirsland.nirslandsminecraftdlcmod.block.EnderiteBrickWallBlock;
import net.nirsland.nirslandsminecraftdlcmod.block.EnderiteBlockBlock;
import net.nirsland.nirslandsminecraftdlcmod.block.AcidBlock;
import net.nirsland.nirslandsminecraftdlcmod.NirslandsMinecraftDlcModMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class NirslandsMinecraftDlcModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NirslandsMinecraftDlcModMod.MODID);
	public static final RegistryObject<Block> STAR_SHARDS_BLOCK = REGISTRY.register("star_shards_block", () -> new StarShardsBlockBlock());
	public static final RegistryObject<Block> STAR_SHARDS_ORE = REGISTRY.register("star_shards_ore", () -> new StarShardsOreBlock());
	public static final RegistryObject<Block> STAR_BRICKS = REGISTRY.register("star_bricks", () -> new StarBricksBlock());
	public static final RegistryObject<Block> STAR_BRICKS_STAIRS = REGISTRY.register("star_bricks_stairs", () -> new StarBricksStairsBlock());
	public static final RegistryObject<Block> STAR_BRICKS_SLABS = REGISTRY.register("star_bricks_slabs", () -> new StarBricksSlabsBlock());
	public static final RegistryObject<Block> STAT_BRICK_WALL = REGISTRY.register("stat_brick_wall", () -> new StatBrickWallBlock());
	public static final RegistryObject<Block> POISONED_NETHER_PORTAL = REGISTRY.register("poisoned_nether_portal", () -> new PoisonedNetherPortalBlock());
	public static final RegistryObject<Block> POISONED_NETHERACK = REGISTRY.register("poisoned_netherack", () -> new PoisonedNetherackBlock());
	public static final RegistryObject<Block> ACID = REGISTRY.register("acid", () -> new AcidBlock());
	public static final RegistryObject<Block> POISONED_NETHER_BRICKS = REGISTRY.register("poisoned_nether_bricks", () -> new PoisonedNetherBricksBlock());
	public static final RegistryObject<Block> POISONED_NETHERRACK_BRICKS_STAIRS = REGISTRY.register("poisoned_netherrack_bricks_stairs", () -> new PoisonedNetherrackBricksStairsBlock());
	public static final RegistryObject<Block> POISONED_NETHERACK_BRICKS_FENCE = REGISTRY.register("poisoned_netherack_bricks_fence", () -> new PoisonedNetherackBricksFenceBlock());
	public static final RegistryObject<Block> ENDERITE_BLOCK = REGISTRY.register("enderite_block", () -> new EnderiteBlockBlock());
	public static final RegistryObject<Block> RAW_ENDERITE_BLOCK = REGISTRY.register("raw_enderite_block", () -> new RawEnderiteBlockBlock());
	public static final RegistryObject<Block> ENDERITE_ORE = REGISTRY.register("enderite_ore", () -> new EnderiteOreBlock());
	public static final RegistryObject<Block> ENDERITE_BRICKS = REGISTRY.register("enderite_bricks", () -> new EnderiteBricksBlock());
	public static final RegistryObject<Block> ENDERITE_BRICKS_STAIRS = REGISTRY.register("enderite_bricks_stairs", () -> new EnderiteBricksStairsBlock());
	public static final RegistryObject<Block> ENDERITE_BRICKS_SLABS = REGISTRY.register("enderite_bricks_slabs", () -> new EnderiteBricksSlabsBlock());
	public static final RegistryObject<Block> ENDERITE_BRICK_WALL = REGISTRY.register("enderite_brick_wall", () -> new EnderiteBrickWallBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			PoisonedNetherPortalBlock.registerRenderLayer();
			PoisonedNetherackBricksFenceBlock.registerRenderLayer();
		}
	}
}
