import java.util.Scanner;

public class RepresentArray{

    //Main method - Entry point of the program
    public static void main(String[]args){

        //Create a scanner object to read input from the user
        Scanner scn = new Scanner(System.in);

        //Prompt the user to enter the number of rows (n)
        System.out.println("Enter the number of rows:");
        int n = scn.nextInt();

        //Prompt the user to enter the number of columns (m)
        System.out.println("Enter the number of columns:");
        int m = scn.nextInt();

        //Create a 2D array with n rows and m columns
        int[][] arr = new int [n][m];

        //Prompt the user to enter the elements of the 2D array
        System.out.println("Enter the number of the 2D array");
        for(int i = 0; i < n; i++){
            for(int j =0; j < m; j++){
                System.out.println(arr[i][j]+" ");//Print each element
            }
            System.out.println();//Print a new line after each row
        }
    }
}