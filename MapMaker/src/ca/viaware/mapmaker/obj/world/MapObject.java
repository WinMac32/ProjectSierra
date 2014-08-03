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
