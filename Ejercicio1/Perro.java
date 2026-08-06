package Ejercicio1;

public class Perro extends Animal {
//Constructor
public Perro (String nombre){
    super(nombre);

}
@Override
public void HacerSonido(){
    System.out.println(nombre+" Ladra: Guau Guau");
}
}