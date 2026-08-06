package Ejercicio9;

import java.util.Scanner;



public class NumeroMayor {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Arreglo de tamaño fijo para los 3 números
        double[] numeros = new double[3];
        int contador = 0;
        System.out.println("Ejercicio 9: Número Mayor");
        System.out.println("--- Buscador del Número Mayor  ---");

        // Pedimos los 3 números con validación de errores
        while (contador < 3) {
            System.out.print("Ingrese el número " + (contador + 1) + ": ");
            try {
                numeros[contador] = Double.parseDouble(scanner.nextLine());
                contador++;
            } catch (NumberFormatException e) {
                System.out.println(" Error: Entrada inválida. Por favor, ingrese un número.");
            }
        }

       
        for (int i = 0; i < numeros.length - 1; i++) {
            
            // El bucle interno compara los elementos adyacentes
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                
                // Si el número actual es MAYOR que el siguiente, los intercambiamos
                if (numeros[j] > numeros[j + 1]) {
                    // Usamos una variable temporal para no perder el valor al sobrescribir
                    double temporal = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temporal;
                }
            }
        }
       
        double mayor = numeros[numeros.length - 1];

        System.out.println("\n----------------------------------");
       
        System.out.println("Arreglo ordenado: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
        System.out.println("El número mayor es: " + mayor);
        System.out.println("----------------------------------");

        scanner.close();
    }
}