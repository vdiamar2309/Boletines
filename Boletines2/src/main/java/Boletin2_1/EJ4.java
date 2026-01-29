package Boletin2_1;

import java.util.Scanner;

public class EJ4 {
    public static final int MAX_INTENTOS = 5;

    public static void main() {
        int aleatorio = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        int intentos = 0;
        boolean acertado = false;
        while (intentos < MAX_INTENTOS && !acertado) {
            System.out.println("Elige un numero entre el 1 al 100");
            int a = sc.nextInt();
            if (a > 100 || a < 1) {
                System.out.println("Este número es inválido");
            } else {
                if (aleatorio < a) {
                    System.out.println("El numero " + a + " es  mayor que el Aleatorio");
                } else if (aleatorio > a) {
                    System.out.println("El numero " + a + " es  menor que el Aleatorio");
                } else {
                    System.out.println("HAS ACERTADO EL NUMERO ES " + aleatorio);
                    acertado = true;
                }
            }
            ++intentos;
            int hechosintentos=MAX_INTENTOS-intentos;
            System.out.println("Te quedan "+hechosintentos+" intentos");
        }
    }
}