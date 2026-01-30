package Arrays;

public class HolaMundo2 {
    public static void main() {
        int contador = 0;
        int[] x = {-2, 1, 5, -6, 56, -53, 62, -101, 32};
        for (int i = 0; i < x.length; i++) {
            //System.out.println(x[i]);
            if (x[i] < 0) {
                contador++;
            }
        }
        System.out.println(contador);
    }

}

