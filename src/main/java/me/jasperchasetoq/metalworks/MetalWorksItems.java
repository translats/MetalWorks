package me.jasperchasetoq.metalworks;

import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class MetalWorksItems {
    public static final NestedItemGroup MetalWorks_General = new NestedItemGroup(new NamespacedKey(MetalWorks.getInstance(), "METALWORKS_GENERAL"), new CustomItemStack(Material.ANVIL, "&fMetalWorks"));
    public static final SubItemGroup Helmets = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "HELMETS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_HELMET, "&fMetalworks Helmets"));
    public static final SubItemGroup Chestplates = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "CHESTPLATES"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_HELMET, "&fMetalworks Helmets"));
    public static final SubItemGroup Leggings = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "LEGGINGS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_HELMET, "&fMetalworks Helmets"));
    public static final SubItemGroup Boots = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "BOOTS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_HELMET, "&fMetalworks Helmets"));
    public static final SubItemGroup Pickaxes = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "PICKAXES"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_HELMET, "&fMetalworks Helmets"));
    public static final SubItemGroup Axes = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "HELMETS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_HELMET, "&fMetalworks Helmets"));
    public static final SubItemGroup Shovels = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "HELMETS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_HELMET, "&fMetalworks Helmets"));
    public static final SubItemGroup Hoes = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "HELMETS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_HELMET, "&fMetalworks Helmets"));


}
