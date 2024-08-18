package seguimiento3.ejercicio4;

public class Propiedad {
    private String idPropiedad;
    private String direccion;
    private double area;
    private double precio;
    private int cantidadHabitaciones;
    private int cantidadBanos;
    private boolean tieneGaraje;
    private String estado; // Disponible, Vendida, Rentada

    // Constructor
    public Propiedad(String idPropiedad, String direccion, double area, double precio,
                     int cantidadHabitaciones, int cantidadBanos, boolean tieneGaraje, String estado) {
        this.idPropiedad = idPropiedad;
        this.direccion = direccion;
        this.area = area;
        this.precio = precio;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.cantidadBanos = cantidadBanos;
        this.tieneGaraje = tieneGaraje;
        this.estado = estado;
    }

    // Métodos Getters y Setters
    public String getIdPropiedad() {
        return idPropiedad;
    }

    public void setIdPropiedad(String idPropiedad) {
        this.idPropiedad = idPropiedad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getCantidadBanos() {
        return cantidadBanos;
    }

    public void setCantidadBanos(int cantidadBanos) {
        this.cantidadBanos = cantidadBanos;
    }

    public boolean isTieneGaraje() {
        return tieneGaraje;
    }

    public void setTieneGaraje(boolean tieneGaraje) {
        this.tieneGaraje = tieneGaraje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método para mostrar los datos de la propiedad
    public void mostrarDatos() {
        System.out.println("ID de Propiedad: " + idPropiedad);
        System.out.println("Dirección: " + direccion);
        System.out.println("Área en m2: " + area);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad de habitaciones: " + cantidadHabitaciones);
        System.out.println("Cantidad de baños: " + cantidadBanos);
        System.out.println("Garaje: " + (tieneGaraje ? "Sí" : "No"));
        System.out.println("Estado: " + estado);
    }
}

