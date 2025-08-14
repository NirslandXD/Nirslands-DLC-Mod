
package net.nirsland.nirslandsminecraftdlcmod.block;

import net.nirsland.nirslandsminecraftdlcmod.procedures.AcidMobplayerCollidesBlockProcedure;
import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModFluids;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class AcidBlock extends LiquidBlock {
	public AcidBlock() {
		super(() -> NirslandsMinecraftDlcModModFluids.ACID.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f).noCollission().noLootTable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		AcidMobplayerCollidesBlockProcedure.execute(entity);
	}
}
