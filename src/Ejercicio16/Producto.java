package Ejercicio16;

public abstract class Producto {
    // Encapsulamiento: Atributos privados
    private String codigo;
    private String nombre;
    private double precioBase;

    // Constructor con validación
    public Producto(String codigo, String nombre, double precioBase) {
        if (precioBase < 0) {
            throw new IllegalArgumentException("El precio base no puede ser negativo.");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    // Métodos abstractos que las clases hijas deberán implementar (Polimorfismo)
    public abstract double calcularPrecioFinal();
    public abstract void mostrarDetalles();
}