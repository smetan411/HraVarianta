package teleporteri;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;

public class Vidlak {
    public void vytvorNokit(World svet, Location misto) {
        var nokit = (Villager) svet.spawnEntity(misto, EntityType.VILLAGER);
        nokit.setCustomName("Vidlak");
    }
}
