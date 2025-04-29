package Persona;

/**
 *
 * @author sistemas
 */
public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    public void mostrarDatosEstudiante() {
        System.out.println("Estudiante: " + nombre + ", " + edad + " años, Carrera: " + carrera);
    }
}
