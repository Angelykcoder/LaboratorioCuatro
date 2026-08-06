package Ejercicio1;

public class Main {
    public static void main(String[]args){
        //Crear objetoss
        Animal Perro1=new Perro("Pelusa");
        Animal Gato1=new Gato("Kitty");

        System.out.println("Ejercicio 1: Sistema de Animales");
        Animal[] AnimalesCreado={Perro1, Gato1};
        System.out.println("Ejemplo Polimorfismo");
        for (Animal animal: AnimalesCreado){
            animal.HacerSonido();
        }

    }
    
}
