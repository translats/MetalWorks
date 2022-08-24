package me.jasperchasetoq.metalworks.setup;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.jasperchasetoq.metalworks.MetalWorks;
import me.jasperchasetoq.metalworks.MetalWorksItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public class MetalWorksItemSetup {
    private MetalWorksItemSetup() {}

    public static void setup(@Nonnull MetalWorks plugin) {

        new SlimefunItem(MetalWorksItems.JC_CC_MACHINES, MetalWorksItems.JC_COMPRESSOR_1, RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
        SlimefunItems.CARBON, SlimefunItems.SMALL_CAPACITOR, SlimefunItems.CARBON,
                SlimefunItems.ELECTRIC_MOTOR, new ItemStack(Material.PISTON), SlimefunItems.ELECTRIC_MOTOR,
                SlimefunItems.CARBON, SlimefunItems.HEATING_COIL, SlimefunItems.CARBON,
    }).register(plugin);
}
}
