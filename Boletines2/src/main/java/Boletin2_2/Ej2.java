package Boletin2_2;

import java.util.Scanner;

public class Ej2 {
        public static void main() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime un número");
            int num = sc.nextInt();
            while (num<0){
                System.out.println("El Numero tiene que ser positivo");
                num= sc.nextInt();
            }
            int invertido = 0;
            int resto;
            while (num>0) {
                resto = num % 10;
                invertido =invertido*10+resto;
                num /=10;
            }
            System.out.println("El numero invertido es: "+invertido);
        }
    }

}
