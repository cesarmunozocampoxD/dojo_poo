package dominio;

public class Perro extends Animal implements ITerrestre {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "Guau guau";
    }

    @Override
    public void caminar() {
        System.out.println(getNombre() + " está caminando haciendo un desmadre en cuatros patas.");
    }
}
