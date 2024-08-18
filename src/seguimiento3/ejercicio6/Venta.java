package seguimiento3.ejercicio6;

public class Venta {
    private String fecha;
    private Zapato zapato;
    private String talla;
    private int cantidad;
    private double total;

    // Constructor
    public Venta(String fecha, Zapato zapato, String talla, int cantidad) {
        this.fecha = fecha;
        this.zapato = zapato;
        this.talla = talla;
        this.cantidad = cantidad;
        this.total = calcularTotal();
    }

    // Método para calcular el total de la venta
    private double calcularTotal() {
        return zapato.getPrecio() * cantidad;
    }

    // Método para mostrar el detalle de la venta
    public void imprimirDetalle() {
        System.out.println("Fecha: " + fecha);
        System.out.println("Zapato: " + zapato.getNombre());
        System.out.println("Talla: " + talla);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total: $" + total);
    }

    // Getters para acceder a los atributos privados
    public Zapato getZapato() {
        return zapato;
    }

    public String getTalla() {
        return talla;
    }

    public int getCantidad() {
        return cantidad;
    }
}

