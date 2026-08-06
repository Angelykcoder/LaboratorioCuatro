package Ejercicio3;

public class Main {
    public static void main(String[] args){
        //Creo pagos de diferentes tipos
        // 1. Un pago con tarjeta 
        Pago pago1 = new PagoTarjeta(150.50, "4532-XXXX-XXXX-1234");
        
        // 2. Un pago en efectivo 
        Pago pago2 = new PagoEfectivo(45.00, 50.00);
        
        // 3. Un pago en efectivo fallido 
        Pago pago3 = new PagoEfectivo(100.00, 80.00);

        // Agrupo los pagos en un arreglo 
        Pago[] transacciones = { pago1, pago2, pago3 };
        System.out.println("Ejercicio 3: Sistema de Pagos");
        System.out.println("--- Sistema de Procesamiento de Pagos ---");
        
        // Proceso todos los pagos
        for (Pago transaccion : transacciones) {
            System.out.println("\nProcesando nueva transacción:");
            // El polimorfismo se encarga de llamar al método correcto
            transaccion.procesarPago();
        }
    }
}
