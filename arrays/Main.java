package arrays;

//array insertion and deletion in beginning & ending

import java.util.*;
class Main {
    static void display(int arr[], int n) {
        for(int i = 0; i < n; ++i) {
            if(i == 0)
                System.out.print("[");
            System.out.print(arr[i]);
            if(i < n -1)
                System.out.print(",");
            else
                System.out.print("]");
        }
        System.out.println();
    }

    static int pushBack(int arr[], int val, int n) {
        if(n == arr.length)
            return n;
        arr[n] = val;
        return n + 1;
    }

    static int popBack(int arr[], int n) {
        if(n == 0)
            return 0;
        arr[n-1] = 0;
        return n - 1;
    }

    static int pushFront(int arr[], int val, int n) {
        if(n == arr.length)
            return n;

        // Shift arr[0 ... (n - 1)] 1 step right
        for(int i = n - 1; i >= 0; --i)
            arr[i + 1] = arr[i];

        arr[0] = val;
        return n + 1;
    }

    static int popFront(int arr[], int n) {
        if(n == 0)
            return 0;

        // [1, 2, 3 ..... n-1] -> i + 1
        // [0, 1, 2 ..... n-2] -> i

        for(int i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];

        arr[n-1] = 0;
        return n - 1;
    }

    static int push(int arr[], int id, int val, int n) {
        if(n == arr.length)
            return n;
        if(id < 0 || id > n)
            return n;

        // Shift arr[id ... (n - 1)] 1 step right
        for(int i = n - 1; i >= id; --i)
            arr[i + 1] = arr[i];

        arr[id] = val;
        return n + 1;
    }

    static int pop(int arr[], int id, int n) {
        if(n == 0)
            return 0;
        if(id < 0 || id >= n)
            return n;

        // [id+1, id+2, id+3 ..... n-1] -> i + 1
        // [id, id+1, id+2 ..... n-2] -> i

        for(int i = id; i < n - 1; i++)
            arr[i] = arr[i + 1];

        arr[n-1] = 0;
        return n - 1;
    }

    public static void main(String[] args) {
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();

        display(arr, n);

        // Push Back
        n = popBack(arr, n);
        display(arr, n);

        // Push Back
        n = popBack(arr, n);
        display(arr, n);

        // Push Back 5
        n = pushBack(arr, 5, n);
        display(arr, n);

        // Push Back 20
        n = pushBack(arr, 20, n);
        display(arr, n);

        // Pop Front
        n = popFront(arr, n);
        display(arr, n);

        // Push Front 2
        n = pushFront(arr, 2, n);
        display(arr, n);

        // Push Front 3
        n = pushFront(arr, 3, n);
        display(arr, n);

        // Push 4 at index 4
        n = push(arr, 4, 4, n);
        display(arr, n);

        n = popBack(arr, n);
        n = popBack(arr, n);
        n = popBack(arr, n);
        display(arr, n);

        // Push 4 at index 4
        n = push(arr, 4, 4, n);
        display(arr, n);

        // Push 15 at index 10
        n = push(arr, 10, 15, n);
        display(arr, n);

        // Pop index 1
        n = pop(arr, 1, n);
        display(arr, n);

        // Pop index 0
        n = pop(arr, 0, n);
        display(arr, n);

        // Push Front 1
        n = pushFront(arr, 1, n);
        display(arr, n);

        // Push Back 5
        n = pushBack(arr, 5, n);
        display(arr, n);
    }
}