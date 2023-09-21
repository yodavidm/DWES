package laboral;
/**
 * La clase DatosNoCorrectosException es una excepción personalizada que se utiliza para indicar que los datos proporcionados no son correctos.
 */
public class DatosNoCorrectosException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Crea una instancia de DatosNoCorrectosException con un mensaje de error personalizado.
     *
     * @param mensaje El mensaje de error que describe la razón por la que los datos no son correctos.
     */
    public DatosNoCorrectosException(String mensaje) {
        super(mensaje);
    }
}
