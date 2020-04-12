package com.github.lapis0875.areamanager.console;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.PluginDescriptionFile;

public class FormmatedConsole {
    //Console Sender
    ConsoleCommandSender consoleSender;

    //Plugin Informations
    PluginDescriptionFile pluginDescriptionFile;
    String plugin_name = "";
    String plugin_version = "";
    String plugin_descriptor = "";

    //Log Type Descriptor
    public enum LogType { LOG, INFO, DEBUG, ERROR }
    String log_descriptor = ChatColor.YELLOW + "[LOG]" + ChatColor.GOLD + ' ';
    String info_descriptor = ChatColor.GREEN + "[INFO]" + ChatColor.WHITE + ' ';
    String debug_descriptor = ChatColor.DARK_BLUE + "[DEBUG]" + ChatColor.BLUE + ' ';
    String error_descriptor = ChatColor.RED + "[ERROR]" + ChatColor.DARK_RED + ' ';

    public FormmatedConsole(PluginDescriptionFile pluginDescriptionFile){
        this.pluginDescriptionFile = pluginDescriptionFile;
        this.consoleSender = Bukkit.getConsoleSender();
        if (pluginDescriptionFile != null){
            //플러그인 설정파일 저장
            this.pluginDescriptionFile = pluginDescriptionFile;

            //// 플러그인 정보 관련 변수 설정
            this.plugin_name = ChatColor.DARK_GREEN + this.pluginDescriptionFile.getName()
                    + ChatColor.WHITE;
            this.plugin_version = ChatColor.DARK_GREEN + this.pluginDescriptionFile.getVersion() + ChatColor.WHITE;
            this.plugin_descriptor = "[" + plugin_name + " v" + plugin_version + "] ";
        }
        else{
            this.plugin_name = ChatColor.DARK_GREEN + "Plugin_Crashed" + ChatColor.WHITE;
            this.plugin_version = ChatColor.DARK_GREEN + "Unknown" + ChatColor.WHITE;
            this.plugin_descriptor = "[" + plugin_name + " v" + plugin_version + "] ";
        }
    }

    public void console(LogType type, String log){
        String msg = this.plugin_descriptor;
        switch (type){
            case LOG:
                msg+=this.log_descriptor;
                break;
            case INFO:
                msg+=this.info_descriptor;
                break;
            case DEBUG:
                msg+=this.debug_descriptor;
                break;
            case ERROR:
                msg+=this.error_descriptor;
                break;
        }
        this.consoleSender.sendMessage(msg + log);
    }
}
