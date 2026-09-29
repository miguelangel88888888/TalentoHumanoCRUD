package modelo;

public class EmpleadoBase {
    private String cedula;
    private String nombre;
    private String cargo;
    private double salario;

    public EmpleadoBase(String cedula, String nombre, String cargo, double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Getters y Setters
    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    @Override
    public String toString() {
        return "Empleado [cedula=" + cedula + ", nombre=" + nombre +
                ", cargo=" + cargo + ", salario=" + salario + "]";
    }
}
