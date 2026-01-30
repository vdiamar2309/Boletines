package Boletin1_2;

import java.util.Scanner;

public class MiEntradaSalida {
    private static Scanner sc = new Scanner(System.in);

    /**
     * Lee un entero mostrando el mensaje pasado como parámetro
     *
     * @param mensaje El mensaje a mostrar
     * @return el numero entero leído por teclado
     */


    public static int leerEntero(String mensaje) {
        System.out.print("Introduce un número:  ");
        return sc.nextInt();

    }

    static void main(String[] args) {
        int a = MiEntradaSalida.leerEntero("introduce un número");
        System.out.printf("El numero introducido es %d", a);
    }

}

