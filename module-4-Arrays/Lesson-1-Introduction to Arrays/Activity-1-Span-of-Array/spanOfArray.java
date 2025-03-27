import java.util.Scanner;

public class spanOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input number of elements
        System.out.print("Enter the number of elements: ");
        int n = scn.nextInt();

        int[] arr = new int[n];

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Find and print span
        System.out.println("Span of the array: " + findSpan(arr));
    }

    public static int findSpan(int[] arr) {
        int min = arr[0], max = arr[0];

        // Find min and max
        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return max - min;
    }

}