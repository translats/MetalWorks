package me.jasperchasetoq.metalworks;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class MetalWorksItems {
    public static final NestedItemGroup MetalWorks_General = new NestedItemGroup(new NamespacedKey(MetalWorks.getInstance(), "METALWORKS_GENERAL"), new CustomItemStack(Material.ANVIL, "&f金属工作"));
    public static final SubItemGroup Helmets = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "HELMETS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_HELMET, "&f金属制品头盔"));
    public static final SubItemGroup Chestplates = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "CHESTPLATES"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_CHESTPLATE, "&f金属制品胸甲"));
    public static final SubItemGroup Leggings = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "LEGGINGS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_LEGGINGS, "&f金属制品金属制品护腿"));
    public static final SubItemGroup Boots = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "BOOTS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_BOOTS, "&f金属制品靴"));
    public static final SubItemGroup Swords = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "SWORDS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_SWORD, "&f金属制品剑"));
    public static final SubItemGroup Pickaxes = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "PICKAXES"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_PICKAXE, "&f金属制品镐"));
    public static final SubItemGroup Axes = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "AXES"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_AXE, "&f金属制品轴"));
    public static final SubItemGroup Shovels = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "SHOVELS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_SHOVEL, "&f金属制品铲子"));
    public static final SubItemGroup Hoes = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "HOES"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_HOE, "&f金属制品锄头"));
    public static final SubItemGroup Shields = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "SHIELDS"), MetalWorks_General, new CustomItemStack(Material.SHIELD, "&f金属制品护罩"));
    public static final SubItemGroup Bows = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "BOWS"), MetalWorks_General, new CustomItemStack(Material.BOW, "&金属制品弓"));
    public static final SubItemGroup Crossbows = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "CROSSBOWS"), MetalWorks_General, new CustomItemStack(Material.CROSSBOW, "&f金属制品弩"));

    public static final SlimefunItemStack JC_GOLD_4K_HELMET = new SlimefunItemStack("JC_GOLD_4K_HELMET", Material.GOLDEN_HELMET, "&f金色头盔&7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_CHESTPLATE = new SlimefunItemStack("JC_GOLD_4_CHESTPLATE", Material.GOLDEN_CHESTPLATE, "&f黄金胸牌&7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_LEGGINGS = new SlimefunItemStack("JC_GOLD_4K_LEGGINGS", Material.GOLDEN_LEGGINGS, "&f金色打底裤&7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_BOOTS = new SlimefunItemStack("JC_GOLD_4K_BOOTS", Material.GOLDEN_BOOTS, "&f金靴&7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_SWORD = new SlimefunItemStack("JC_GOLD_4K_SWORDS", Material.GOLDEN_SWORD, "&f金剑&7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_PICKAXE = new SlimefunItemStack("JC_GOLD_4K_PICKAXE", Material.GOLDEN_PICKAXE, "&f金镐&7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_AXE = new SlimefunItemStack("JC_GOLD_4K_AXE", Material.GOLDEN_AXE, "&f金头盔&7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_SHOVEL = new SlimefunItemStack("JC_GOLD_4K_SHOVEL", Material.GOLDEN_AXE, "&f金铲&7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_HOE = new SlimefunItemStack("JC_GOLD_4K_HOE", Material.GOLDEN_HOE, "&f金锄头&7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_SHIELD = new SlimefunItemStack("JC_GOLD_4K_SHIELD", Material.SHIELD, "&f金盾&7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_BOW = new SlimefunItemStack("JC_GOLD_4K_BOW", Material.BOW, "&金色蝴蝶结&7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_CROSSBOW = new SlimefunItemStack("JC_GOLD_4K_CROSSBOW", Material.CROSSBOW, "&f黄金弩&7(4克拉)");

}
