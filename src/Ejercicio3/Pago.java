package Ejercicio3;

public abstract class Pago{
    //Encapsulamiento
    private double monto;

    //Constructor
    public Pago (double monto){
        this.monto=monto;

    }

    //Getters y Setters
    public double getMonto(){
        return monto;
    }
    public void setMonto(double monto){
        this.monto=monto;
    }

    //Método Abstracto 
    public abstract void procesarPago();
}