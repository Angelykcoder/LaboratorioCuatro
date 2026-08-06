package Ejercicio3;

public class PagoEfectivo extends Pago {
    //Atributo para saber que billetes dieron
    private double dineroEntregado;
    
    //Constructor
    public PagoEfectivo(double monto, double dineroEntregado){
        super (monto);
        this.dineroEntregado=dineroEntregado;

    }

    public double getDineroEntregado(){
        return dineroEntregado;
    }

    @Override
    public void procesarPago(){
        System.out.println("Recibiendo dinero físico...");
        if (dineroEntregado>=getMonto()){
            double vuelto=dineroEntregado-getMonto();
            System.out.println("Se cobro Q."+ getMonto()+ " en Efectivo");
            System.out.println("Sue vuelto es de Q."+ vuelto);

        }else{
            System.out.println("Error el dinero entregado Q"+ dineroEntregado+" no alcanza para cubrir" + getMonto());
        }
    }
}
