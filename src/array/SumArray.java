package array;

public class SumArray {
    public static void main(String[] args) {
        Double [] array = new Double[3];
        array[1] = 100.0;
        array[2] = 200.0;
        array[0] = -1000.0;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println("Sum of array : " + sum);
    }
}
