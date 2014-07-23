package ca.viaware.api.gui.base;

import java.awt.BorderLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import ca.viaware.api.gui.base.event.CloseListener;

@SuppressWarnings("serial")
public class VFrame extends JFrame {

	private VPanel mainPanel;
	
	private CloseListener closeListener;
	
	public VFrame(String title, int width, int height) {
		this.mainPanel = new VPanel();
		this.getContentPane().add(mainPanel, BorderLayout.CENTER);
		this.setTitle(title);
		this.setSize(width, height);
		
		this.addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {}
			@Override
			public void windowIconified(WindowEvent e) {}
			@Override
			public void windowDeiconified(WindowEvent e) {}
			@Override
			public void windowDeactivated(WindowEvent e) {}
			@Override
			public void windowClosing(WindowEvent e) {
				if (closeListener != null) closeListener.onClose();
			}
			@Override
			public void windowClosed(WindowEvent e) {}
			@Override
			public void windowActivated(WindowEvent e) {}
		});
	}
	
	public VFrame(String title) {
		this(title, 200, 200);
	}
	
	public VFrame() {
		this("");
	}
	
	public VPanel getMainPanel() {
		return mainPanel;
	}
	
	public void setCloseListener(CloseListener closeListener) {
		this.closeListener = closeListener;
	}
	
	
}
