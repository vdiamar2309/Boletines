package Matrices;

public class MatrizDosYTres {
    public static void main() {
        int[][] matriz = {{1, 2, 3, 4, 6}, {1, 2, 3, 4, 5, 6}};
        System.out.print("2) ");
        System.out.println(sumarMatriz(matriz));
        System.out.print("3) ");
        devolverFila(matriz);
        System.out.println();
        System.out.print("4) ");
        devolverFilaInversa(matriz);
        System.out.println();
        System.out.print("5) ");
               devolverColumnas(matriz);
    }


    public static int sumarMatriz(int[][] matriz) {
        int acumulador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                acumulador += matriz[i][j];
            }
        }
        return acumulador;
    }

    public static void devolverFila(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }

    public static void devolverFilaInversa(int[][] matriz) {

        for (int i = matriz.length - 1; i >= 0; i--) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }

    public static void devolverColumnas(int[][] matriz) {
        int filas = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                filas = matriz[j].length;
            }
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
}