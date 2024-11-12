import java.util.Scanner;

public class MainVehiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String marca = "";
        String modelo = "";
        int anioFabricacion = 0;
        int no_motores = 0;
        int opcion = 0;
        String respuesta = "";
        do{
            do {
                System.out.println("¿Que tipo de vehículo es? ");
                System.out.println("1. Vehículo Terrestre ");
                System.out.println("2. Vehículo Acuatico ");
                opcion = scanner.nextInt();
            }while (opcion < 1 || opcion > 2);

            switch (opcion){
                case 1:
                    System.out.print("Introduce la marca del vehículo: ");
                    marca = scanner.next();
                    System.out.print("Introduce el modelo del vehículo: ");
                    modelo = scanner.next();
                    System.out.print("Introduce el año de fabricacion del vehículo: ");
                    anioFabricacion = scanner.nextInt();
                    vehiculoTerrestre vehiculoTerrestre = new vehiculoTerrestre(marca, modelo, anioFabricacion);
                    System.out.println(vehiculoTerrestre.mostrarMensaje());
                    break;
                case 2:
                    System.out.print("Introduce la marca del vehículo: ");
                    marca = scanner.next();
                    System.out.print("Introduce el modelo del vehículo: ");
                    modelo = scanner.next();
                    System.out.print("Introduce el año de fabricacion del vehículo: ");
                    anioFabricacion = scanner.nextInt();
                    System.out.print("Introduce el número de motores del vehículo: ");
                    no_motores = scanner.nextInt();
                    vehiculoAcuatico vehiculoAcuatico = new vehiculoAcuatico(marca, modelo, anioFabricacion, no_motores);
                    System.out.println(vehiculoAcuatico.mostrarMensaje());
                    break;
                default:
                    break;
            }
            System.out.println("¿Que agregar otro vehículo? S/N");
            respuesta = scanner.next();
        }while (respuesta.equalsIgnoreCase("S"));

    }
}