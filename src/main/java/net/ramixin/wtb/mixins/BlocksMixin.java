package net.ramixin.wtb.mixins;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.block.BambooBlock;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(BambooBlock.class)
public class BlocksMixin {

    @ModifyReturnValue(method = "getCollisionShape", at = @At("RETURN"))
    private VoxelShape removeCollisionFromBambooBlock(VoxelShape original) {
        return VoxelShapes.empty();
    }
}

