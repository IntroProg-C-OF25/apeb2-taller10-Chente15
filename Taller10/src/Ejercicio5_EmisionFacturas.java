/*
 * Crea un programa que gestione el inventario de una tienda, así como la emisión de facturas. 
 * Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda, con información como nombre, precio y cantidad. 
 * El programa debe permitir facturar un producto dado su código, y unidades deseadas. Adicional se debe agregar a la factura al 15% del IVA, y si la compra superar los $100, 
 * se debe aplicar un descuento.
 * Nota: Considere la alternativa de inexistencias en Stop, para el caso, muestre la alerta respectiva.
 * 
 */

/**
 *
 * @author Chente15
 */
import java.util.Scanner;

public class Ejercicio5_EmisionFacturas {
    static String[][] productos = {
        {"01", "Carne", "0.5", "100"},
        {"02", "Pollo", "0.7", "150"},
        {"03", "Papas", "0.3", "200"}
    };

    public static void mostrarProductos() {
        System.out.println("Codigo\tNombre\t\tPrecio\tCantidad");
        for (String[] producto : productos) {
            System.out.println(producto[0] + "\t" + producto[1] + "\t\t$" + producto[2] + "\t" + producto[3]);
        }
    }
    public static void facturarProducto(String codigo, int unidades) {
        for (String[] producto : productos) {
            if (producto[0].equals(codigo)) {
                int cantidadDisponible = Integer.parseInt(producto[3]);
                if (cantidadDisponible >= unidades) {
                    double precio = Double.parseDouble(producto[2]);
                    double subtotal = precio * unidades;
                    double descuento = 0;
                    if (subtotal > 100) {
                        descuento = subtotal * 0.10;
                        subtotal -= descuento;
                        System.out.println("Descuento aplicado: $" + String.format("%.2f", descuento));
                    }
                    double iva = subtotal * 0.15;
                    double total = subtotal + iva;
                    producto[3] = String.valueOf(cantidadDisponible - unidades);
                    System.out.println("Factura:\nProducto: " + producto[1] + "\nUnidades: " + unidades + "\nSubtotal: $" + String.format("%.2f", precio * unidades) + "\nIVA (15%): $" + String.format("%.2f", iva) + "\nTotal: $" + String.format("%.2f", total));
                    return;
                } else {
                    System.out.println("No hay suficientes unidades");
                    return;
                }
            }
        }
        System.out.println("Alerta: Producto no encontrado.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mostrarProductos();
        System.out.println("Ingrese el código del producto:");
        String codigo = scanner.nextLine();
        System.out.println("Ingrese la cantidad de unidades:");
        int unidades = scanner.nextInt();
        facturarProducto(codigo, unidades);
        mostrarProductos();
    }
}
/**
 * run:
 Codigo	 Nombre		Precio	Cantidad
 * 01	 Carne		$0.5	100
 * 02	 Pollo		$0.7	150
 * 03	 Papas		$0.3	200
 Ingrese el codigo del producto:
 * 02
 Ingrese la cantidad de unidades:
 * 50
 * Factura:
 * Producto: Pollo
 * Unidades: 50
 * Subtotal: $35,00
 * IVA (15%): $5,25
 * Total: $40,25
 Codigo Nombre	Precio	Cantidad
 * 01	 Carne	$0.5	100
 * 02	 Pollo	$0.7	100
 * 03	 Papas	$0.3	200
 */



   

    

