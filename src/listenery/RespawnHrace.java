package listenery;

//        var player = event.getEntity();
//                var mistoLoby = new MistoLoby(player.getWorld());
//                player.teleport(mistoLoby.get());

import mainHra.MistoLoby;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerRespawnEvent;

public class RespawnHrace {
    public void respawn(PlayerRespawnEvent respawnEvent){
        Player player = respawnEvent.getPlayer();
        var mistoLoby = new MistoLoby(player.getWorld());
        player.getInventory().clear();
        player.teleport(mistoLoby.get());
    }
}
