package Ejercicio7;
import java.util.Scanner;


public class EntradaNumerica {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        boolean numeroValido= false;
        double numero =0; 

        System.out.println("--- Validar Entrada Numerica--");

        while (!numeroValido){
            System.out.print("Por favor, ingrese un número: ");
            try{
                String entrada=scanner.nextLine();
                numero=Double.parseDouble(entrada);
                numeroValido= true;
                System.out.println("Ingreso el número: " + numero);
            }
            
            catch(NumberFormatException e){
                System.out.println("Error ha ingresado un texto o caracteres inválidos");
                System.out.println("Debe ingresar únicamente valores numéricos. Inténtelo de nuevo.\n");
            }
            }

            scanner.close();

        }


    }

