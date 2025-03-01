import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for ages
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

        // Taking input for heights
        System.out.print("Enter Amar's height (in cm): ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter Akbar's height (in cm): ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter Anthony's height (in cm): ");
        double heightAnthony = sc.nextDouble();

        // Finding the youngest friend (minimum age)
        String youngest;
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            youngest = "Amar";
        }
	else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            youngest = "Akbar";
        }
	else {
            youngest = "Anthony";
        }

        // Finding the tallest friend (maximum height)
        String tallest;
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            tallest = "Amar";
        }
	else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            tallest = "Akbar";
        }
	else {
            tallest = "Anthony";
        }

        // Displaying results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

    }
}
