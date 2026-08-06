package Ejercicio4;

public class Revista extends Material {
    //Atributos encapsulados
    private int numeroEdicion;
    private String mesPublicacion;

    //Constructor
    public Revista(String titulo, String codigo, int numeroEdicion, String mesPublicación){
        super(titulo, codigo);
        this.numeroEdicion=numeroEdicion;
        this.mesPublicacion=mesPublicación;
    }

public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getMesPublicacion() {
        return mesPublicacion;
    }

    public void setMesPublicacion(String mesPublicacion) {
        this.mesPublicacion = mesPublicacion;
    }


    //Polimorfismo
    @Override
    public void mostrarInformacion(){
        System.out.println("Revista [" + getCodigo() + "] - Título: " + getTitulo() +  ", Edición N°: " + numeroEdicion + " (" + mesPublicacion + ")");

    }
}