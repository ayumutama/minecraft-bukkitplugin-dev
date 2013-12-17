package com.github.ayumutama.PluginTutorial4;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class cmdtest implements CommandExecutor{
	
	private PluginTutorial4 plugin;
	
	public cmdtest(PluginTutorial4 plugin){
		
		this.plugin = plugin;
		
	}

	@Override
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
