package ca.viaware.mapmaker;

import ca.viaware.mapmaker.gui.windows.control.ControlWindow;
import ca.viaware.mapmaker.obj.GameManager;

import javax.swing.*;

public class ConstructionKit {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        GameManager gameManager = new GameManager();
        new ControlWindow(gameManager).setVisible(true);
    }

}
