package me.jasperchasetoq.metalworks;


import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.updater.GitHubBuildsUpdater;
import me.jasperchasetoq.metalworks.setup.MetalWorksItemSetup;
import org.bstats.bukkit.Metrics;
import net.guizhanss.guizhanlibplugin.updater.GuizhanBuildsUpdaterWrapper;

import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;
import java.io.File;

public class MetalWorks extends JavaPlugin implements SlimefunAddon {


    @Override
    public void onEnable() {

        Config cfg = new Config(this);

        MetalWorksItemSetup.setup(this);
        if (!new File(getDataFolder(), "config.yml").exists()) {
            saveDefaultConfig();
        }

        if (getConfig().getBoolean("auto-update", true) && getDescription().getVersion().startsWith("Build")) {
            GuizhanBuildsUpdaterWrapper.start(this, getFile(), "SlimefunGuguProject", "MetalWorks", "master", false);

            int pluginId = 16258; // <-- Replace with the id of your plugin!
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

}

