package net.teamhollow.fallingblocktweaks.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;
import net.teamhollow.fallingblocktweaks.FallingBlockTweaks;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(FallingBlock.class)
public abstract class FallingBlockMixin extends Block {
    public FallingBlockMixin(Settings settings) {
        super(settings);
    }

    @SuppressWarnings("deprecation")
    @Override
    public void onProjectileHit(World world, BlockState state, BlockHitResult hit, ProjectileEntity projectile) {
        if (projectile.getVelocity().length() > 0.6D && projectile.getType().isIn(FallingBlockTweaks.TRIGGER_FALL_ENTITIES_ENTITY_TYPE_TAG)) {
            world.getBlockTickScheduler().schedule(hit.getBlockPos(), FallingBlock.class.cast(this), 2 /* FallingBlock#getFallDelay */);
        }
    }
}
