package ca.viaware.mapmaker.gui.windows.assets.editor;

import ca.viaware.api.gui.base.VFrame;

public abstract class EditorWindow extends VFrame {

    public EditorWindow(String title) {
        super("GameEditor - " + title);
    }

}
