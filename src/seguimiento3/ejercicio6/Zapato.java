package seguimiento3.ejercicio6;

public class Zapato {
    private String nombre;
    private String material;
    private String color;
    private String talla;
    private double precio;
    private String coleccion;

    // Constructor
    public Zapato(String nombre, String material, String color, String talla, double precio, String coleccion) {
        this.nombre = nombre;
        this.material = material;
        this.color = color;
        this.talla = talla;
        this.precio = precio;
        this.coleccion = coleccion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColeccion() {
        return coleccion;
    }

    public void setColeccion(String coleccion) {
        this.coleccion = coleccion;
    }

    // Método para mostrar los detalles del zapato
    public void mostrarDetalles() {
        System.out.println("Zapato: " + nombre + ", Material: " + material + ", Color: " + color +
                                   ", Talla: " + talla + ", Precio: $" + precio + ", Colección: " + coleccion);
    }
}


