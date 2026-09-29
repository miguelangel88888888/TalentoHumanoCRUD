package vista;

import controlador.EmpleadoControlador;
import modelo.EmpleadoBase;
import repositorio.RepositorioEmpleados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEmpleados extends JFrame {
    private EmpleadoControlador controlador;

    // Componentes de la interfaz
    private JTextField txtCedula, txtNombre, txtCargo, txtSalario;
    private JTextArea areaResultado;

    public VentanaEmpleados() {
        // Inicializar controlador con repositorio
        controlador = new EmpleadoControlador(new RepositorioEmpleados());

        setTitle("Gestión de Empleados");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel de entrada
        JPanel panelEntrada = new JPanel(new GridLayout(4, 2));
        panelEntrada.add(new JLabel("Cédula:"));
        txtCedula = new JTextField();
        panelEntrada.add(txtCedula);

        panelEntrada.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelEntrada.add(txtNombre);

        panelEntrada.add(new JLabel("Cargo:"));
        txtCargo = new JTextField();
        panelEntrada.add(txtCargo);

        panelEntrada.add(new JLabel("Salario:"));
        txtSalario = new JTextField();
        panelEntrada.add(txtSalario);

        add(panelEntrada, BorderLayout.NORTH);

        // Panel de botones
        JPanel panelBotones = new JPanel(new FlowLayout());
        JButton btnAgregar = new JButton("Agregar");
        JButton btnBuscar = new JButton("Buscar");
        JButton btnActualizar = new JButton("Actualizar");
        JButton btnEliminar = new JButton("Eliminar");
        JButton btnListar = new JButton("Listar");

        panelBotones.add(btnAgregar);
        panelBotones.add(btnBuscar);
        panelBotones.add(btnActualizar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnListar);

        add(panelBotones, BorderLayout.CENTER);

        // Área de resultados
        areaResultado = new JTextArea();
        add(new JScrollPane(areaResultado), BorderLayout.SOUTH);

        // Eventos de botones
        btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EmpleadoBase emp = new EmpleadoBase(
                        txtCedula.getText(),
                        txtNombre.getText(),
                        txtCargo.getText(),
                        Double.parseDouble(txtSalario.getText())
                );
                controlador.agregarEmpleado(emp);
                areaResultado.setText("Empleado agregado: " + emp);
            }
        });

        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EmpleadoBase emp = controlador.buscarEmpleado(txtCedula.getText());
                areaResultado.setText(emp != null ? emp.toString() : "Empleado no encontrado.");
            }
        });

        btnActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EmpleadoBase emp = new EmpleadoBase(
                        txtCedula.getText(),
                        txtNombre.getText(),
                        txtCargo.getText(),
                        Double.parseDouble(txtSalario.getText())
                );
                controlador.actualizarEmpleado(emp);
                areaResultado.setText("Empleado actualizado: " + emp);
            }
        });

        btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controlador.eliminarEmpleado(txtCedula.getText());
                areaResultado.setText("Empleado eliminado con cédula: " + txtCedula.getText());
            }
        });

        btnListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                areaResultado.setText("Lista de empleados:\n");
                for (EmpleadoBase emp : controlador.listarEmpleados()) {
                    areaResultado.append(emp.toString() + "\n");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new VentanaEmpleados().setVisible(true));
    }
}
