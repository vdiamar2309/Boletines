package Boletin2_1;

import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero que vayas a contar");
        int a = sc.nextInt();
        int contador = 0;
        while (Math.abs(a) > 0) {
            a = a / 10;
            contador++;
        }
        System.out.println(contador);
    }
}

