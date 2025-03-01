import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Checking if the number is a positive integer
        if (number < 1) {
            System.out.println("Please enter a positive integer greater than or equal to 1.");
        }
	else {
            System.out.println("Factors of " + number + " are:");

            // Loop to find factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
        }

    }
}
