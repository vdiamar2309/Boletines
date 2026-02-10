package domain;

public class Familiar extends Invitados {
    public Familiar(String nombre) {
        super(nombre);
        super.setHambre((int) (Math.random() * 30) + 30);
    }

    @Override
    public void corteTarta() {
        comer(20);
    }

    @Override
    public void musicaAlta() {

    }

    @Override
    public void musicaBaja() {

    }

    @Override
    public void charlita() {

    }

    @Override
    public void baile() {

    }

    @Override
    public void piniata() {

    }

    @Override
    public void aperturaRegalos() {

    }
}
