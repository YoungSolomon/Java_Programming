import java.util.*;

public class eliminateDuplicates {
    public static void main(String[] args) throws Exception {
        System.out.println("Please denote the size of the array");
        Scanner userInput = new Scanner(System.in);
        int arr_size = 0;
        if (userInput.hasNextInt()) {
            arr_size = userInput.nextInt();
        }

        int[] array = new int[arr_size];

        System.out.println("Please input the array elements");

        for (int i = 0; i < arr_size; i++){
            if (userInput.hasNextInt()) {
                array[i] = userInput.nextInt();
            }
        }

        int[] uniqueArray = dupeElim(array);
        System.out.println(Arrays.toString(uniqueArray) + " is the input array with all duplicate integers removed.");

    }

    private static int[] dupeElim(int[] list){
        int[] result = new int[list.length];

        for (int i = 0; i < list.length - 1 ; i++){
            boolean dupe = false;
            for (int j = 0; j < list.length; j++){
                if (list[i] == result[j]){
                    dupe = true;
                    break;
                } 
            }

            if (dupe) {
                continue;
            }

            result[i] = list[i];
        }


        return Arrays.stream(result).filter(num -> num != 0).toArray();
    }
}
