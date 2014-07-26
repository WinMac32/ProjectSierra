package ca.viaware.mapmaker.obj.asset;

import java.util.Iterator;

public enum AssetType {

    WEAPON(0, "Weapon"),
    STATIC(1, "Static"),
    LIVING(2, "Living"),
    CONSUMABLE(3, "Consumable"),
    CLOTHING(4, "Clothing"),
    SOUND(5, "Sound"),
    QUEST(6, "Quest"),
    INTELLIGENCE(7, "AI Package"),
    EFFECT(8, "Effect"),
    DIALOG(9, "Dialog"),
    TEXTURE(10, "Texture"),
    ANIMATION(11, "Animation");

    //Used by view to generate UI
    public static final int ASSET_COUNT = 12;

    private int typeID;
    private String humanReadable;

    AssetType(int typeID, String humanReadable) {
        this.typeID = typeID;
        this.humanReadable = humanReadable;
    }

    public int getTypeID() {
        return typeID;
    }

    public String getHumanReadable() {
        return humanReadable;
    }

    public static AssetType getAssetType(int typeID) {
        for (AssetType t : AssetType.values()) {
            if (t.getTypeID() == typeID) return t;
        }
        return AssetType.STATIC;
    }

}
