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
package ca.viaware.game.assets;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import java.util.HashMap;

public class Tileset {

    private Texture texture;
    private HashMap<String, TextureRegion> regions;

    public Tileset(Texture texture, HashMap<String, TextureRegion> regions) {
        this.texture = texture;
        this.regions = regions;
    }

    public Tileset(Texture texture) {
        this(texture, new HashMap<String, TextureRegion>());
    }

    public Texture getTexture() {
        return texture;
    }

    public TextureRegion getRegion(String name) {
        return regions.get(name);
    }

    public void addRegion(String name, int x, int y, int width, int height) {
        regions.put(name, new TextureRegion(getTexture(), x, y, width, height));
    }

}
