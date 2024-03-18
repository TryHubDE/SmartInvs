package fr.minuskube.inv;

import org.bukkit.plugin.java.JavaPlugin;

public class SmartInvsPlugin extends JavaPlugin {

    private static InventoryManager invManager;

    @Override
    public void onEnable() {
        invManager = new InventoryManager(this);
        invManager.init();
    }

    public static InventoryManager manager() { return invManager; }

}
