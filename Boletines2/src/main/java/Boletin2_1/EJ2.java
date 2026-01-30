package Boletin2_1;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int exponente = 0;
        int base = 0;
        do {
            System.out.println("Escribe la base");
            base = sc.nextInt();
        } while (base < 0);
        do {
            System.out.println("Escribe el exponente");
            exponente = sc.nextInt();
        } while (exponente < 0);
        int resultado = 1;
        for (int bucle = 0; bucle < exponente; bucle++) {
            resultado = resultado * base;
        }
        System.out.println(resultado);
    }
}