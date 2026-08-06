package Ejercicio4;

public class Libro extends Material {
    //Atributos encapsulados
    private String autor;
    private int numeroPaginas;

    //Constructor
    public Libro(String titulo, String codigo, String autor, int numeroPaginas){
        super(titulo, codigo);
        this.autor=autor;
        this.numeroPaginas=numeroPaginas;
    }
    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }

    private int getNumeroPaginas(){
        return numeroPaginas;
    }

    public void setNumeroPagina(int numeroPaginas){
        this.numeroPaginas=numeroPaginas;

    }

    //Polimorfismo
    @Override
    public void mostrarInformacion(){
        System.out.println("Libro: ["+getCodigo()+"] - Títul: "+ getTitulo()+ ", Autor " + autor + ", Paginas: "+ numeroPaginas);
    }
}