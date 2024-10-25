import java.util.Scanner;

public class MainBiblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        biblioteca Biblioteca = new biblioteca();
        String titulo;
        String autor;
        int anioPublicacion;
        int opcionMenu;
        String regresar;

        do {
            do {
                System.out.println("Biblioteca");
                System.out.println("Selecciona la opcion de tu preferencia");
                System.out.println("1.- Agregar libro");
                System.out.println("2.- Mostrar libros");
                System.out.println("3.- Salir");
                opcionMenu = scanner.nextInt();

                switch (opcionMenu){
                    case 1:
                        System.out.println("==== Agregar libro ====");
                        System.out.print("Titulo: ");
                        titulo = scanner.nextLine();
                        scanner.nextLine();
                        System.out.print("Autor: ");
                        autor = scanner.nextLine();
                        System.out.print("Año P: ");
                        anioPublicacion = scanner.nextInt();

                        libro Lib1 = new libro(titulo, autor, anioPublicacion);

                        Biblioteca.agregarLibro(Lib1);
                        break;
                    case 2:
                        System.out.println("==== Mostrar libros ====");
                        Biblioteca.mostrarLibros();
                        break;
                    case 3:
                        System.out.println("==== Salir ====");
                        break;
                    default:
                        break;
                }
            }while(opcionMenu > 3 || opcionMenu < 1);
            System.out.println("¿Quieres hacer otra operacion? S/N ");
            regresar = scanner.next();
        }while (regresar.equalsIgnoreCase("S"));

    }
}