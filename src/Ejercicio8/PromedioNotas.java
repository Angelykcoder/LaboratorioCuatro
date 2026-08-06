package Ejercicio8;
import java.util.ArrayList;
import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Creamos un arreglo dinámico (ArrayList) para guardar números decimales (Double)
        ArrayList<Double> notas = new ArrayList<>();
        
        double suma = 0;
        int cantidadNotas = 5;

        System.out.println("--- Calculadora de Promedio de Notas ---");
        System.out.println("Por favor, ingrese " + cantidadNotas + " notas.");

        // Usamos un bucle while que se repetirá hasta que el arreglo tenga exactamente 5 notas
        while (notas.size() < cantidadNotas) {
            // Mostramos el número de nota que estamos pidiendo (1, 2, 3...)
            System.out.print("Ingrese la nota #" + (notas.size() + 1) + ": ");
            
            try {
                // Leemos la entrada y la convertimos a double
                double notaIngresada = Double.parseDouble(scanner.nextLine());
                
                // Opcional: Validar que la nota tenga un valor lógico (por ejemplo, entre 0 y 100)
                if (notaIngresada < 0 || notaIngresada > 100) {
                    System.out.println(" La nota debe estar entre 0 y 100. Inténtelo de nuevo.");
                    continue; // Salta a la siguiente iteración del bucle sin guardar la nota
                }
                
      
                notas.add(notaIngresada);
                
               
                suma += notaIngresada;
                
            } catch (NumberFormatException e) {
            
                System.out.println(" Error: Debe ingresar un valor numérico válido.");
            }
        }
        
 
        double promedio = suma / notas.size();
        
   
        System.out.println("Resumen de notas ingresadas: " + notas); 
        System.out.println("El promedio final es: " + promedio);
    
        
        scanner.close();
    }
}