package array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Insert number of array elements : ");
        int arrayLength = new Scanner(System.in).nextInt();
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Insert element index" + i + ": ");
            numbers[i] = new Scanner(System.in).nextInt();
        }
        int length = numbers.length;
        System.out.println("Length of array is: " + length);
        System.out.println(Arrays.toString(numbers));
        for (int a : numbers) {
            System.out.println(a);
        }
        Arrays.stream(numbers).forEach(System.out::println);
    }
}
