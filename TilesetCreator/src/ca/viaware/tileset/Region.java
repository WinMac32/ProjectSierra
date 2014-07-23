package ca.viaware.tileset;

import java.awt.*;

public class Region extends Rectangle {

    private String name;

    public Region(int x, int y, int width, int height, String name) {
        super(x, y, width, height);
        this.name = name;
    }

    public Region(int x, int y, int width, int height) {
        this(x, y, width, height, "REGION");
    }

    public Region() {
        this(0, 0, 0, 0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
