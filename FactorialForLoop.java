import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Checking if the number is a natural number (0 or positive integer)
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        }
	else {
            long factorial = 1; // Initialize factorial as 1

            // Compute factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Displaying the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

    }
}
