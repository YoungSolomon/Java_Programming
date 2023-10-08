import java.util.Scanner;

public class tuitionCalculator {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);

        try {

            System.out.println("Please enter the tuition for your university.");
            double tuition = userInput.nextDouble();
            System.out.println("Please enter how many years in the future you'd like to calculate tuition for.");
            Integer time = userInput.nextInt();

            double finalTuition = (tuition * (1 + (0.05*time)));
            System.out.println("Your tuition due would be " + finalTuition + " after " + time + " years.");

            double totalTuition = finalTuition * 4;
            System.out.println(totalTuition + " is your total cost of four years of schooling based on the previously given information.");

        } finally {
            userInput.close();
        }
    }
}
