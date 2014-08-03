package ca.viaware.mapmaker.obj;

import ca.viaware.mapmaker.obj.asset.AssetManager;
import ca.viaware.mapmaker.obj.world.WorldManager;

public class GameManager {

    private AssetManager assetManager;
    private WorldManager worldManager;

    public GameManager() {
        assetManager = new AssetManager();
        worldManager = new WorldManager();
    }

    public AssetManager getAssetManager() {
        return assetManager;
    }

    public WorldManager getWorldManager() {
        return worldManager;
    }

}
