package Arrays;

import java.util.Scanner;

public class HolaMundo6 {
    public static void main(String[] args) {
        int size = (int) (Math.random() * 100) + 1;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el elemento a buscar: ");
        int numero = sc.nextInt();
        boolean ver = false;
        int cantidad = array.length;
        for (int i  = 0;i< cantidad;i++) {
            if (numero == array[i]) {
                ver = true;
                break;
            } else {
                break;
            }
        }
        if (ver){
            System.out.println("Se ha encontrado el número");
        } else {
            System.out.println("No se ha encontrado el número");
        }
    }
}

