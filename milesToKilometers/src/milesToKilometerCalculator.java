import java.util.*;

public class milesToKilometerCalculator {
    public static void main(String[] args) throws Exception {
    Scanner userInput = new Scanner(System.in);

    try {
        System.out.println("Please enter a length value in miles.");
        double lengthValue = userInput.nextDouble();
        double kilometerValue = lengthValue * 1.609;
        System.out.println("Here is the given value in kilometers " + kilometerValue);

    } finally {
        userInput.close();
    }
}
}