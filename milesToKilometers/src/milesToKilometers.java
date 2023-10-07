import java.util.*;

public class milesToKilometers {
    public static void main(String[] args) throws Exception {
        HashMap<Integer,Double> conversionChart = new HashMap<Integer, Double>();
        conversionChart.put(1, 1.609);
        conversionChart.put(2, 3.218);
        conversionChart.put(3, 4.827);
        conversionChart.put(4, 6.436);
        conversionChart.put(5, 8.045);
        conversionChart.put(6, 9.654);
        conversionChart.put(7, 11.263);
        conversionChart.put(8, 12.872);
        conversionChart.put(9, 14.481);
        conversionChart.put(10, 16.090);

        for (HashMap.Entry<Integer,Double> entry: conversionChart.entrySet()){
            System.out.println(entry.getKey() + " miles is equivalent to " + entry.getValue());

        }
    }

}