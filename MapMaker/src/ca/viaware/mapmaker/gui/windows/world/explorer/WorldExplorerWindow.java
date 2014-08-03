package ca.viaware.mapmaker.gui.windows.world.explorer;

import ca.viaware.api.gui.base.VFrame;
import ca.viaware.api.gui.base.VScrollingList;
import ca.viaware.api.logging.Log;
import ca.viaware.mapmaker.obj.world.World;
import ca.viaware.mapmaker.obj.world.WorldManager;

import java.awt.*;

public class WorldExplorerWindow extends VFrame {

    private WorldManager worldManager;

    VScrollingList worldList;

    public WorldExplorerWindow(WorldManager worldManager) {
        super("World Explorer", 800, 600);
        this.worldManager = worldManager;

        setMinimumSize(new Dimension(300, 300));

        worldList = new VScrollingList();
        add(worldList, BorderLayout.CENTER);

        reload();
    }

    public void reload() {
        worldList.getList().removeAll();
        for (World w : worldManager.getAllWorlds()) {
            worldList.getList().add(new WorldListElement(worldList.getList(), this, w));
        }
        worldList.revalidate();
    }

    public void listElementClick(World world) {
        Log.info("Bleh loading a world %0", world.getWorldID());
    }

}
