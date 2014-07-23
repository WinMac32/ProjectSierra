package ca.viaware.mapmaker.obj;

import java.util.ArrayList;

public class World {

    private ArrayList<MapObject> objects;
    private String worldID;

    public World(String worldID, ArrayList<MapObject> objects) {
        this.worldID = worldID;
        this.objects = objects;
    }

    public World(String worldID) {
        this(worldID, new ArrayList<MapObject>());
    }

    public String getWorldID() {
        return worldID;
    }

    public void setWorldID(String worldID) {
        this.worldID = worldID;
    }

    public ArrayList<MapObject> getObjects() {
        return objects;
    }

    public void addObject(MapObject object) {
        objects.add(object);
    }

}
