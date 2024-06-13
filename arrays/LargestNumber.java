import java.util.*;

//find the largest number in a given array

public class LargestNumber {
    public static int getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];

            }
        }
        return largest;

    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 4, 6, 5, };
        System.out.println("Largest Value is : " + getlargest(numbers));

    }

}
