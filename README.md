# Proyecto TalentoHumano

## 📌 Descripción
Este proyecto implementa un sistema básico de **gestión de empleados** en Java, utilizando el patrón **MVC (Modelo–Vista–Controlador)** y una interfaz gráfica con **Swing**.  
Forma parte del trabajo de los **Cómics ADSO**, donde cada cómic representa un avance en el desarrollo.

---

## 📂 Estructura del proyecto
src/
├── modelo/
│    └── EmpleadoBase.java
├── repositorio/
│    └── RepositorioEmpleados.java
├── controlador/
│    └── EmpleadoControlador.java
├── vista/
│    └── VentanaEmpleados.java
└── Main.java


---

## 🎭 Cómics ADSO
1. **Cómic 1 – Modelo**  
   Creación de la clase `EmpleadoBase` con atributos y constructor.

2. **Cómic 2 – Repositorio**  
   Implementación de `RepositorioEmpleados` para almacenar empleados en memoria.

3. **Cómic 3 – Controlador**  
   Clase `EmpleadoControlador` que conecta el repositorio con la vista.

4. **Cómic 4 – Vista**  
   Ventana gráfica `VentanaEmpleados` con campos de entrada, botones y área de resultados.

5. **Cómic 5 – Main**  
   Clase principal `Main` que lanza la ventana con `SwingUtilities.invokeLater`.

6. **Cómic 6 – Documentación**  
   Este README.md con explicación y organización del proyecto.

---

## ▶️ Ejecución en IntelliJ o VS Code
1. Abre el proyecto.
2. Marca la carpeta `src` como **Sources**.
3. Haz **Build → Rebuild Project** (en IntelliJ) o compila con `javac` (en VS Code).
4. Ejecuta con clic derecho sobre `Main.java` → **Run 'Main.main()'**.
5. Se abrirá la ventana `VentanaEmpleados`.

---

## 🔗 Diagrama MVC (texto)
[Usuario] → [Vista: VentanaEmpleados] → [Controlador: EmpleadoControlador] → [Repositorio: RepositorioEmpleados] → [Modelo: EmpleadoBase]


---

## ✨ Conclusión
El proyecto demuestra cómo aplicar el patrón MVC en Java con Swing, integrando lógica de negocio, almacenamiento en memoria y una interfaz gráfica sencilla.  
Cada cómic representa un paso en el desarrollo, culminando con esta documentación que organiza y explica todo el trabajo.

