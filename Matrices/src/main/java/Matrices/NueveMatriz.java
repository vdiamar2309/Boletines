package Matrices;

public class NueveMatriz {
    public static void main() {
        int[][] matriz = {{1, 3, 5, 6}, {4, 2, 0, 8}, {4, 2, 0, 8}, {1, 3, 5, 6}};
        int[][] matriz10 = {{1, 3, 0, 3, 1}, {4, 2, 7, 2, 4}, {6, 1, 9, 1, 6}, {0, 8, 8, 8, 0}};
        int[][] matrizp = {{1, 3, 0, 3, 1}, {4, 2, 7, 2, 4}, {6, 1, 9, 1, 6}, {0, 8, 8, 8, 0, 1}};
        if (comprobar(matriz)) {
            System.out.println("Es simetrico");
        } else {
            System.out.println("No es simetrico");
        }

        if (comprobar(matriz10)) {
            System.out.println("Es simetrico");
        } else {
            System.out.println("No es simetrico");
        }

        if (comprobar(matrizp)) {
            System.out.println("Es simetrico");
        } else {
            System.out.println("No es simetrico");
        }

    }

    public static boolean comprobar(int[][] matriz) {
       // Lo que queremos es que se doble y sea simetrico o sea el primero con el ultimo  el segundo con el antepenultimo
        //Esto lo dobla a la mitad
        int l = matriz[0].length / 2;
        //recorres la matriz
        for (int i = 0; i < matriz.length; ++i) {
            for (int j = 0; j < l; ++j) {
                if (i != matriz[i].length) {
                    return false;
                }
            }
        }
        return true;
    }
}





