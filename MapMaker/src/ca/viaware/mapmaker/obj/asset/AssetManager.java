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
