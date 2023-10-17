import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int input = userInput.nextInt();
        int finalSum = sumDigits(input);
        System.out.println(finalSum + " is the total of the digits of the given integer.");
    }

    public static int sumDigits(long n){
        int RETURN = 0;
        long Input = n;

        while (true){
            int Digit = (int)Input % 10;
            RETURN += Digit;
            Input = Input /10;

            if (Input == 0) break;

        }
        return RETURN;
    }
}

