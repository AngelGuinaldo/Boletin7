package boletin7;

public class Libro {

    private String titulo;
    private String autor;
    private int numeroexemplares;
    private int exemplaresprestados;

    public void Libro(String titulo, String autor, int numeroexemplares, int exemplaresprestados) {
        this.autor = autor;
        this.exemplaresprestados = exemplaresprestados;
        this.titulo = titulo;
        this.numeroexemplares = numeroexemplares;

    }

    public String getTitulo() {

        return titulo;
    }

    public String getAutor() {
        return autor;

    }

    public int getNumeroExemplares() {
        return numeroexemplares;
    }

    public int getExemplaresPrestados() {
        return exemplaresprestados;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setNumeroExemplares(int numeroexemplares){
        this.numeroexemplares = numeroexemplares;
        
    }
    public void setExemplaresPrestados(int exemplaresprestados){
        this.exemplaresprestados = exemplaresprestados;
    }
    public void prestamo(){
        do{
           exemplaresprestados = ++ exemplaresprestados;
           System.out.println("");
        }while(numeroexemplares>0);
        
        System.out.println();
        
    }
}

