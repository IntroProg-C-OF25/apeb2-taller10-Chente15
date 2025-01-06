/*
 * Dada una matriz cuadrada (m X m) de valores enteros aleatorios, desarrollar su procesamiento para presentar los elementos:
 * De la diagonal principal.
 * De la diagonal segundaria.
 * Ubicados bajo la diagonal principal.
 * Ubicados sobre la diagonal principal.
 * Ubicados bajo la diagonal secundaria.
 * Ubicados sobre la diagonal secundaria.
 * 
 */

/**
 *
 * @author Chente15
 */
import java.util.Scanner;
import java.util.Random;

public class Ejercicio1_RecorridoMatrices {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Random random = new Random();
        int n;
        System.out.print("Ingrese el tamaño de  la matriz: ");
        n = tcl.nextInt();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (random.nextInt(9) + 1);
                System.out.print(matriz[i][j] + "\t ");
            }
            System.out.println("");
        }
        System.out.println("DIAGONAL PRINCIPAL DE LA FORMA OBVIA: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("\nDIAGONAL PRINCIPAL DE LA FORMA EFICIENTE: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + "\t");
        }
        System.out.println("\nDIAGONAL SECUNDARIA DE LA FORMA OBVIA: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if ((i + j) == matriz.length - 1) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("\nDIAGONAL SECUNDARIA DE LA FORMA  EFICIENTE: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - 1 - i] + "\t");
        }
        System.out.println("\nELEMENTOS DEBAJO DE LA DIAGONAL PRINCIPAL DE LA FORMA OBVIA: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i > j) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("\nELEMENTOS DEBAJO DE LA DIAGONAL PRINCIPAL DE LA FORMA EFICIENTE: ");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("\nELEMENTOS POR ARRIBA DE LA DIAGONAL PRINCIPAL DE LA FORMA 0BVIA: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i < j) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
    }
}
/**
 * run:
 Ingrese el tama�o de  la matriz: 3
 * 6	 5	 2	 
 * 7	 9	 3	 
 * 7	 2	 8	 
 DIAGONAL PRINCIPAL DE LA FORMA OBVIA: 
 * 6	 9	 8	
 DIAGONAL PRINCIPAL DE LA FORMA EFICIENTE: 
 * 6	 9	 8	
 DIAGONAL SECUNDARIA DE LA FORMA OBVIA: 
 * 2	 9	 7	
 DIAGONAL SECUNDARIA DE LA FORMA  EFICIENTE: 
 * 2	 9	 7	
 ELEMENTOS DEBAJO DE LA DIAGONAL PRINCIPAL DE LA FORMA OBVIA: 
 * 7	 7	 2	
 ELEMENTOS DEBAJO DE LA DIAGONAL PRINCIPAL DE LA FORMA EFICIENTE: 
 * 7	 7	 2	
 ELEMENTOS POR ARRIBA DE LA DIAGONAL PRINCIPAL DE LA FORMA 0BVIA: 
 * 5	 2	 3	
 */
