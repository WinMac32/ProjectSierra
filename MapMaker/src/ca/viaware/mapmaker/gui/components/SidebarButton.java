package ca.viaware.mapmaker.gui.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class SidebarButton extends JButton {

    public SidebarButton(String text) {
        super(text);
        setPreferredSize(new Dimension(180, 30));
    }

    public SidebarButton(ActionListener e, String actionCommand, String text) {
        this(text);
        addActionListener(e);
        setActionCommand(actionCommand);
    }

}
