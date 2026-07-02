package dominio;

public abstract class Animal {

    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto: cada subclase DEBE implementarlo a su manera (polimorfismo)
    public abstract String hacerSonido();

    public void cagar() {
        System.out.println("Estoy cagando");
    }

    public String getNombre() {
        return nombre;
    }
}
