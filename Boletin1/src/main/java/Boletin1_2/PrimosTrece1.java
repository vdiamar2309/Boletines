package Boletin1_2;

public class PrimosTrece1 {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i + " Es multiplo de 7");
            }
            if (i % 13 == 0) {
                System.out.println(i + " Es multiplo de 13");
            }
        }
    }
}
