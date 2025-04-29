package Electrodomestico;

/**
 *
 * @author sistemas
 */
public class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora(String marca, double consumoEnergetico, double carga) {
        super(marca, consumoEnergetico);
        this.carga = carga;
    }

    public void lavar() {
        System.out.println("Lavando ropa con carga de " + carga + " kg.");
    }
}
