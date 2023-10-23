import java.util.*;
import java.lang.Math;

public class orderDigits {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter an integer string");
        double input1 = userInput.nextDouble();
        double input2 = userInput.nextDouble();
        double input3 = userInput.nextDouble();
        double[] orderedDigits = displaySortedNumbers(input1, input2, input3);
        System.out.println(Arrays.toString(orderedDigits) + "Here are the digits ordered in ascending order.");
    }

    public static double[] displaySortedNumbers(double num1, double num2, double num3){
        double max = Math.max(num1, Math.max(num2, num3));
        double min = Math.min(num1, Math.min(num2, num3));
        double mid = num1 + num2 + num3 - max - min;
        double[] result = {min, mid, max};
        return result;
    }
}
