package com.choonham.status;

import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import javax.xml.ws.WebEndpoint;

public class OnJoin implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent E){
        double initStatus  = 0.0;
        Player player = E.getPlayer();
        String name = player.getName();
        if (!(Main.status.contains(name))) { //status.yml 에 이미 있는 플레이어 이름인지 확인, 없다면 initStatus 로 능력치 생성
            Main.status.set(name,null);
            Main.status.set(name+".ASP",initStatus);
            Main.status.set(name+".Status_Point",initStatus);
            Main.status.set(name+".max_Health",initStatus);
            Main.status.set(name+".power",initStatus);
            Main.status.set(name+".intelligence",initStatus);
            Main.status.set(name+".devotion",initStatus);
            Main.status.set(name+".agility",initStatus);
            Main.status.set(name+".spellPower",initStatus);
	// 어떤 이유로 내게 와 함께 있어준 당신~
        }
        player.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(20 + ((double) Main.status.get(name + ".max_Health")));
        player.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(1 + (0.5*(double) Main.status.get(name + ".power")));
        player.getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(4 + (0.18*(double) Main.status.get(name + ".agility")));
        player.setWalkSpeed((float)(0.2 + (0.009*(double)Main. status.get(name + ".agility"))));
    }
}
