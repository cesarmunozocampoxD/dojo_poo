package dominio;

public class Gato extends Animal implements ITerrestre {

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "Miau";
    }

    @Override
    public void caminar() {
        System.out.println(getNombre() + " está caminando sigilosamente en cuatros patas.");
    }
}
