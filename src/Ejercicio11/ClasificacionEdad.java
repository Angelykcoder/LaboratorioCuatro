package Ejercicio11;
import java.util.Scanner;
public class ClasificacionEdad {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int edad = -1; 
        boolean entradaValida = false;

        System.out.println("--- Sistema de Clasificación de Edad ---");

        // 1. Pedir la edad y validarla
        while (!entradaValida) {
            System.out.print("Por favor, ingrese su edad: ");
            
            try {
                edad = Integer.parseInt(scanner.nextLine());
                
            
                if (edad < 0) {
                    System.out.println(" Error: La edad no puede ser un número negativo. Inténtelo de nuevo.\n");
                } else {
                    entradaValida = true; // Si es un número válido y positivo, salimos del bucle
                }
                
            } catch (NumberFormatException e) {
                System.out.println(" Error: Por favor, ingrese un número entero válido.\n");
            }
        }

        // 2. Clasificar la edad usando condicionales
        String categoria = "";

        if (edad >= 0 && edad <= 12) {
            categoria = "Niño";
        } else if (edad >= 13 && edad <= 17) {
            categoria = "Adolescente";
        } else {
            // Si no es niño ni adolescente, por descarte (18 o más) es adulto
            categoria = "Adulto"; 
        }

        // 3. Mostrar el resultado
      
        System.out.println("Edad ingresada: " + edad + " años.");
        System.out.println("Clasificación:  ¡Eres un " + categoria + "!");
       

        scanner.close();
    }
}
