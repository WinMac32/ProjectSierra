package ca.viaware.mapmaker.obj.asset;

import java.util.ArrayList;

public class AssetManager {

    private ArrayList<GameAsset> assets;

    public AssetManager() {
        assets = new ArrayList<GameAsset>();
    }

    /**
     * Returns all assets of specified AssetType
     * @param type
     * @return All assets of AssetType, empty list if none
     */
    public ArrayList<GameAsset> getAssetsByType(AssetType type) {
        ArrayList<GameAsset> sorted = new ArrayList<GameAsset>();

        for (GameAsset asset : assets) {
            if (asset.getAssetType().equals(type)) sorted.add(asset);
        }

        return sorted;
    }

    /**
     * Get asset with provided ID
     * @param id Asset id
     * @return Asset if exists, null if not found
     */
    public GameAsset getAssetByID(String id) {
        for (GameAsset asset : assets) {
            if (asset.getAssetID().equals(id)) return asset;
        }

        return null;
    }

    public ArrayList<GameAsset> getAllAssets() {
        return assets;
    }

    public void addAsset(GameAsset asset) {
        assets.add(asset);
    }

}
