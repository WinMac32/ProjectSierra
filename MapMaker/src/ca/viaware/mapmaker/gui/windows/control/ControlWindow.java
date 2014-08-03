package ca.viaware.mapmaker.gui.windows.control;

import ca.viaware.api.gui.base.VFrame;
import ca.viaware.mapmaker.gui.components.SidebarButton;
import ca.viaware.mapmaker.gui.windows.assets.explorer.AssetExplorerWindow;
import ca.viaware.mapmaker.gui.windows.world.explorer.WorldExplorerWindow;
import ca.viaware.mapmaker.obj.GameManager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlWindow extends VFrame implements ActionListener {

    private GameManager gameManager;

    private AssetExplorerWindow assetExplorerWindow;
    private WorldExplorerWindow worldExplorerWindow;

    public ControlWindow(GameManager gameManager) {
        super("Construction Kit", 200, 1000);

        this.gameManager = gameManager;

        setResizable(false);
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 5));

        //TODO this will need to close safely eventually
        setDefaultCloseOperation(VFrame.EXIT_ON_CLOSE);

        add(new SidebarButton(this, "WORLD_EXPLORER", "World Explorer"));
        add(new SidebarButton(this, "ASSET_EXPLORER", "Asset Explorer"));

        assetExplorerWindow = new AssetExplorerWindow(gameManager.getAssetManager());
        worldExplorerWindow = new WorldExplorerWindow(gameManager.getWorldManager());

        assetExplorerWindow.setLocation(getX() + getWidth(), getY());
        worldExplorerWindow.setLocation(getX() + getWidth(), getY());

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String cmd = actionEvent.getActionCommand();
        if (cmd.equals("WORLD_EXPLORER")) {
            if (!worldExplorerWindow.isVisible()) worldExplorerWindow.setVisible(true);
        } else if (cmd.equals("ASSET_EXPLORER")) {
            if (!assetExplorerWindow.isVisible()) assetExplorerWindow.setVisible(true);
        }
    }
}
