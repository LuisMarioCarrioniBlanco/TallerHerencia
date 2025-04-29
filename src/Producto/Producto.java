package Producto;
/**
 *
 * @author sistemas
 */
public class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Marca del producto: " + precio);
    }
}
