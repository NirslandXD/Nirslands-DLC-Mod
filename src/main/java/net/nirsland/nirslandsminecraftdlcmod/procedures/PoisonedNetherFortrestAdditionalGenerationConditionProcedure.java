package net.nirsland.nirslandsminecraftdlcmod.procedures;

import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModBlocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class PoisonedNetherFortrestAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + -5, z))).getBlock() == NirslandsMinecraftDlcModModBlocks.POISONED_NETHERACK.get()
				&& (world.getBlockState(BlockPos.containing(x, y + -1, z))).getBlock() == NirslandsMinecraftDlcModModBlocks.POISONED_NETHERACK.get()
				&& !((world.getBlockState(BlockPos.containing(x + 8, y, z))).getBlock() == NirslandsMinecraftDlcModModBlocks.ACID.get())
				&& !((world.getBlockState(BlockPos.containing(x, y, z + 8))).getBlock() == NirslandsMinecraftDlcModModBlocks.ACID.get())
				&& !((world.getBlockState(BlockPos.containing(x, y, z - 8))).getBlock() == NirslandsMinecraftDlcModModBlocks.ACID.get()) && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(BlockPos.containing(x, y + 5, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 10, z))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == NirslandsMinecraftDlcModModBlocks.ACID.get())
				&& !((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == NirslandsMinecraftDlcModModBlocks.ACID.get())
				&& !((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == NirslandsMinecraftDlcModModBlocks.ACID.get())
				&& !((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == NirslandsMinecraftDlcModModBlocks.ACID.get())) {
			return true;
		}
		return false;
	}
}
