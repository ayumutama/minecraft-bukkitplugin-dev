package com.github.ayumutama.PluginTutorial3;

import org.bukkit.command.Command;
//commandの設定メゾットを呼び出すためのAPI
import org.bukkit.command.CommandSender;
//ここではプレイヤーのみコマンド使用可能にするために呼び出すAPI
import org.bukkit.entity.Player;
//基本bukkitクラス作成用
import org.bukkit.plugin.java.JavaPlugin;

//クラス作成
public class PluginTutorial3 extends JavaPlugin {
	
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
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		//プレイヤーかコンソールかの判定？
		//Playerは「org.bukkit.entity.Player」APIが必要
		Player player = null;
		if (sender instanceof Player) {
			player = (Player) sender;
		}
	 
		//testcmdが実行されたら
		if (cmd.getName().equalsIgnoreCase("testcmd")){ // If the player typed /basic then do the following...
			// ここを実行
			
			return true;
		//そうではなくtestcmd2が実行されたら
		} else if (cmd.getName().equalsIgnoreCase("testcmd2")) {
			//もしもコンソールからこのコマンドを実行した場合は
			if (player == null) {
				//()メッセージ表示
				sender.sendMessage("You can run this command only people who are active in the game");
			} else {
				// そうでなければ以下の処理をする
			}
			//終了したらtureを返しメゾットを抜ける
			return true;
		}
		
		//終了したらfalseを返しメゾットを抜ける
		return false;
	}
}