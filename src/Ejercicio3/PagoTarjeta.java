package Ejercicio3;

public class PagoTarjeta extends Pago {
    //Atributo de esta clase
    private String numeroTarjeta;

    //Constructor
    public PagoTarjeta(double monto, String numeroTarjeta){
        super(monto);
        this.numeroTarjeta=numeroTarjeta;

    }
    public String getNumeroTarjeta(){
        return numeroTarjeta;
    }
    //Polimorfismo

    @Override
    public void procesarPago(){
        System.out.println("Se ha cobrado "+getMonto()+ " Mediante Tarjeta de Crédito/Débito");
    }
}
