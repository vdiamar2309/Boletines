package domain;

public class Gorron extends Invitados {
    public Gorron(String nombre) {
        super(nombre);
        super.setHambre(90);
    }

    @Override
    public void aperturaRegalos() {
    divertirse(10);
    }

    @Override
    public void piniata() {
    divertirse(5);
    comer(20);
    }

    @Override
    public void baile() {
    divertirse(5);
    comer(20);
    }

    @Override
    public void charlita() {
    aburrirse(20);
    }

    @Override
    public void musicaBaja() {
    aburrirse(30);
    }

    @Override
    public void musicaAlta() {
    comer(20);
    }

    @Override
    public void corteTarta() {
    comer(30);
    }

}
