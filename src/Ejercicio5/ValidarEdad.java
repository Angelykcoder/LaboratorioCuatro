package Ejercicio5;
import java.util.Scanner;

public class ValidarEdad {
    public static void main(String[] args){
    //Instancio scanner 
    Scanner scanner = new Scanner (System.in);

    int edad=0;
    boolean edadValida=false;
  
  System.out.println("--- Sistema de Verificación de Edad ---");
    

  while (!edadValida){

  System.out.print("Por favor, ingrese su edad: ");
            
            try {
                // Leemos la entrada como texto y luego la convertimos a entero (int).
                // Esto evita problemas en el buffer del Scanner cuando el usuario presiona Enter.
                String entrada = scanner.nextLine();
                edad = Integer.parseInt(entrada);
                
                // Validación: Comprobar que sea un número positivo
                if (edad < 0) {
                    // Si es negativo, lanzamos una excepción intencionalmente
                    throw new IllegalArgumentException("La edad no puede ser un número negativo.");
                } else if (edad == 0) {
                     throw new IllegalArgumentException("La edad debe ser mayor a cero.");
                }
                
                // Si el código llega a esta línea, significa que no hubo errores ni excepciones
                edadValida = true;
                System.out.println("\n¡Registro exitoso! Edad guardada: " + edad + " años.");
                
            } catch (NumberFormatException e) {
                // Este bloque atrapa el error si el usuario ingresa letras, decimales o símbolos
                System.out.println(" Error: Debe ingresar un número entero válido (Ejemplo: 25). Inténtelo de nuevo.\n");
                
            } catch (IllegalArgumentException e) {
                // Este bloque atrapa el error que nosotros mismos lanzamos si el número es negativo o cero
                System.out.println(" Error: " + e.getMessage() + " Inténtelo de nuevo.\n");
            }
        }
        scanner.close();
}
}
