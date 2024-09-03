package com.estudio.ejemplointerface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de personas
        List<Persona> personas = new ArrayList<>();

        // Crear dos objetos de tipo PersonaImpl
        Persona persona1 = new PersonaImpl("Juan", "Perez", 30);
        Persona persona2 = new PersonaImpl("Ana", "Gomez", 25);

        // Añadir las personas a la lista
        personas.add(persona1);
        personas.add(persona2);

        // Imprimir la lista de personas
        System.out.println("Lista inicial de personas:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Leer una persona por su nombre
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la persona a buscar: ");
        String nombreBuscar = scanner.nextLine();

        Persona personaEncontrada = null;
        for (Persona persona : personas) {
            if (persona.getNombre().equalsIgnoreCase(nombreBuscar)) {
                personaEncontrada = persona;
                break;
            }
        }

        // Si se encuentra la persona, actualizar su edad
        if (personaEncontrada != null) {
            System.out.print("Ingrese la nueva edad para " + personaEncontrada.getNombre() + ": ");
            int nuevaEdad = scanner.nextInt();
            personaEncontrada.setEdad(nuevaEdad);
            System.out.println("Edad actualizada: " + personaEncontrada);
        } else {
            System.out.println("Persona no encontrada.");
        }

        // Eliminar una persona de la lista
        System.out.print("Ingrese el nombre de la persona a eliminar: ");
        scanner.nextLine();  // Consumir el newline
        String nombreEliminar = scanner.nextLine();

        Persona personaEliminar = null;
        for (Persona persona : personas) {
            if (persona.getNombre().equalsIgnoreCase(nombreEliminar)) {
                personaEliminar = persona;
                break;
            }
        }

        if (personaEliminar != null) {
            personas.remove(personaEliminar);
            System.out.println("Persona eliminada: " + personaEliminar);
        } else {
            System.out.println("Persona no encontrada.");
        }

        // Imprimir la lista de personas al final
        System.out.println("Lista final de personas:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
