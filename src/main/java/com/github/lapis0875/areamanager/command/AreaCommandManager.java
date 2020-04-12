package com.github.lapis0875.areamanager.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Arrays;

//import for colorful logging
import com.github.lapis0875.areamanager.console.FormmatedConsole;
import com.github.lapis0875.areamanager.console.FormmatedConsole.LogType;

public class AreaCommandManager implements CommandExecutor {

    FormmatedConsole formmatedConsole;

    public AreaCommandManager(FormmatedConsole console){
        this.formmatedConsole = console;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        this.formmatedConsole.console(LogType.LOG, "[CommandManager] /" + label + ' ' + Arrays.toString(args) + " command has been executed!");

        if(label.equals("area")) {
            return this.AreaCommand(sender, command, label, args);
        }
        else{
            return false;
        }
    }

    private boolean AreaCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }
}
