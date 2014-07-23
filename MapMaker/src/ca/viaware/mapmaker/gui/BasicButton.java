package ca.viaware.mapmaker.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BasicButton extends JButton {

    public BasicButton(ActionListener e, String actionCommand, String text) {
        this(text);
        addActionListener(e);
        setActionCommand(actionCommand);
    }

    public BasicButton(String text) {
        super(text);
        setPreferredSize(new Dimension(180, 30));
    }

}
