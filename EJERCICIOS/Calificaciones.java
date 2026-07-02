package POO;

public class Calificaciones {

    private double matematicas;
    private double historia;
    private double fisica;

    public Calificaciones(double p1, double p2, double p3) {
        this.matematicas = p1;
        this.historia = p2;
        this.fisica = p3;
    }

    public double calculaPromedio() {
        return this.sumaCalificaciones() / 3;
    }

    private double sumaCalificaciones() {
        return this.getMatematicas() + this.getHistoria() + this.getFisica();
    }

    // write properties for each attribute
    public void setMatematicas(double matematicas) {
        this.matematicas = matematicas;
    }

    public double getMatematicas() {
        return matematicas;
    }

    public void setHistoria(double historia) {
        this.historia = historia;
    }

    public double getHistoria() {
        return historia;
    }

    public void setFisica(double fisica) {
        this.fisica = fisica;
    }

    public double getFisica() {
        return fisica;
    }

}
