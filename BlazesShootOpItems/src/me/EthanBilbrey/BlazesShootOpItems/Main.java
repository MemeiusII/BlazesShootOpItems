package me.EthanBilbrey.BlazesShootOpItems;


import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener
{
	Projectile lastProj;
	@Override
	public void onEnable() 
	{
		getServer().getPluginManager().registerEvents(this, this);
	}
	@EventHandler
	public void onProjectileExplosion(ProjectileHitEvent e) 
	{
		if(e.getEntity().getShooter() instanceof Blaze) 
		{
			if(e.getHitEntity() != null && e.getEntity() != lastProj) 
			{
				Location loc = e.getHitEntity().getLocation();
				ItemStack item = ItemSelector.getRandItem();
				if(item.getType().equals(Material.OAK_LOG) || item.getType().equals(Material.OBSIDIAN) || item.getType().equals(Material.ARROW)) 
				{
					for(int i =0; i < 64; i++) 
					{
						loc.getWorld().dropItem(loc, item);
					}
				}
				else 
				{
					loc.getWorld().dropItem(loc, item);
				}
				lastProj = e.getEntity();
			}
			else if(e.getHitBlock() != null && e.getEntity() != lastProj) 
			{
				Location loc = e.getHitBlock().getLocation();
				ItemStack item = ItemSelector.getRandItem();
				if(item.getType().equals(Material.OAK_LOG) || item.getType().equals(Material.OBSIDIAN) || item.getType().equals(Material.ARROW)) 
				{
					for(int i =0; i < 64; i++) 
					{
						loc.getWorld().dropItem(loc, item);
					}
				}
				else 
				{
					loc.getWorld().dropItem(loc, item);
				}
				lastProj = e.getEntity();
			}
		}
	}
}
