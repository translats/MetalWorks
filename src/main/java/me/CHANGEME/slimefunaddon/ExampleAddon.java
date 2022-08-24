package me.CHANGEME.slimefunaddon;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import org.bstats.bukkit.Metrics;

import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;
import java.io.File;

public class ExampleAddon extends JavaPlugin implements SlimefunAddon {


    @Override
    public void onEnable() {

        Config cfg = new Config(this);

        MetalWorksItemsSetup.setup(this);
        if (!new File(getDataFolder(), "config.yml").exists()) {
            saveDefaultConfig();
        }

        if (getConfig().getBoolean("options.auto-update") && getDescription().getVersion().startsWith("DEV - ")) {
            new GitHubBuildsUpdater(this, getFile(), "JasperChaseTOQ/MetalWorks/master").start();

            int pluginId = 15656; // <-- Replace with the id of your plugin!
            Metrics metrics = new Metrics(this, pluginId);
        }
    }
    @Override
    public void onDisable() {
        // Logic for disabling the plugin...
    }
    @Override
    public String getBugTrackerURL() {
        return "https://github.com/JasperChaseTOQ/MetalWorks/issues";
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    private static MetalWorks instance;

    public MetalWorks() {
        instance = this;
    }

    public static MetalWorks getInstance() {
        return instance;
    }
    public static String getVersion() {
        return instance.getDescription().getVersion();
    }
}