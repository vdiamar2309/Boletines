package Ejercicio1objetos;

public class main {
    public static void main(String[] args) {
            Alumno a = new Alumno("Alberto","García","hola@gmail.com",12,"2912 129 123 123");
            Alumno b = new Alumno("Alberto","García","hola@gmail.com",18,"2912 129 123 123");
            Alumno c = new Alumno("Alberto","García","hola@gmail.com",19,"2912 129 123 123");
            
        System.out.println(a.mayorMenor());
        System.out.println(b.mayorMenor());
        System.out.println(c.mayorMenor());
    }
}
