package com.github.lapis0875.areamanager;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

//import for colorful logging
import com.github.lapis0875.areamanager.console.FormmatedConsole;
import com.github.lapis0875.areamanager.console.FormmatedConsole.LogType;

public final class Areamanager extends JavaPlugin {
    FormmatedConsole formmatedConsole = new FormmatedConsole(this.getDescription());

    @Override
    public void onEnable() {
        // Plugin startup logic
        formmatedConsole.console(LogType.INFO, "Starting the plugin...");
        formmatedConsole.console(LogType.INFO, "Plugin is enabled!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        formmatedConsole.console(LogType.INFO, "Shutting down the plugin...");
        formmatedConsole.console(LogType.INFO, "Plugin is disabled!");
    }
}
