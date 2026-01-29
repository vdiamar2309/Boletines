package Boletin2_1;

import java.util.Scanner;

public class EJ1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero");
        int a = sc.nextInt();
        System.out.println("Escribe un segundo numero");
        int b = sc.nextInt();
        System.out.println("Escribe un tercer numero");
        int c = sc.nextInt();
        if (a <= b && a <= c) {
            if (b > c) {
                System.out.println(a + "<" + c + "<" + b);
            } else System.out.println(a + "<" + b + "<" + c);
        } else if (b <= a && b <= c) {
            if (a > c) {
                System.out.println(b + "<" + c + "<" + a);
            } else System.out.println(b + "<" + a + "<" + c);
        } else if (c <= a && c <= b) {
            if (a > b) {
                System.out.println(c + "<" + b + "<" + a);
            } else System.out.println(c + "<" + a + "<" + b);
        }
    }
}
