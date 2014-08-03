package ca.viaware.mapmaker.gui.windows.world.explorer;

import ca.viaware.api.gui.base.VLabel;
import ca.viaware.api.gui.base.VList;
import ca.viaware.api.gui.base.VListElement;
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

        setLayout(new GridLayout(1, 2));

        add(new VLabel(world.getWorldID()));
        add(new VLabel(world.getWorldName()));

        addDoubleClickActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        explorerWindow.listElementClick(world);
    }
}
