package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RepositorioEmpleados {

    private HashMap<String, EmpleadoBase> empleados;

    public RepositorioEmpleados() {
        empleados = new HashMap<>();
    }

    public boolean agregar(EmpleadoBase empleado) {
        if (empleados.containsKey(empleado.getCedula())) {
            return false;
        }

        empleados.put(empleado.getCedula(), empleado);
        return true;
    }

    public EmpleadoBase buscar(String cedula) {
        return empleados.get(cedula);
    }

    public boolean actualizar(EmpleadoBase empleado) {
        if (!empleados.containsKey(empleado.getCedula())) {
            return false;
        }

        empleados.put(empleado.getCedula(), empleado);
        return true;
    }

    public boolean eliminar(String cedula) {
        return empleados.remove(cedula) != null;
    }

    public List<EmpleadoBase> listarTodos() {
        return new ArrayList<>(empleados.values());
    }
}