package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        
       //Instancio los objetos
        
        Material libro1 = new Libro("Cien Años de Soledad", "LIB-001", "Gabriel García Márquez", 417);
        Material revista1 = new Revista("National Geographic", "REV-045", 152, "Agosto 2026");
      

        // Creamos un arreglo de Materiales
        Material[] inventario = { libro1, revista1};

        System.out.println("--- Inventario de la Biblioteca ---");
        System.out.println("-----------------------------------");
        
        // Iteramos sobre el arreglo para demostrar el polimorfismo
        for (Material item : inventario) {
       
            item.mostrarInformacion();
        }
    }
}
