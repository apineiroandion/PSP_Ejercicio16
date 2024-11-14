package controller;

import controller.hilos.Bajada;
import controller.hilos.Subida;
import model.Ascensor;
import view.FloorPanel;

import java.util.LinkedList;
import java.util.Queue;

public class AscensorController {
    private Ascensor ascensor;
    private Bajada bajada;
    private Subida subida;
    private FloorPanel floorPanel;
    private Queue<Integer> colaPisos;

    public AscensorController(Ascensor ascensor, FloorPanel floorPanel) {
        this.ascensor = ascensor;
        this.floorPanel = floorPanel;
        this.colaPisos = new LinkedList<>();
    }

    public void pulsarBoton(Integer nuevoPiso) {
//        if (nuevoPiso > ascensor.getPisoActual()) {
//            subir(nuevoPiso);
//        } else if (nuevoPiso < ascensor.getPisoActual()) {
//            bajar(nuevoPiso);
//        }else {
//            System.out.println("Ya estás en el piso " + nuevoPiso);
//        }
        colaPisos.add(nuevoPiso);
        if (!ascensor.getEnMovimiento()) {
                procesarSiguienteSolicitud();
        }

    }

    private void procesarSiguienteSolicitud() {
        if (!colaPisos.isEmpty()) {
            int siguientePiso = colaPisos.poll();
            if (siguientePiso > ascensor.getPisoActual()) {
                subir(siguientePiso);
            } else if (siguientePiso < ascensor.getPisoActual()) {
                bajar(siguientePiso);
            } else {
                System.out.println("Ya estás en el piso " + siguientePiso);
                procesarSiguienteSolicitud();
            }
        }
    }

    public void subir(int nuevoPiso) {
        if (!ascensor.getEnMovimiento()) {
            subida = new Subida(ascensor, floorPanel, this);
            subida.setNuevoPiso(nuevoPiso);
            subida.start();
        }
    }

    public void bajar(int nuevoPiso) {
        if (!ascensor.getEnMovimiento()) {
            bajada = new Bajada(ascensor, floorPanel, this);
            bajada.setNuevoPiso(nuevoPiso);
            bajada.start();
        }
    }

    public void viajeTerminado() {
        ascensor.setEnMovimiento(false);
        procesarSiguienteSolicitud();
    }

}
