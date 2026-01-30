package Boletin1_2;

import java.util.Scanner;

public class EjercicioCinco {
    static void main() {
        System.out.println("Escribe un número");
        Scanner sc = new Scanner(System.in);
        int negativo = sc.nextInt();
        int reintentos = 0;
        do {
            System.out.println("Escribe otro número");
            negativo = sc.nextInt();
            reintentos++;
        } while (negativo >= 0);
        System.out.println("Se ha introducido: "+reintentos);
    }
}