package ca.viaware.api.gui.base;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

@SuppressWarnings({ "unused", "serial" })
public class VButton extends JButton {

	private Color activeBackground;
	private Color hoverBackground;
	private Color selectedBackground;
	private String text;
	
	private boolean mouseOver;
	private boolean mouseClicking;

    public VButton(String text) {
        super(text);
    }

    public VButton(String text, ActionListener listener, String actionCommand) {
        this(text);
        addActionListener(listener);
        setActionCommand(actionCommand);
    }

    public VButton() {
        this("");
    }

}
