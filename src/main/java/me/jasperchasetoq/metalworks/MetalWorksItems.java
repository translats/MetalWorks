package me.jasperchasetoq.metalworks;

import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class MetalWorksItems {
    public static final NestedItemGroup MetalWorks_General = new NestedItemGroup(new NamespacedKey(MetalWorks.getInstance(), "METALWORKS_GENERAL"), new CustomItemStack(Material.ANVIL, "&fMetalWorks"));
    public static final SubItemGroup Helmets = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "HELMETS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_HELMET, "&fMetalworks Helmets"));
    public static final SubItemGroup Chestplates = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "CHESTPLATES"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_CHESTPLATE, "&fMetalworks Chestplates"));
    public static final SubItemGroup Leggings = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "LEGGINGS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_LEGGINGS, "&fMetalworks Metalworks Leggings"));
    public static final SubItemGroup Boots = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "BOOTS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_BOOTS, "&fMetalworks Boots"));
    public static final SubItemGroup Swords = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "SWORDS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_SWORD, "&fMetalworks Swords"));
    public static final SubItemGroup Pickaxes = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "PICKAXES"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_PICKAXE, "&fMetalworks Pickaxes"));
    public static final SubItemGroup Axes = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "AXES"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_AXE, "&fMetalworks Axes"));
    public static final SubItemGroup Shovels = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "SHOVELS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_SHOVEL, "&fMetalworks Shovels"));
    public static final SubItemGroup Hoes = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "HOES"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_HOE, "&fMetalworks Hoes"));
    public static final SubItemGroup Shields = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "SHIELDS"), MetalWorks_General, new CustomItemStack(Material.SHIELD, "&fMetalworks Shields"));
    public static final SubItemGroup Bows = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "BOWS"), MetalWorks_General, new CustomItemStack(Material.BOW, "&fMetalworks Bows"));
    public static final SubItemGroup Crossbows = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "CROSSBOWS"), MetalWorks_General, new CustomItemStack(Material.CROSSBOW, "&fMetalworks Crossbows"));
    public static final SubItemGroup Tridents = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "TRIDENTS"), MetalWorks_General, new CustomItemStack(Material.TRIDENT, "&fMetalworks Tridents"));



}
