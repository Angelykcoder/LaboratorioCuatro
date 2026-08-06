package Ejercicio4;

public class Material {
    //Encapsulamiento
    private String titulo;
    private String codigo;

    //Constructor
    public Material (String titulo, String codigo){
        this.titulo=titulo;
        this.codigo=codigo;
    }

    //Getters y Setters
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String Codigo){
        this.codigo=codigo;

    }
    public void mostrarInformacion(){
        System.out.println("Material - Titulo: "+ titulo+ ", código: "+ codigo);
    }
}

