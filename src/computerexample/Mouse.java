package computerexample;

/**
 * This class contains the mouse characteristics.
 * @author dcancelas
 */
public class Mouse {

    private String type;

    /**
     * Builder without parameters.
     */
    public Mouse() {

    /**
     * Builder with parameters.
     * @param type The type parameter defines the mouse type.
     */
    }
    public Mouse(String type) {
        this.type = type;
    }

    /**
     * Método que establece el valor del parámetro type.
     * @param type El parámetro type define el tipo de ratón.
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * Método que devuelve el valor del parámetro type.
     * @return El valor del parámetro type.
     */
    public String getType() {
        return type;
    }

}