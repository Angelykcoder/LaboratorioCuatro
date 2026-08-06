package Ejercicio15;

public class EmpleadoTiempoCompleto extends Empleado {
    
    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, String identificacion, double salarioMensual) {
        super(nombre, identificacion);
        
        // Validación de datos
        if (salarioMensual < 0) {
            throw new IllegalArgumentException("El salario mensual no puede ser negativo.");
        }
        this.salarioMensual = salarioMensual;
    }

   
    @Override
    public double calcularPago() {
        return salarioMensual;
    }
}