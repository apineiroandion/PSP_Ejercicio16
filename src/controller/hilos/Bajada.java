package controller.hilos;

import model.Ascensor;
import view.FloorPanel;

import javax.swing.*;

public class Bajada extends Thread{
    private Ascensor ascensor;
    private FloorPanel floorPanel;
    private int nuevoPiso;

    public Bajada(Ascensor ascensor, FloorPanel floorPanel) {
        this.ascensor = ascensor;
        this.floorPanel = floorPanel;
    }

    @Override
    public void run() {
        ascensor.setEnMovimiento(true);
        for (int i = ascensor.getPisoActual(); i >= nuevoPiso; i--) {
            ascensor.setPisoActual(i);
            SwingUtilities.invokeLater(() -> floorPanel.setFloor(ascensor.getPisoActual()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        ascensor.setEnMovimiento(false);
    }
    public void setNuevoPiso(int nuevoPiso) {
        this.nuevoPiso = nuevoPiso;
    }
}
