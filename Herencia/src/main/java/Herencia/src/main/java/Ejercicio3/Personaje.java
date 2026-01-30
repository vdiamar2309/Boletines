package Herencia.src.main.java.Ejercicio3;

public abstract class Personaje {

    private int fuerza;
    private int pvida;
    private int inteligencia;
    private int maxVida;

    public Personaje(int maxVida, int fuerza, int inteligencia) {
        this.fuerza = fuerza;
        pvida = maxVida;
        this.inteligencia = inteligencia;
        this.maxVida = maxVida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) throws PersonajeExcepcion {
        if (fuerza < 0) {
            throw new PersonajeExcepcion("No se puede introducir un valor menor a 0");
        }
        if (fuerza > 20) {
            throw new PersonajeExcepcion("No se puede introducir un numero mayor que 20");
        }
        this.fuerza = fuerza;
    }

    public int getPvida() {
        return pvida;
    }

    public void setPvida(int pvida) {
        this.pvida = pvida;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) throws PersonajeExcepcion {
        if (inteligencia < 0) {
            throw new PersonajeExcepcion("No se puede introducir un valor menor a 0");
        }
        if (inteligencia > 20) {
            throw new PersonajeExcepcion("No se puede introducir un numero mayor que 20");
        }
        this.inteligencia = inteligencia;
    }

    public int getMaxVida() {
        return maxVida;
    }

    public void setMaxVida(int maxVida) {
        this.maxVida = maxVida;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "fuerza=" + fuerza +
                ", pvida=" + pvida +
                ", inteligencia=" + inteligencia +
                ", maxVida=" + maxVida +
                '}';
    }
}
