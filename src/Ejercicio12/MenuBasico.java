package Ejercicio12;

import java.util.Scanner;

public class MenuBasico {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        boolean continuar = true;

        System.out.println("Ejercicio 12: Menú Básico");
        do {
            System.out.println("\n--- MENÚ DE CALCULADORA BÁSICA ---");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Salir");
            System.out.print("Elija una opción (1-3): ");
            
            try {
                
                opcion = Integer.parseInt(scanner.nextLine());
                
               
                switch (opcion) {
                    case 1:
                        System.out.println("\n--- SUMA ---");
                        System.out.print("Ingrese el primer número: ");
                        double sum1 = Double.parseDouble(scanner.nextLine());
                        System.out.print("Ingrese el segundo número: ");
                        double sum2 = Double.parseDouble(scanner.nextLine());
                        
                        System.out.println(" Resultado: " + sum1 + " + " + sum2 + " = " + (sum1 + sum2));
                        break; 
                        
                    case 2:
                        System.out.println("\n--- RESTA ---");
                        System.out.print("Ingrese el primer número: ");
                        double res1 = Double.parseDouble(scanner.nextLine());
                        System.out.print("Ingrese el segundo número: ");
                        double res2 = Double.parseDouble(scanner.nextLine());
                        
                        System.out.println("Resultado: " + res1 + " - " + res2 + " = " + (res1 - res2));
                        break;
                        
                    case 3:
                        System.out.println("\nSaliendo del programa... ¡Hasta luego!");
                        continuar = false; 
                        break;
                        
                    default:
                        
                        System.out.println(" Opción no válida. Por favor, elija 1, 2 o 3.");
                        break;
                }
                
            } catch (NumberFormatException e) {
               
                System.out.println(" Error: Debe ingresar un valor numérico válido.");
            }
            
        } while (continuar);
        
        scanner.close();
    }
}