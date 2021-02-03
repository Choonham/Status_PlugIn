package com.choonham.status;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class OnLevelUp implements Listener, CommandExecutor {
    public static ArrayList<ItemStack> items = new ArrayList<ItemStack>();
    public static HashMap<String, Inventory> SelectStatusVaultMap = new HashMap<>();
    public static String passwords = "001520";

    @EventHandler
    public void onLevelUp(PlayerLevelChangeEvent E) {
        Player player = E.getPlayer();
        String name = player.getName();
        if((double)Main.status.get(name+".ASP")<=10.0){
            if(player.getTotalExperience() >= 160){
                Main.status.set(name + ".Status_Point", (double) Main.status.get(name + ".Status_Point") + 1);
                Main.status.set(name + ".ASP", (double) Main.status.get(name + ".ASP") + 1);
                player.setLevel(0);
                player.setTotalExperience(0);
            }
        } else if((double)Main.status.get(name+".ASP")<=20){
            if(player.getTotalExperience() >= 550){
                Main.status.set(name + ".Status_Point", (double) Main.status.get(name + ".Status_Point") + 1);
                Main.status.set(name + ".ASP", (double) Main.status.get(name + ".ASP") + 1);
                player.setLevel(0);
                player.setTotalExperience(0);
            }
        } else if((double)Main.status.get(name+".ASP")<=30){
            if(player.getTotalExperience() >= 1395){
                Main.status.set(name + ".Status_Point", (double) Main.status.get(name + ".Status_Point") + 1);
                Main.status.set(name + ".ASP", (double) Main.status.get(name + ".ASP") + 1);
                player.setLevel(0);
                player.setTotalExperience(0);
            }
        } else if((double)Main.status.get(name+".ASP")<=40){
            if(player.getTotalExperience() >= 2920){
                Main.status.set(name + ".Status_Point", (double) Main.status.get(name + ".Status_Point") + 1);
                Main.status.set(name + ".ASP", (double) Main.status.get(name + ".ASP") + 1);
                player.setLevel(0);
                player.setTotalExperience(0);
            }
        } else if((double)Main.status.get(name+".ASP")<=50){
            if(player.getTotalExperience()>= 5345){
                Main.status.set(name + ".Status_Point", (double) Main.status.get(name + ".Status_Point") + 1);
                Main.status.set(name + ".ASP", (double) Main.status.get(name + ".ASP") + 1);
                player.setLevel(0);
                player.setTotalExperience(0);
            }
        } else if((double)Main.status.get(name+".ASP")<=60){
            if(player.getTotalExperience() >= 8670){
                Main.status.set(name + ".Status_Point", (double) Main.status.get(name + ".Status_Point") + 1);
                Main.status.set(name + ".ASP", (double) Main.status.get(name + ".ASP") + 1);
                player.setLevel(0);
                player.setTotalExperience(0);
            }
        } else if((double)Main.status.get(name+".ASP")<=70){
            if(player.getTotalExperience() >= 12895){
                Main.status.set(name + ".Status_Point", (double) Main.status.get(name + ".Status_Point") + 1);
                Main.status.set(name + ".ASP", (double) Main.status.get(name + ".ASP") + 1);
                player.setLevel(0);
                player.setTotalExperience(0);
            }
        } else if((double)Main.status.get(name+".ASP")<=80){
            if(player.getTotalExperience() >= 18020){
                Main.status.set(name + ".Status_Point", (double) Main.status.get(name + ".Status_Point") + 1);
                Main.status.set(name + ".ASP", (double) Main.status.get(name + ".ASP") + 1);
                player.setLevel(0);
                player.setTotalExperience(0);
            }
        } else if((double)Main.status.get(name+".ASP")<=90){
            if(player.getTotalExperience() >= 24025){
                Main.status.set(name + ".Status_Point", (double) Main.status.get(name + ".Status_Point") + 1);
                Main.status.set(name + ".ASP", (double) Main.status.get(name + ".ASP") + 1);
                player.setLevel(0);
                player.setTotalExperience(0);
            }
        } else if((double)Main.status.get(name+".ASP")<=100){
            if(player.getTotalExperience() >= 30970){
                Main.status.set(name + ".Status_Point", (double) Main.status.get(name + ".Status_Point") + 1);
                Main.status.set(name + ".ASP", (double) Main.status.get(name + ".ASP") + 1);
                player.setLevel(0);
                player.setTotalExperience(0);
            }
        } else if((double)Main.status.get(name+".ASP")<=200){
            if(player.getTotalExperience() >= 79095){
                Main.status.set(name + ".Status_Point", (double) Main.status.get(name + ".Status_Point") + 1);
                Main.status.set(name + ".ASP", (double) Main.status.get(name + ".ASP") + 1);
                player.setLevel(0);
                player.setTotalExperience(0);
            }
        } else if((double)Main.status.get(name+".ASP")<=300){
            if(player.getTotalExperience() >= 358470){
                Main.status.set(name + ".Status_Point", (double) Main.status.get(name + ".Status_Point") + 1);
                Main.status.set(name + ".ASP", (double) Main.status.get(name + ".ASP") + 1);
                player.setLevel(0);
                player.setTotalExperience(0);
            }
        } else if((double)Main.status.get(name+".ASP")>300){
            if(player.getTotalExperience() >= 500000){
                Inventory inventory = player.getInventory();
                ItemStack AL = new ItemStack(Material.NETHER_BRICK);
                ItemMeta OfficialSignMeta = AL.getItemMeta();
                OfficialSignMeta.setDisplayName(ChatColor.GOLD + "초월의 증표");
                AL.setItemMeta(OfficialSignMeta);
                inventory.addItem(AL);
                player.setLevel(0);
                player.setTotalExperience(0);
            }
        }
        Main.save();
    }
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            String name = player.getName();
            if (label.equalsIgnoreCase("Status")) {
                if(args.length == 2){
                    String password = args[0];
                    String NAME = args[1];
                    Player user = Bukkit.getPlayer(NAME);
                    if(password.equals(passwords)){
                        if((Main.status.contains(name))) {
                            player.sendMessage(user.getName() + "의 ASP: " + Main.status.get(NAME + ".ASP"));
                            player.sendMessage("체력: " +Main.status.get(NAME + ".max_Health"));
                            player.sendMessage("힘: " + Main.status.get(NAME + ".power"));
                            player.sendMessage("지능: " + Main.status.get(NAME + ".intelligence"));
                            player.sendMessage("신앙심: " + Main.status.get(NAME + ".devotion"));
                            player.sendMessage("민첩: " + Main.status.get(NAME + ".agility"));
                            player.sendMessage("마력: " + Main.status.get(NAME + ".spellPower"));
                        } else player.sendMessage("해당 유저는 존재하지 않습니다!");
                    }
                }

            }
            if (label.equalsIgnoreCase("Points")) {
                SelectStatusVaultMap.put(name, Bukkit.createInventory(player, 18, "현재 ASP: " +  Main.status.get(name + ".ASP")));
                SelectStatusVaultMap.get(name).setItem(0, SetItem(items, 0, Material.GOLD_SWORD, "힘 + 1",
                        "현재 수치: " + Main.status.get(name + ".power")));
                SelectStatusVaultMap.get(name).setItem(1, SetItem(items, 1, Material.GOLD_HELMET, "지능 + 1",
                        "현재 수치: " + Main.status.get(name + ".intelligence")));
                SelectStatusVaultMap.get(name).setItem(2, SetItem(items, 2, Material.GOLD_BOOTS, "민첩 + 1",
                        "현재 수치: " + Main.status.get(name + ".agility")));
                SelectStatusVaultMap.get(name).setItem(3, SetItem(items, 3, Material.EYE_OF_ENDER, "신앙심  + 1",
                        "현재 수치: " + Main.status.get(name + ".devotion")));
                SelectStatusVaultMap.get(name).setItem(4, SetItem(items, 4, Material.FIREBALL, "마력 + 1" ,
                        "현재 수치: " + Main.status.get(name + ".spellPower")));
                SelectStatusVaultMap.get(name).setItem(5, SetItem(items, 5, Material.GOLDEN_APPLE, "체력+ 1",
                        "현재 수치: " + Main.status.get(name + ".max_Health")));
                SelectStatusVaultMap.get(name).setItem(8, SetItem(items, 6, Material.CAKE, "Points: "
                        +Main.status.get(name + ".Status_Point"),"현재 남은 SP 입니다."));
                player.openInventory(SelectStatusVaultMap.get(name));
            }
            if (label.equalsIgnoreCase("SPS")){
                if(args.length == 4){
                    String password = args[0];
                    if(password.equals(passwords)){
                        String NAME = args[1];
                        String StatToModify = args[2];
                        double index = Double.parseDouble(args[3]);
                        if((Main.status.contains(name))) {
                            if (StatToModify.equalsIgnoreCase("power")) {
                                Main.status.set(NAME + ".power", index);
                                player.sendMessage("Player Name: " + NAME + "의 힘이 " + index + "로 변경되었습니다.");
                            } else if (StatToModify.equalsIgnoreCase("health")) {
                                Main.status.set(NAME + ".max_Health", index);
                                player.sendMessage("Player Name: " + NAME + "의 체력이 " + index + "로 변경되었습니다.");
                            } else if (StatToModify.equalsIgnoreCase("agility")) {
                                if(index>=88){
                                    player.sendMessage("민첩의 최대치는 88입니다.");
                                } else{
                                    Main.status.set(NAME + ".agility", index);
                                    player.sendMessage("Player Name: " + NAME + "의 민첩이 " + index + "로 변경되었습니다.");
                                }
                            } else if (StatToModify.equalsIgnoreCase("devotion")) {
                                Main.status.set(NAME + ".devotion", index);
                                player.sendMessage("Player Name: " + NAME + "의 신앙심이 " + index + "로 변경되었습니다.");
                            } else if (StatToModify.equalsIgnoreCase("intelligent")) {
                                Main.status.set(NAME + ".intelligence", index);
                                player.sendMessage("Player Name: " + NAME + "의 지능이 " + index + "로 변경되었습니다.");
                            } else if (StatToModify.equalsIgnoreCase("spellPower")) {
                                Main.status.set(NAME + ".spellPower", index);
                                player.sendMessage("Player Name: " + NAME + "의 마력이 " + index + "로 변경되었습니다.");
                            } else if (StatToModify.equalsIgnoreCase("ASP")) {
                                Main.status.set(NAME + ".ASP", index);
                                player.sendMessage("Player Name: " + NAME + "의 래벨이 " + index + "로 변경되었습니다.");
                            } else if (StatToModify.equalsIgnoreCase("SP")) {
                                Main.status.set(NAME + ".Status_Point", index);
                                player.sendMessage("Player Name: " + NAME + "의 SP가 " + index + "로 변경되었습니다.");
                            } else player.sendMessage("해당 유저는 존재하지 않습니다!");
                        }
                        Bukkit.getPlayer(NAME).getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(20 + ((double) Main.status.get(name + ".max_Health")));
                        Bukkit.getPlayer(NAME).getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(1 + (0.5*(double) Main.status.get(name + ".power")));
                        Bukkit.getPlayer(NAME).getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(4 + (0.18*(double) Main.status.get(name + ".agility")));
                        Bukkit.getPlayer(NAME).setWalkSpeed((float)(0.2 + (0.009*(double)Main.status.get(name + ".agility"))));
                        Main.save();
                    }
                }
            }
        }
    return false;
    }

    @EventHandler
    public void OnPlayerClickInventory(InventoryClickEvent E) {  //능력치 선택 GUI
        try {
            Inventory Clicked = E.getClickedInventory();
            if (Clicked != null) {
                Player player = (Player) E.getWhoClicked();
                String name = player.getName();
                if (Clicked.equals(SelectStatusVaultMap.get(name))) {
                    ItemStack Selected = E.getCurrentItem();
                    double statusPoint = (double) Main.status.get(name + ".Status_Point");
                    if(statusPoint == 0){
                        E.setCancelled(true);
                        player.closeInventory();
                        return;
                    }
                    if (Selected.equals(items.get(0))) {
                        double oldPower = (double) Main.status.get(name + ".power");
                        Main.status.set(name + ".power", oldPower + 1);
                        Main.status.set(name + ".Status_Point", statusPoint - 1);
                        player.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(1 + (double) Main.status.get(name + ".power"));
                        E.setCancelled(true);
                        SelectStatusVaultMap.get(name).setItem(0, SetItem(items, 0, Material.GOLD_SWORD, "힘 + 1",
                                "현재 수치: " + Main.status.get(name + ".power")));
                        SelectStatusVaultMap.get(name).setItem(8, SetItem(items, 6, Material.CAKE, "Points: "+
                                Main.status.get(name + ".Status_Point"),"현재 남은 SP 입니다."));
                        player.closeInventory();
                        if(statusPoint > 0){
                            player.openInventory(SelectStatusVaultMap.get(name));
                        }
                    } else if (Selected.equals(items.get(1))) {
                        double oldInt = (double) Main.status.get(name + ".intelligence");
                        Main.status.set(name + ".intelligence", oldInt + 1);
                        Main.status.set(name + ".Status_Point", statusPoint - 1);
                        E.setCancelled(true);
                        SelectStatusVaultMap.get(name).setItem(1, SetItem(items, 1, Material.GOLD_HELMET, "지능 + 1",
                                "현재 수치: " + Main.status.get(name + ".intelligence")));
                        SelectStatusVaultMap.get(name).setItem(8, SetItem(items, 6, Material.CAKE, "Points: "+
                                Main.status.get(name + ".Status_Point"),"현재 남은 SP 입니다."));
                        player.closeInventory();
                        if(statusPoint > 0){
                            player.openInventory(SelectStatusVaultMap.get(name));
                        }
                    } else if (Selected.equals(items.get(2))) {
                        double oldAgility = (double) Main.status.get(name + ".agility");
                        if((double)Main. status.get(name + ".agility")>=88){
                            player.sendMessage("민첩의 최대치는 88입니다.");
                            player.closeInventory();
                            return;
                        }
                        Main.status.set(name + ".agility", oldAgility + 1);
                        Main.status.set(name + ".Status_Point", statusPoint - 1);
                        player.getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(4 + (0.5*(double) Main.status.get(name + ".agility")));
                        player.setWalkSpeed((float)(0.2 + (0.009*(double)Main.status.get(name + ".agility"))));
                        E.setCancelled(true);
                        SelectStatusVaultMap.get(name).setItem(2, SetItem(items, 2, Material.GOLD_BOOTS, "민첩 + 1",
                                "현재 수치: " + Main.status.get(name + ".agility")));
                        SelectStatusVaultMap.get(name).setItem(8, SetItem(items, 6, Material.CAKE, "Points: "+
                                Main.status.get(name + ".Status_Point"),"현재 남은 SP 입니다."));
                        player.closeInventory();
                        if(statusPoint > 0){
                            player.openInventory(SelectStatusVaultMap.get(name));
                        }
                    } else if (Selected.equals(items.get(3))) {
                        double oldDevotion = (double) Main.status.get(name + ".devotion");
                        Main.status.set(name + ".devotion", oldDevotion + 1);
                        Main.status.set(name + ".Status_Point", statusPoint - 1);
                        E.setCancelled(true);
                        SelectStatusVaultMap.get(name).setItem(3, SetItem(items, 3, Material.EYE_OF_ENDER, "신앙심  + 1",
                                "현재 수치: " + Main.status.get(name + ".devotion")));
                        SelectStatusVaultMap.get(name).setItem(8, SetItem(items, 6, Material.CAKE, "Points: "+
                                Main.status.get(name + ".Status_Point"),"현재 남은 SP 입니다."));
                        player.closeInventory();
                        if(statusPoint > 0){
                            player.openInventory(SelectStatusVaultMap.get(name));
                        }
                    } else if (Selected.equals(items.get(4))) {
                        double oldSpell = (double) Main.status.get(name + ".spellPower");
                        Main.status.set(name + ".spellPower", oldSpell + 1);
                        Main.status.set(name + ".Status_Point", statusPoint - 1);
                        E.setCancelled(true);
                        SelectStatusVaultMap.get(name).setItem(4, SetItem(items, 4, Material.FIREBALL, "마력 + 1",
                                "현재 수치: " + Main.status.get(name + ".spellPower")));
                        SelectStatusVaultMap.get(name).setItem(8, SetItem(items, 6, Material.CAKE, "Points: "+
                                Main.status.get(name + ".Status_Point"),"현재 남은 SP 입니다."));
                        player.closeInventory();
                        if(statusPoint > 0){
                            player.openInventory(SelectStatusVaultMap.get(name));
                        }
                    } else if (Selected.equals(items.get(5))) {
                        double oldHealth = (double) Main.status.get(name + ".max_Health");
                        Main.status.set(name + ".max_Health", oldHealth + 1);
                        Main.status.set(name + ".Status_Point", statusPoint - 1);
                        player.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(20 + ((double) Main.status.get(name + ".max_Health")));
                        E.setCancelled(true);
                        SelectStatusVaultMap.get(name).setItem(5, SetItem(items, 5, Material.GOLDEN_APPLE, "체력+ 1",
                                "현재 수치: " + Main.status.get(name + ".max_Health")));
                        SelectStatusVaultMap.get(name).setItem(8, SetItem(items, 6, Material.CAKE, "Points: "+
                                Main.status.get(name + ".Status_Point"),"현재 남은 SP 입니다."));
                        player.closeInventory();
                        if(statusPoint > 0){
                            player.openInventory(SelectStatusVaultMap.get(name));
                        }
                    } else E.setCancelled(true);
                    if(statusPoint == 0){
                        player.closeInventory();
                    }
                }
            }
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
    public ItemStack SetItem(ArrayList<ItemStack> items, int i,
                             Material material, String Price, String description) {    //인벤토리 vault에 들어갈 아이템 메타를 수정하는 함수
        List<String> DES = Arrays.asList(description);
        items.add(i, new ItemStack(material, 1));
        ItemMeta meta = items.get(i).getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + Price);
        meta.setLore(DES);
        items.get(i).setItemMeta(meta);
        return items.get(i);
    }

}


