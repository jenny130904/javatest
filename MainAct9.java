import javax.swing.*;
import java.util.Scanner;

public class MainAct9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numE = 0;
        String nombre = "";
        int edad = 0;

        System.out.print("Ingresa el numero de estudiantes a almacenar: ");
        numE = scanner.nextInt();
        Estudiante[] estudiante = new Estudiante[numE];//Objeto

        for (int i=0; i < numE; i++){
            System.out.print("Escribe el nombre del alumno: ");
            nombre = scanner.next();
            System.out.print("Escribe la edad del alumno: ");
            edad = scanner.nextInt();

            estudiante[i] = new Estudiante(nombre, edad);
        }

        for (int i = 0; i < estudiante.length; i++){
            System.out.println(estudiante[i]);
        }
    }
}