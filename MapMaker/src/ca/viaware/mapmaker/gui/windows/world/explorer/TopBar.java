package ca.viaware.mapmaker.gui.windows.world.explorer;

import ca.viaware.api.gui.base.VButton;
import ca.viaware.api.gui.base.VPanel;

import java.awt.*;

public class TopBar extends VPanel {

    public TopBar(WorldExplorerWindow explorerWindow) {
        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(new VButton("New World", explorerWindow, "TOP_BAR_NEW"));
    }

}
