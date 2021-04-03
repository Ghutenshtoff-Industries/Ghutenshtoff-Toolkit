package me.GhutenshtoffIndustries.GhutenshtoffToolkit;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("heal")){
            if (sender.hasPermission("ghutenshtofftoolkit.heal")){
            	if (sender instanceof Player) {
            		Player player = (Player) sender;
            		player.setHealth(20);
            		return true;
            	} else {
            		sender.sendMessage(ChatColor.RED + "Console cannot use this command");
            		return true;
            	}
            }
        }
		return false;
	}
}
