package ca.viaware.mapmaker.gui.windows.world.explorer;

import ca.viaware.api.gui.base.VFrame;
import ca.viaware.api.gui.base.VScrollingList;
import ca.viaware.api.logging.Log;
import ca.viaware.mapmaker.obj.world.World;
import ca.viaware.mapmaker.obj.world.WorldManager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorldExplorerWindow extends VFrame implements ActionListener {

    private WorldManager worldManager;

    private VScrollingList worldList;
    private TopBar topBar;

    public WorldExplorerWindow(WorldManager worldManager) {
        super("World Explorer", 800, 600);
        this.worldManager = worldManager;

        setMinimumSize(new Dimension(300, 300));

        worldList = new VScrollingList();
        add(worldList, BorderLayout.CENTER);

        topBar = new TopBar(this);
        add(topBar, BorderLayout.PAGE_START);

        reload();
    }

    public void reload() {
        worldList.getList().removeAll();
        for (World w : worldManager.getAllWorlds()) {
            worldList.getList().add(new WorldListElement(worldList.getList(), this, w));
        }
        worldList.revalidate();
    }

    public void newWorld() {
        Log.info("Bleh creating new world");
    }

    public void listElementClick(World world) {
        Log.info("Bleh loading a world %0", world.getWorldID());
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        String cmd = actionEvent.getActionCommand();

        if (cmd.equals("TOP_BAR_NEW")) {
            newWorld();
        }

    }
}
