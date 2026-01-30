package Arrays;

import java.util.Scanner;

public class HolaMundo3 {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduzca las posiciones que tendrá el array: ");

        int numero = sc.nextInt();
        int[] array = new int[numero];
        int intro = 1;

        for (int i = 0; i < numero; i++) {
            System.out.println("Escribe un numero " + intro++);
            array[i] = sc.nextInt();
        }

        int contadormy = 0;
        int contadormn = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int a = 0; a < numero; a++) {
            if (mayor < array[a]) {
                mayor = array[a];
                contadormy = 1;
            } else if (menor > array[a]) {
                menor = array[a];
                contadormn = 1;
            } else if (array[a] == mayor) {
                contadormy++;
            } else if (array[a] == menor) {
                contadormn++;
            }
        }
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero de repetidos del menor es " + contadormn);
        System.out.println("El numero de repetidos del mayor es " + contadormy);
    }
}