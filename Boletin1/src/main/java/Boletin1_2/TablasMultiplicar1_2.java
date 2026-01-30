package Boletin1_2;

import java.util.Scanner;

public class TablasMultiplicar1_2 {
    public static void main(String[] args) {
        System.out.println("Escribe un número");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tabla;
        if (num > 0 && num <= 10) {
            for (tabla = 0; tabla <= 10; tabla++) {
                int resultado = tabla * num;
                System.out.println(num + "x" + tabla + "=" + resultado);
                System.out.println(" ");
            }
        }
        else{
            System.out.println("Operación no válida");
        }
    }
}
