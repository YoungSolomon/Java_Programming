//Import necessary functions
import java.util.Scanner;

public class daysInMonth {
    public static void main(String[] args) throws Exception {
        
        //Implement scanner object to receive user input
        Scanner userMonth = new Scanner(System.in);
        System.out.println("Please enter a month");

        try {

            String monthInput = userMonth.nextLine();

            //Implement a switch case to check what month has been input by the user
            switch (monthInput) {

                case "January", "March", "May", "July", "August", "October", "December":
                System.out.println( monthInput + " will have 31 days.");
                break;
                case "April", "June", "September", "November":
                System.out.println( monthInput + " will have 30 days.");
                break;
                case "February":
                System.out.println( monthInput +" will have 28 days. If the current year is divisible by 4 (2020, 2024, 2028, 2032), it will have 29 days instead.");
                break;
                
            }

        } finally {
            userMonth.close();
        }


    }
}
