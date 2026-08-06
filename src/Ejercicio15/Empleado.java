package Ejercicio15;

public abstract class Empleado {
    // Encapsulamiento
    private String nombre;
    private String identificacion;

    // Constructor con validación básica
    public Empleado(String nombre, String identificacion) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del empleado no puede estar vacío.");
        }
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    // Método abstracto: Las clases hijas definirán la fórmula exacta (Polimorfismo)
    public abstract double calcularPago();
    
}
