package com.choonham.status;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class OnOut implements Listener {

    @EventHandler
    public void onOut(PlayerQuitEvent E){
        Main.save();
    }
}
