import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking year as input
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        // Checking if the year is valid
        if (year < 1582) {
            System.out.println("The program only works for years in the Gregorian calendar (>= 1582).");
        }
	else {
            // **Method 1: Using multiple if-else conditions**
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    }
		    else {
                        System.out.println(year + " is NOT a Leap Year.");
                    }
                }
		else {
                    System.out.println(year + " is a Leap Year.");
                }
            }
	    else {
                System.out.println(year + " is NOT a Leap Year.");
            }

            // **Method 2: Using a single if statement with logical operators**
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("(Using logical operators) " + year + " is a Leap Year.");
            }
	    else {
                System.out.println("(Using logical operators) " + year + " is NOT a Leap Year.");
            }
        }

    }
}
