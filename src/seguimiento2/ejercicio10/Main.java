package seguimiento2.ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el tipo de lavadora
        System.out.print("Ingrese el tipo de lavadora (1 para grande, 2 para pequeña): ");
        int tipo = scanner.nextInt();

        // Solicitar al usuario que ingrese las horas de alquiler
        System.out.print("Ingrese el número de horas de alquiler: ");
        int horas = scanner.nextInt();

        // Solicitar al usuario que ingrese la cantidad de lavadoras
        System.out.print("Ingrese la cantidad de lavadoras a alquilar: ");
        int cantidad = scanner.nextInt();

        // Crear una instancia de la clase Lavadora
        Lavadora lavadora = new Lavadora(tipo, horas, cantidad);

        // Calcular y mostrar el costo total
        double costoTotal = lavadora.calcularCosto();
        System.out.println("El costo total a pagar es: " + costoTotal);

        scanner.close();
    }
}