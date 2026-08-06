package Ejercicio16;

public class ProductoFisico extends Producto {
    // Atributo específico encapsulado (peso en kilogramos)
    private double pesoKg;

    public ProductoFisico(String codigo, String nombre, double precioBase, double pesoKg) {
        super(codigo, nombre, precioBase); // Herencia: Llama al constructor de Producto
        
        if (pesoKg <= 0) {
            throw new IllegalArgumentException("El peso del producto físico debe ser mayor a cero.");
        }
        this.pesoKg = pesoKg;
    }

   
    @Override
    public double calcularPrecioFinal() {
        double costoEnvio = pesoKg * 5.00;
        return getPrecioBase() + costoEnvio;
    }

    // Polimorfismo: Detalles específicos para el producto físico
    @Override
    public void mostrarDetalles() {
        System.out.println("   [FÍSICO] " + getNombre() + " (Cód: " + getCodigo() + ")");
        System.out.println("   Peso: " + pesoKg + " kg | Precio Base: Q" + getPrecioBase());
        System.out.println("   Precio Final (con envío): Q" + calcularPrecioFinal());
    }
}