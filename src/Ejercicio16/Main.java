package Ejercicio16;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // Creamos una lista genérica de la clase padre
        ArrayList<Producto> carritoCompras = new ArrayList<>();
          System.out.println("Ejercicio 16: Sistema de Productos");
        System.out.println("--- Tienda en Línea ---\n");

        try {
            // 1. Instanciamos los objetos (Polimorfismo)
            Producto producto1 = new ProductoFisico("FIS-001", "Silla de Oficina Ergonómica", 150.00, 12.5);
            Producto producto2 = new ProductoFisico("FIS-002", "Teclado Mecánico", 45.00, 1.2);
            Producto producto3 = new ProductoDigital("DIG-001", "Licencia Windows 11", 120.00, 5.0);
            Producto producto4 = new ProductoDigital("DIG-002", "Curso de Java en Video", 29.99, 1500.0);

            // Los añadimos al carrito
            carritoCompras.add(producto1);
            carritoCompras.add(producto2);
            carritoCompras.add(producto3);
            carritoCompras.add(producto4);
            
            // 2. Iteramos sobre el carrito para mostrar los datos
            double totalAPagar = 0;
            
            for (Producto item : carritoCompras) {

                item.mostrarDetalles();
                totalAPagar += item.calcularPrecioFinal();
               
            }
            
            System.out.println(" TOTAL A PAGAR EN EL CARRITO: Q" + totalAPagar);


        } catch (IllegalArgumentException e) {
            System.out.println(" Error de sistema: " + e.getMessage());
        }
    }
}