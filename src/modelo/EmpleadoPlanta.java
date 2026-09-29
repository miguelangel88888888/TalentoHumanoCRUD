package modelo;

public class EmpleadoPlanta extends EmpleadoBase {
    private double bonificacion;

    public EmpleadoPlanta(String cedula, String nombre, String cargo, double salario, double bonificacion) {
        super(cedula, nombre, cargo, salario);
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() { return bonificacion; }
    public void setBonificacion(double bonificacion) { this.bonificacion = bonificacion; }

    @Override
    public String toString() {
        return super.toString() + ", bonificacion=" + bonificacion;
    }
}

