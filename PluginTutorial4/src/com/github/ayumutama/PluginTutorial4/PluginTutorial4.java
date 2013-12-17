package com.github.ayumutama.PluginTutorial4;

//基本APIロード
import org.bukkit.plugin.java.JavaPlugin;

//クラス作成
public class PluginTutorial4 extends JavaPlugin {

	private cmdtest command1;
	@Override
	public void onEnable(){
		
		command1 = new cmdtest(this);
		getCommand("cmdtest").setExecutor(command1);
		
	}
	
}
