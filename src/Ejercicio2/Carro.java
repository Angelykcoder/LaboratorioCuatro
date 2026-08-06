package Ejercicio2;

public class Carro extends Vehiculo {
    //Atributo propio encapsulado
    private int cantidadPuertas;
    //Constructor
    public Carro(String marca, String modelo, int CantidadPuertas){
        super(marca, modelo); //Herencia del constructor vehiculo
        this.cantidadPuertas=CantidadPuertas;
    }
    public int getCantidadPuertas(){
        return cantidadPuertas;
    }
    
    public void seCantidadPuertas (int cantidadPuertas){
        this.cantidadPuertas=cantidadPuertas;
    }

    //Polimorfismo
    @Override
    public void mostrarDatos(){
        //Getters por que los atributos son pribados
        System.out.println("Carro-Marca " + getMarca()+ ", Modelo: " + getModelo()+ ",  Puertas: " + cantidadPuertas);
    }
}