import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for month and day
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter the day: ");
        int day = sc.nextInt();

        // Checking if the date falls in the Spring Season (March 20 - June 20)
        boolean isSpring = (month == 3 && day >= 20 && day <= 31) || // March 20 to March 31
                           (month == 4 && day >= 1 && day <= 30) ||  // April (full month)
                           (month == 5 && day >= 1 && day <= 31) ||  // May (full month)
                           (month == 6 && day >= 1 && day <= 20);    // June 1 to June 20

        // Printing the result
        if (isSpring) {
            System.out.println("It's a Spring Season.");
        }
	else {
            System.out.println("Not a Spring Season.");
        }

    }
}
