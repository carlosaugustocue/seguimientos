package seguimiento3.ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia de CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria("123456789", 1000.0, true, "1234");

        int opcion;

        do {
            // Mostrar el menú
            System.out.println("\033[32m"); // Cambia el color a verde
            System.out.println("\n***********************");
            System.out.println("Cajero Electrónico:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar efectivo");
            System.out.println("3. Consignar efectivo");
            System.out.println("4. Cambiar clave");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            System.out.println("\n***********************");
            opcion = scanner.nextInt();
            System.out.println("\033[0m"); // Restablece el color a predeterminado

            switch (opcion) {
                case 1:
                    cuenta.consultarSaldo();
                    break;
                case 2:
                    System.out.println("\n------------------------------------------------------------");
                    System.out.print("Ingrese el monto a retirar: ");
                    System.out.println("\n------------------------------------------------------------");
                    double montoRetirar = scanner.nextDouble();
                    cuenta.retirarEfectivo(montoRetirar);
                    break;
                case 3:
                    System.out.println("\n------------------------------------------------------------");
                    System.out.print("Ingrese el monto a consignar: ");
                    System.out.println("\n------------------------------------------------------------");
                    double montoConsignar = scanner.nextDouble();
                    cuenta.consignarEfectivo(montoConsignar);
                    break;
                case 4:
                    System.out.println("\n------------------------------------------------------------");
                    System.out.print("Ingrese la clave actual: ");
                    System.out.println("\n------------------------------------------------------------");
                    String claveActual = scanner.next();
                    System.out.println("\n------------------------------------------------------------");
                    System.out.print("Ingrese la nueva clave: ");
                    System.out.println("\n------------------------------------------------------------");
                    String nuevaClave = scanner.next();
                    cuenta.cambiarClave(claveActual, nuevaClave);
                    break;
                case 5:
                    System.out.println("\n------------------------------------------------------------");
                    System.out.println("Saliendo del sistema...");
                    System.out.println("\n------------------------------------------------------------");
                    break;
                default:
                    System.out.println("\n------------------------------------------------------------");
                    System.out.println("Opción no válida. Intente nuevamente.");
                    System.out.println("\n------------------------------------------------------------");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
