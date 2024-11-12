package view.resources;

import controller.AscensorController;
import view.FloorPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerNumericButtons implements ActionListener {
    private FloorPanel floorPanel;
    private AscensorController ascensorController;

    public ActionListenerNumericButtons(FloorPanel floorPanel, AscensorController ascensorController) {
        this.floorPanel = floorPanel;
        this.ascensorController = ascensorController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand(); //TODO: Cambiar a getActionCommand
        try {
            int piso = Integer.parseInt(command);
            //floorPanel.setFloor(piso);
            ascensorController.pulsarBoton(piso);
            mostrarPiso(piso);
        } catch (NumberFormatException ex) {
            System.out.println("Comando no es un número válido: " + command);
        }
    }

    public void mostrarPiso(int piso) {
        System.out.println("Piso: " + piso);
    }
}