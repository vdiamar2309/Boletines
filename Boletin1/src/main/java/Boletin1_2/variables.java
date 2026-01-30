package Boletin1_2;

public class variables {
    public static void main(String[] args) {
        int bucle;
        int a = 0;
        for (bucle = 1; bucle < 101; bucle+=2) {
            a += bucle;
        }
        System.out.println(a);
    }
}
