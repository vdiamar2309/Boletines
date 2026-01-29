package Boletin1_2;

import java.util.Scanner;

public class SumaNPrimeros_4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int positivo = 0;
        do {
            System.out.println("Escribe un numero positivo");
            positivo = sc.nextInt();
            if (positivo < 0) {
                System.out.println("Numero inválido");
            }
        } while (positivo < 0);
        int suma = 0;
        for (int bucle = 0; bucle <= positivo; bucle++) {
            suma = suma + bucle;

        }
        System.out.println("La suma de todos los numeros es: " + suma);
    }
}


