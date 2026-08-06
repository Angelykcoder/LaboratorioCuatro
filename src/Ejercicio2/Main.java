package Ejercicio2;

public class Main {
    public static void main (String[] args){
        //Creo objetos
        Vehiculo Carro1= new Carro("Mazda", "3 Grand Touring", 4);
        Vehiculo Moto1= new Moto("Honda", "CRF", 250);
        //Arreglo 
        Vehiculo[] Losvehiculos={Carro1, Moto1};
        System.out.println("Ejemplo Polimorfimso");
   
        for(Vehiculo v: Losvehiculos){
            v.mostrarDatos();
        }
   
    }
}
