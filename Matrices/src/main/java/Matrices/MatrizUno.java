package Matrices;

public class MatrizUno {
    public static void main() {
        boolean boleano = false;
        int[][] matriz = {{1, 2, 3, 4, 5, 6}, {1, 2, -3, 4, 5, 6}};

        if (contieneNegativo(matriz)){
            System.out.println("Sí, contiene un negativo al menos");
        }
        else {
            System.out.println("No, no contiene negativos");
        }
    }

    public static boolean contieneNegativo (int[][] m){
        for (int a = 0; a < m.length; a++) {
            for (int b = 0; b < 6; b++) {
                if (m[a][b] < 0) {
                    return true;
                }
            }
        }

        return false;
    }
}