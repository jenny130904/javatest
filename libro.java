public class libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    @Override //Decoradores, Sobre escribir una funcion ya hecha
    public String toString(){
        return "Titulo: " + titulo + ", Autor: " + autor + ", Año P: " + anioPublicacion;
    }
}