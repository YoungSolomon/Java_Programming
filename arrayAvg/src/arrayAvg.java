public class arrayAvg {
    

    public static int arrAvg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        sum = sum / (array.length - 1);
        return sum;
    } 

    public static double arrAvg(double[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        sum = sum / (array.length - 1);
        return sum;
    }
    public static void main(String[] args) throws Exception {
        int[] test1 = {1,2,3,4,5,6,7,8,98};
        double[] test2 = {1.5,27.9,82.33,21};
        System.out.println(arrAvg(test1));
        System.out.println(arrAvg(test2));
    }
}
