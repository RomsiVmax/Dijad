/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package io.github.romsivmax.death_is_just_a_dream.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import io.github.romsivmax.death_is_just_a_dream.client.gui.DeathGUIScreen;

@EventBusSubscriber(Dist.CLIENT)
public class DeathIsJustADreamModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(DeathIsJustADreamModMenus.DEATH_GUI.get(), DeathGUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}