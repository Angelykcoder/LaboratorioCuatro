package Ejercicio15;

public class EmpleadoPorHoras extends Empleado {
    
    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHoras(String nombre, String identificacion, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, identificacion);
        
        // Validación de datos rigurosa
        if (tarifaPorHora <= 0) {
            throw new IllegalArgumentException("La tarifa por hora debe ser mayor a cero.");
        }
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas no pueden ser negativas.");
        }
        
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Implementación del cálculo de pago
    @Override
    public double calcularPago() {
        return tarifaPorHora * horasTrabajadas;
    }
}