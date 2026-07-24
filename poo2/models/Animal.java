public abstract class Animal {

    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // todos los metodos que definias como abstractos
    // los tienes que implementar en las clases hijas.

    // definir una funcion
    public abstract void hacerSonido();

    // lo que va entre llaves es la implementacion.

    public void moverse() {

    }

}
