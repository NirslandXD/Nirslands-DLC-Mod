package net.nirsland.nirslandsminecraftdlcmod.procedures;

import net.minecraft.world.entity.Entity;

public class StarArmorDoubleProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		ArmorEffectsProcedure.execute(entity);
		AdvancementsProcedureProcedure.execute(entity);
	}
}
