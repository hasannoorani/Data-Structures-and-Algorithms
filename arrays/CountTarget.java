package arrays;

/*
    Given an array and a target, count how many
    times is the target present in the array?

    Ex: arr = [2, 2, 3, 2, 5] target = 2
    Ans = 3

    Ex 2: arr = [2, 2, 3, 2, 5] target = 10
    Ans = 0
*/

import java.util.*;

public class CountTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int ans = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}