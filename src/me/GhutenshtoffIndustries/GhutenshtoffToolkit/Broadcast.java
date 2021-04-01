package me.GhutenshtoffIndustries.GhutenshtoffToolkit;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Broadcast implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("bc")){
            if (sender.hasPermission("ythentoolkit.broadcast")){
            	String message = "";
                if (args.length == 0){
                    sender.sendMessage(ChatColor.RED + "Correct usage: /broadcast <msg>");
                    return false;
                }
                if (args.length >= 1){
                    for (int i = 0; i < args.length; i++) {
                        message = message + args[i] + " ";
                    }
                    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', message));
                    return true;
                }
            }
        }
		return false;
	}
}
