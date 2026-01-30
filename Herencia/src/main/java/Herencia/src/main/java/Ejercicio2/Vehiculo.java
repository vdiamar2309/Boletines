package Herencia.src.main.java.Ejercicio2;

public abstract class Vehiculo {
    private String matricula;
    private String gama;

    // Constructor
    public Vehiculo(String gama, String matricula) {
        this.gama = gama;
        this.matricula = matricula;
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }
}
