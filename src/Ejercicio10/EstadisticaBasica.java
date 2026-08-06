package Ejercicio10;
import java.util.Scanner;

public class EstadisticaBasica {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Arreglo para almacenar los 5 números
        double[] numeros = new double[5];
        int contador = 0;
        double suma = 0;

        System.out.println("--- Calculadora de Estadísticas Básicas ---");
        System.out.println("Por favor, ingrese 5 números.");

        // 1. Ingresar los 5 números con validación de errores
        while (contador < 5) {
            System.out.print("Ingrese el número " + (contador + 1) + ": ");
            try {
                // Leemos y guardamos el número
                numeros[contador] = Double.parseDouble(scanner.nextLine());
                
                // Vamos sumando inmediatamente para aprovechar el ciclo
                suma += numeros[contador];
                
                contador++; // Solo avanza si no hubo errores
            } catch (NumberFormatException e) {
                System.out.println(" Error: Entrada inválida. Por favor, ingrese un número (Ej: 10 o 5.5).");
            }
        }

        // 2. Calcular el promedio
        double promedio = suma / numeros.length;

        // 3. Ordenar el arreglo con BUBBLE SORT (de menor a mayor)
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                
                // Si el elemento actual es mayor que el siguiente, se intercambian
                if (numeros[j] > numeros[j + 1]) {
                    double temporal = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temporal;
                }
            }
        }

        double menor = numeros[0]; 
        double mayor = numeros[numeros.length - 1];

        System.out.println(" RESULTADOS ESTADÍSTICOS");
        System.out.println("]\n");
        System.out.println(" Suma total: " + suma);
        System.out.println(" Promedio:   " + promedio);
        System.out.println(" Menor:      " + menor);
        System.out.println(" Mayor:      " + mayor);
    

        scanner.close();
    }
}