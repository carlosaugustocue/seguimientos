package seguimiento3.ejercicio6;

public class Inventario {
    private Zapato zapato;
    private String[] tallas;  // Almacena las tallas disponibles
    private int[] cantidades; // Almacena la cantidad disponible por talla

    // Constructor
    public Inventario(Zapato zapato, String[] tallas, int[] cantidades) {
        this.zapato = zapato;
        this.tallas = tallas;
        this.cantidades = cantidades;
    }

    // Método para registrar o incrementar el stock por talla
    public void registrarStock(String talla, int cantidad) {
        for (int i = 0; i < tallas.length; i++) {
            if (tallas[i].equals(talla)) {
                cantidades[i] += cantidad;
                return;
            }
        }
    }

    // Método para reducir el stock por talla
    public void reducirStock(String talla, int cantidad) {
        for (int i = 0; i < tallas.length; i++) {
            if (tallas[i].equals(talla)) {
                if (cantidades[i] >= cantidad) {
                    cantidades[i] -= cantidad;
                } else {
                    System.out.println("Stock insuficiente para la talla " + talla);
                }
                return;
            }
        }
        System.out.println("Talla no encontrada en el inventario.");
    }

    // Método para mostrar el inventario
    public void mostrarInventario() {
        System.out.println("Inventario del zapato: " + zapato.getNombre());
        for (int i = 0; i < tallas.length; i++) {
            System.out.println("Talla: " + tallas[i] + " - Cantidad: " + cantidades[i]);
        }
    }

    // Obtener el zapato
    public Zapato getZapato() {
        return zapato;
    }
}

