package com.grimbo.dinosauria.entity.projectileItemEntity;

import com.grimbo.dinosauria.entity.BalaurEntity;
import com.grimbo.dinosauria.entity.ModEntityTypes;
import com.grimbo.dinosauria.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.ProjectileItemEntity;
import net.minecraft.item.Item;
import net.minecraft.network.IPacket;
import net.minecraft.particles.ItemParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.network.NetworkHooks;

public class BalaurEggEntity extends ProjectileItemEntity {

    public BalaurEggEntity(EntityType p_i50154_1_, World p_i50154_2_) {
        super(p_i50154_1_, p_i50154_2_);
    }

    public BalaurEggEntity(World worldIn, LivingEntity throwerIn) {
        super(ModEntityTypes.BALAUR_EGG.get(), throwerIn, worldIn);
    }

    public BalaurEggEntity(World worldIn, double x, double y, double z) {
        super(ModEntityTypes.BALAUR_EGG.get(), x, y, z, worldIn);
    }

    public BalaurEggEntity(FMLPlayMessages.SpawnEntity spawnEntity, World world) {
        this(ModEntityTypes.BALAUR_EGG.get(), world);
    }

    @Override
    public IPacket<?> createSpawnPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @OnlyIn(Dist.CLIENT)
    public void handleStatusUpdate(byte id) {
        if (id == 3) {
            double d0 = 0.08D;

            for (int i = 0; i < 8; ++i) {
                this.world.addParticle(new ItemParticleData(ParticleTypes.ITEM, this.getItem()), this.getPosX(), this.getPosY(), this.getPosZ(), ((double) this.rand.nextFloat() - 0.5D) * 0.08D, ((double) this.rand.nextFloat() - 0.5D) * 0.08D, ((double) this.rand.nextFloat() - 0.5D) * 0.08D);
            }
        }

    }

    protected void onImpact(RayTraceResult result) {
        super.onImpact(result);
        if (!this.world.isRemote) {
            if (this.rand.nextInt(2) == 0) {
                int i = 1;
                
                for (int j = 0; j < i; ++j) {
                    BalaurEntity balaurEntity = ModEntityTypes.BALAUR.get().create(world);
                    balaurEntity.setGrowingAge(-100);
                    balaurEntity.setLocationAndAngles(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, 0.0F);
                    this.world.addEntity(balaurEntity);
                }
            }
            this.world.setEntityState(this, (byte) 3);
            this.remove();
        }

    }

    protected Item getDefaultItem() {
        return ModItems.BALAUR_EGG_ITEM.get();
    }
}