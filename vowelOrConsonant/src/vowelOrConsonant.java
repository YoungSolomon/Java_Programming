import java.util.Scanner;

public class vowelOrConsonant {
    public static void main(String[] args) throws Exception {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a letter.");
            String userChar = userInput.nextLine();    

            if (userChar.equals("a") || userChar.equals("e") || userChar.equals("i") || userChar.equals("o") || userChar.equals("u")){
            System.out.println(userChar + " is a vowel.");
            } else {
            System.out.println(userChar + " is a consonant.");

        }  
    }
}

