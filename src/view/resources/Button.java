package view.resources;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Button extends JButton {
    public Button(String text, ActionListener actionListener) {
        super(text);
        this.addActionListener(actionListener);
    }
}
