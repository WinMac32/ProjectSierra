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
