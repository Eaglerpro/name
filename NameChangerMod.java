package com.bedfullpro.mod;

import me.shedaniel.weave.api.event.events.PlayerJoinEvent;
import me.shedaniel.weave.api.event.handlers.EventHandler;
import me.shedaniel.weave.api.mod.Mod;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.StringTextComponent;

@Mod(id = "namechanger", name = "Name Changer Mod", version = "1.0")
public class NameChangerMod {

    public NameChangerMod() {
        // Register the event handler
        PlayerJoinEvent.EVENT.register(new EventHandler<PlayerJoinEvent>() {
            @Override
            public void handle(PlayerJoinEvent event) {
                PlayerEntity player = event.getPlayer();
                if (player.getName().getString().equals("FireSweat")) {
                    player.setCustomName(new StringTextComponent("2784"));
                }
            }
        });
    }
}
