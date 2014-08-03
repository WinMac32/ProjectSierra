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

import ca.viaware.api.gui.base.*;
import ca.viaware.mapmaker.obj.world.World;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WorldListElement extends VListElement implements ActionListener {

    private World world;
    private WorldExplorerWindow explorerWindow;

    public WorldListElement(VList parent, WorldExplorerWindow explorerWindow, World world) {
        super(parent);

        this.world = world;
        this.explorerWindow = explorerWindow;

        setLayout(new GridLayout(1, 2));

        add(new VLabel(world.getWorldID()));
        add(new VLabel(world.getWorldName()));

        addDoubleClickActionListener(this);

        VPopupMenu popupMenu = new VPopupMenu();
        popupMenu.add(new VMenuItem("New world", this, "POPUP_NEW"));
        popupMenu.add(new VMenuItem("Edit world", this, "POPUP_EDIT"));
        popupMenu.add(new VMenuItem("Delete world", this, "POPUP_DELETE"));
        setComponentPopupMenu(popupMenu);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String cmd = (actionEvent.getActionCommand() != null ? actionEvent.getActionCommand() : "");
        if (cmd.equals("POPUP_NEW")) {
            explorerWindow.newWorld();
        } else if (cmd.equals("POPUP_EDIT")) {
            explorerWindow.listElementClick(world);
        } else if (cmd.equals("POPUP_DELETE")) {
            //TODO Delete that shit
        } else {
            explorerWindow.listElementClick(world);
        }
    }
}
