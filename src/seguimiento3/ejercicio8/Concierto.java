package seguimiento3.ejercicio8;

public class Concierto {
    private Entrada[] entradas;
    private int indiceEntrada;

    // Constructor
    public Concierto(int maxEntradas) {
        this.entradas = new Entrada[maxEntradas];
        this.indiceEntrada = 0;
    }

    // Método para agregar una entrada al concierto
    public void agregarEntrada(Entrada entrada) {
        if (indiceEntrada < entradas.length) {
            entradas[indiceEntrada] = entrada;
            indiceEntrada++;
        } else {
            System.out.println("No se pueden agregar más entradas. Capacidad máxima alcanzada.");
        }
    }

    // Método para verificar disponibilidad de entradas en una zona
    public void verificarDisponibilidad(String zona) {
        int disponibles = 0;
        for (Entrada entrada : entradas) {
            if (entrada != null && entrada.getZona().equalsIgnoreCase(zona) && !entrada.isVendida()) {
                disponibles++;
            }
        }
        System.out.println("Entradas disponibles en zona " + zona + ": " + disponibles);
    }

    // Método para vender una entrada
    public void venderEntrada(int numeroEntrada) {
        for (Entrada entrada : entradas) {
            if (entrada != null && entrada.getNumeroEntrada() == numeroEntrada) {
                entrada.vender();
                return;
            }
        }
        System.out.println("Entrada no encontrada.");
    }

    // Método para registrar el ingreso de una entrada
    public void registrarIngreso(int numeroEntrada) {
        for (Entrada entrada : entradas) {
            if (entrada != null && entrada.getNumeroEntrada() == numeroEntrada) {
                entrada.registrarIngreso();
                return;
            }
        }
        System.out.println("Entrada no encontrada.");
    }
}

