package arrays;

//Given a number & an array, check if the given number is present in the array or not?

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){          //Reading Array Elements
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();      //Reading the Target Number

        boolean targetFound = false;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                targetFound = true;
                break;
            }
        }

        // 2nd approach -->  Use Arrays.stream to check if the target is present
        // boolean targetFound = Arrays.stream(arr).anyMatch(num -> num == target);


        System.out.println(targetFound);  // Print the result

    }
}
