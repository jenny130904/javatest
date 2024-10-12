import java.util.Scanner;

public class Numeros {

    int num = 1, numero = 0;
    Scanner scanner = new Scanner(System.in);

    //Números del 1 al 100 usando while.
    public void primerCiclo() {
        System.out.println("Ciclo while");
        while (num < 100) {
            num++;
            System.out.println("Numero " + num);
        }
    }

    //Números del 1 al 100 usando for.
    public void segundoCiclo() {
        System.out.println("Ciclo for");
        for (int num = 1; num < 100; num++) {
            System.out.println("Numero " + num);
        }
    }

    //Números del 1 al 100 divisibles entre 2 y 3.
    public void multiplos2Y3(){
        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.println("El numero " + num + " es multiplo de 2");
            } else if (num % 3 == 0) {
                System.out.println("El numero " + num + " es multiplo de 3");
            }
            num++;
        }
    }

    //El número escrito es mayor o igual a 0.
    public void mayorA0 (){
        do{
            System.out.print("Ingresa un numero: ");
            numero = scanner.nextInt();
        }while(numero < 0);
        System.out.print("El numero " + numero + " es mayor o igual a 0");
    }
}
