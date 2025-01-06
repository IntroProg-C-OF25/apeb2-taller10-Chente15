/*
 * Crea un programa que gestione el inventario de una tienda. 
 * Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda, con información como nombre, precio y cantidad.
 * El programa debe permitir agregar nuevos productos, actualizar existencias, buscar productos y eliminarlos.
 * 
 */

/**
 *
 * @author Chente15
 */
import java.util.Scanner;

public class Ejercicio4_InventarioTienda {

    public static void main(String[] args) {
        String[][] inventario = new String[3][3];
        int numProductos = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nGestion de Inventario: ");
            System.out.println("1. Agregar nuevo producto");
            System.out.println("2. Actualizar existencias");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Mostrar inventario");
            System.out.print("Selecciona una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    if (numProductos < 100) {
                        System.out.print("Nombre del producto: ");
                        inventario[numProductos][0] = scanner.nextLine();
                        System.out.print("Precio del producto: ");
                        inventario[numProductos][1] = scanner.nextLine();
                        System.out.print("Cantidad del producto: ");
                        inventario[numProductos][2] = scanner.nextLine();
                        numProductos++;
                        System.out.println("Producto agregado exitosamente.");
                    } else {
                        System.out.println("Inventario lleno. No se pueden agregar más productos.");
                    }
                    break;
                case 2:
                    System.out.print("Nombre del producto a actualizar: ");
                    String nombreActualizar = scanner.nextLine();
                    boolean encontradoActualizar = false;
                    for (int i = 0; i < numProductos; i++) {
                        if (inventario[i][0].equals(nombreActualizar)) {
                            System.out.print("Nuevo precio: ");
                            inventario[i][1] = scanner.nextLine();
                            System.out.print("Nueva cantidad: ");
                            inventario[i][2] = scanner.nextLine();
                            encontradoActualizar = true;
                            System.out.println("Producto actualizado exitosamente.");
                            break;
                        }
                    }
                    if (!encontradoActualizar) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Nombre del producto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    boolean encontradoBuscar = false;
                    for (int i = 0; i < numProductos; i++) {
                        if (inventario[i][0].equals(nombreBuscar)) {
                            System.out.println("Producto encontrado:");
                            System.out.println("Nombre: " + inventario[i][0]);
                            System.out.println("Precio: " + inventario[i][1]);
                            System.out.println("Cantidad: " + inventario[i][2]);
                            encontradoBuscar = true;
                            break;
                        }
                    }
                    if (!encontradoBuscar) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Nombre del producto a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    boolean encontradoEliminar = false;
                    for (int i = 0; i < numProductos; i++) {
                        if (inventario[i][0].equals(nombreEliminar)) {
                            for (int j = i; j < numProductos - 1; j++) {
                                inventario[j][0] = inventario[j + 1][0];
                                inventario[j][1] = inventario[j + 1][1];
                                inventario[j][2] = inventario[j + 1][2];
                            }
                            numProductos--;
                            encontradoEliminar = true;
                            System.out.println("Producto eliminado exitosamente.");
                            break;
                        }
                    }
                    if (!encontradoEliminar) {
                        System.out.println("Producto no encontrado.");
                    }
                    break;
                case 5:
                    System.out.println("Inventario actual:");
                    for (int i = 0; i < numProductos; i++) {
                        System.out.println("Nombre: " + inventario[i][0] + ", Precio: " + inventario[i][1] + ", Cantidad: " + inventario[i][2]);
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }
}
/**
 * run:
 Gestion de Inventario:
 * 1. Agregar nuevo producto
 * 2. Actualizar existencias
 * 3. Buscar producto
 * 4. Eliminar producto
 * 5. Mostrar inventario
 Selecciona una opcion: 1
 * Nombre del producto: Azucar
 * Precio del producto: 2,00
 * Cantidad del producto: 3
 Producto agregado exitosamente.
 Gestion de Inventario:
 * 1. Agregar nuevo producto
 * 2. Actualizar existencias
 * 3. Buscar producto
 * 4. Eliminar producto
 * 5. Mostrar inventario
 Selecciona una opcion: 1
 * Nombre del producto: Carne
 * Precio del producto: 5,50
 * Cantidad del producto: 3
 Producto agregado exitosamente.
 Gestion de Inventario
 * 1. Agregar nuevo producto
 * 2. Actualizar existencias
 * 3. Buscar producto
 * 4. Eliminar producto
 * 5. Mostrar inventario
 Selecciona una opcion: 1
 * Nombre del producto: Papas
 * Precio del producto: 3,40
 * Cantidad del producto: 2
 Producto agregado exitosamente.
 Gestion de Inventario
 * 1. Agregar nuevo producto
 * 2. Actualizar existencias
 * 3. Buscar producto
 * 4. Eliminar producto
 * 5. Mostrar inventario
 Selecciona una opcion: 5
 Inventario actual:
 * Nombre: Azucar, Precio: 2,00, Cantidad: 3
 * Nombre: Carne, Precio: 5,50, Cantidad: 3
 * Nombre: Papas, Precio: 3,40, Cantidad: 2
 Gestion de Inventario:
 * 1. Agregar nuevo producto
 * 2. Actualizar existencias
 * 3. Buscar producto
 * 4. Eliminar producto
 * 5. Mostrar inventario
 Selecciona una opcion: 4
 * Nombre del producto a eliminar: Azucar
 Producto eliminado exitosamente.
 Gestion de Inventario:
 * 1. Agregar nuevo producto
 * 2. Actualizar existencias
 * 3. Buscar producto
 * 4. Eliminar producto
 * 5. Mostrar inventario
 Selecciona una opcion: 3
 * Nombre del producto a buscar: Carne
 * Producto encontrado:
 * Nombre: Carne
 * Precio: 5,50
 * Cantidad: 3
 */
