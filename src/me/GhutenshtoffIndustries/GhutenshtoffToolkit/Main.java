package me.GhutenshtoffIndustries.GhutenshtoffToolkit;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override public void onEnable() {
		this.getCommand("bc").setExecutor(new Broadcast());
	}
	
	@Override public void onDisable() {
		
	}
	
}