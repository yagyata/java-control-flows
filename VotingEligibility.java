import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the person's age: ");
        int age = sc.nextInt();

        // Checking voting eligibility
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        }
	else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }


    }
}

