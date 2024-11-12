package model;

public class Ascensor {
    private Integer pisoActual;
    private Boolean enMovimiento;

    public Ascensor() {
        this.pisoActual = 0;
        this.enMovimiento = false;
    }

    public Integer getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(Integer pisoActual) {
        this.pisoActual = pisoActual;
    }

    public Boolean getEnMovimiento() {
        return enMovimiento;
    }

    public void setEnMovimiento(Boolean enMovimiento) {
        this.enMovimiento = enMovimiento;
    }
}
