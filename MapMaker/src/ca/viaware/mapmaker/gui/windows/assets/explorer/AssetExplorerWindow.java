package ca.viaware.mapmaker.gui.windows.assets.explorer;

import ca.viaware.api.gui.base.VFrame;
import ca.viaware.api.logging.Log;
import ca.viaware.mapmaker.obj.asset.AssetManager;
import ca.viaware.mapmaker.obj.asset.AssetType;
import ca.viaware.mapmaker.obj.asset.GameAsset;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AssetExplorerWindow extends VFrame {

    private AssetManager assetManager;

    private JTree assetView;
    private DefaultMutableTreeNode rootNode;

    public AssetExplorerWindow(AssetManager assetManager) {
        super("Asset Explorer", 800, 600);
        this.assetManager = assetManager;

        setMinimumSize(new Dimension(300, 300));

        rootNode = new DefaultMutableTreeNode("Assets", true);
        assetView = new JTree(rootNode);
        assetView.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {}

            @Override
            public void mousePressed(MouseEvent mouseEvent) {
                if (mouseEvent.getClickCount() == 2) {
                    TreePath path = assetView.getPathForLocation(mouseEvent.getX(), mouseEvent.getY());
                    int row = assetView.getRowForLocation(mouseEvent.getX(), mouseEvent.getY());
                    if (row != -1) handleDoubleClick(path, row);
                }
            }

            @Override
            public void mouseReleased(MouseEvent mouseEvent) {}
            @Override
            public void mouseEntered(MouseEvent mouseEvent) {}
            @Override
            public void mouseExited(MouseEvent mouseEvent) {}
        });
        reload();

        add(assetView, BorderLayout.CENTER);
    }

    private void handleDoubleClick(TreePath path, int row) {
        Log.info("Double click placeholder %0, %1", path, row);
    }

    private void reload() {
        rootNode.removeAllChildren();
        for (int i = 0; i < AssetType.ASSET_COUNT; i++) {
            DefaultMutableTreeNode assetTypeNode = new DefaultMutableTreeNode(AssetType.getAssetType(i).getHumanReadable());
            rootNode.add(assetTypeNode);
            for (GameAsset asset : assetManager.getAssetsByType(AssetType.getAssetType(i))) {
                DefaultMutableTreeNode assetNode = new DefaultMutableTreeNode(asset.getAssetID());
                assetTypeNode.add(assetNode);
            }
        }
    }

}
