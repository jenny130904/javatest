import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] Op = new float[4];
        float[] valor = new float[3];
        /* System.out.print("Ingrese el valor primer valor: );
            Op[0] = scanner.nextFloat(); */

        for (int i = 0; i < valor.length; i++) {
            System.out.print("Ingrese el valor " + (i+1) + ": ");
            valor[i] = scanner.nextFloat();
        }
        for (int i = 0; i < valor.length; i++) {
            System.out.println("El valor de valor " + (i + 1) + " valor [" + i + "] es: " + valor[i]);
        }
        /*
        Suma el primer valor más el segundo valor y al resultado réstale el tercer valor.
        Resta el segundo valor menos el tercer valor y multiplica el resultado por el primer valor.
        Multiplica el primer valor por el segundo valor y el resultado multiplícalo por el tercer valor.
        Divide el tercer valor entre el primer valor y al resultado súmale el segundo valor.
        */
        Op[0] = (valor[0] + valor[1]) - valor[2];
        Op[1] = (valor[1] - valor[2]) * valor[0];
        Op[2] = (valor[0] * valor[1]) * valor[2];
        Op[3] = (valor[2] / valor[0]) + valor[1];

        for (int i = 0; i < Op.length; i++) {
            System.out.println("El resultado de la primera operacion es: " + Op[i]);
        }
    }
}
