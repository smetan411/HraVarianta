package teleporteri;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;

public class Ohnivak {
    public void vytvorOhnivakkit(World svet, Location misto) {
        var ohnivakKit = (Villager) svet.spawnEntity(misto, EntityType.VILLAGER);
        ohnivakKit.setCustomName("Ohnivak");
    }

}
