package seguimiento3.ejercicio7;

public class Prestamo {
    private String isbnLibro;
    private String identificacionUsuario;
    private String fechaPrestamo;
    private String fechaDevolucion;

    // Constructor
    public Prestamo(String isbnLibro, String identificacionUsuario, String fechaPrestamo, String fechaDevolucion) {
        this.isbnLibro = isbnLibro;
        this.identificacionUsuario = identificacionUsuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    // Getters y Setters
    public String getIsbnLibro() {
        return isbnLibro;
    }

    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }

    public String getIdentificacionUsuario() {
        return identificacionUsuario;
    }

    public void setIdentificacionUsuario(String identificacionUsuario) {
        this.identificacionUsuario = identificacionUsuario;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    // Método para mostrar la información del préstamo
    public void mostrarInformacion() {
        System.out.println("ISBN del Libro: " + isbnLibro);
        System.out.println("Identificación del Usuario: " + identificacionUsuario);
        System.out.println("Fecha de Préstamo: " + fechaPrestamo);
        System.out.println("Fecha de Devolución: " + fechaDevolucion);
    }
}

