package seguimiento2.ejercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del empleado
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        // Solicitar el número de horas trabajadas
        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        int horasTrabajadas = scanner.nextInt();

        // Crear el objeto Empleado y mostrar el mensaje
        Empleado empleado = new Empleado(nombre, horasTrabajadas);
        empleado.mostrarMensaje();

        scanner.close();
    }
}
