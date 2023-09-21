package laboral;
/**
 * La clase Persona representa a una persona con atributos como nombre, DNI y sexo.
 */
public class Persona {
    /** El nombre de la persona. */
    public String nombre;

    /** El número de DNI de la persona (debe tener 9 caracteres). */
    public String dni;

    /** El sexo de la persona. */
    public String sexo;

    /**
     * Constructor para crear una instancia de Persona con nombre, DNI y sexo.
     *
     * @param nombre El nombre de la persona.
     * @param dni    El número de DNI de la persona.
     * @param sexo   El sexo de la persona.
     * @throws DatosNoCorrectosException Si los datos proporcionados no son correctos.
     */
    public Persona(String nombre, String dni, String sexo) throws DatosNoCorrectosException {
        if (nombre != null && dni != null && dni.length() == 9) {
            this.nombre = nombre;
            this.dni = dni;
            this.sexo = sexo;
        } else {
            throw new DatosNoCorrectosException("Datos no correctos");
        }
    }

    /**
     * Constructor para crear una instancia de Persona con nombre y sexo.
     *
     * @param nombre El nombre de la persona.
     * @param sexo   El sexo de la persona.
     */
    public Persona(String nombre, String sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    /**
     * Establece el número de DNI de la persona.
     *
     * @param dni El número de DNI de la persona.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Imprime los detalles de la persona, incluyendo nombre y DNI.
     */
    public void Imprime() {
        System.out.println("Nombre: " + nombre + " DNI: " + dni);
    }
}

