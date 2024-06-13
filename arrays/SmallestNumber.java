import java.util.*;
//find the smallest number in a given array

public class SmallestNumber {
    public static int getsmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE; // +infinity
        for (int i = 0; i < numbers.length; i++) {
            if (smallest > numbers[i]) {
                smallest = numbers[i];

            }
        }
        return smallest;

    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 4, 6, 5, };
        System.out.println("Smallest Value is : " + getsmallest(numbers));

    }

}
