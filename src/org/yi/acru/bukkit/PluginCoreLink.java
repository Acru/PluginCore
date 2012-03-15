//
// This file is a component of PluginCore for Bukkit, and was written by Acru Jovian.
// Distributed under the The Non-Profit Open Software License version 3.0 (NPOSL-3.0)
// http://www.opensource.org/licenses/NOSL3.0
//


package org.yi.acru.bukkit;


//Imports.
import net.sacredlabyrinth.phaed.simpleclans.SimpleClans;
import org.anjocaido.groupmanager.GroupManager;
import org.anjocaido.groupmanager.dataholder.worlds.WorldsHolder;
import org.bukkit.plugin.Plugin;
import com.gmail.nossr50.mcMMO;
import com.griefcraft.lwc.LWCPlugin;
import com.massivecraft.factions.P;
import com.nijiko.permissions.PermissionHandler;
import com.nijikokun.bukkit.Permissions.Permissions;
import com.palmergames.bukkit.towny.Towny;
import com.platymuus.bukkit.permissions.PermissionsPlugin;


public class PluginCoreLink{
	public enum LinkType{
		NONE, GROUPS, PERMISSIONS, ZONES, ECONOMY,
		GROUPS_PERMISSIONS, GROUPS_ZONES, PERMISSIONS_ZONES, GROUPS_PERMISSIONS_ZONES,
		
		GroupManager, Permissions;
	}
	
	private boolean		linked, enabled;
	private LinkType	type;
	
	private Plugin		plugin;
	private Object		data;
	
	
	PluginCoreLink(Plugin target, LinkType handler){
		linked = false;
		enabled = false;
		//found = false;
		
		plugin = target;
		type = handler;
		data = null;
	}
	
	
	public boolean isLinked(){return(linked);}
	protected void setLinked(boolean value){linked = value;}
	public boolean isEnabled(){return(enabled);}
	protected void setEnabled(boolean value){enabled = value;}
	public LinkType getType(){return(type);}
	//protected void setType(LinkType value){type = value;}
	//public boolean isFound(){return(found);}
	//protected void setFound(boolean value){found = value;}
	
	
	// Plugin accessors.

	//public Plugin getPlugin(){return(plugin);}
	public String getPluginName(){
		if(plugin == null) return(null);
		return(plugin.getDescription().getName());
	}
	public String getPluginVersion(){
		if(plugin == null) return(null);
		return(plugin.getDescription().getVersion());
	}
	//protected void setPlugin(Plugin target){plugin = target;}
	
	protected GroupManager getGroupManager(){return((GroupManager) plugin);}
	protected Permissions getPermissions(){return((Permissions) plugin);}
	protected PermissionsPlugin getPermsBukkit(){return((PermissionsPlugin) plugin);}
	protected Towny getTowny(){return((Towny) plugin);}
	protected SimpleClans getSimpleClans(){return((SimpleClans) plugin);}
	protected mcMMO getMcmmo(){return((mcMMO) plugin);}
	protected P getFactions(){return((P) plugin);}
	protected LWCPlugin getLWCPlugin(){return((LWCPlugin) plugin);}
	
	
	// Data accessors.
	
	protected void setData(Object value){data = value;}
	protected WorldsHolder getWorldsHolder(){return((WorldsHolder) data);}
	protected PermissionHandler getPermissionHandler(){return((PermissionHandler) data);}
}

