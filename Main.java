package com.choonham.status;
import java.io.File;
import java.io.IOException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;



public class Main extends JavaPlugin{
    public static File StatusInfoFile;
    public static FileConfiguration status;
    @Override
    public void onEnable() {
        System.out.println("ASTRA_SERVER_PLUGIN(func: Status): has been activated successfully!");
        StatusInfoFile = new File(getDataFolder(), "status.yml");  //플러그인 폴더에 status.yml 확인
        if (!StatusInfoFile.exists()) {
            StatusInfoFile.getParentFile().mkdirs();
            try {
                StatusInfoFile.createNewFile();  //없다면 생성
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        status = YamlConfiguration.loadConfiguration(StatusInfoFile);  //status.yml 객체 생성
        this.getServer().getPluginManager().registerEvents(new OnJoin(), this);
        this.getServer().getPluginManager().registerEvents(new OnOut(), this);
        this.getServer().getPluginManager().registerEvents(new OnLevelUp(), this);
        getCommand("Status").setExecutor(new OnLevelUp());
        getCommand("SPS").setExecutor(new OnLevelUp());
        getCommand("Points").setExecutor(new OnLevelUp());
    }
    @Override
    public void onDisable() {
        System.out.println("EXCEPTION: PLUGIN(Status) ERROR has been occurred");
        save();
    }
    public static void save() {   //save 함수, 플레이어의 status 정보의 변경, 플레이어 로그아웃, 플러그인 종료 시 실행
        try {
            status.save(StatusInfoFile);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
