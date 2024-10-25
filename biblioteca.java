import java.util.ArrayList;

public class biblioteca {
    private ArrayList<libro> Libros;

    public biblioteca() {
        this.Libros = new ArrayList<>(); //new para inicializar objetos
    }

    public void agregarLibro(libro lbr){
        Libros.add(lbr);
    }

    public void mostrarLibros() {
        if (Libros.isEmpty()){ //Vacio el arrayList
            System.out.println("No hay libros");
        }else{
            for(libro lib: Libros){ //Tipo, nombre, objeto
                System.out.println(lib);
            }
        }
    }
}
