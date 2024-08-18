package seguimiento3.ejercicio4;


public class Main {
    public static void main(String[] args) {
        // Crear 3 propiedades
        Propiedad propiedad1 = new Propiedad("P001", "Calle 123", 120.5, 100000, 3, 2, true, "Disponible");
        Propiedad propiedad2 = new Propiedad("P002", "Avenida 456", 80.0, 75000, 2, 1, false, "Disponible");
        Propiedad propiedad3 = new Propiedad("P003", "Transversal 789", 150.0, 200000, 4, 3, true, "Arrendada");

        //Este es un arreglo de objetos de tipo propiedad
        Propiedad[] propiedades = {propiedad1, propiedad2, propiedad3};

        // Mostrar los datos de cada propiedad usando un ciclo
        System.out.println("Datos de las propiedades:");
        for (Propiedad propiedad : propiedades) {
            propiedad.mostrarDatos();
            System.out.println();
        }

        // Modificar el estado de una propiedad
        propiedad2.setEstado("Vendida");

        // Mostrar nuevamente los datos de la propiedad modificada
        System.out.println("Datos de la propiedad modificada:");
        propiedad2.mostrarDatos();
    }
}
