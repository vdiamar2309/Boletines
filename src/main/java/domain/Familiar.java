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
    aburrirse(20);
    }

    @Override
    public void musicaBaja() {
    divertirse(20);
    }

    @Override
    public void charlita() {
    divertirse(20);
    }

    @Override
    public void baile() {
    divertirse(15);
    }

    @Override
    public void piniata() {
    divertirse(20);
    }

    @Override
    public void aperturaRegalos() {
        divertirse(20);
    }

}
