package ca.viaware.game.entities;

import ca.viaware.game.entity.Entity;

public class MapObject extends Entity {

    public MapObject(float worldX, float worldY, float width, float height) {
        super(worldX * 32, worldY * 32, width, height, null);
    }
}
