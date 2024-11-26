import java.util.HashMap;
import java.util.List;

public class Universidad extends Estudiante1{
    private HashMap<String, Estudiante1> listaAlumnos;
    private HashMap<String, Materia> listaMaterias;

    public Universidad(){
        this.listaAlumnos = new HashMap<>();
        this.listaMaterias = new HashMap<>();
    }

    public Universidad(String nombreMateria, double calificacion, String nombre, List<Materia> calificaciones, int edad, HashMap<String, Estudiante1> listaAlumnos, HashMap<String, Materia> listaMaterias) {
        super(nombreMateria, calificacion, nombre, calificaciones, edad);
        this.listaAlumnos = listaAlumnos;
        this.listaMaterias = listaMaterias;
    }

    public void agregarAlumnos(Estudiante1 estudiante){
        listaAlumnos.put(estudiante.getNombre(), estudiante);
    }

    public void agregarMaterias(Materia materia){
        listaMaterias.put(materia.getNombreMateria(), materia);
    }

    public void mostrarListaAlum(){
        if (listaAlumnos.isEmpty()){
            System.out.println("No hay registro de alumnos");
        }else{
            for (Estudiante1 estudiante : listaAlumnos.values()){
                System.out.println(estudiante);
            }
        }
    }
    public void mostraListaMater(){
        if (listaMaterias.isEmpty()){
            System.out.println("No hay registro de alumnos");
        }else{
            for (Materia materia : listaMaterias.values()){
                System.out.println(materia);
            }
        }
    }
}

