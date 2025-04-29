package Producto;
/**
 *
 * @author sistemas
 */
public class Alimento extends Producto {
    private String fechaCaducidad;

    public Alimento(String nombre, double precio, String fechaCaducidad) {
        super(nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Fecha de caducidad: " + fechaCaducidad);
    }
}
