package u3pp;

import java.util.Scanner;

/**
 * Takes users input year and runs isLeapYear until user enters STOP
 If isLeapYear returns true, "is a leap year" is printed
 If isLeapYear returns false, "is not a leap year" is printed
 * 
 * @author Jason de Moura
 */

class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year (or enter STOP to end): ");
		String input = sc.nextLine();
    int year;

		while (!input.toUpperCase().equals("STOP")) {
      year = Integer.parseInt(input);
    
      if (LeapYear.isLeapYear(year) == true) {
        System.out.println(year + " is a leap year");
      } 
      else {
        System.out.println(year + " is not a leap year");
      }
    System.out.print("Enter a year (or enter STOP to end): ");
    input = sc.nextLine();
		}
		sc.close();
	}
}