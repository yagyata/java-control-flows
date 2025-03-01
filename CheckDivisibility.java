import java.util.Scanner;  // Importing the Scanner class for user input

class CheckDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Creating a Scanner object to take user input

        // Prompting the user to enter a number
        System.out.print("Enter the number you want to check divisibility with 5: ");
        int number = sc.nextInt();  // Reading the integer input from the user

        String answer = "Yes";  // Default answer is set to "Yes"

        // Checking if the number is divisible by 5
        if (number % 5 == 0) {
            answer = "Yes";  // If the remainder when divided by 5 is 0, it's divisible
        } else {
            answer = "No";   // Otherwise, it's not divisible
        }

        // Printing the result
        System.out.println("Is the number " + number + " divisible by 5? " + answer);


    }
}



