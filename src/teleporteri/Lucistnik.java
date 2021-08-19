package teleporteri;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;

public class Lucistnik {
    public void vytvorLucistnikkit(World svet, Location misto) {
        var lucistnikKit = (Villager) svet.spawnEntity(misto, EntityType.VILLAGER);
        lucistnikKit.setCustomName("Lucistnik");
    }

}
