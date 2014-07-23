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
