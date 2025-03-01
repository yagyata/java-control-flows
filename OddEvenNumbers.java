import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        // Checking if the number is a natural number (positive integer)
        if (number < 1) {
            System.out.println("Please enter a natural number (greater than or equal to 1).");
        }
	else {
            // Iterating from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                }
		else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }

    }
}
