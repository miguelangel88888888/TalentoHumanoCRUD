package repositorio;

import modelo.EmpleadoBase;
import java.util.*;

public class RepositorioEmpleados {
    private Map<String, EmpleadoBase> empleados = new HashMap<>();

    // Agregar empleado
    public boolean agregar(EmpleadoBase e) {
        if (empleados.containsKey(e.getCedula())) {
            System.out.println("⚠️ Ya existe un empleado con esa cédula.");
            return false;
        }
        empleados.put(e.getCedula(), e);
        System.out.println("✅ Empleado agregado correctamente.");
        return true;
    }

    // Buscar empleado
    public EmpleadoBase buscar(String cedula) {
        return empleados.get(cedula);
    }

    // Actualizar empleado
    public boolean actualizar(EmpleadoBase e) {
        if (!empleados.containsKey(e.getCedula())) {
            System.out.println("⚠️ No se encontró el empleado para actualizar.");
            return false;
        }
        empleados.put(e.getCedula(), e);
        System.out.println("✅ Empleado actualizado correctamente.");
        return true;
    }

    // Eliminar empleado
    public boolean eliminar(String cedula) {
        if (empleados.remove(cedula) != null) {
            System.out.println("✅ Empleado eliminado correctamente.");
            return true;
        }
        System.out.println("⚠️ No se encontró el empleado para eliminar.");
        return false;
    }

    // Listar todos los empleados
    public List<EmpleadoBase> listarTodos() {
        return new ArrayList<>(empleados.values());
    }
}
