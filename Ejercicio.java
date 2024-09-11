import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String mayor = "Eres mayor de edad";
        String menor = "Eres menor de edad";
        String resultado = "";

        System.out.print("¿Cuál es tu edad? ");
        age = scanner.nextInt();

        resultado = (age > 18) ? mayor : menor;
        System.out.println(resultado);
    }
}
