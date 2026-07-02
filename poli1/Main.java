import dominio.Animal;
import dominio.Perro;
import dominio.Gato;
import dominio.Vaca;
import dominio.Pato;

public class Main {

    public static void main(String[] args) {

        Animal[] animales = {
                new Perro("Firulais"),
                new Gato("Michi"),
                new Vaca("Lola"),
                new Pato("Donald")
        };

        for (int i = 0; i < animales.length; i++) {
            Animal a = animales[i];
            System.out.println(a.getNombre() + " dice: " + a.hacerSonido() + " y ");
            a.cagar();

        }
    }
}
