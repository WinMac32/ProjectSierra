package ca.viaware.mapmaker.obj.world;

import java.util.ArrayList;

public class WorldManager {

    private ArrayList<World> worlds;

    public WorldManager() {
        worlds = new ArrayList<World>();
    }

    /**
     * Get world with specified ID
     * @param id World id
     * @return World if found, null if not found
     */
    public World getWorldById(String id) {
        for (World world : worlds) {
            if (world.getWorldID().equals(id)) return world;
        }

        return null;
    }

    public ArrayList<World> getAllWorlds() {
        return worlds;
    }

}
