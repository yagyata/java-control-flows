import java.util.Scanner;

public class GreatestFactor {
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

            // Loop from (number - 1) to 1 to find the greatest factor
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) { // Check if i is a factor
                    greatestFactor = i;
                    break; // Stop once the greatest factor is found
                }
            }

            // Displaying the greatest factor
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        }

    }
}
