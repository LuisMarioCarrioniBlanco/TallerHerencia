package Electrodomestico;

/**
 *
 * @author sistemas
 */
public class MainEj1 {

    public static void main(String[] args) {
        Lavadora l = new Lavadora("LG", 0.5, 7);
        Televisor t = new Televisor("Samsung", 0.2, 55);
        l.encender(); l.lavar(); l.apagar();
        t.encender(); t.cambiarCanal(7); t.apagar();
    }
    
}
