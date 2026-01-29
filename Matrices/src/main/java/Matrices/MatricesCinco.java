package Matrices;

public class MatricesCinco {
    public static void main() {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
        int[][] matriz2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matriz3 = {{3, 4, 3}, {4, 5, 6}};
        int[][] matriz4 = {{3, 4, 3}, {4, 5}};
        System.out.print("5) ");
        contarColumnas(matriz);
        System.out.println();
        System.out.print("6) ");
        contarColumnasInversa(matriz);
        System.out.println();
        System.out.print("7) ");
        System.out.println("Aquí se mostrará la comparación de martriz y matriz 2");
        if (igualdadMatrices(matriz, matriz2)) {
            System.out.println("Sí, son iguales");
        } else {
            System.out.println("Son desiguales");
        }
        System.out.println("Aquí se mostrará la comparación de matriz y Matriz 3 la cual es diferente las cifras pero no el tamaño");
        if (igualdadMatrices(matriz, matriz3)) {
            System.out.println("Sí, son iguales");
        } else {
            System.out.println("Son desiguales");
        }
        System.out.println("Aquí se mostrará la comparación de martriz y matriz 4 las cuales son diferentes en tamaño");
        if (igualdadMatrices(matriz, matriz3)) {
            System.out.println("Sí, son iguales");
        } else {
            System.out.println("Son desiguales");
        }
        System.out.println();
        System.out.println("8) ");
        int[][] matriza = {{1, 2}, {4, 6}};
        int[][] matrizb = {{4, 1}, {1, 0, 3}, {1, 2, 3}};
        sumarArrays(matriza, matrizb);

    }

    public static void contarColumnas(int[][] devolver) {
        int filas = devolver[0].length - 1;
        int columnas = devolver.length - 1;

        int i;
        int j = 0;
        while (j <= filas) {
            i = 0;
            while (i <= columnas) {
                System.out.print(devolver[i][j]);
                i++;
            }
            j++;
        }
    }

    public static void contarColumnasInversa(int[][] devolver) {
        int filas = devolver[0].length - 1;
        int columnas = devolver.length - 1;
        for (int i = filas; i >= 0; i--) {
            for (int j = columnas; j >= 0; j--) {
                System.out.print(devolver[j][i]);
            }

        }
    }

    public static void sumarArrays(int[][] MatrizA, int[][] MatrizB) {
        int filas = Integer.MIN_VALUE;
        int columnas = Integer.MIN_VALUE;
        if (MatrizA.length < MatrizB.length) {
            filas = MatrizB.length;
        } else {
            filas = MatrizA.length;
        }
        for (int j = 0; j < columnas; j++) {
            if (MatrizA[0].length < MatrizB[0].length) {
                columnas = MatrizB[0].length;
            } else {
                columnas = MatrizA[0].length;
            }
        }
        int[][] MatrizC = new int[filas][columnas];
        int[][] Resultado = new int[filas][columnas];
        for (int i = 0; i < MatrizA.length; i++) {
            for (int j = 0; j < MatrizA[0].length; j++) {
                MatrizC[i][j] = MatrizA[i][j];
            }
        }
            for (int i = 0; i < MatrizA.length; i++) {
                for (int j = 0; j < MatrizA[0].length; j++) {
                    Resultado[i][j] = MatrizC[i][j] + MatrizB[i][j];
                    System.out.println(Resultado[i][j]);
                }
            }

    }


    public static boolean igualdadMatrices(int[][] matrizA, int[][] matrizB) {
        if (matrizA.length != matrizB.length) {
            return false;
        }


        for (int i = 0; i < matrizA.length - 1; i++) {
            if (matrizA[i].length != matrizB[i].length) {
                return false;
            }
            for (int j = 0; j < matrizA[0].length - 1; j++) {
                if (matrizA[i][j] != matrizB[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}

