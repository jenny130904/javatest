public class Tarea {
    public static void Tarea(String[] args){
        //System.out.println("Primer archivo de git con java");

        int[] calificaciones = {99, 90, 85, 100, 86};

        Student estudiante = new Student("Carla", 4, 3754923, 20, calificaciones);

        estudiante.displayInfo();
    }
}
