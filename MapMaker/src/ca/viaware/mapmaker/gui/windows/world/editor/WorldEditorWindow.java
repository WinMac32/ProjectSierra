package ca.viaware.mapmaker.gui.windows.world.editor;

import ca.viaware.api.gui.base.VFrame;

import java.awt.*;

@SuppressWarnings("serial")
public class WorldEditorWindow extends VFrame {

	private SidebarPanel sidebar;
	
    public WorldEditorWindow() {
    	super("ViaWare World Designer", 1024, 1024);

        setDefaultCloseOperation(VFrame.EXIT_ON_CLOSE);

    	sidebar = new SidebarPanel();
        add(sidebar, BorderLayout.LINE_START);
    }

}
