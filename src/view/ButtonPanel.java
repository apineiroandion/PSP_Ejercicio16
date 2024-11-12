package view;

import controller.AscensorController;
import view.resources.ActionListenerNumericButtons;
import view.resources.Button;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {
    public ButtonPanel(FloorPanel floorPanel, AscensorController ascensorController) {
        this.setLayout(new GridLayout(10,2));
        ActionListenerNumericButtons listener = new ActionListenerNumericButtons(floorPanel, ascensorController);
        crearBotones(20, listener);
    }
    public void crearBotones(Integer cantidad, ActionListenerNumericButtons listener) {
        for (int i = 0; i < cantidad; i++) {
            this.add(new Button(String.valueOf(i),listener ));
        }
    }
}
