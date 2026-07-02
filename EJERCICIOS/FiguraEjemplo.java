package POO;

public class FiguraEjemplo {

    // Atributos
    // Nunca de los nunca los atributos son publicos.!!
    private int lados;
    private double altura;
    private double grados;
    private double base;
    private String color;

    // constructor inicializa - instanciar
    public FiguraEjemplo(int lados, double altura, double grados, double base, String color) {
        this.lados = lados;
        this.altura = altura;
        this.grados = grados;
        this.base = base;
        this.color = color;
    }

    public FiguraEjemplo() {
        this.lados = 3;
        this.altura = 5.1;
        this.grados = 90;
        this.base = 15.22345234;
        this.color = "Negro";
    }

    public FiguraEjemplo(int lados) {
        this.lados = lados;
        // no es necesario definir todos los atributos
    }

    // metodo
    public double calculaPerimetro() {
        double resultado = 0;

        return resultado;
    }

    // metodo
    public double calculaArea() {
        double resultado = 0;

        return resultado;
    }

    // Propiedades son metodos que nos ayudan a modificar nuestros atributos
    public void setLados(int ladosDos) {
        // this = hace referencia a los atributos de la clase
        // validaciones
        this.lados = ladosDos;
    }

    public int getLados() {
        return this.lados;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public double getGrados() {
        return this.grados;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return this.base;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

}
