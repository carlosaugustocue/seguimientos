package seguimiento3.ejercicio5;

public class Habitacion {
    private int numeroHabitacion;
    private double precioPorNoche;
    private boolean disponible;
    private String huespedesAlojados;

    // Constructor
    public Habitacion(int numeroHabitacion, double precioPorNoche, boolean disponible, String huespedesAlojados) {
        this.numeroHabitacion = numeroHabitacion;
        this.precioPorNoche = precioPorNoche;
        this.disponible = disponible;
        this.huespedesAlojados = huespedesAlojados;
    }

    // Getters y Setters
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getHuespedesAlojados() {
        return huespedesAlojados;
    }

    public void setHuespedesAlojados(String huespedesAlojados) {
        this.huespedesAlojados = huespedesAlojados;
    }

    // Método para mostrar los datos de la habitación
    public void mostrarDatos() {
        System.out.println("Número de Habitación: " + numeroHabitacion);
        System.out.println("Precio por Noche: $" + precioPorNoche);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
        System.out.println("Huéspedes Alojados: " + huespedesAlojados);
        System.out.println();
    }
}

