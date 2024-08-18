package seguimiento3.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Mascota perro = new Mascota("Antoine", 5, "Pastor Alemán", "Negro");
        Mascota gato = new Mascota("Michu", 2, "Siames", "Blanco");
        Mascota loro = new Mascota("Paco", 3, "Capibara", "Marron");

        // Imprimir los valores de los atributos de cada mascota
        System.out.println("Información de las mascotas:");
        perro.imprimirInfo();
        System.out.println();

        gato.imprimirInfo();
        System.out.println();

        loro.imprimirInfo();
        System.out.println();

        // Modificar los valores de los atributos de alguna mascota
        perro.setColor("Marrón");
        perro.setEdad(6);

        // Volver a imprimir para comprobar los cambios
        System.out.println("Información modificada de Antoine:");
        perro.imprimirInfo();

    }
}
