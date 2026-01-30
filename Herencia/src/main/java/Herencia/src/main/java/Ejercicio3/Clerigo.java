package Herencia.src.main.java.Ejercicio3;

public class Clerigo extends Personaje {


    public Clerigo(int maxVida, int inteligencia, int pvida, int fuerza, char nombre) {
        super(maxVida, inteligencia, pvida, fuerza, nombre);

    }

    @Override
    public void setFuerza(int fuerza) throws PersonajeExcepcion {
        if (fuerza < 18) {
            throw new PersonajeExcepcion("No puedes tener menos de 18 de fuerza");
        }
        if (fuerza > 20) {
            throw new PersonajeExcepcion("No puedes tener más de 20 de fuerza");
        }
    }

    @Override
    public void setInteligencia(int inteligencia) throws PersonajeExcepcion {
        if (inteligencia < 12) {
            throw new PersonajeExcepcion("El clérigo no puede tener una inteligencia menor a 12");
        }
        if (inteligencia > 16) {
            throw new PersonajeExcepcion("El clérigo no puede tener una inteligencia mayor a 16");
        }
    }


    public void curar(Personaje p) throws PersonajeExcepcion {
        if (p.getNombre(equals(this.()))) {
            throw new PersonajeExcepcion("No puede curarse a si mismo");
        }

    }


}
