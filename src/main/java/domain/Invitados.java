package domain;


public abstract class Invitados {

    private String nombre;
    private int aburrimiento;
    private int hambre;
    private Invitados[] invitados;

    public Invitados(String nombre) {
        this.nombre = nombre;
        aburrimiento=((int) (Math.random() * 0) + 50);;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAburrimiento() {
        return aburrimiento;
    }

    public void setAburrimiento(int aburrimiento) {
        this.aburrimiento = aburrimiento;
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public abstract void corteTarta();

    public abstract void musicaAlta();

    public abstract void musicaBaja();

    public abstract void charlita();

    public abstract void baile();

    public abstract void piniata();

    public abstract void aperturaRegalos();

    public void divertirse(int i) {
        if (aburrimiento <= 20) {
            aburrimiento = 0;
        } else
        aburrimiento -= i;
    }

    public void aburrirse(int i) {

        if (aburrimiento >= 80) {
            aburrimiento = 100;
        }else

        aburrimiento += i;
    }

    public void comer(int i) {

        if (hambre <= 20) {
            hambre = 0;
        }else
            hambre -= i;
    }

    public void pasarHambre(int i) {

        if (hambre >= 80) {
            hambre = 100;
        }else
        hambre += i;
    }

}
