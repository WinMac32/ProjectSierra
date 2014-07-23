package ca.viaware.api.gui.base;

import javax.swing.BoxLayout;

@SuppressWarnings("serial")
public class VList extends VPanel {

	private VListElement currentClicked;
	
	public VList() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}
	
	public void setClicked(VListElement e) {
		if (currentClicked != null) currentClicked.setClicked(false);
		currentClicked = e;
	}
	
	public VListElement getAbove(VListElement below) {
		for (int i = 0; i < getComponentCount(); i++) {
			if (this.getComponent(i).equals(below)) {
				if (i > 0) return (VListElement) getComponent(i-1);
			}
		}
		
		return null;
	}
	
}
