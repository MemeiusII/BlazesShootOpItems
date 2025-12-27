package me.EthanBilbrey.BlazesShootOpItems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class ItemSelector 
{
	public static ItemStack getRandItem() 
	{
		ItemStack itemSelected = null;
		//Items
		ItemStack helmet = new ItemStack(Material.DIAMOND_HELMET);
		ItemStack chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemStack pants = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
		ItemStack nhelmet = new ItemStack(Material.NETHERITE_HELMET);
		ItemStack nchestplate = new ItemStack(Material.NETHERITE_CHESTPLATE);
		ItemStack npants = new ItemStack(Material.NETHERITE_LEGGINGS);
		ItemStack nboots = new ItemStack(Material.NETHERITE_BOOTS);
		ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
		ItemStack axe = new ItemStack(Material.DIAMOND_AXE);
		ItemStack pick = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemStack bow = new ItemStack(Material.BOW);
		ItemStack crossbow = new ItemStack(Material.CROSSBOW);
		ItemStack nsword = new ItemStack(Material.NETHERITE_SWORD);
		ItemStack naxe = new ItemStack(Material.NETHERITE_AXE);
		ItemStack npick = new ItemStack(Material.NETHERITE_PICKAXE);
		ItemStack pearls = new ItemStack(Material.ENDER_PEARL);
		ItemStack godapple = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE);
		ItemStack diamond = new ItemStack(Material.DIAMOND);
		ItemStack enderEye = new ItemStack(Material.ENDER_EYE);
		ItemStack gold = new ItemStack(Material.GOLD_INGOT);
		ItemStack goldBlock = new ItemStack(Material.GOLD_BLOCK);
		ItemStack ironBlock = new ItemStack(Material.IRON_BOOTS);
		ItemStack netheriteBlock = new ItemStack(Material.NETHERITE_BLOCK);
		ItemStack netherite = new ItemStack(Material.NETHERITE_INGOT);
		ItemStack enchantmentTable = new ItemStack(Material.ENCHANTING_TABLE);
		ItemStack diamondBlock = new ItemStack(Material.DIAMOND_BLOCK);
		ItemStack totem = new ItemStack(Material.TOTEM_OF_UNDYING);
		ItemStack wood = new ItemStack(Material.OAK_LOG);
		ItemStack obisidian = new ItemStack(Material.OBSIDIAN);
		ItemStack arrow = new ItemStack(Material.ARROW);
		
		ArrayList<ItemStack> armor = new ArrayList<ItemStack>();
		armor.add(helmet);
		armor.add(chestplate);
		armor.add(pants);
		armor.add(boots);
		armor.add(nhelmet);
		armor.add(nchestplate);
		armor.add(npants);
		armor.add(nboots);
		
		ArrayList<ItemStack> tools = new ArrayList<ItemStack>();
		tools.add(sword);
		tools.add(axe);
		tools.add(pick);
		tools.add(nsword);
		tools.add(naxe);
		tools.add(npick);
		tools.add(bow);
		tools.add(crossbow);
		
		ArrayList<ItemStack> items = new ArrayList<ItemStack>();
		items.add(pearls);
		items.add(godapple);
		items.add(diamond);
		items.add(diamondBlock);
		items.add(gold);
		items.add(goldBlock);
		items.add(enderEye);
		items.add(totem);
		items.add(ironBlock);
		items.add(netheriteBlock);
		items.add(netherite);
		items.add(enchantmentTable);
		items.add(wood);
		items.add(obisidian);
		items.add(arrow);
		
		//iterate through armor and add enchants
		Iterator<ItemStack> var29 = armor.iterator();

		Random rand;
		int itemNumber;
		while (var29.hasNext()) {
			ItemStack item = (ItemStack) var29.next();
			rand = new Random();
			itemNumber = rand.nextInt(4) + 1;
			switch (itemNumber) {
				case 1 :
					item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL,
							Enchantment.PROTECTION_ENVIRONMENTAL.getMaxLevel() + 6);
					item.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE,
							Enchantment.PROTECTION_PROJECTILE.getMaxLevel() + 6);
					item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS,
							Enchantment.PROTECTION_EXPLOSIONS.getMaxLevel() + 6);
					item.addUnsafeEnchantment(Enchantment.DURABILITY, Enchantment.DURABILITY.getMaxLevel());
					break;
				case 2 :
					item.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE,
							Enchantment.PROTECTION_PROJECTILE.getMaxLevel() + 6);
					item.addUnsafeEnchantment(Enchantment.PROTECTION_FIRE,
							Enchantment.PROTECTION_FIRE.getMaxLevel() + 6);
					item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL,
							Enchantment.PROTECTION_ENVIRONMENTAL.getMaxLevel() + 6);
					item.addUnsafeEnchantment(Enchantment.DURABILITY, Enchantment.DURABILITY.getMaxLevel() + 7);
					break;
				case 3 :
					item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS,
							Enchantment.PROTECTION_EXPLOSIONS.getMaxLevel() + 6);
					item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL,
							Enchantment.PROTECTION_ENVIRONMENTAL.getMaxLevel() + 6);
					item.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE,
							Enchantment.PROTECTION_PROJECTILE.getMaxLevel() + 6);
					break;
				case 4 :
					item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL,
							Enchantment.PROTECTION_ENVIRONMENTAL.getMaxLevel() + 6);
					item.addUnsafeEnchantment(Enchantment.PROTECTION_PROJECTILE,
							Enchantment.PROTECTION_PROJECTILE.getMaxLevel() + 6);
					item.addUnsafeEnchantment(Enchantment.PROTECTION_EXPLOSIONS,
							Enchantment.PROTECTION_EXPLOSIONS.getMaxLevel() + 6);
					item.addUnsafeEnchantment(Enchantment.DURABILITY, Enchantment.DURABILITY.getMaxLevel() + 7);
			}
		}
		
		//iterate through tools and add enchants
		Iterator<ItemStack> var38 = tools.iterator();
		
		int armorPiece;
		while (var38.hasNext()) {
			ItemStack item = (ItemStack) var38.next();
			Random random = new Random();
			armorPiece = random.nextInt(3) + 1;
			switch (armorPiece) {
				case 1 :
					if (!item.getType().equals(Material.DIAMOND_PICKAXE)
							&& !item.getType().equals(Material.NETHERITE_PICKAXE)) {
						if (!item.getType().equals(Material.BOW)
								&& !item.getType().equals(Material.CROSSBOW)) {
							item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL,
									Enchantment.DAMAGE_ALL.getMaxLevel() + 5);
							item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT,
									Enchantment.FIRE_ASPECT.getMaxLevel() + 9);
							item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS,
									Enchantment.LOOT_BONUS_MOBS.getMaxLevel() + 7);
							break;
						}

						item.addUnsafeEnchantment(Enchantment.ARROW_FIRE,
								Enchantment.ARROW_FIRE.getMaxLevel() + 9);
						item.addUnsafeEnchantment(Enchantment.ARROW_INFINITE,
								Enchantment.ARROW_INFINITE.getMaxLevel());
						item.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK,
								Enchantment.ARROW_KNOCKBACK.getMaxLevel() + 4);
						break;
					}

					item.addUnsafeEnchantment(Enchantment.DIG_SPEED,
							Enchantment.DIG_SPEED.getMaxLevel() + 5);
					item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS,
							Enchantment.LOOT_BONUS_BLOCKS.getMaxLevel() + 7);
					break;
				case 2 :
					if (!item.getType().equals(Material.DIAMOND_PICKAXE)
							&& !item.getType().equals(Material.NETHERITE_PICKAXE)) {
						if (!item.getType().equals(Material.BOW)
								&& !item.getType().equals(Material.CROSSBOW)) {
							item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL,
									Enchantment.DAMAGE_ALL.getMaxLevel() + 5);
							item.addUnsafeEnchantment(Enchantment.KNOCKBACK,
									Enchantment.KNOCKBACK.getMaxLevel());
							item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_MOBS,
									Enchantment.LOOT_BONUS_MOBS.getMaxLevel() + 7);
							break;
						}

						item.addUnsafeEnchantment(Enchantment.ARROW_FIRE,
								Enchantment.ARROW_FIRE.getMaxLevel());
						item.addUnsafeEnchantment(Enchantment.ARROW_INFINITE,
								Enchantment.ARROW_INFINITE.getMaxLevel());
						item.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK,
								Enchantment.ARROW_KNOCKBACK.getMaxLevel() + 7);
						item.addUnsafeEnchantment(Enchantment.DURABILITY,
								Enchantment.DURABILITY.getMaxLevel());
						break;
					}

					item.addUnsafeEnchantment(Enchantment.DIG_SPEED,
							Enchantment.DIG_SPEED.getMaxLevel() + 5);
					item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS,
							Enchantment.LOOT_BONUS_BLOCKS.getMaxLevel() + 7);
					break;
				case 3 :
					if (!item.getType().equals(Material.DIAMOND_PICKAXE)
							&& !item.getType().equals(Material.NETHERITE_PICKAXE)) {
						if (!item.getType().equals(Material.BOW)
								&& !item.getType().equals(Material.CROSSBOW)) {
							item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL,
									Enchantment.DAMAGE_ALL.getMaxLevel() + 5);
							item.addUnsafeEnchantment(Enchantment.DURABILITY,
									Enchantment.DURABILITY.getMaxLevel());
							item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT,
									Enchantment.FIRE_ASPECT.getMaxLevel());
						} else {
							item.addUnsafeEnchantment(Enchantment.ARROW_INFINITE,
									Enchantment.ARROW_INFINITE.getMaxLevel());
							item.addUnsafeEnchantment(Enchantment.ARROW_KNOCKBACK,
									Enchantment.ARROW_KNOCKBACK.getMaxLevel() + 7);
						}
					} else {
						item.addUnsafeEnchantment(Enchantment.DIG_SPEED,
								Enchantment.DIG_SPEED.getMaxLevel() + 5);
						item.addUnsafeEnchantment(Enchantment.DURABILITY,
								Enchantment.DURABILITY.getMaxLevel());
						item.addUnsafeEnchantment(Enchantment.LOOT_BONUS_BLOCKS,
								Enchantment.LOOT_BONUS_BLOCKS.getMaxLevel() + 7);
					}
			}
		}
		
		//Selected whether to drop armor, tools, or items and get a random item from the list
		rand = new Random();
		itemNumber = rand.nextInt(3) + 1;
		switch (itemNumber) {
			case 1 :
				armorPiece = rand.nextInt(8);
				itemSelected = armor.get(armorPiece);
				break;
			case 2 :
				int tool = rand.nextInt(8);
				itemSelected = tools.get(tool);
				break;
			case 3 :
				int item = rand.nextInt(15);
				itemSelected =  items.get(item);
				break;
		}
		
		return itemSelected;
	}
}
