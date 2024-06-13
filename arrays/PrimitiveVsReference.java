package arrays;

import java.util.*;

class PrimitiveVsReference {
    public static void main(String[] args) {

        // Showing copying difference
        int a = 5;
        int b = a;

        System.out.println(b);
        a = 10;
        System.out.println(b);

        int arr[] = new int[3];
        arr[0] = 1; arr[1] = 2; arr[2] = 3;

        int brr[] = arr;

        System.out.println(Arrays.toString(brr));
        arr[1] = 5;
        System.out.println(Arrays.toString(brr));

        // Fix
        brr = Arrays.copyOf(arr, arr.length);

        // Showing equating difference
        int x = 5, y = 5;
        System.out.println(x == y);

        int a1[] = new int[3]; // [0, 0, 0]
        int a2[] = new int[3]; // [0, 0, 0]
        System.out.println(a1[0] == a2[0] && a1[1] == a2[1] && a1[2] == a2[2]);
        System.out.println(a1 == a2);

        // Fix
        System.out.println(Arrays.equals(a1, a2));
    }
}