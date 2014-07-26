package ca.viaware.mapmaker.gui.windows.control;

import ca.viaware.api.gui.base.VFrame;
import ca.viaware.mapmaker.gui.components.SidebarButton;
import ca.viaware.mapmaker.gui.windows.assets.explorer.AssetExplorerWindow;
import ca.viaware.mapmaker.obj.asset.AssetManager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlWindow extends VFrame implements ActionListener {

    public ControlWindow() {
        super("Construction Kit", 200, 1000);

        setResizable(false);
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 5));

        //TODO this will need to close safely eventually
        setDefaultCloseOperation(VFrame.EXIT_ON_CLOSE);

        add(new SidebarButton(this, "OPEN_WORLD", "Open World"));
        add(new SidebarButton(this, "ASSET_EXPLORER", "Asset explorer"));

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String cmd = actionEvent.getActionCommand();

        if (cmd.equals("OPEN_WORLD")) {
            //TODO open a world for editing
        } else if (cmd.equals("ASSET_EXPLORER")) {
            //TODO open the asset explorer if not open
            //TODO this is temp
            new AssetExplorerWindow(new AssetManager()).setVisible(true);
        }
    }
}
