package seguimiento3.ejercicio8;

public
class Main {
    public static void main(String[] args) {
        // Crear un concierto con un máximo de 10 entradas
        Concierto concierto = new Concierto(10);

        // Agregar algunas entradas
        concierto.agregarEntrada(new Entrada(1, "GENERAL", 50.0));
        concierto.agregarEntrada(new Entrada(2, "VIP", 100.0));
        concierto.agregarEntrada(new Entrada(3, "GENERAL", 50.0));
        concierto.agregarEntrada(new Entrada(4, "VIP", 100.0));
        concierto.agregarEntrada(new Entrada(5, "GENERAL", 50.0));

        // Verificar disponibilidad de entradas en cada zona
        concierto.verificarDisponibilidad("GENERAL");
        concierto.verificarDisponibilidad("VIP");

        // Vender algunas entradas
        concierto.venderEntrada(1);
        concierto.venderEntrada(2);

        // Intentar vender una entrada ya vendida
        concierto.venderEntrada(1);

        // Registrar ingreso para algunas entradas
        concierto.registrarIngreso(1);
        concierto.registrarIngreso(2);

        // Intentar registrar ingreso para una entrada no vendida
        concierto.registrarIngreso(3);

        // Intentar registrar ingreso nuevamente para la misma entrada
        concierto.registrarIngreso(1);
    }
}
