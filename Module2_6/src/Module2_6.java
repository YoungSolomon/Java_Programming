// import scanner tool
import java.util.Scanner;

public class Module2_6 {
    public static void main(String[] args) throws Exception {

        // Implement two scanners for user input
           Scanner gratuityRateInput = new Scanner(System.in);
           Scanner subTotalInput = new Scanner(System.in);

           // Initialize try/finally case to prevent memory leakage
           try {

            // Convert tip rate and sub totals into tip and total respectively
            double gratuityRate = gratuityRateInput.nextDouble();
            double subTotal = subTotalInput.nextDouble();
            System.out.println("Please enter your desired gratuity percentage and subtotal for your meal.");

            double gratuity = subTotal * gratuityRate;
            double total = subTotal + gratuity;
            System.out.println("Your tip is ");
            System.out.println(gratuity);
            System.out.println("Your total is ");
            System.out.println(total);


           } finally {
                gratuityRateInput.close();
                subTotalInput.close();
           }


        }
    }
