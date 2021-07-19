import java.sql.Array;
import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {

        //How many cups of coffee we have drank over the week
//        int[] coffeeArray = new int[7];
//
//        coffeeArray[0] = 3;
//        coffeeArray[1] = 4;
//        coffeeArray[2] = 12;
//        coffeeArray[3] = 2;
//        coffeeArray[4] = 1;
//        coffeeArray[5] = 0;
//        coffeeArray[6] = 1;

        int[] coffeeArray = {3,4,12,2,1,0,1};

        int coffeeCounter = 0;

        ///Loops help iterate over all elements in an Array
        for (int i = 0; i < coffeeArray.length; i++) {
            coffeeCounter += coffeeArray[i];    //Adds coffee cups to the counter and sums up all the cups
        }
        System.out.println("I had " + coffeeCounter + " cups of coffee in a week.");


        ////////2D Arrays
        int[][] my2DArray = {{1,2,4,7}, {11,12,13,14}, {22,23,24,25}};

        System.out.println("This an element of row index 2 and column index 3: " + my2DArray[2][3]);

        ////Group task with 2D Arrays - great exercise to understand rows and columns
        int[][] groupTask = {{125,91,90,1}, {55, 5,211,2}, {77,19,21,3}};
//        System.out.println("Row=1, column=1, value= " + groupTask[0][0]);
//        System.out.println("Row=1, column=2, value= " + groupTask[0][1]);
//        System.out.println("Row=1, column=3, value= " + groupTask[0][2]);
//
//        System.out.println("Row=2, column=1, value= " + groupTask[1][0]);
//        System.out.println("Row=2, column=2, value= " + groupTask[1][1]);
//        System.out.println("Row=2, column=3, value= " + groupTask[1][2]);
//
//        System.out.println("Row=3, column=1, value= " + groupTask[2][0]);
//        System.out.println("Row=3, column=2, value= " + groupTask[2][1]);
//        System.out.println("Row=3, column=3, value= " + groupTask[2][2]);

        ///Same code ^ but simpler (added last element in each row)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++){
                System.out.println(groupTask[i][j]);
            }
            System.out.println();
        }

        /////// FOR EACH loop
        int[] forLoopArray = {5,6,7,1,1};
        for (int internalValue : forLoopArray) {
            System.out.println("Elements: " + internalValue);
        }
        ////// Complex 2D array
        int[][] complexArray = {{5,6},{7,8}};
        for (int[] singleRow : complexArray) {
            for (int singleElement : singleRow) {
                System.out.println("Single element from 2D array: " + singleElement);
            }
        }

        //////// WHILE loop
        int clockTime = 0;
        while (clockTime <= 24){
            System.out.println("The time is: " + clockTime + " o'clock!");
            clockTime += 3;
        }

        //// complex example
        boolean runWhileLoop = true;
        while (runWhileLoop){
            System.out.println("variable is still true and running");

            if (clockTime > 50){
                runWhileLoop = false;
            }
            clockTime++;
        }

        ///// Cool loop-like option app (menu)
        int menuItem = 10;

        Scanner scanner = new Scanner(System.in);

        while (menuItem != 0){
            System.out.println("Select an action you want to do: ");
            System.out.println("1 - write that you are smart");
            System.out.println("2 - write that you are pretty");
            System.out.println("3 - write that you are the best");
            System.out.println("0 - Exit the app");

            menuItem = scanner.nextInt();
            if (menuItem == 1){
                System.out.println("You are smart!");
            }else if (menuItem == 2){
                System.out.println("You are pretty!");
            }else if (menuItem == 3){
                System.out.println("You are the best!");
            }else{
                System.out.println("There is no such option");
            }
        }

        /////// DO WHILE loop
        int initialValue = 10;
        // Will not run at all
//        while (initialValue < 5){
//            System.out.println("Initial value < 5");
//        }
        // Runs once
        do {
            System.out.println("Initial value < 5");
        }while (initialValue < 5);

    }
}
