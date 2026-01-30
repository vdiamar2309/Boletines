package Arrays;

import java.util.Scanner;

public class HolaMundo5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduzca las posiciones que tendrá el array: ");
        int tamano = sc.nextInt();
        int[] array = new int[tamano];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        int a = 1;
        for (int j : array) {
            System.out.println(a + ") " + j);
            a++;
        }
    }
}
