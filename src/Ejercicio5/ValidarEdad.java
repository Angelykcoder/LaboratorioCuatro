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
               
                String entrada = scanner.nextLine();
                edad = Integer.parseInt(entrada);
                
                // Validación: Comprobar que sea un número positivo
                if (edad < 0) {
                    // Si es negativo, lanzamos una excepción intencionalmente
                    throw new IllegalArgumentException("La edad no puede ser un número negativo.");
                } else if (edad == 0) {
                     throw new IllegalArgumentException("La edad debe ser mayor a cero.");
                }
                
   
                edadValida = true;
                System.out.println("\n¡Registro exitoso! Edad guardada: " + edad + " años.");
                
            } catch (NumberFormatException e) {
           
                System.out.println(" Error: Debe ingresar un número entero válido (Ejemplo: 25). Inténtelo de nuevo.\n");
                
            } catch (IllegalArgumentException e) {
            
                System.out.println(" Error: " + e.getMessage() + " Inténtelo de nuevo.\n");
            }
        }
        scanner.close();
}
}
