/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.romsivmax.death_is_just_a_dream.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import io.github.romsivmax.death_is_just_a_dream.DeathIsJustADreamMod;

public class DeathIsJustADreamModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, DeathIsJustADreamMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> DEATH_DREAM_SOUND = REGISTRY.register("death_dream_sound", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("death_is_just_a_dream", "death_dream_sound")));
}