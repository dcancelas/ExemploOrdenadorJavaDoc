package computerexample;
import java.util.Scanner;

/**
 * This class contains a scanner that is responsible for collecting the
 * necessary data for the execution of the rest of the classes.
 * @author dcancelas
 * @version 1.0.0
 */
public class ComputerExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter the type of mouse: ");
                String type = sc.next();
            System.out.print("Enter the screen brand: ");
                String brand =sc.next();
            System.out.print("Enter the inches: ");
                float inches = sc.nextFloat();
            System.out.print("Enter the CPU speed: ");
                int speed = sc.nextInt();
            System.out.print("Enter the CPU memory: ");
                int memory = sc.nextInt();
        sc.close();

        Computer computer1 = new Computer(new Mouse(type),
        new Screen(brand, inches), new Cpu(speed, memory));
            computer1.visualize();
    }
    
}
