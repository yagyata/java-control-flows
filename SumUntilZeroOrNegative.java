import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double total = 0.0; // Variable to store the sum

        // Infinite loop to keep asking for numbers
        while (true) {
            System.out.print("Enter a number (Enter 0 or a negative number to stop): ");
            double number = sc.nextDouble();

            // If the number is 0 or negative, break the loop
            if (number <= 0) {
                break;
            }

            total += number; // Add the number to the total sum
        }

        // Displaying the total sum
        System.out.println("The total sum of numbers entered is: " + total);


    }
}


