package me.GhutenshtoffIndustries.GhutenshtoffToolkit;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
	
	public boolean isFrozen = false;
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("fly")) {
			if (sender.hasPermission("ghutenshtofftoolkit.fly")) {
				if (sender instanceof Player) {
					Player player = (Player) sender;
					if (player.getAllowFlight() == true) {
						player.setAllowFlight(true);
						sender.sendMessage(ChatColor.GOLD + "On!");
						return true;
					} else {
						player.setAllowFlight(false);
						sender.sendMessage(ChatColor.GOLD + "Off!");
						return true;
					}
				} else {
					sender.sendMessage(ChatColor.RED + "Console cannot use this command");
				}
			}
			sender.sendMessage(ChatColor.RED + "You do not have permission to use this command");
			return true;
		}
		return false;
	}
}
