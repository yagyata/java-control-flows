import java.util.Scanner;

class MultiplesWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        // Checking if the number is a valid positive integer and less than 100
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        }
	else {
            System.out.println("Multiples of " + number + " below 100 are:");

            int counter = 99; // Start counter from the largest possible multiple

            // Loop to find multiples using while loop
            while (counter >= 1) {
                if (counter % number == 0) { // Check if counter is a multiple of the number
                    System.out.print(counter + " ");
                }
                counter--; // Decrement counter
            }
        }

    }
}
