package seguimiento3.ejercicio3;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private boolean estado;  // true = activa, false = inactiva
    private String claveSeguridad;

    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldo, boolean estado, String claveSeguridad) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.estado = estado;
        this.claveSeguridad = claveSeguridad;
    }

    // Método para consultar saldo
    public void consultarSaldo() {
        System.out.println("------------------------------------------------------------");
        System.out.println("El saldo actual es: $" + saldo);
        System.out.println("------------------------------------------------------------");
    }

    // Método para retirar efectivo
    public void retirarEfectivo(double valor) {
        if (valor > saldo) {
            System.out.println("------------------------------------------------------------");
            System.out.println("Fondos insuficientes para retirar $" + valor);
            System.out.println("------------------------------------------------------------");
        } else {
            saldo -= valor;
            System.out.println("------------------------------------------------------------");
            System.out.println("Has retirado $" + valor + ". El nuevo saldo es: $" + saldo);
            System.out.println("------------------------------------------------------------");
        }
    }

    // Método para consignar efectivo
    public void consignarEfectivo(double valor) {
        saldo += valor;
        System.out.println("------------------------------------------------------------");
        System.out.println("Has consignado $" + valor + ". El nuevo saldo es: $" + saldo);
        System.out.println("------------------------------------------------------------");
    }

    // Método para cambiar clave
    public void cambiarClave(String claveActual, String nuevaClave) {
        if (this.claveSeguridad.equals(claveActual)) {
            this.claveSeguridad = nuevaClave;
            System.out.println("------------------------------------------------------------");
            System.out.println("Clave cambiada exitosamente.");
            System.out.println("------------------------------------------------------------");
        } else {
            System.out.println("------------------------------------------------------------");
            System.out.println("Clave actual incorrecta. No se pudo cambiar la clave.");
            System.out.println("------------------------------------------------------------");
        }
    }

    // Método para verificar si la cuenta está activa
    public boolean estaActiva() {
        return estado;
    }
}
