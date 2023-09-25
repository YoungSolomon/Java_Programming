//Don't forget to import the scanner
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) throws Exception {
        //Implement scanner objs to acquire user input
        Scanner userWeight = new Scanner(System.in);
        System.out.println("Please enter your weight in lbs.");
        Scanner userHeight = new Scanner(System.in);
        System.out.println("Please enter your height in inches only.");

        //Implement try/finally to prevent memory leakage
        try {
            
            //Convert scanners into double values so we can use them in conversions
            double weightInput = userWeight.nextDouble();
            double heightInput = userHeight.nextDouble();

            //Calculate BMI using given values
            double BMI = ((weightInput / (Math.pow(heightInput, 2))) * 703);

            //Should implement a switch statement but I dont have to google conditionals
            if (BMI < 18.5) {
                System.out.println("Your BMI is " + BMI);
                System.out.println("This is considered underweight, additional calories are strongly recommended.");
            } else if (BMI >= 18.5 && BMI < 25) {
                System.out.println("Your BMI is " + BMI);
                System.out.println("This is considered a healthy weight, congratulations!");
            } else if ((BMI >= 25) && (BMI < 30)) {
                System.out.println("Your BMI is " + BMI);
                System.out.println("This is considered overweight, caloric restriction is highly recommended.");               
            } else {
                System.out.println("Your BMI is " + BMI);
                System.out.println("This is considered obese, a consultation with a dietician is highly recommended.");
            }

            } finally {

            userWeight.close();
            userHeight.close();
            
            }
            }
}
