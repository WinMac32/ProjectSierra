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
