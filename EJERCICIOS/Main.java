package POO;

public class Main {

    public static void main(String[] args) {

        Calificaciones pablo = new Calificaciones(9, 4, 6);
        Calificaciones david = new Calificaciones(10, 10, 10);
        double resultadoPablo = pablo.calculaPromedio();
        double resultadoDavid = david.calculaPromedio();

        System.out.println("promedio de pablo es: " + resultadoPablo);
        System.out.println("promedio de david es: " + resultadoDavid);

        Campeon akali = new Campeon();
        akali.setName("akali");
        Campeon sett = new Campeon();
        sett.setName("sett");
        Campeon garen = new Campeon();
        garen.setName("garen");
    }

}
