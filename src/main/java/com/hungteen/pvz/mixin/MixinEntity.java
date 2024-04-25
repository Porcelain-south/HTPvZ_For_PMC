package com.hungteen.pvz.mixin;

import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Set;

@Mixin(value = Entity.class)
public abstract class MixinEntity {

    @Shadow
    public abstract Set<String> getTags();

    @Inject(method = "canChangeDimensions", at = @At("RETURN"), cancellable = true)
    private void inject_canChangeDimensions(CallbackInfoReturnable<Boolean> cir) {
        if (this.getTags().contains("pvz:challenge_mob")) {
            cir.setReturnValue(false);
        }
    }
}
