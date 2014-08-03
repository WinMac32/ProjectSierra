package ca.viaware.mapmaker.obj.world;

import ca.viaware.mapmaker.obj.asset.GameAsset;

public class MapObject {

    private int x;
    private int y;

    private int width;
    private int height;

    private GameAsset asset;

    public MapObject(int x, int y, int width, int height, GameAsset asset) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

        this.asset = asset;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public GameAsset getAsset() {
        return asset;
    }

    public void setAsset(GameAsset asset) {
        this.asset = asset;
    }
}
