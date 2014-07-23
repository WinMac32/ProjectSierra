package ca.viaware.api.gui.base;

import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class VMenuItem extends JMenuItem {

	public VMenuItem(String text, int mnemonic) {
		super(text, mnemonic);
	}
	
	public VMenuItem(String text) {
		super(text);
	}
	
	public VMenuItem(String text, ActionListener listener, String command) {
		this(text);
		addActionListener(listener);
		setActionCommand(command);
	}
	
	public VMenuItem() {
		super();
	}
	
}
