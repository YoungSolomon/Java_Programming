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

    public static int[] dupeElim(int[] list){
        int[] result = {};
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        for (int i = 0; i < list.length - 1 ; i++){
            boolean check = map.containsKey(list[i]);
            if (check != true) {
                map.put(list[i], "dupe");
                result[i] = list[i];
            } else {
                continue;
            }
        }

        return result;
    }
}
