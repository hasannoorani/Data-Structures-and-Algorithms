import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE; // Integer.MIN_VALUE means max = -Infinitive hoga. aur max = 0 nhi lenge khunki arr[3] : -10 -30 40 bhi ho sakta hai.
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }

}
