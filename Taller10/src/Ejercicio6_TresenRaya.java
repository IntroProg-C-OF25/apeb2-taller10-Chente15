/*
 * Crea un juego de tres en raya utilizando una matriz bidimensional de 3x3. Permita a dos jugadores marcar sus movimientos alternativamente. 
 * El juego debe verificar si alguno de los jugadores ha ganado o si hay un empate.
 * 
 */

/**
 *
 * @author Chente15
 */
import java.util.Scanner;

public class Ejercicio6_TresenRaya {

    static char[][] tablero = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void mostrarTablero() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -----");
            }
        }
    }

    public static boolean verificarGanador(char jugador) {
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador)
                    || (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
                return true;
            }
        }
        if ((tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador)
                || (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)) {
            return true;
        }
        return false;
    }

    public static boolean verificarEmpate() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char jugadorActual = 'X';
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            mostrarTablero();
            System.out.println("Jugador " + jugadorActual + ", ingrese la fila y la columna:");
            int fila = scanner.nextInt();
            int columna = scanner.nextInt();

            if (tablero[fila][columna] == ' ') {
                tablero[fila][columna] = jugadorActual;
                if (verificarGanador(jugadorActual)) {
                    mostrarTablero();
                    System.out.println("El jugador " + jugadorActual + " ha ganado");
                    juegoTerminado = true;
                } else if (verificarEmpate()) {
                    mostrarTablero();
                    System.out.println("Es un empate");
                    juegoTerminado = true;
                } else {
                    jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Esa posición ya está ocupada. Intente nuevamente.");
            }
        }
    }
}
/**
 * run:
 *   0 1 2
 * 0  | | 
 *   -----
 * 1  | | 
 *   -----
 * 2  | | 
 Jugador X, ingrese la fila y la columna:
 * 1
 * 2
     0 1 2
 * 0  | | 
 *   -----
 * 1  | |X
 *   -----
 * 2  | | 
 Jugador O, ingrese la fila y la columna:
 * 0
 * 0
 *   0 1 2
 * 0 O| | 
 *   -----
 * 1  | |X
     -----
 * 2  | | 
 Jugador X, ingrese la fila y la columna :
 * 2
 * 2
 *   0 1 2
 * 0 O| | 
 *   -----
 * 1  | |X
     -----
 * 2  | |X
 Jugador O, ingrese la fila y la columna :
 * 0
 * 2
 *   0 1 2
 * 0 O| |O
 *   -----
 * 1  | |X
     -----
 * 2  | |X
 Jugador X, ingrese la fila y la columna :
 * 2
 * 0
 *   0 1 2
 * 0 O| |O
 *   -----
 * 1  | |X
     -----
 * 2 X| |X
 Jugador O, ingrese la fila y la columna :
 * 0
 * 1
 *   0 1 2
 * 0 O|O|O
 *   -----
 * 1  | |X
 *   -----
 * 2 X| |X
 * El jugador O ha ganado
 */
