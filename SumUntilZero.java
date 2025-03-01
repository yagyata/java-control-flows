import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0; // Variable to store the sum
        double number; // Variable to store user input

        // Taking input from the user
        System.out.print("Enter a number (Enter 0 to stop): ");
        number = sc.nextDouble();

        // Loop until user enters 0
        while (number != 0) {
            total += number; // Add the number to the total sum

            // Asking for next input
            System.out.print("Enter a number (Enter 0 to stop): ");
            number = sc.nextDouble();
        }

        // Displaying the total sum
        System.out.println("The total sum of numbers entered is: " + total);

    }
}
