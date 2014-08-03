package ca.viaware.mapmaker.gui.windows.world.editor;

import ca.viaware.api.gui.base.VFrame;
import ca.viaware.mapmaker.obj.world.World;

import java.awt.*;

@SuppressWarnings("serial")
public class WorldEditorWindow extends VFrame {

	private SidebarPanel sidebar;
	
    public WorldEditorWindow(World world) {
    	super("ViaWare World Designer", 1024, 1024);

    	sidebar = new SidebarPanel();
        add(sidebar, BorderLayout.LINE_START);
    }

}
