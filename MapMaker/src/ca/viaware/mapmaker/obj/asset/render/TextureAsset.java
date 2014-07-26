package ca.viaware.mapmaker.obj.asset.render;

import ca.viaware.mapmaker.obj.asset.AssetType;
import ca.viaware.mapmaker.obj.asset.GameAsset;

import java.awt.*;
import java.io.InputStream;

public class TextureAsset extends GameAsset {

    public TextureAsset(String assetID, Image assetIcon) {
        super(assetID, AssetType.TEXTURE, assetIcon);
    }

    @Override
    protected void loadFromStream(InputStream input) {

    }
}
