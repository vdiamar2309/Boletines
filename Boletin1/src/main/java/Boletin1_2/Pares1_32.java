package Boletin1_2;

import java.util.Scanner;

public class Pares1_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica la cantidad de numeros");
        int bucles = sc.nextInt();
        int i;
        for (i = 1; i <= bucles; i++) {
            System.out.println("Introduce un numero");
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println("Este numero es invalido");
            } else if (n % 2 == 0) {
                System.out.println(n + " Es par");
            } else
                System.out.println(n + " Es impar");


        }
    }
}