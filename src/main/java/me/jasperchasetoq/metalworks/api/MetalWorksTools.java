package me.jasperchasetoq.metalworks.api;

import org.bukkit.Material;

public class MetalWorksTools {

    enum MetalWorksArmor {

        Wood(
                Material.WOODEN_PICKAXE,
                Material.WOODEN_AXE,
                Material.WOODEN_SHOVEL,
                Material.WOODEN_HOE),

        Stone(
                Material.STONE_PICKAXE,
                Material.STONE_AXE,
                Material.STONE_SHOVEL,
                Material.STONE_HOE),

        Gold(
                Material.GOLDEN_PICKAXE,
                Material.GOLDEN_AXE,
                Material.GOLDEN_SHOVEL,
                Material.GOLDEN_HOE),

        Iron(
                Material.IRON_PICKAXE,
                Material.IRON_AXE,
                Material.IRON_SHOVEL,
                Material.IRON_HOE),

        Diamond(
                Material.DIAMOND_PICKAXE,
                Material.DIAMOND_AXE,
                Material.DIAMOND_SHOVEL,
                Material.DIAMOND_HOE),

        Netherite(
                Material.NETHERITE_PICKAXE,
                Material.NETHERITE_AXE,
                Material.NETHERITE_SHOVEL,
                Material.NETHERITE_HOE);

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


}
