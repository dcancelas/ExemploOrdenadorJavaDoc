package computerexample;

/**
 * This class contains the elements that make up a Computer.
 * @author dcancelas
 */
public class Computer {
    
    private Mouse mouse = new Mouse();
    private Screen screen = new Screen();
    private Cpu cpu = new Cpu();

    /**
     * Builder without parameters.
     */
    public Computer() {

    }
    /**
     * Builder with parameters.
     * @param mouse The mouse parameter defines the mouse characteristics.
     * @param screen The screen parameter defines the screen characteristics.
     * @param cpu The cpu parameter defines the CPU characteristics.
     */
    public Computer(Mouse mouse, Screen screen, Cpu cpu) {
        this.mouse = mouse;
        this.screen = screen;
        this.cpu = cpu;
    }
    
    /**
     * Method that sets the value of the mouse parameter.
     * @param mouse The mouse parameter defines the mouse characteristics.
     */
    public void setmouse(Mouse mouse) {
        this.mouse = mouse;
    }
    /**
     * Method that returns the value of the mouse parameter.
     * @return The value of the mouse parameter.
     */
    public Mouse getmouse() {
        return mouse;
    }
    /**
     * Method that sets the value of the screen parameter.
     * @param screen The screen parameter defines
     * the screen characteristics.
     */
    public void setscreen(Screen screen) {
        this.screen = screen;
    }
    /**
     * Method that returns the value of the screen parameter.
     * @return The value of the screen parameter.
     */
    public Screen getscreen() {
        return screen;
    }
    /**
     * Method that sets the value of the cpu parameter.
     * @param cpu The cpu parameter defines
     * the CPU characteristics.
     */
    public void setcpu(Cpu cpu) {
        this.cpu = cpu;
    }
    /**
     * Method that returns the value of the cpu parameter.
     * @return The value of the cpu parameter.
     */
    public Cpu getcpu() {
        return cpu;
    }
    /**
     * Method that shows on screen the different
     * computer characteristics.
     */
    public void visualize() {
        System.out.println("\n\n\n---COMPUTER---");
        System.out.println("\nMouse type: "+getmouse().getType()+"\n\nScreen brand: "+
        getscreen().getBrand()+"\nInches: "+getscreen().getInches()+
        "\n\nCPU speed: "+getcpu().getSpeed()+
        "\nCPU memory: "+getcpu().getMemory());
    }

}