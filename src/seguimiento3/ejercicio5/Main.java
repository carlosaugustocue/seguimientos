package seguimiento3.ejercicio5;

public
class Main {
    public static
    void main(String[] args) {
        // Crear 5 habitaciones de ejemplo
        Habitacion[] habitaciones = new Habitacion[5];
        habitaciones[0] = new Habitacion(101, 150.0, true, "Ninguno");
        habitaciones[1] = new Habitacion(102, 200.0, false, "Juan Pérez");
        habitaciones[2] = new Habitacion(103, 175.0, true, "Ninguno");
        habitaciones[3] = new Habitacion(104, 225.0, false, "María López");
        habitaciones[4] = new Habitacion(105, 180.0, true, "Ninguno");

        // Recorrer el arreglo y mostrar los datos de cada habitación
        System.out.println("Datos de las habitaciones:");
        for (Habitacion habitacion : habitaciones) {
            habitacion.mostrarDatos();
        }

        // Modificar el precio y la disponibilidad de algunas habitaciones
        habitaciones[0].setPrecioPorNoche(160.0);
        habitaciones[0].setDisponible(false);
        habitaciones[0].setHuespedesAlojados("Pedro Gómez");

        habitaciones[2].setPrecioPorNoche(185.0);
        habitaciones[2].setDisponible(false);
        habitaciones[2].setHuespedesAlojados("Ana Torres");

        // Mostrar nuevamente los datos para verificar los cambios
        System.out.println("Datos después de las modificaciones:");
        for (Habitacion habitacion : habitaciones) {
            habitacion.mostrarDatos();
        }
    }
}
