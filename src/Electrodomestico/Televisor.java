package Electrodomestico;

/**
 *
 * @author sistemas
 */
public class Televisor extends Electrodomestico {
    private int tamanioPulgadas;

    public Televisor(String marca, double consumoEnergetico, int tamanioPulgadas) {
        super(marca, consumoEnergetico);
        this.tamanioPulgadas = tamanioPulgadas;
    }

    public void cambiarCanal(int canal) {
        System.out.println("Cambiando al canal " + canal + ".");
    }
}
