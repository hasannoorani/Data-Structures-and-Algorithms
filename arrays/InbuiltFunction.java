package arrays;

import java.util.*;

public class InbuiltFunction {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i = 0; i < n; ++i) {
                arr[i] = sc.nextInt();
            }

            System.out.println(Arrays.toString(arr));

            // Sort the Array
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));

            // Fill the array
            Arrays.fill(arr,5);
            System.out.println(Arrays.toString(arr));
        }
    }

