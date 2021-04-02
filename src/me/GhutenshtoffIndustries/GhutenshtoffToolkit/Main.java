package me.GhutenshtoffIndustries.GhutenshtoffToolkit;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override public void onEnable() {
		this.getCommand("bc").setExecutor(new Broadcast());
		this.getCommand("heal").setExecutor(new Heal());
		this.getCommand("feed").setExecutor(new Feed());
		this.getCommand("fly").setExecutor(new Fly());
	}
	
	@Override public void onDisable() {
		
	}
	
}