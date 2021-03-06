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
package ca.viaware.tileset.gui;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class LabelAndTextPanel extends JPanel {

    private JTextField textField;
    private JLabel label;

    public LabelAndTextPanel(String labelText, String fieldText) {
        textField = new JTextField(fieldText);
        label = new JLabel(labelText);

        setLayout(new FlowLayout());

        textField.setPreferredSize(new Dimension(90, 25));
        label.setPreferredSize(new Dimension(80, 25));

        add(label);
        add(textField);

    }

    public LabelAndTextPanel() {
        this("","");
    }

    public JTextField getField() {
        return textField;
    }

    public JLabel getLabel() {
        return label;
    }
}
