import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Print the divisors of the entered number
        System.out.println("Divisors of " + number + ": " + getDivisors(number));

        scanner.close();
    }

    public static String getDivisors(int number) {
        StringBuilder divisors = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisors.append(i).append(", ");
            }
        }

        // Remove the trailing ", " if divisors are found
        if (divisors.length() > 0) {
            divisors.setLength(divisors.length() - 2);
        }

        return divisors.toString();
    }
}