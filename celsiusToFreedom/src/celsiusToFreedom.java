import java.util.Scanner;

public class celsiusToFreedom {
    public static void main(String[] args) throws Exception {

        // Creates a scanner object in order to receive user temperature input
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a temperature in Non-freedom units.");
        //try/finally case to close our scanner obj after use
        try {
        // Reads user input
        double celsius = obj.nextDouble();
        double temperature = (9.0/5) * celsius + 32;

        // Prints temperature in fahreinheit
        System.out.println("Here is the temperature in fahreinheit, congratulations on a superior unit system.");
        System.out.println(temperature);
        
        } finally {
            obj.close();
        }
    }
}
