package Ejercicio2;

public class Vehiculo{
    //Encapsulamiento
    private String marca;
    private String modelo;


    //Constructor
    public Vehiculo(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;

    }
    //Encapsulamiento
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo (String modelo){
        this.modelo=modelo;
    }

    
    //Metodo sobrescrito
    public void mostrarDatos(){
        System.out.println("Vehiclo-Marca "+marca+", Modelo: "+modelo);
    }

}