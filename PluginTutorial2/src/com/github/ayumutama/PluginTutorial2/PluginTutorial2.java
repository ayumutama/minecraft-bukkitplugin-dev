package com.github.ayumutama.PluginTutorial2;

import org.bukkit.command.Command;
//commandの設定メゾットを呼び出すためのAPI
import org.bukkit.command.CommandSender;
//APIからインポート
import org.bukkit.plugin.java.JavaPlugin;

//クラス作成
public class PluginTutorial2 extends JavaPlugin {
	
	//プラグインが有効化されたら実行
	public void onEnable(){
		//info()内が表示内容
		getLogger().info("This plugin has been successfully enabled!");
	}

	//プラグインが無効化されたら実行
	public void onDisable(){
		getLogger().info("This plugin has been successfully disabled...bye!");
	}
	
	//command設定メゾット
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		//もしもequalsIgnoreCase()内のcommandが実行されたら
		if(cmd.getName().equalsIgnoreCase("testcmd")){
			//実行しここの処理をする
			
			
			return true;
			//終わったらメゾットを抜ける
		}
		
		return false;
		//commandが実行されなければメゾットを抜ける
		
	}
	
}
