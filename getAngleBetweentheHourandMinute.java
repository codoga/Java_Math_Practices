import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the time in 24-hour format
        System.out.print("Enter the time in 24-hour format: ");
        String time = scanner.nextLine();

        // Split the time string into hours and minutes
        String[] timeParts = time.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);

        // Validate the input
        if (hours < 0 || hours >= 24 || minutes < 0 || minutes >= 60) {
            System.out.println("Invalid time format. Please enter a valid time.");
            return;
        }

        // Calculate the angle between the hour and minute hands
        double angle = calculateAngle(hours, minutes);

        // Output the result
        System.out.println("Angle between the hour and minute hands: " + angle + " degrees");

        scanner.close();
    }

    public static double calculateAngle(int hours, int minutes) {
        // Calculate the angle made by the hour hand with respect to 12 o'clock
        double hourAngle = (hours % 12 + minutes / 60.0) * 30;

        // Calculate the angle made by the minute hand with respect to 12 o'clock
        double minuteAngle = minutes * 6;

        // Calculate the absolute difference between the two angles
        double angle = Math.abs(hourAngle - minuteAngle);

        // Ensure the smaller angle between the two possible angles is returned
        return Math.min(angle, 360 - angle);
    }
}