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
