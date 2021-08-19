package teleporteri;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Villager;

public class Golem {
    public void vytvorGolemkit(World svet, Location misto) {
        var golemkit = (Villager) svet.spawnEntity(misto, EntityType.VILLAGER);
        golemkit.setProfession(Villager.Profession.ARMORER);
        golemkit.setCustomName("Golem");

    }
}
