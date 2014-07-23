package ca.viaware.tileset.gui;

import ca.viaware.tileset.Region;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class RawImageWindow extends JFrame {

    private SidebarPanel sidebarPanel;
    private RawImagePanel imagePanel;

    private ArrayList<Region> regions;

    public RawImageWindow(BufferedImage image, ArrayList<Region> regions) {
        setTitle("ViaWare Tileset Creator");
        setSize(1200, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.regions = regions;
        
        imagePanel = new RawImagePanel(image, regions);
        sidebarPanel = new SidebarPanel(imagePanel, regions);

        final JScrollPane scroll = new JScrollPane(imagePanel);

        scroll.getViewport().addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent changeEvent) {
                //Linux fix
                scroll.repaint();
            }
        });

        add(sidebarPanel, BorderLayout.LINE_START);
        add(scroll, BorderLayout.CENTER);
    }

}
