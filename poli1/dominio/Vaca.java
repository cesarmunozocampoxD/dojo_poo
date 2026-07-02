package dominio;

public class Vaca extends Animal implements ITerrestre {

    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "Muu";
    }

    @Override
    public void caminar() {
        System.out.println(getNombre() + " está caminando lentamente en cuatros patas.");
    }

}
