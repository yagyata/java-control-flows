import java.util.Scanner;

public class FizzBuzz {
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
            // Looping from 1 to the given number
            for (int i = 1; i <= number; i++) {
                // Checking for multiples of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
		else if (i % 3 == 0) {
                    System.out.println("Fizz");
                }
		else if (i % 5 == 0) {
                    System.out.println("Buzz");
                }
		else {
                    System.out.println(i);
                }
            }
        }

    }
}
