package Ejercicio12;

import java.util.Scanner;

public class MenuBasico {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        boolean continuar = true;


        do {
            System.out.println("\n--- MENÚ DE CALCULADORA BÁSICA ---");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Salir");
            System.out.print("Elija una opción (1-3): ");
            
            try {
                // Leemos la opción del usuario
                opcion = Integer.parseInt(scanner.nextLine());
                
                // Estructura switch para ejecutar código según la opción elegida
                switch (opcion) {
                    case 1:
                        System.out.println("\n--- SUMA ---");
                        System.out.print("Ingrese el primer número: ");
                        double sum1 = Double.parseDouble(scanner.nextLine());
                        System.out.print("Ingrese el segundo número: ");
                        double sum2 = Double.parseDouble(scanner.nextLine());
                        
                        System.out.println("✅ Resultado: " + sum1 + " + " + sum2 + " = " + (sum1 + sum2));
                        break; // El break es importante para que no se sigan ejecutando las opciones de abajo
                        
                    case 2:
                        System.out.println("\n--- RESTA ---");
                        System.out.print("Ingrese el primer número: ");
                        double res1 = Double.parseDouble(scanner.nextLine());
                        System.out.print("Ingrese el segundo número: ");
                        double res2 = Double.parseDouble(scanner.nextLine());
                        
                        System.out.println("✅ Resultado: " + res1 + " - " + res2 + " = " + (res1 - res2));
                        break;
                        
                    case 3:
                        System.out.println("\nSaliendo del programa... ¡Hasta luego!");
                        continuar = false; // Cambiamos a false para romper el ciclo
                        break;
                        
                    default:
                        // El default atrapa cualquier número que no sea 1, 2 o 3
                        System.out.println("⚠️ Opción no válida. Por favor, elija 1, 2 o 3.");
                        break;
                }
                
            } catch (NumberFormatException e) {
                // Si el usuario escribe letras en el menú o en los números de la suma/resta
                System.out.println("❌ Error: Debe ingresar un valor numérico válido.");
            }
            
        } while (continuar);
        
        scanner.close();
    }
}