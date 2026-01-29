package Boletin1_2;

import java.util.Scanner;

public class Pares1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica un numero");
        int bucles = sc.nextInt();
        int i;
        for (i = 0; i <= bucles; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " Es par");
            } else
                System.out.println(i + " Es impar");
            }
        }
    }


