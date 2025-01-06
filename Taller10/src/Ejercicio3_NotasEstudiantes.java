/*
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuáles al finalizar el periodo, la Dirección de la carrera de Computación a solicitado las siguientes estadísticas de la materia INTRODUCCIÓN A LA PROGRAMACIÓN en función a los promedios por estudiante, dichos promedios se deben calcular (ponderar, ya que el docente ingresa todo sobre 10pts.) de 3 calificaciones (ACD que representa el 35% de la nota, APE del 35% y la nota del AA con un peso del 30%). En resumen, los requerimientos son los siguientes:

 * Registre los nombres de cada estudiante de dicho paralelo.
 * Genere aleatoriamente las notas ACD, APE, AA, para cada uno de los 28 estudiantes de 0-10 pts.
 * Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente ponderación: ACD->35%, APE->35%, y el AA->30%.
 * Obtenga el promedio del curso, del paralelo C.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por encima del promedio del curso.
 * Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por debajo del promedio del curso.
 * Muestre el estudiante con su calificación, si es el del mayor promedio (el más alto de la clase).
 * Muestre el estudiante con su calificación, si es el del menor promedio (el más bajo de la clase).
 * 
 */

/**
 *
 * @author Chente15
 */
import java.util.Random;

public class Ejercicio3_NotasEstudiantes {

    public static void main(String[] args) {
        double promedioCurso = 0, maxPromedio, minPromedio;
        String[] nombres = {
            "Juan", "Maria", "Pedro", "Luisa", "Carlos", "Ana", "Jorge", "Sofia",
            "Miguel", "Camila", "Diego", "Daniela", "Jose", "Lucia", "Andres", "Robert",
            "Luis", "Mariana", "Manuel", "David", "Ricardo", "Josue", "Adrian", "Laura",
            "Pablo", "Romina", "Fernando", "Oscar"
        };
        int numEstudiantes = nombres.length;
        double[][] notas = new double[numEstudiantes][3];
        double[] promedios = new double[numEstudiantes];
        Random random = new Random();
        for (int i = 0; i < numEstudiantes; i++) {
            notas[i][0] = random.nextInt(11);
            notas[i][1] = random.nextInt(11);
            notas[i][2] = random.nextInt(11);
            promedios[i] = (notas[i][0] * 0.35) + (notas[i][1] * 0.35) + (notas[i][2] * 0.30);
        }
        promedioCurso = 0;
        for (double promedio : promedios) {
            promedioCurso += promedio;
        }
        promedioCurso /= numEstudiantes;
        System.out.println("Promedio del curso: " + promedioCurso);
        System.out.println("\nEstudiantes por encima del promedio del curso:");
        for (int i = 0; i < numEstudiantes; i++) {
            if (promedios[i] > promedioCurso) {
                System.out.println(nombres[i] + ": " + promedios[i]);
            }
        }
        System.out.println("\nEstudiantes por debajo del promedio del curso:");
        for (int i = 0; i < numEstudiantes; i++) {
            if (promedios[i] < promedioCurso) {
                System.out.println(nombres[i] + ": " + promedios[i]);
            }
        }
        maxPromedio = promedios[0];
        minPromedio = promedios[0];
        String estudianteMax = nombres[0];
        String estudianteMin = nombres[0];
        for (int i = 1; i < numEstudiantes; i++) {
            if (promedios[i] > maxPromedio) {
                maxPromedio = promedios[i];
                estudianteMax = nombres[i];
            }
            if (promedios[i] < minPromedio) {
                minPromedio = promedios[i];
                estudianteMin = nombres[i];
            }
        }
        System.out.println("\nEstudiante con el mayor promedio:");
        System.out.println(estudianteMax + ": " + maxPromedio);

        System.out.println("\nEstudiante con el menor promedio:");
        System.out.println(estudianteMin + ": " + minPromedio);
    }
}
/**
 Promedio del curso: 5.1071428571428585
 Estudiantes por encima del promedio del curso:
 * Juan: 5.5
 * Maria: 7.199999999999999
 * Luisa: 5.6
 * Carlos: 7.2
 * Ana: 5.5
 * Miguel: 5.25
 * Camila: 6.8
 * Lucia: 7.35
 * Robert: 8.649999999999999
 * Luis: 7.35
 * Mariana: 6.75
 * Manuel: 5.25
 * David: 6.85
 * Pablo: 5.6
 * Romina: 5.5
 * Oscar: 5.9
 Estudiantes por debajo del promedio del curso:
 * Pedro: 3.6999999999999997
 * Jorge: 3.8
 * Sofia: 3.8499999999999996
 * Diego: 4.05
 * Daniela: 3.7499999999999996
 * Jose: 5.1
 * Andres: 1.9499999999999997
 * Ricardo: 1.4
 * Josue: 2.0
 * Adrian: 3.9499999999999997
 * Laura: 4.4
 * Fernando: 2.8
 Estudiante con el mayor promedio:
 * Robert: 8.649999999999999
 Estudiante con el menor promedio:
 * Ricardo: 1.4
 */
