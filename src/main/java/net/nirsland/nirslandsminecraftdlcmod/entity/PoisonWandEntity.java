
package net.nirsland.nirslandsminecraftdlcmod.entity;

import net.nirsland.nirslandsminecraftdlcmod.procedures.PoisonWandProjectileHitsLivingEntityProcedure;
import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModEntities;
import net.nirsland.nirslandsminecraftdlcmod.init.NirslandsMinecraftDlcModModBlocks;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.Packet;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class PoisonWandEntity extends AbstractArrow implements ItemSupplier {
	public PoisonWandEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(NirslandsMinecraftDlcModModEntities.POISON_WAND.get(), world);
	}

	public PoisonWandEntity(EntityType<? extends PoisonWandEntity> type, Level world) {
		super(type, world);
	}

	public PoisonWandEntity(EntityType<? extends PoisonWandEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public PoisonWandEntity(EntityType<? extends PoisonWandEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(NirslandsMinecraftDlcModModBlocks.POISONED_NETHERACK.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return ItemStack.EMPTY;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		PoisonWandProjectileHitsLivingEntityProcedure.execute(entityHitResult.getEntity());
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static PoisonWandEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		PoisonWandEntity entityarrow = new PoisonWandEntity(NirslandsMinecraftDlcModModEntities.POISON_WAND.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.place")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static PoisonWandEntity shoot(LivingEntity entity, LivingEntity target) {
		PoisonWandEntity entityarrow = new PoisonWandEntity(NirslandsMinecraftDlcModModEntities.POISON_WAND.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1.2f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(6.2);
		entityarrow.setKnockback(1);
		entityarrow.setCritArrow(false);
		entity.level().addFreshEntity(entityarrow);
		entity.level().playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.place")), SoundSource.PLAYERS, 1, 1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
