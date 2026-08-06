package Ejercicio16;

public class ProductoDigital extends Producto {
    // Atributo específico encapsulado (tamaño en Megabytes)
    private double tamañoMB;

    public ProductoDigital(String codigo, String nombre, double precioBase, double tamañoMB) {
        super(codigo, nombre, precioBase);
        
        if (tamañoMB <= 0) {
            throw new IllegalArgumentException("El tamaño del archivo debe ser mayor a cero.");
        }
        this.tamañoMB = tamañoMB;
    }

    // Polimorfismo: El precio final es exactamente el precio base, sin envío
    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase();
    }

    // Polimorfismo: Detalles específicos para el producto digital
    @Override
    public void mostrarDetalles() {
        System.out.println("   [DIGITAL] " + getNombre() + " (Cód: " + getCodigo() + ")");
        System.out.println("   Tamaño: " + tamañoMB + " MB | Precio Base: Q" + getPrecioBase());
        System.out.println("   Precio Final (sin envío): Q" + calcularPrecioFinal());
    }
}