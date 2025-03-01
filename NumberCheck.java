import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Checking if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        }
	else if (number < 0) {
            System.out.println("The number is negative.");
        }
	else {
            System.out.println("The number is zero.");
        }


    }
}
