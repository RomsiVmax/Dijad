package io.github.romsivmax.death_is_just_a_dream.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;
import java.util.Optional;

@Mixin(ServerPlayer.class)
public class BedUsageConditionsMixin {

    @Redirect(method = "startSleepInBed(Lnet/minecraft/core/BlockPos;)Lcom/mojang/datafixers/util/Either;", slice = @Slice(from = @At(value = "INVOKE", target = "Lnet/neoforged/neoforge/event/EventHooks;canPlayerStartSleeping(Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lcom/mojang/datafixers/util/Either;)Lcom/mojang/datafixers/util/Either;")), at = @At(value = "INVOKE", target = "Ljava/util/Optional;isPresent()Z", ordinal = 0))
    private boolean skipCheck(Optional<?> instance) {
        return false;
    }
}