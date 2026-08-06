package Ejercicio6;
import java.util.Scanner;


public class DivisionSegura {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora de División ---");

        try {
            // 1. Pedir el primer número (Dividendo)
            System.out.print("Ingrese el primer número (dividendo): ");
            double numero1 = Double.parseDouble(scanner.nextLine());

            // 2. Pedir el segundo número (Divisor)
            System.out.print("Ingrese el segundo número (divisor): ");
            double numero2 = Double.parseDouble(scanner.nextLine());

            // 3. Validar la división entre 0
            if (numero2 == 0) {
                // Forzamos un error matemático lanzando una excepción
                throw new ArithmeticException("No se puede dividir entre cero.");
            }

            // Realizar la división si todo está correcto
            double resultado = numero1 / numero2;
            System.out.println("\n El resultado de la división es: " + resultado);

        } catch (ArithmeticException e) {
            // Atrapa el error específico de la división por cero
            System.out.println("\n Error Matemático: " + e.getMessage());
            
        } catch (NumberFormatException e) {
            // Atrapa el error si el usuario escribe letras o símbolos en lugar de números
            System.out.println("\n Error de Entrada: Por favor, ingrese únicamente valores numéricos.");
            
        } finally {
            // El bloque finally siempre se ejecuta, haya error o no. 
            // Es el lugar ideal para cerrar el scanner.
            scanner.close();
            System.out.println("Programa finalizado.");
        }
    }
}
