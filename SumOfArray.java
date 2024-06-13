import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Create an array to store user-input elements
        int arr[] = new int[size];

        // Prompt the user to enter array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + arr[i];   //or sum += arr[i];
        }
        // Display the sum of the array
        System.out.println("Sum of the array is: " + sum);
    }

}
