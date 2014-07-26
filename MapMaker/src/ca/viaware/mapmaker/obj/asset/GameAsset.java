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
