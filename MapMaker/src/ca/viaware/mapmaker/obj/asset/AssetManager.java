package ca.viaware.mapmaker.obj.asset;

import java.util.ArrayList;

public class AssetManager {

    private ArrayList<GameAsset> assets;

    public AssetManager() {
        assets = new ArrayList<GameAsset>();
    }

    public ArrayList<GameAsset> getAssetsByType(AssetType type) {
        ArrayList<GameAsset> sorted = new ArrayList<GameAsset>();

        for (GameAsset asset : assets) {
            if (asset.getAssetType().equals(type)) sorted.add(asset);
        }

        return sorted;
    }

    public ArrayList<GameAsset> getAllAssets() {
        return assets;
    }

    public void addAsset(GameAsset asset) {
        assets.add(asset);
    }

}
