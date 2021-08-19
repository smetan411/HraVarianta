package teleporteri;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;

public class DuchCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)) return false;
        Player player = (Player) commandSender;
        vytvorDuchkit(player.getWorld(), player.getLocation());
        return true;
    }

    private void vytvorDuchkit(World svet, Location misto) {
        var nokit = (Villager) svet.spawnEntity(misto, EntityType.VILLAGER);
        nokit.setCustomName(Teleporteri.DUCH.getJmeno());
    }
}
