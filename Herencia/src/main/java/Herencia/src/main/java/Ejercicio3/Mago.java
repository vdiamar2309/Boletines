package Herencia.src.main.java.Ejercicio3;

public class Mago extends Personaje {

    private String[] memoria;

    public Mago(int maxVida, int fuerza, int inteligencia, String[] memoria) {
        super(maxVida, fuerza, inteligencia);
        this.memoria = new String[4];
    }

    @Override
    public void setFuerza(int fuerza) throws PersonajeExcepcion {
        if (fuerza > 15) {
            throw new PersonajeExcepcion("El mago no puede tener más de 15 puntos de vida");
        }
        super.setFuerza(fuerza);
    }

    @Override
    public void setInteligencia(int inteligencia) throws PersonajeExcepcion {
        if (inteligencia < 17) {
            throw new PersonajeExcepcion("No puedes tener menos de 17 puntos de inteligencia siendo mago");
        }
        super.setInteligencia(inteligencia);
    }


    public void aprenderHechizo(String hechizo) throws PersonajeExcepcion {
        int hechizosAprendidos = 0;
        for (int i = 0; 0 < memoria.length; i++) {
            if (memoria[i] == null) {
                memoria[i] = hechizo;
                break;
            } else {
                hechizosAprendidos++;
            }

        }

        if (hechizosAprendidos == memoria.length) {
            throw new PersonajeExcepcion("No puedes aprender más de 4 hechizos");
        }
    }


}
