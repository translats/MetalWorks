package me.jasperchasetoq.metalworks.api;

import org.bukkit.Material;

enum MetalWorksArmor {

    Leather(
            Material.LEATHER_HELMET,
            Material.LEATHER_CHESTPLATE,
            Material.LEATHER_LEGGINGS,
            Material.LEATHER_BOOTS),

    Chainmail(
            Material.CHAINMAIL_HELMET,
            Material.CHAINMAIL_CHESTPLATE,
            Material.CHAINMAIL_LEGGINGS,
            Material.CHAINMAIL_BOOTS),

    Gold(
            Material.GOLDEN_HELMET,
            Material.GOLDEN_CHESTPLATE,
            Material.GOLDEN_LEGGINGS,
            Material.GOLDEN_BOOTS),

    Iron(
            Material.IRON_HELMET,
            Material.IRON_CHESTPLATE,
            Material.IRON_LEGGINGS,
            Material.IRON_BOOTS),

    Diamond
            (Material.DIAMOND_HELMET,
                    Material.DIAMOND_CHESTPLATE,
                    Material.DIAMOND_LEGGINGS,
                    Material.DIAMOND_BOOTS),

    Netherite(
            Material.NETHERITE_HELMET,
            Material.NETHERITE_CHESTPLATE,
            Material.NETHERITE_LEGGINGS,
            Material.NETHERITE_BOOTS);

    public final Material helmet;
    public final Material chestplate;
    public final Material leggings;
    public final Material boots;

    MetalWorksArmor(Material helmet, Material chestplate, Material leggings, Material boots) {
        this.helmet = helmet;
        this.chestplate = chestplate;
        this.leggings = leggings;
        this.boots = boots;
    }
    public Material GetHelmet(){
        return helmet;
    }
    public Material GetChestplate(){
        return chestplate;
    }
    public Material GetLeggings(){
        return leggings;
    }
    public Material GetBoots(){
        return boots;
    }

}
