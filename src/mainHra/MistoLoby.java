package mainHra;

import org.bukkit.Location;
import org.bukkit.World;

public class MistoLoby {

    private final World world;

    public MistoLoby(World world) {
        this.world = world;
    }

    public Location get(){
        return new Location(world, -13, 67, 4);
    }
}
