import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int limit = scanner.nextInt();

        // Print prime numbers below the entered number
        System.out.println("Prime numbers below " + limit + ":");
        printPrimes(limit);

        scanner.close();
    }

    public static void printPrimes(int limit) {
        // Start from 2 because 1 is not a prime number
        for (int number = 2; number < limit; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}