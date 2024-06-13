package arrays;

//Given an array, find the range of the array.

import java.util.Scanner;

public class RangeOfTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        //Find the range
        int maxElement = arr[0];
        int minElement = arr[0];

        for(int x : arr){  // x = arr[0], arr[1], arr[2] ...
            if(x > maxElement) {
                maxElement = x;
            }
            if(x < minElement) {
                minElement = x;
            }
        }
        System.out.println(maxElement - minElement);

    }

}
