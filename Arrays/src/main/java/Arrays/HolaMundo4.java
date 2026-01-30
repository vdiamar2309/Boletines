package Arrays;

public class HolaMundo4 {
    public static void main() {
        final int LENGTH = 6000;
        int[] array = new int[LENGTH];
        int[] terminaciones = new int[10];
        int aleatorio;
        for (int i = 0; i < LENGTH; i++) {
            aleatorio = (int) (Math.random() * 100);
            array [i] = aleatorio;
        }

        int n = array.length;
        for (int i = 0; i < array.length; i++) {
            terminaciones[array[i] % 10]++;
        }
        for (int i = 0; i < terminaciones.length; i++) {
            double media = (double) (terminaciones[i] * 100) / array.length;
            System.out.println("El numero "+i+" Se ha repetido "+ terminaciones[i]+" Esto equivale a "+media+"%");
        }
    }
}
