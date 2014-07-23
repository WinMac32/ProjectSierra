package ca.viaware.tileset.gui.listeners;

import ca.viaware.tileset.Globals;
import ca.viaware.tileset.gui.SidebarPanel;
import ca.viaware.tileset.utils.FileUtils;
import ca.viaware.tileset.utils.Utils;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SidebarListener implements ActionListener {

    private SidebarPanel sidebar;

    public SidebarListener(SidebarPanel sidebar) {
        this.sidebar = sidebar;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String cmd = event.getActionCommand();

        if (cmd.equals("ENABLE_GRID")) {
            if (!Globals.isGrid) {
                Rectangle gridConfig = sidebar.getGridSettings();
                Utils.setGridConfig(gridConfig.x, gridConfig.y, gridConfig.width, gridConfig.height);
            } else {
                Utils.disableGrid();
            }
        }

        if (cmd.equals("SHOW_GRID")) {
            Globals.showingGrid = !Globals.showingGrid;
        }

        if (cmd.equals("GENERATE_REGIONS")) {
            if (Globals.isGrid) sidebar.getRegions().addAll(Utils.generateRegionsFromGrid(sidebar.getImagePanel().getImageDimensions().width / Utils.getGrid().width, sidebar.getImagePanel().getImageDimensions().height / Utils.getGrid().height));
        }
        
        if (cmd.equals("SAVE")) {
            FileUtils.saveRegions(Globals.dataFile, sidebar.getRegions());
        }

        sidebar.getImagePanel().repaint();
        sidebar.getParent().repaint();

    }
}
