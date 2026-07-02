package dominio;

public class Pajaro extends Animal implements IVolador, ITerrestre {

    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "Pio pio";
    }

    @Override
    public void volar() {
        System.out.println(getNombre() + " está volando en el cielo.");
    }

    @Override
    public void caminar() {
        System.out.println(getNombre() + " está caminando en el suelo.");
    }

}
