package ca.viaware.tileset.gui;

import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
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
