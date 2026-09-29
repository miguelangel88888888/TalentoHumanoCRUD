package modelo;

import java.time.LocalDate;

public class EmpleadoTemporal extends EmpleadoBase {
    private LocalDate fechaFinContrato;

    public EmpleadoTemporal(String cedula, String nombre, double salarioBase, LocalDate fechaFinContrato) {
        super(cedula, nombre, salarioBase);
        this.fechaFinContrato = fechaFinContrato;
    }

    public LocalDate getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(LocalDate fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    @Override
    public String getTipo() {
        return "Temporal";
    }
}

