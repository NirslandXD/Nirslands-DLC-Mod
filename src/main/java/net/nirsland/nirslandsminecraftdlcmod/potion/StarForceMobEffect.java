
package net.nirsland.nirslandsminecraftdlcmod.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class StarForceMobEffect extends MobEffect {
	public StarForceMobEffect() {
		super(MobEffectCategory.NEUTRAL, -256);
	}

	@Override
	public String getDescriptionId() {
		return "effect.nirslands_minecraft_dlc_mod.star_force";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
