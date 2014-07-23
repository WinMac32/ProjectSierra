package ca.viaware.game.assets;

import com.badlogic.gdx.Gdx;

public class TilesetLoader {

    public static void loadAllTilesets() {
        TilesetManager.loadTileset("tiles1", Gdx.files.internal("tiles.png"));
        TilesetManager.loadTileset("tiles2", Gdx.files.internal("tiles2.png"));
    }

}
