import java.util.Random;
import java.util.Scanner;
public class mainCurp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String nombre;
        String apellidoPaterno;
        String apellidoMaterno;
        String fechaNacimiento;
        String sexo;
        int homoclave = random.nextInt(90);
        int seleccionEntidadFederativa;
        String claveEntidadFederativa;
        String nombreEntidadFederativa;
        String respuesta;

        do {
            System.out.println("CALCULADORA DE CURP");
            System.out.println("Escriba los siguientes datos para calcular la CURP: ");
            System.out.print("Nombre (s): ");
            nombre = scanner.nextLine();
            System.out.print("Apellido paterno: ");
            apellidoPaterno = scanner.nextLine();
            System.out.print("Apellido materno: ");
            apellidoMaterno = scanner.nextLine();
            System.out.print("Fecha de nacimiento (dd/mm/aaaa): ");
            fechaNacimiento = scanner.nextLine();
            System.out.print("Sexo (H/M): ");
            sexo = scanner.nextLine();

            EntidadFederativa entidadFederativa = new EntidadFederativa();
            entidadFederativa.mostrarCatalogo();
            System.out.print("Seleccione Entidad Federativa: ");
            seleccionEntidadFederativa = scanner.nextInt();
            scanner.nextLine();
            claveEntidadFederativa = entidadFederativa.getClaveEntidad(seleccionEntidadFederativa);
            System.out.print("Clave Entidad Federativa: " + claveEntidadFederativa + " ");
            nombreEntidadFederativa = entidadFederativa.getNombreEntidad(seleccionEntidadFederativa);
            System.out.print("= " +nombreEntidadFederativa);

            CURP curp1 = new CURP(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento, sexo, claveEntidadFederativa, homoclave);
            System.out.println("\nCURP: " + curp1.getCURP().toUpperCase());

            System.out.print("¿Deseas saber conocer CURP? (si/no) ");
            respuesta = scanner.next();
            scanner.nextLine();
        }while(respuesta.equals("si") || respuesta.equals("Si"));
    }
}
