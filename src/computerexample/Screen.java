package computerexample;

/**
 * This class contains the screen characteristics.
 * @author dcancelas
 */
public class Screen {
    
    private String brand;
    private float inches;

    /**
     * Builder without parameters.
     */
    public Screen() {

    /**
     * Builder with parameters.
     * @param brand The brand parameter defines the Screen brand.
     * @param inches The brand parameter defines the Screen inches.
     */
    }
    public Screen(String brand, float inches) {
        this.brand = brand;
        this.inches = inches;
    }

    /**
     * Method that sets the value of the brand parameter.
     * @param brand The brand parameter defines
     * the Screen brand.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
    /**
     * Method that returns the value of the brand parameter.
     * @return The value of the brand parameter.
     */
    public String getBrand() {
        return brand;
    }
    /**
     * Method that sets the value of the inches parameter.
     * @param inches The inches parameter defines
     * the Screen inches.
     */
    public void setInches(float inches) {
        this.inches = inches;
    }
    public float getInches() {
        return inches;
    }

}