package seguimiento2.ejercicio10;

public class Lavadora {
    // Constantes para los precios por hora
    private static final int PRECIO_GRANDE = 4000;
    private static final int PRECIO_PEQUENA = 3000;
    private static final double DESCUENTO = 0.03;

    // Atributos
    private int tipo;
    private int horas;
    private int cantidad;

    // Constructor
    public Lavadora(int tipo, int horas, int cantidad) {
        this.tipo = tipo;
        this.horas = horas;
        this.cantidad = cantidad;
    }

    // Método para calcular el costo total
    public double calcularCosto() {
        int precioPorHora = (tipo == 1) ? PRECIO_GRANDE : PRECIO_PEQUENA;
        double costoTotal = precioPorHora * horas * cantidad;

        // Aplicar descuento si es necesario
        if (cantidad > 3) {
            costoTotal -= costoTotal * DESCUENTO;
        }

        return costoTotal;
    }

    // Getters y Setters
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

