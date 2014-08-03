/*
Copyright 2014 Seth Traverse

This file is part of Project Sierra.

Project Sierra is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Project Sierra is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Project Sierra.  If not, see <http://www.gnu.org/licenses/>.
 */
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
