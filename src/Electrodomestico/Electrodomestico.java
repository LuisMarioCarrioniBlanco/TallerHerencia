package Electrodomestico;

/**
 *
 * @author sistemas
 */
public class Electrodomestico {
    private String marca;
    private double consumoEnergetico;

    public Electrodomestico(String marca, double consumoEnergetico) {
        this.marca = marca;
        this.consumoEnergetico = consumoEnergetico;
    }

    public void encender() {
        System.out.println("Electrodoméstico encendido.");
    }

    public void apagar() {
        System.out.println("Electrodoméstico apagado.");
    }

    public String getMarca() {
        return marca;
    }

    public double getConsumoEnergetico() {
        return consumoEnergetico;
    }
    
}

