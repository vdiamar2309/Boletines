package Boletin1_2;

import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine();
        int variable = 1;
        System.out.println(variable);
        System.out.println("Hola " + nombre);
    }
}