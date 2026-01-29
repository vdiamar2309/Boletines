package Herencia.src.main.java.Ejercicio2;

public class Coche extends Vehiculo {


    private double alquiler;
    private String tipo;

    public Coche(String gama, String matricula) {
        super(gama, matricula);
    }

    public Coche(String gama, String matricula, double alquiler, String tipo) {
        super(gama, matricula);
        this.alquiler = alquiler;
        this.tipo = tipo;
    }
}
