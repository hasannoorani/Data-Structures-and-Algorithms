package arrays;

public class BasicsOfArray {
    public static void main(String[] args) {

        int arr[]; // Declaration
        arr = new int[5]; // initialisation

        // Or only single line declaration and initialisation the Array int arr[] = new int[10];

        System.out.println(arr);

        System.out.println(arr[0]);

        arr[0] = 10;
        for(int i = 0; i < 5; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Length: " + arr.length);


    }
}
