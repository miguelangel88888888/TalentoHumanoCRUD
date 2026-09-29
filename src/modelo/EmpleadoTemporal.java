package modelo;

import java.time.LocalDate;

public class EmpleadoTemporal extends EmpleadoBase {
    private LocalDate fechaFinContrato;

    public EmpleadoTemporal(String cedula, String nombre, String cargo, double salario, LocalDate fechaFinContrato) {
        super(cedula, nombre, cargo, salario);
        this.fechaFinContrato = fechaFinContrato;
    }

    public LocalDate getFechaFinContrato() { return fechaFinContrato; }
    public void setFechaFinContrato(LocalDate fechaFinContrato) { this.fechaFinContrato = fechaFinContrato; }

    @Override
    public String toString() {
        return super.toString() + ", finContrato=" + fechaFinContrato;
    }
}
