//Import scanner util
import java.util.Scanner;

public class hexagonArea {
    public static void main(String[] args) throws Exception {
        //Create scanner object to receive user input
        Scanner userInput = new Scanner(System.in);
        //Prompt the user to enter the side length
        System.out.println("Please enter a value for the hexagon side length.");

        //Try case to close scanner object after use
        try {
            //Assign pi constant to a variable for ease of use
            final double pi = Math.PI;
            //Convert userInput to a double
            double s = userInput.nextDouble();
            //Calculate area of a hexagon
            double hexagonArea = (6 * (Math.pow(s, 2))) / (4 * (Math.tan(pi/6)));
            //Print the values
            System.out.println("Here is the area for the hexagon based on the provided side length, " + hexagonArea);

        } finally {
            //Close scanner to prevent memory leakage
            userInput.close();
        }

    }
}
