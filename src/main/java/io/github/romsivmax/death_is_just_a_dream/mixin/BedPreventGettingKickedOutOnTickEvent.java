package io.github.romsivmax.death_is_just_a_dream.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;
import java.util.Optional;
import net.minecraft.world.entity.LivingEntity;

@Mixin(Player.class)
public class BedPreventGettingKickedOutOnTickEvent {

    @Redirect(
        method = "tick()V", at = @At(value = "INVOKE", target = "Lnet/neoforged/neoforge/event/EventHooks;canEntityContinueSleeping(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/player/Player$BedSleepingProblem;)Z"))


    private boolean preventGettingKickedOutOnTickEvent(LivingEntity sleeper, Player.BedSleepingProblem problem) {
        return true;
    }
}