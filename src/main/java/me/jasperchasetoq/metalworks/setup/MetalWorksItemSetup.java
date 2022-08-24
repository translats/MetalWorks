package me.jasperchasetoq.metalworks.setup;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.jasperchasetoq.metalworks.MetalWorks;
import me.jasperchasetoq.metalworks.MetalWorksItems;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;

public class MetalWorksItemSetup {
    private MetalWorksItemSetup() {
    }

    public static void setup(@Nonnull MetalWorks plugin) {

        registerHelmet(MetalWorksItems.Helmets, SlimefunItems.GILDED_IRON, new ItemStack[]{
                SlimefunItems.GILDED_IRON_HELMET
        }, "GILDED_IRON", plugin);
    }

    @ParametersAreNonnullByDefault
    private static void registerHelmet(ItemGroup itemGroup, ItemStack MetalType, ItemStack[] items, String idSyntax, SlimefunAddon Helmet) {
        String[] components = new String[]{"_HELMET"};
        List<ItemStack[]> recipes = new ArrayList<>();

        recipes.add(new ItemStack[]{MetalType, MetalType, MetalType, MetalType, null, MetalType, null, null, null});

        for (int i = 0; i < 1; i++) {
            new SlimefunItem(itemGroup, new SlimefunItemStack(idSyntax + components[i], items[i]), RecipeType.ARMOR_FORGE, recipes.get(i)).register(Helmet);
        }

    }
}
