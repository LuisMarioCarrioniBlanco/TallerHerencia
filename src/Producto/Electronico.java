package Producto;
/**
 *
 * @author sistemas
 */
public class Electronico extends Producto {
    private int garantiaMeses;

    public Electronico(String nombre, double precio, int garantiaMeses) {
        super(nombre, precio);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Garantía: " + garantiaMeses + " meses");
    }
}