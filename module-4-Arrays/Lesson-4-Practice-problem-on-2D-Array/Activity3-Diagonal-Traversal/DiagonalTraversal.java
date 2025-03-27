import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = scn.nextInt();
        int[][] matrix = new int[n][n];
        
        System.out.println("Enter the elements of the " + n + "x" + n + " matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }
        
        System.out.println("\nDiagonal Traversal:");
        printDiagonals(matrix);
    }

    public static void printDiagonals(int[][] matrix) {
        int n = matrix.length;

        // Print diagonals starting from first row
        for (int diagonal = 0; diagonal < n; diagonal++) {
            System.out.print("Diagonal " + (diagonal + 1) + ": ");
            int row = 0;
            int col = diagonal;

            while (row < n && col < n) {
                System.out.print(matrix[row][col] + " ");
                row++;
                col++;
            }
            System.out.println();
        }

        // Print diagonals starting from first column (excluding first row)
        for (int diagonal = 1; diagonal < n; diagonal++) {
            System.out.print("Diagonal " + (n + diagonal) + ": ");
            int row = diagonal;
            int col = 0;

            while (row < n && col < n) {
                System.out.print(matrix[row][col] + " ");
                row++;
                col++;
            }
            System.out.println();
        }
    }
}