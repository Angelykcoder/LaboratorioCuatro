package Ejercicio1;

public class Gato extends Animal {
//Constructor
public Gato (String nombre){
    super(nombre);

}
@Override
public void HacerSonido(){
    System.out.println(nombre+" Maulla: Miau Miau");
}
}