package laboral;
/**
 * La clase CalculaNominas se utiliza para calcular y mostrar las nóminas de los empleados.
 */
public class CalculaNominas {

    /**
     * Método principal que inicia la aplicación y calcula las nóminas de dos empleados.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        try {
            // Crea dos objetos Empleado con información de ejemplo
        	
			/* Crear empleados para que salte el error
			Empleado empleado = new Empleado("James Cosling","32200035G","M",4,7);
			Empleado empleado2 = new Empleado("Ada Lovelace","32000031G","E");
	        escribe(empleado, empleado2);
	        */
        	
            Empleado empleado1 = new Empleado("James Cosling", "32200035G", "H", 9, 7);
            Empleado empleado2 = new Empleado("Ada Lovelace", "32000031G", "M", 2, 0);

            // Llama al método escribe para mostrar los detalles de los empleados y sus sueldos
            escribe(empleado1, empleado2);
        } catch (DatosNoCorrectosException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Muestra los detalles de los empleados y sus sueldos.
     *
     * @param empleado1 El primer empleado.
     * @param empleado2 El segundo empleado.
     */
    private static void escribe(Empleado empleado1, Empleado empleado2) {
        System.out.println("Empleado 1:");
        empleado1.imprime();
        System.out.println("Sueldo: " + Nomina.sueldo(empleado1));
        System.out.println("============================");
        System.out.println("Empleado 2:");
        empleado2.imprime();
        System.out.println("Sueldo: " + Nomina.sueldo(empleado2));
    }
}
