package ca.viaware.mapmaker.obj.asset.render;

import ca.viaware.mapmaker.obj.asset.AssetType;
import ca.viaware.mapmaker.obj.asset.GameAsset;

import java.awt.*;

public class TextureAsset extends GameAsset {

    public TextureAsset(String assetID, Image assetIcon) {
        super(assetID, AssetType.TEXTURE, assetIcon);
    }
}
