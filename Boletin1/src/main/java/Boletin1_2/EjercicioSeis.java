package Boletin1_2;

import java.util.Scanner;

public class EjercicioSeis {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un número");
        int a = sc.nextInt();
        System.out.println("Escribe otro numero");
        int b = sc.nextInt();
        int c = 0;

        for (int bucle = 0; bucle < Math.abs(b); bucle++) {

            c += a;
        }

        if (b < 0) {
            c = -c;
        }

        System.out.printf("La multiplicación es %d", c);
    }
}




