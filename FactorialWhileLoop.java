import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Checking if the number is a positive integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        }
	else {
            long factorial = 1; // Initialize factorial as 1
            int counter = number; // Counter starts from the number

            // Compute factorial using while loop
            while (counter > 0) {
                factorial *= counter;
                counter--;
            }

            // Displaying the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

    }
}
