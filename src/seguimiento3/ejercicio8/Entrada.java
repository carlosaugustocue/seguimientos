package seguimiento3.ejercicio8;

public class Entrada {
    private int numeroEntrada;
    private String zona; // GENERAL o VIP
    private double valor;
    private boolean vendida;
    private boolean ingresoRegistrado;

    // Constructor
    public Entrada(int numeroEntrada, String zona, double valor) {
        this.numeroEntrada = numeroEntrada;
        this.zona = zona;
        this.valor = valor;
        this.vendida = false;
        this.ingresoRegistrado = false;
    }

    // Getters y Setters
    public int getNumeroEntrada() {
        return numeroEntrada;
    }

    public void setNumeroEntrada(int numeroEntrada) {
        this.numeroEntrada = numeroEntrada;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isVendida() {
        return vendida;
    }

    public boolean isIngresoRegistrado() {
        return ingresoRegistrado;
    }

    // Método para marcar la entrada como vendida
    public void vender() {
        if (!vendida) {
            this.vendida = true;
            System.out.println("Entrada número " + numeroEntrada + " vendida.");
        } else {
            System.out.println("Entrada número " + numeroEntrada + " ya ha sido vendida.");
        }
    }

    // Método para registrar el ingreso
    public void registrarIngreso() {
        if (vendida && !ingresoRegistrado) {
            this.ingresoRegistrado = true;
            System.out.println("Ingreso registrado para la entrada número " + numeroEntrada);
        } else if (!vendida) {
            System.out.println("No se puede registrar ingreso. La entrada número " + numeroEntrada + " no ha sido vendida.");
        } else {
            System.out.println("Ingreso ya registrado para la entrada número " + numeroEntrada);
        }
    }
}

