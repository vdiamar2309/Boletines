package Boletin2_1;

import java.util.Scanner;

public class EJ5 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int a = sc.nextInt();
        while (a <= 0) {
            System.out.println("Numero inválido");
            System.out.println("Ingresa otro de nuevo");
            a = sc.nextInt();
        }
        if (a == 1) {
            System.out.println("Es primo");

        } else if (a == 2) {
            System.out.println("Es primo");

        } else if (a == 3) {
            System.out.println("Es primo");

        } else if (a == 7) {
            System.out.println("Es primo");


        } else if (a == 5) {
            System.out.println("Es primo");

        } else if (a % 2 == 0) {
            System.out.println("No es primo");

        } else if (a % 3 == 0) {
            System.out.println("No es primo");

        } else if (a % 5 == 0) {
            System.out.println("No es primo");

        } else if (a % 7 == 0) {
            System.out.println("No es primo");
        } else System.out.println("Es primo");
    }
}
