import java.util.*;

/*
 * Operation In Array :-
 * Create 
 * Input
 * Output
 * Update
 */


public class OperationInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int phy;
        // phy = sc.nextInt();

       //creating in  array
       int marks[] = new int[50];

    //    int numbers[] = {1,2,3};

    //    String fruits[] = {"Apple", "Mango", "Orange"};

       //Input
       marks[0] = sc.nextInt();
       marks[1] = sc.nextInt();
       marks[2] = sc.nextInt();

       System.out.println("phy : " + marks[0]);
       System.out.println("che : " + marks[1]);
       System.out.println("math : " + marks[2]);

       //Update
          marks[2]= 100;
          System.out.println("math : " + marks[2]);

       
        //    marks[2] = marks[2]+1;
        //    System.out.println("math : " + marks[2]);


        //    int percentage = (marks[0]+marks[1]+marks[2])/3;
        //    System.out.println("percentage = " + percentage + "%");



          System.out.println("Lenth of Array = " +  marks.length);

    
    }
}