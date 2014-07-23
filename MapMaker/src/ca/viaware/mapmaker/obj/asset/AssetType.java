package ca.viaware.mapmaker.obj.asset;

public enum AssetType {

    WEAPON(0),
    STATIC(1),
    LIVING(2),
    CONSUMABLE(3),
    CLOTHING(4),
    SOUND(5),
    QUEST(6),
    INTELLIGENCE(7),
    EFFECT(8),
    DIALOG(9),
    TEXTURE(10),
    ANIMATION(11);

    private int typeID;

    AssetType(int typeID) {
        this.typeID = typeID;
    }

    public int getTypeID() {
        return typeID;
    }

    public AssetType getAssetType(int typeID) {
        for (AssetType t : AssetType.values()) {
            if (t.getTypeID() == typeID) return t;
        }
        return AssetType.STATIC;
    }

}
