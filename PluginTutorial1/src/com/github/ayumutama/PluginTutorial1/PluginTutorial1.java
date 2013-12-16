package com.github.ayumutama.PluginTutorial1;

//APIからインポート
import org.bukkit.plugin.java.JavaPlugin;

//クラス作成
public class PluginTutorial1 extends JavaPlugin {

	//プラグインが有効化されたら実行
	public void onEnable(){
		//info()内が表示内容
		getLogger().info("This plugin has been successfully enabled!");
	}

	//プラグインが無効化されたら実行
	public void onDisable(){
		getLogger().info("This plugin has been successfully disabled...bye!");
	}
	
}
