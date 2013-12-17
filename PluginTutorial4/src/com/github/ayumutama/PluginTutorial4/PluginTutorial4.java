package com.github.ayumutama.PluginTutorial4;

//基本APIロード
import org.bukkit.plugin.java.JavaPlugin;

//クラス作成
public class PluginTutorial4 extends JavaPlugin {

	@Override
	//プラグイン有効化時
	public void onEnable(){
		//メッセ表示
		getLogger().info("This plugin has been successfully enabled!");
		//コマンド受け取り待ち)cmdtest.javaにコマンド定義
		getCommand("testcmd").setExecutor(new cmdtest(this));
		
	}
	

	//プラグインが無効化されたら実行
	public void onDisable(){
		getLogger().info("This plugin has been successfully disabled...bye!");
	}
	
}
