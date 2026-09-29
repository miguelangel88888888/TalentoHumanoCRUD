package modelo;

public class EmpleadoPlanta extends EmpleadoBase {
    private double bonificacion;

    public EmpleadoPlanta(String cedula, String nombre, double salarioBase, double bonificacion) {
        super(cedula, nombre, salarioBase);
        this.bonificacion = bonificacion;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public double calcularSalarioTotal() {
        return super.calcularSalarioTotal() + bonificacion;
    }

    @Override
    public String getTipo() {
        return "Planta";
    }
}

