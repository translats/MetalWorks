package me.jasperchasetoq.metalworks.setup;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.jasperchasetoq.metalworks.MetalWorks;
import me.jasperchasetoq.metalworks.MetalWorksItems;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;

public class MetalWorksItemSetup {
    private MetalWorksItemSetup() {
    }

    public static void setup(@Nonnull MetalWorks plugin) {

        registerMetalWorksGear(MetalWorksItems.Helmets, SlimefunItems.GOLD_4K, new ItemStack[]{
                MetalWorksItems.JC_GOLD_4K_HELMET
        }, "JC_GOLD_4K", plugin);
    }

    @ParametersAreNonnullByDefault
    private static void registerMetalWorksGear(ItemGroup itemGroup, ItemStack MetalType, ItemStack[] items, String idSyntax, SlimefunAddon MetalWorksGear) {
        String[] components = new String[]
                {"_HELMET", "_CHESTPLATE", "_LEGGINGS","_BOOTS","_SWORD","_PICKAXE","_AXE","_SHOVEL","_HOE","_SHIELD","_BOW","_CROSSBOW","_TRIDENT"};
        List<ItemStack[]> recipes = new ArrayList<>();
        //Helmet
        recipes.add(new ItemStack[]{
                MetalType, MetalType, MetalType,
                MetalType, null, MetalType,
                null, null, null});
        //Chestplate
        recipes.add(new ItemStack[]{
                MetalType, null, MetalType,
                MetalType, MetalType, MetalType,
                MetalType, MetalType, MetalType});
        //Leggings
        recipes.add(new ItemStack[]{
                MetalType, MetalType, MetalType,
                MetalType, null, MetalType,
                MetalType, null, MetalType});
        //Boots
        recipes.add(new ItemStack[]{
                null, null, null,
                MetalType, null, MetalType,
                MetalType, null, MetalType});
        //Swords
        recipes.add(new ItemStack[]{
                MetalType, MetalType, MetalType,
                MetalType, null, MetalType,
                null, new ItemStack(Material.STICK), null});
        //Pickaxes
        recipes.add(new ItemStack[]{
                MetalType, MetalType, MetalType,
                MetalType, null, MetalType,
                null, null, null});
        //Axes
        recipes.add(new ItemStack[]{
                MetalType, MetalType, MetalType,
                MetalType, null, MetalType,
                null, null, null});
        //Shovels
        recipes.add(new ItemStack[]{
                MetalType, MetalType, MetalType,
                MetalType, null, MetalType,
                null, null, null});
        //Hoes
        recipes.add(new ItemStack[]{
                MetalType, MetalType, MetalType,
                MetalType, null, MetalType,
                null, null, null});
        //Shields
        recipes.add(new ItemStack[]{
                MetalType, MetalType, MetalType,
                MetalType, null, MetalType,
                null, null, null});
        //Bows
        recipes.add(new ItemStack[]{
                MetalType, MetalType, MetalType,
                MetalType, null, MetalType,
                null, null, null});
        //CrossBows
        recipes.add(new ItemStack[]{
                MetalType, MetalType, MetalType,
                MetalType, null, MetalType,
                null, null, null});
        //Tridents
        recipes.add(new ItemStack[]{
                MetalType, MetalType, MetalType,
                MetalType, null, MetalType,
                null, null, null});


        for (int i = 0; i < 13; i++) {
            new SlimefunItem(itemGroup, new SlimefunItemStack(idSyntax + components[i], items[i]), RecipeType.ARMOR_FORGE, recipes.get(i)).register(MetalWorksGear);
        }

    }
}
