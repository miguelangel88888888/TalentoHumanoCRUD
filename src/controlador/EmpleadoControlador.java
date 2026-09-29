package controlador;

import modelo.EmpleadoBase;
import repositorio.RepositorioEmpleados;
import java.util.List;

public class EmpleadoControlador {
    private RepositorioEmpleados repositorio;

    public EmpleadoControlador(RepositorioEmpleados repositorio) {
        this.repositorio = repositorio;
    }

    // Agregar empleado
    public boolean agregarEmpleado(EmpleadoBase e) {
        return repositorio.agregar(e);
    }

    // Buscar empleado
    public EmpleadoBase buscarEmpleado(String cedula) {
        return repositorio.buscar(cedula);
    }

    // Actualizar empleado
    public boolean actualizarEmpleado(EmpleadoBase e) {
        return repositorio.actualizar(e);
    }

    // Eliminar empleado
    public boolean eliminarEmpleado(String cedula) {
        return repositorio.eliminar(cedula);
    }

    // Listar empleados
    public List<EmpleadoBase> listarEmpleados() {
        return repositorio.listarTodos();
    }
}
