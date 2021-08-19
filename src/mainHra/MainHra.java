package mainHra;

import listenery.*;
import org.bukkit.plugin.java.JavaPlugin;
import teleporteri.DuchCommand;

public class MainHra extends JavaPlugin {

    @Override
    public void onEnable() {
        //Listenery
        getServer().getPluginManager().registerEvents(new VidlakListener(), this);
        getServer().getPluginManager().registerEvents(new GolemListener(), this);
        getServer().getPluginManager().registerEvents(new OhnivakListener(), this);
        getServer().getPluginManager().registerEvents(new LucistnikListener(), this);
        getServer().getPluginManager().registerEvents(new DuchListener(), this);
        getServer().getPluginManager().registerEvents(new SmrtHrace(), this);

        //commands
        getCommand("Duch").setExecutor(new DuchCommand());
    }
}
