package Ejercicio15;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        
        ArrayList<Empleado> nomina = new ArrayList<>();
        System.out.println("Ejercicio 15: Sistema de Empleados");
        System.out.println("--- Sistema de Nómina de Empleados ---\n");

        try {
            // 1. Creación de empleados válidos
            Empleado emp1 = new EmpleadoTiempoCompleto("Ana López", "EMP-001", 1200.50);
            Empleado emp2 = new EmpleadoPorHoras("Carlos Pérez", "EMP-002", 15.00, 40);
            
            nomina.add(emp1);
            nomina.add(emp2);
            
            System.out.println(" Empleados registrados exitosamente.\n");

            // 2. Demostración de Polimorfismo
            System.out.println("--- Detalles de Pagos ---");
            for (Empleado emp : nomina) {

                System.out.println("Empleado: " + emp.getNombre() + " (" + emp.getIdentificacion() + ")");
                System.out.println("Pago a realizar: Q" + emp.calcularPago());
           
            }

     
            System.out.println("\nIntentando registrar un empleado con datos inválidos...");
            Empleado empInvalido = new EmpleadoPorHoras("Luis Gómez", "EMP-003", -10.00, 20); // Tarifa negativa
            

            nomina.add(empInvalido);

        } catch (IllegalArgumentException e) {
     
            System.out.println(" Error en el registro: " + e.getMessage());
        }
    }
}