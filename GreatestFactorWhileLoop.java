import java.util.Scanner;

public class GreatestFactorWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Checking if the number is a positive integer
        if (number <= 1) {
            System.out.println("Please enter an integer greater than 1.");
        } else {
            int greatestFactor = 1; // Initialize greatest factor
            int counter = number - 1; // Start from number - 1

            // Loop to find the greatest factor
            while (counter >= 1) {
                if (number % counter == 0) { // Check if counter is a factor
                    greatestFactor = counter;
                    break; // Stop once the greatest factor is found
                }
                counter--; // Decrement counter
            }

            // Displaying the greatest factor
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        }

    }
}
