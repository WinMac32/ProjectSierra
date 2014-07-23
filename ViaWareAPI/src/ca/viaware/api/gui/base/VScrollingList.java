package ca.viaware.api.gui.base;

@SuppressWarnings("serial")
public class VScrollingList extends VPanel {
	
	private VList list;
	private VScrollPane scrollPane;
	
	public VScrollingList() {
		list = new VList();
		scrollPane = new VScrollPane(list);
		scrollPane.getVerticalScrollBar().setUnitIncrement(16);
		add(scrollPane);
	}
	
	public void add(VListElement e) {
		list.add(e);
	}
	
	public VList getList() {
		return list;
	}
	
	public VScrollPane getScrollPane() {
		return scrollPane;
	}
}
