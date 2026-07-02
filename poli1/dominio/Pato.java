package dominio;

public class Pato extends Animal implements IAcuatico, ITerrestre, IVolador {

    public Pato(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "Cuac";
    }

    @Override
    public void volar() {
        System.out.println(getNombre() + " está volando en el cielo.");
    }

    @Override
    public void caminar() {
        System.out.println(getNombre() + " está caminando en el suelo.");
    }

    @Override
    public void nadar() {
        System.out.println(getNombre() + " está nadando en el agua.");
    }
}
