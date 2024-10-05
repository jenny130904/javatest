public class Main {
    public static void main(String[] args) {
        int[] calificaciones = {99, 90, 85, 100, 86};

        Student estudiante = new Student("Carla", 4, 3754923, 20, calificaciones);

        estudiante.displayInfo();
    }
}
