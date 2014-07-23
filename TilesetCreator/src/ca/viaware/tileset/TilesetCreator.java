package ca.viaware.tileset;

import ca.viaware.api.logging.Log;
import ca.viaware.tileset.gui.RawImageWindow;
import ca.viaware.tileset.utils.FileUtils;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TilesetCreator {

    public static void main(String[] args) {
        Log.info("Running ViaWare tileset creator");

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (InstantiationException e1) {
            e1.printStackTrace();
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        } catch (UnsupportedLookAndFeelException e1) {
            e1.printStackTrace();
        }
        
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File imageFile = chooser.getSelectedFile();
            if (imageFile.exists()) {
                try {
                    BufferedImage image = ImageIO.read(imageFile);
                    Log.info("Image is valid...");
                    Globals.dataFile = new File(imageFile.getParent() + "/" + imageFile.getName().split("[.]")[0] + ".regions");
                    new RawImageWindow(image, FileUtils.loadRegions(Globals.dataFile)).setVisible(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                Log.error("Could not find that image file!");
            }
        } else {
            Log.error("User cancelled.");
        }

    }
}
