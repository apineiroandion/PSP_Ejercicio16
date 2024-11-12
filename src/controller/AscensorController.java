package controller;

import controller.hilos.Bajada;
import controller.hilos.Subida;
import model.Ascensor;
import view.FloorPanel;

public class AscensorController {
    private Ascensor ascensor;
    private Bajada bajada;
    private Subida subida;
    private FloorPanel floorPanel;

    public AscensorController(Ascensor ascensor, FloorPanel floorPanel) {
        this.ascensor = ascensor;
        this.floorPanel = floorPanel;
    }

    public void pulsarBoton(Integer nuevoPiso) {
        if (nuevoPiso > ascensor.getPisoActual()) {
            subir(nuevoPiso);
        } else if (nuevoPiso < ascensor.getPisoActual()) {
            bajar(nuevoPiso);
        }else {
            System.out.println("Ya estás en el piso " + nuevoPiso);
        }
    }

    public void subir(int nuevoPiso) {
        if (!ascensor.getEnMovimiento()) {
            subida = new Subida(ascensor, floorPanel);
            subida.setNuevoPiso(nuevoPiso);
            subida.start();
        }
    }

    public void bajar(int nuevoPiso) {
        if (!ascensor.getEnMovimiento()) {
            bajada = new Bajada(ascensor, floorPanel);
            bajada.setNuevoPiso(nuevoPiso);
            bajada.start();
        }
    }

}
