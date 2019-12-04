package computerexample;

/**
 * This class contains the CPU characteristics.
 * @author dcancelas
 */
public class Cpu {
    
    private int speed;
    private int memory;

    /**
     * Builder without parameters.
     */
    public Cpu() {

    /**
     * Builder with parameters.
     * @param speed The speed parameter defines the CPU speed.
     * @param memory The memory parameter defines the CPU memory.
     */
    }
    public Cpu(int speed, int memory) {
        this.speed = speed;
        this.memory = memory;
    }

    /**
     * Method that sets the value of the speed parameter.
     * @param speed The speed parameter defines
     * the CPU speed.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    /**
     * Method that returns the value of the speed parameter.
     * @return The value of the speed parameter.
     */
    public int getSpeed() {
        return speed;
    }
    /**
     * Method that sets the value of the memory parameter.
     * @param memory The memory parameter defines
     * the CPU memory.
     */
    public void setMemory(int memory) {
        this.memory = memory;
    }
    /**
     * Method that returns the value of the memory parameter.
     * @return The value of the memory parameter.
     */
    public int getMemory() {
        return memory;
    }

}