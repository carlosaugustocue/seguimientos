package seguimiento2.ejercicio8;
import java.text.NumberFormat;
import java.util.Locale;

/*
Ejercicio 8:
Una empresa paga el salario por horas. Dadas las horas de trabajo
de una persona durante la semana, calcule el pago total de la semana,teniendo en cuenta
que las horas se pagan dependiendo de la cantidad, entre 1 y 10 se pagan a $30000 y
mayores a 10 se pagan a $33000 Mostar un mensaje así:
Señor tal XXXX el número de horas es XXX y su salario equivale a XXX
*/

public class Empleado {

    // Atributos
    private String nombre;
    private int horasTrabajadas;
    private double salario;

    // Constructor
    public Empleado(String nombre, int horasTrabajadas) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.salario = calcularSalario();
    }

    // Método para calcular el salario
    private double calcularSalario() {
        double salarioPorHora;
        if (horasTrabajadas <= 10) {
            salarioPorHora = 30000;
        } else {
            salarioPorHora = 33000;
        }
        return horasTrabajadas * salarioPorHora;
    }

    // Método para mostrar el mensaje
    public void mostrarMensaje() {

        // Crear un formateador de números para la moneda de Colombia
        NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));

        // Formatear el salario como moneda colombiana
        String salarioFormateado = formatoMoneda.format(salario);

        // Crear el mensaje final
        String mensaje = String.format("Señor %s, el número de horas es %d y su salario equivale a %s pesos " +
                        "colombianos.", nombre, horasTrabajadas, salarioFormateado);

        // Imprimir el mensaje
        System.out.println(mensaje);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
        this.salario = calcularSalario(); // Recalcular el salario si cambian las horas
    }

    public double getSalario() {
        return salario;
    }
}
