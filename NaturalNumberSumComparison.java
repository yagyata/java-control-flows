import java.util.Scanner;

public class NaturalNumberSumComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a natural number (n): ");
        int n = sc.nextInt();

        // Checking if the number is a natural number (positive integer)
        if (n > 0) {
            // Compute sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Compute sum using while loop
            int sumLoop = 0;
            int counter = 1;

            while (counter <= n) {
                sumLoop += counter;
                counter++;
            }

            // Display the results
            System.out.println("Sum computed using formula: " + sumFormula);
            System.out.println("Sum computed using while loop: " + sumLoop);

            // Comparing both results
            if (sumFormula == sumLoop) {
                System.out.println("Both computations match! ✅");
            }
	    else {
                System.out.println("There is a mismatch in the computations ");
            }
	}
	   else {
            // If the number is not natural
            System.out.println("The number " + n + " is not a natural number.");
           }

        sc.close();
    }
}
