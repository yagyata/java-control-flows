import java.util.Scanner;

class CountDown2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking countdown start value from the user
        System.out.print("Enter the countdown start value: ");
        int counter = sc.nextInt();

        // Countdown using for-loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i); // Printing the current countdown value
        }
    }
}
