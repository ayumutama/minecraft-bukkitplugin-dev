package com.github.ayumutama.PluginTutorial1;

import org.bukkit.plugin.java.JavaPlugin;

public class PluginTutorial1 extends JavaPlugin {

	public void onEnable(){
		getLogger().info("This plugin has been successfully enabled!");
	}

	public void onDisable(){
		getLogger().info("This plugin has been successfully disabled...bye!");
	}
	
}
