/*
Copyright 2014 Seth Traverse

This file is part of Project Sierra.

Project Sierra is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Project Sierra is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Project Sierra.  If not, see <http://www.gnu.org/licenses/>.
 */
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
