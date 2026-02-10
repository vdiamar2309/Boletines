package domain;

public class Colega extends Invitados {
    public Colega(String nombre) {
        super(nombre);
        super.setHambre((int) (Math.random() * 50) + 20);
    }


    @Override
    public void corteTarta() {
        comer(20);
    }
    @Override
    public void musicaBaja() {
        aburrirse(30);
    }
    @Override
    public void charlita() {
        divertirse(20);
    }
    @Override
    public void baile() {
        divertirse(20);
    }
    @Override
    public void piniata() {
    divertirse(20);
    comer(10);
    }

    @Override
    public void musicaAlta() {
        divertirse(30);
    }

    @Override
    public void aperturaRegalos() {
    divertirse(10);
    }
}
