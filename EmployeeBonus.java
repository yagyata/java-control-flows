import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking salary and years of service as input
        System.out.print("Enter the employee's salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter the years of service: ");
        int yearsOfService = sc.nextInt();

        double bonus = 0.0; // Initialize bonus as 0

        // Checking if years of service is greater than 5
        if (yearsOfService > 5) {
            bonus = salary * 0.05; // 5% of salary as bonus
            System.out.println("The employee gets a bonus of: INR " + bonus);
        }
	else {
            System.out.println("No bonus, as years of service is less than or equal to 5.");
        }

    }
}
