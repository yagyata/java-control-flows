import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter employee's salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter employee's years of service: ");
        int yearsOfService = sc.nextInt();

        double bonus = 0;

        // Checking if the employee is eligible for a bonus
        if (yearsOfService > 5) {
            bonus = 0.05 * salary; // 5% of the salary
        }

        // Printing the bonus amount
        System.out.println("Bonus amount: $" + bonus);


    }
}

