package petterim1.skin.settrusted;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerAsyncPreLoginEvent;
import cn.nukkit.event.player.PlayerChangeSkinEvent;
import cn.nukkit.plugin.PluginBase;

public class Plugin extends PluginBase implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getServer().getLogger().info("All player skins are now trusted.");
    }

    @EventHandler
    public void onLogin(PlayerAsyncPreLoginEvent e) {
        e.getSkin().setTrusted(true);
    }

    @EventHandler
    public void onSkinChange(PlayerChangeSkinEvent e) {
        e.getSkin().setTrusted(true);
    }
}
