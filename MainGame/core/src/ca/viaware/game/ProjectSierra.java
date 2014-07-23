package ca.viaware.game;

import ca.viaware.game.assets.TilesetLoader;
import com.badlogic.gdx.graphics.OrthographicCamera;

import ca.viaware.game.screens.GameScreen;

public class ProjectSierra extends com.badlogic.gdx.Game {
	
	@Override
	public void create () {
		Globals.camera = new OrthographicCamera(1080, 1920);
        TilesetLoader.loadAllTilesets();
        setScreen(new GameScreen());
	}
}
