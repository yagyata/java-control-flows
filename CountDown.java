import java.util.Scanner;

public class CountDown{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking countdown start value from the user
        System.out.print("Enter the countdown start value: ");
        int counter = sc.nextInt();

        // Countdown loop
        while (counter >= 1) {
            System.out.println(counter); // Printing the current countdown value
            counter--; // Decrementing the counter
        }

    }
}
