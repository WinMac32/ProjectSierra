package ca.viaware.mapmaker.obj.world;

import java.util.ArrayList;

public class World {

    private ArrayList<MapObject> objects;
    private String worldID;
    private String worldName;

    public World(String worldID, String worldName, ArrayList<MapObject> objects) {
        this.worldID = worldID;
        this.worldName = worldName;
        this.objects = objects;
    }

    public World(String worldID) {
        this(worldID, "Unnamed world", new ArrayList<MapObject>());
    }

    public String getWorldID() {
        return worldID;
    }

    public void setWorldID(String worldID) {
        this.worldID = worldID;
    }

    public String getWorldName() {
        return worldName;
    }

    public void setWorldName(String worldName) {
        this.worldName = worldName;
    }

    public ArrayList<MapObject> getObjects() {
        return objects;
    }

    public void addObject(MapObject object) {
        objects.add(object);
    }

}
