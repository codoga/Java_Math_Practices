import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask a Number to Calculate its number of digits.
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Get the number of digits
        int numberOfDigits = getNumberOfDigits(number);

        System.out.println("Number of digits: " + numberOfDigits);

        scanner.close();
    }

    // Method to calculate the number of digits of giving number
    private static int getNumberOfDigits(int number) {
        // for negative numbers switch them into positive
        number = Math.abs(number);

        // 0 has 1 digit
        if (number == 0) {
            return 1;
        }

        // Initial digit value should be 0
        int count = 0;

        // Count the number of digits by repeatedly dividing 10
        while (number > 0) {
            number = number / 10;
            count++;
        }

        return count;
    }
}