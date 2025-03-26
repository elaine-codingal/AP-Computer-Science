import java.util.*;

public class RemovePrime {

    public static void removePrimes(ArrayList<Integer> numbers) {
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (isPrime(numbers.get(i))) {
                numbers.remove(i);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        if (number == 2)
            return true;
        if (number % 2 == 0)
            return false;

        for (int divisor = 3; divisor * divisor <= number; divisor += 2) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int count = scanner.nextInt();

        if (count <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
            return;
        }

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter " + count + " integers:");
        for (int i = 0; i < count; i++) {
            numbers.add(scanner.nextInt());
        }

        removePrimes(numbers);
        System.out.println("Modified List (without primes): " + numbers);
    }
}