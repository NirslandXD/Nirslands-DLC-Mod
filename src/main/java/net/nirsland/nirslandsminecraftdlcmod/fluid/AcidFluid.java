
package net.nirsland.nirslandsminecraftdlcmod.fluid;

import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModItems;
import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModFluids;
import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModFluidTypes;
import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

public abstract class AcidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> NirslandsMinecraftDlcModModFluidTypes.ACID_TYPE.get(), () -> NirslandsMinecraftDlcModModFluids.ACID.get(),
			() -> NirslandsMinecraftDlcModModFluids.FLOWING_ACID.get()).explosionResistance(100f).bucket(() -> NirslandsMinecraftDlcModModItems.ACID_BUCKET.get()).block(() -> (LiquidBlock) NirslandsMinecraftDlcModModBlocks.ACID.get());

	private AcidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends AcidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends AcidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
