package Ejercicio1;

public abstract class Animal{
    //Atributo
    protected String nombre;

    //Constructor
    public Animal(String nombre){
        this.nombre=nombre;
    }
    //Metodo abstracto
    public abstract void HacerSonido();

    //Metodo para obtener nombre
    public String getNombre(){
        return nombre;
    }

}