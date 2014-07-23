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
