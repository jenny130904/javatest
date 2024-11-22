import java.util.HashMap;

public class Agenda {
    private HashMap<String, Contacto> listaContactos;

    public Agenda() {
        this.listaContactos = new HashMap<>();
    }

    public void agregarContacto(Contacto contacto){
        listaContactos.put(contacto.getNombre(), contacto);
    }

    public Contacto buscarContacto(String nombre){
        return listaContactos.get(nombre);
    }

    public void mostrarContactos(){
        if (listaContactos.isEmpty()) {
            System.out.println("No hay contactos registrados en la agenda aún");
        } else {
            for (Contacto contacto : listaContactos.values()){
                System.out.println(contacto);
            }
        }
    }
}
