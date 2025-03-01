import java.util.Scanner;

class MultiplesFinder {
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

            // Loop from 100 down to 1
            for (int i = 99; i >= 1; i--) {
                if (i % number == 0) { // Check if i is a multiple of the number
                    System.out.print(i + " ");
                }
            }
        }

    }
}
