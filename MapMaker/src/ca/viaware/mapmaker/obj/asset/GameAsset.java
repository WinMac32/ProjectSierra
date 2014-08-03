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

import java.awt.*;
import java.io.InputStream;

public abstract class GameAsset {

    private String assetID;
    private Image assetIcon;
    private AssetType assetType;

    public GameAsset(String assetID, AssetType assetType, Image assetIcon) {
        this.assetID = assetID;
        this.assetType = assetType;
        this.assetIcon = assetIcon;
    }

    public String getAssetID() {
        return assetID;
    }

    public void setAssetID(String assetID) {
        this.assetID = assetID;
    }

    public Image getAssetIcon() {
        return assetIcon;
    }

    public void setAssetIcon(Image assetIcon) {
        this.assetIcon = assetIcon;
    }

    public AssetType getAssetType() {
        return assetType;
    }

    //TODO This might not be the best way to do this. Food for thought.
    protected abstract void loadFromStream(InputStream input);
}
