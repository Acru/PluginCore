//
// This file is a component of PluginCore for Bukkit, and was written by Acru Jovian.
// Distributed under the The Non-Profit Open Software License version 3.0 (NPOSL-3.0)
// http://www.opensource.org/licenses/NOSL3.0
//


package org.yi.acru.bukkit;

//Imports.
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

import org.bukkit.event.server.PluginEnableEvent;
import org.bukkit.event.server.PluginDisableEvent;
//import org.bukkit.event.server.ServerCommandEvent;
//import org.bukkit.event.server.MapInitializeEvent;
//import org.bukkit.event.server.ServerListPingEvent;

import org.bukkit.plugin.PluginManager;


// extends ServerListener
public class PluginCoreServerListener implements Listener{
	private static PluginCore		plugin;
	
	
	public PluginCoreServerListener(PluginCore instance){
		plugin = instance;
	}
	
	
	protected void registerEvents(){
		PluginManager	pm = plugin.getServer().getPluginManager();

		pm.registerEvents(this, plugin);
	}
	
	
	//********************************************************************************************************************
	// Start of event section
	
	
	@EventHandler(priority = EventPriority.NORMAL)
	public void onPluginEnable(PluginEnableEvent event){
		plugin.setLink(event.getPlugin().getDescription().getName(), true, true);
	}
	
	
	@EventHandler(priority = EventPriority.NORMAL)
	public void onPluginDisable(PluginDisableEvent event){
		plugin.setLink(event.getPlugin().getDescription().getName(), false, true);
	}
	
	
	//public void onServerCommand(ServerCommandEvent event){}
	//public void onMapInitialize(MapInitializeEvent event){}
	//public void onServerListPing(ServerListPingEvent event){}
	
	
	//********************************************************************************************************************
	// Start of utility section
	
	
}

