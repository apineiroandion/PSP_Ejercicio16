package controller.hilos;

import model.Ascensor;
import view.FloorPanel;

public class Subida extends Thread{
    private Ascensor ascensor;
    private FloorPanel floorPanel;
    private int nuevoPiso;

    public Subida(Ascensor ascensor, FloorPanel floorPanel) {
        this.ascensor = ascensor;
        this.floorPanel = floorPanel;
    }

    @Override
    public void run() {
        ascensor.setEnMovimiento(true);
        //TODO: Implementar limite de piso
        for (int i = ascensor.getPisoActual(); i <= nuevoPiso; i++) {
            ascensor.setPisoActual(i);
            floorPanel.setFloor(ascensor.getPisoActual());
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
