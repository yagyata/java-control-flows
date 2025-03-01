import java.util.Scanner;

public class SmallestNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();

        // Checking if the first number is the smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Displaying the result
        System.out.println("Is the first number the smallest? " + isSmallest);

	}
}
