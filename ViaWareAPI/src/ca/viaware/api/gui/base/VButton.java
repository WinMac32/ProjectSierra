package ca.viaware.api.gui.base;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
	
	public VButton(Color activeBackground, Color hoverBackground, Color selectedBackground, String text) {
		this.activeBackground = activeBackground;
		this.hoverBackground = hoverBackground;
		this.selectedBackground = selectedBackground;
		this.text = text;
		
		this.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				mouseClicking = false;
			}
			@Override
			public void mousePressed(MouseEvent arg0) {
				mouseClicking = true;
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				mouseOver = false;
			}
			@Override
			public void mouseEntered(MouseEvent arg0) {
				mouseOver = true;
			}
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		
	}
	
	public VButton(int activeBackground, int hoverBackground, int selectedBackground, String text) {
		this(new Color(activeBackground), new Color(hoverBackground), new Color(selectedBackground), text);
	}
	
	public VButton(String text) {
		this(new Color(0xFFFFFF), new Color(0xCCCCCC), new Color(0xAAAAAA), text);
	}
	
	public VButton() {
		this("");
	}
	
	/*
	@Override
	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		g2d.clearRect(0, 0, getWidth(), getHeight());
		g2d.setColor((mouseClicking ? selectedBackground : (mouseOver ? hoverBackground : activeBackground)));
		g2d.fillRect(0, 0, getWidth(), getHeight());
		g2d.setColor(new Color(0x000000));
		g2d.drawString(text, (getWidth() / 2) - (getFontMetrics(getFont()).stringWidth(text) / 2), (getHeight() / 2) - (getFontMetrics(getFont()).getHeight() / 2));
	}
	*/
}
