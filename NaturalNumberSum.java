import java.util.Scanner;

public class NaturalNumberSum {
	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Taking input from the user
        	System.out.print("Enter a number: ");
        	int number = sc.nextInt();

        	// Checking if the number is a natural number (positive integer)
        	if (number > 0) {
            		// Formula to calculate the sum of first 'n' natural numbers
            		int sum = number * (number + 1) / 2;
            		System.out.println("The sum of " + number + " natural numbers is " + sum);
        	}
		else {
            		// If the number is not a natural number
            		System.out.println("The number " + number + " is not a natural number");
        	}

    }
}
