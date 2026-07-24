public class pez extends Animal implements INadador {

    public pez(String nombre) {
        super(nombre);
    }

    @Override
    public void nadar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nadar'");
    }

    @Override
    public void hacerSonido() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hacerSonido'");
    }

    @Override
    public void moverse() {
        super.moverse();
    }

}
