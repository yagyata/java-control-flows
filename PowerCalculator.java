import java.util.Scanner;
class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for base number and power
        System.out.print("Enter the base number (positive integer): ");
        int number = sc.nextInt();

        System.out.print("Enter the power (non-negative integer): ");
        int power = sc.nextInt();

        // Checking if the inputs are valid
        if (number < 0 || power < 0) {
            System.out.println("Please enter non-negative integers.");
        }
	else {
            int result = 1; // Initializing result as 1

            // Loop to calculate power using multiplication
            for (int i = 1; i <= power; i++){
                result *= number;
            }

            // Displaying the result
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        }

    }
}
