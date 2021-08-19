package listenery;

import mainHra.MistoLoby;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PripojeniListener implements Listener {

    public void pripojeni(PlayerJoinEvent event) {
        var mistoLoby = new MistoLoby(event.getPlayer().getWorld());
        event.getPlayer().teleport(mistoLoby.get());
    }
}
