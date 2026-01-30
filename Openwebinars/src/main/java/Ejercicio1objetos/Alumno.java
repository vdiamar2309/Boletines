package Ejercicio1objetos;

public class Alumno {

    private String nombre;
    private String apellidos;
    private String email;
    private int edad;
    private String telefono;

    public Alumno() {
    }

    public Alumno(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Alumno(String nombre, String apellidos, String email, int edad, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String mayorMenor(){
        if (this.edad>= 18){
            return "El alumno es mayor de edad";
        }
        return "El alumno es menor de edad";
    }

}
