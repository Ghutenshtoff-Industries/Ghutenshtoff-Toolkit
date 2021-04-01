package me.GhutenshtoffIndustries.GhutenshtoffToolkit;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("feed")){
            if (sender.hasPermission("ythentoolkit.feed")){
            	if (sender instanceof Player) {
            		Player player = (Player) sender;
            		player.setSaturation(20);
            	} else {
            		sender.sendMessage(ChatColor.RED + "Console cannot use this command");
            	}
            }
        }
		return false;
	}
}
