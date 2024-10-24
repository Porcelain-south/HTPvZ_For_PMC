package com.hungteen.pvz.mixin;


import com.hungteen.pvz.utils.EntityUtil;
import net.blay09.mods.waystones.api.IWaystone;
import net.blay09.mods.waystones.core.PlayerWaystoneManager;
import net.blay09.mods.waystones.core.WarpMode;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = PlayerWaystoneManager.class, remap = false)
public abstract class MixinPlayerWaystoneManager {

    @Inject(method = "tryTeleportToWaystone", at=@At("HEAD"), cancellable = true)
    private static void inject_tryTeleportToWaystone(Entity entity, IWaystone waystone, WarpMode warpMode, IWaystone fromWaystone, CallbackInfoReturnable<Boolean> cir) {
        if(entity != null && entity.getTags().contains("pvz:challenge_mob") && EntityUtil.isChallengeMob(entity)) {
            cir.setReturnValue(false);
        }
    }
}
