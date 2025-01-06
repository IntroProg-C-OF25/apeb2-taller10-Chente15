/*
 * Dadas dos matrices (cuadradas y/o rectangulares) de valores enteros aleatorios, desarrollar su procesamiento para calcular y presentar:
 * La suma de las dos matrices (considerar las restricciones matemáticas para ello).
 * La multiplicación de las dos matrices (considerar las reglas matemáticas para ello).
 * 
 */

/**
 *
 * @author Chente15
 */
import java.util.Random;

public class Ejercicio2_Matrices {

    public static void main(String[] args) {
        int n = 3; // Tamaño de las matrices (n x n)
        int[][] matriz1 = new int[n][n];
        int[][] matriz2 = new int[n][n];
        int[][] suma = new int[n][n];
        int[][] multiplicacion = new int[n][n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz1[i][j] = random.nextInt(20);
                matriz2[i][j] = random.nextInt(20);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                multiplicacion[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    multiplicacion[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("Matriz 1:");
        imprimirMatriz(matriz1);

        System.out.println("Matriz 2:");
        imprimirMatriz(matriz2);

        System.out.println("MATRIZ 1 + MATRIZ 2:");
        imprimirMatriz(suma);

        System.out.println("MATRIZ 1 * MATRIZ 2:");
        imprimirMatriz(multiplicacion);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
/**
 * run:
 Matriz 1:
 * 17	 7	3	
 * 14    11	6	
 * 6	 7	8	
 Matriz 2:
 * 17	 7	18	
 * 18	 9	14	
 * 19	 13	16	
 MATRIZ 1 + MATRIZ 2:
 * 34	 14	21	
 * 32	 20	20	
 * 25	 20	24	
 MATRIZ 1 * MATRIZ 2:
 * 472	 221	452	
 * 550	 275	502	
 * 380	 209	334	
 */
