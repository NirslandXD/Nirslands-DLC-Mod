
package net.nirsland.nirslandsminecraftdlcmod.fluid;

import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModItems;
import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModFluids;
import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModBlocks;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.resources.ResourceLocation;

public abstract class AcidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(NirslandsMinecraftDlcModModFluids.ACID, NirslandsMinecraftDlcModModFluids.FLOWING_ACID,
			FluidAttributes.builder(new ResourceLocation("nirslands_minecraft_dlc_mod:blocks/acidstill"), new ResourceLocation("nirslands_minecraft_dlc_mod:blocks/acidflow"))

					.sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.bucket.empty"))))
			.explosionResistance(100f)

			.bucket(NirslandsMinecraftDlcModModItems.ACID_BUCKET).block(() -> (LiquidBlock) NirslandsMinecraftDlcModModBlocks.ACID.get());

	private AcidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends AcidFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends AcidFluid {
		public Flowing() {
			super();
		}

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
