import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the closest palindrome number
        int closestPalindrome = findClosestPalindrome(number);

        // Print the closest palindrome number
        System.out.println("Closest palindrome number to " + number + " is: " + closestPalindrome);

        scanner.close();
    }

    public static int findClosestPalindrome(int number) {
        int lowerPalindrome = number - 1;
        int higherPalindrome = number + 1;

        // Find the closest lower palindrome number
        while (!isPalindrome(lowerPalindrome)) {
            lowerPalindrome--;
        }

        // Find the closest higher palindrome number
        while (!isPalindrome(higherPalindrome)) {
            higherPalindrome++;
        }

        // Return the closest palindrome number
        if (number - lowerPalindrome <= higherPalindrome - number) {
            return lowerPalindrome;
        } else {
            return higherPalindrome;
        }
    }

    public static boolean isPalindrome(int number) {
        String str = String.valueOf(number);
        int left = 0;
        int right = str.length() - 1;

        // Check if the number is a palindrome
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}