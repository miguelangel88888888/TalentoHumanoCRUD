package modelo;

public class EmpleadoAdministrativo extends EmpleadoBase {
    private String departamento;
    private String nivelJerarquico;

    public EmpleadoAdministrativo(String cedula, String nombre, String cargo, double salario,
                                  String departamento, String nivelJerarquico) {
        super(cedula, nombre, cargo, salario);
        this.departamento = departamento;
        this.nivelJerarquico = nivelJerarquico;
    }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public String getNivelJerarquico() { return nivelJerarquico; }
    public void setNivelJerarquico(String nivelJerarquico) { this.nivelJerarquico = nivelJerarquico; }

    @Override
    public String toString() {
        return super.toString() + ", departamento=" + departamento +
                ", nivelJerarquico=" + nivelJerarquico;
    }
}
