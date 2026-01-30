package Arrays;

public class HolaMundo {
    public static void main() {
        int[] x = {-2, 1, 5, -6, 56, -53, 62, -101, 32};
        int resultado = 0;
        for (int i=1; i< x.length;i=i++){
            //System.out.println(x[i]);
            resultado += x[i];
        }
        System.out.println(resultado);
    }
}
