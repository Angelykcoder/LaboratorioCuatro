package Ejercicio2;

public class Moto extends Vehiculo{
    //Atributo propio encapsulado
    private int cilindrada;

    //Constructor
    public Moto (String marca, String modelo, int cilindrada){
        super(marca, modelo);
        this.cilindrada=cilindrada;
    }

    public int getCilindrad(){
        return cilindrada;
    }

    public void setCilindrada (int cilindrada){
        this.cilindrada=cilindrada;
    }

    @Override
    public void mostrarDatos (){
        System.out.println("Moto-Marca " + getMarca()+ ", Modelo: " + getModelo()+ ",  Cilindrada: " + cilindrada+ "cc");
    }
}