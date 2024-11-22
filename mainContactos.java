import java.util.Scanner;

public class mainContactos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        String nombre = "";
        int numero = 0;
        int opcion;
        String regresar;
        do {
            do {
                System.out.println("Selecciona una opcion: ");
                System.out.println("1. Agregar un contacto");
                System.out.println("2. Buscar contacto");
                System.out.println("3. Mostrar contacto");
                opcion = scanner.nextInt();
            }while (opcion > 3 || opcion < 1);
            switch (opcion){
                case 1:
                    System.out.print("Ingresa el nombre del contacto: ");
                    nombre = scanner.next();
                    scanner.nextLine();
                    System.out.print("Ingresa el número del contacto: ");
                    numero = scanner.nextInt();
                    Contacto contacto = new Contacto(nombre,numero);
                    agenda.agregarContacto(contacto);
                    break;
                case 2:
                    System.out.print("Ingresa el nombre del contacto a buscar: ");
                    nombre = scanner.next();
                    Contacto encontrado = agenda.buscarContacto(nombre);
                    System.out.println(encontrado);
                    break;
                case 3:
                    agenda.mostrarContactos();
                    break;
                default:
                    break;
            }
            System.out.println("Deseas realizar otra operacion: s/n");
            regresar = scanner.next();
        }while (regresar.equalsIgnoreCase("S"));
        System.out.println("Saliste del programa");
    }
}
