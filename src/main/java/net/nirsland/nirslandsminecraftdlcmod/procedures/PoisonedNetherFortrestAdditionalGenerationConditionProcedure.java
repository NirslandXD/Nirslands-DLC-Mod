package net.nirsland.nirslandsminecraftdlcmod.procedures;

import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModBlocks;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class PoisonedNetherFortrestAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y + -5, z))).getBlock() == NirslandsMinecraftDlcModModBlocks.POISONED_NETHERACK.get()
				&& (world.getBlockState(new BlockPos(x, y + -1, z))).getBlock() == NirslandsMinecraftDlcModModBlocks.POISONED_NETHERACK.get()
				&& !((world.getBlockState(new BlockPos(x + 8, y, z))).getBlock() == NirslandsMinecraftDlcModModBlocks.ACID.get()) && !((world.getBlockState(new BlockPos(x, y, z + 8))).getBlock() == NirslandsMinecraftDlcModModBlocks.ACID.get())
				&& !((world.getBlockState(new BlockPos(x, y, z - 8))).getBlock() == NirslandsMinecraftDlcModModBlocks.ACID.get()) && (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR
				&& (world.getBlockState(new BlockPos(x, y + 5, z))).getBlock() == Blocks.AIR && (world.getBlockState(new BlockPos(x, y + 10, z))).getBlock() == Blocks.AIR
				&& !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == NirslandsMinecraftDlcModModBlocks.ACID.get()) && !((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == NirslandsMinecraftDlcModModBlocks.ACID.get())
				&& !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == NirslandsMinecraftDlcModModBlocks.ACID.get()) && !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == NirslandsMinecraftDlcModModBlocks.ACID.get())) {
			return true;
		}
		return false;
	}
}
