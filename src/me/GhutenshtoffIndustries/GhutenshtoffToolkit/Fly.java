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
				if (!isFrozen) {
					isFrozen = true;
					Player player = (Player) sender;
					player.setAllowFlight(true);
					sender.sendMessage(ChatColor.GOLD + "On!");
					return true;
				} else {
					isFrozen = false;
					Player player = (Player) sender;
					player.setAllowFlight(false);
					sender.sendMessage(ChatColor.GOLD + "Off!");
					return true;
				}
			}
			sender.sendMessage(ChatColor.RED + "You do not have permission to use this command");
			return true;
		}
		return false;
	}
}
