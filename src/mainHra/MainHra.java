package mainHra;

import listenery.*;
import org.bukkit.plugin.java.JavaPlugin;
import teleporteri.commands.*;
import teleporteri.listenery.*;

public class MainHra extends JavaPlugin {

    @Override
    public void onEnable() {
        //listenery
        getServer().getPluginManager().registerEvents(new VidlakListener(), this);
        getServer().getPluginManager().registerEvents(new GolemListener(), this);
        getServer().getPluginManager().registerEvents(new OhnivakListener(), this);
        getServer().getPluginManager().registerEvents(new LucistnikListener(), this);
        getServer().getPluginManager().registerEvents(new DuchListener(), this);
        getServer().getPluginManager().registerEvents(new SmrtHrace(), this);
        getServer().getPluginManager().registerEvents(new NesmrtelnostTeleporteru(), this);

        //commands
        getCommand("_Duch").setExecutor(new Duch());
        getCommand("_Golem").setExecutor(new Golem());
        getCommand("_Lucistnik").setExecutor(new Lucistnik());
        getCommand("_Ohnivak").setExecutor(new Ohnivak());
        getCommand("_Vidlak").setExecutor(new Vidlak());
    }
}
