import java.util.InputMismatchException;
import java.util.Scanner;

public class manejoExcepcion {
    public static double division (double a, double b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("No se permite division entre 0");
        }
        return a / b;
    }
    public static void validarOperacion (int opcion) throws IllegalArgumentException{
        if ((opcion < 1) || (opcion > 4)){
            throw new IllegalArgumentException("Operacion Invalida");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = 0.0, b = 0.0, resultado = 0.0;
        int opcion = 0;
        try {
            System.out.println("Teclea la opcion: ");
            System.out.println("1. SUMA ");
            System.out.println("2. RESTA ");
            System.out.println("3. MULTIPLICACION ");
            System.out.println("4. DIVISION ");
            opcion= scanner.nextInt();
            validarOperacion(opcion);

            System.out.print("Ingresa el primer numero: ");
            a = scanner.nextDouble();
            System.out.print("Ingresa el segundo numero: ");
            b = scanner.nextDouble();

            switch (opcion){
                case 1:
                    resultado = a + b;
                    System.out.println("Resultado de la suma: " + resultado);
                    break;
                case 2:
                    resultado = a - b;
                    System.out.println("Resultado de la resta: " + resultado);
                    break;
                case 3:
                    resultado = a * b;
                    System.out.println("Resultado de la multiplicacion: " + resultado);
                    break;
                case 4:
                    resultado = division(a, b);
                    System.out.println("Resultado de la division: " + resultado);
                    break;
                default:
                    break;
            }
        }catch (ArithmeticException | IllegalArgumentException e){
            System.out.println("Excepcion: "+e);
        }
        catch (InputMismatchException e){
            System.out.println("Excepcion: " + e + ": No puedes ingresar letras");
        }
        finally {
            scanner.close();
        }
    }
}