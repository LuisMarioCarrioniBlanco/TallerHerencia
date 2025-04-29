package Animal;

/**
 *
 * @author sistemas
 */
public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void emitirSonido() {
        System.out.println("¡Guau! Soy un perro de raza " + raza);
    }
}
