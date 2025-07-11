
package rederaJo_LE3_1;
/**
======================================================================
CLASS NAME : DayOfTheWeek
DESCRIPTION : A program that prompts the user to enter year, month, and day of the month, and displays the name of the day of the week.
AUTHOR : John Isaac A. Redera
COPYRIGHT : September 4, 2023
REVISION HISTORY
Date: By: Description:
revision date author description of the change
revision date author description of the change
.
.
.
revision date author description of the change
======================================================================
*/
import java.util.Scanner;
public class DayOfTheWeek {
/**	======================================================================
METHOD : main
DESCRIPTION : runs the program which displays the name of the day of the week.
PRE-CONDITION : There are no pre-conditions since it's the starting point of the program.
POST-CONDITION : Program will be executed and the name of the day of the week will be displayed.
======================================================================
*/
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int year, m, q, j, k, h;
		
		System.out.print("Enter year: (e.g. 2012) : ");
		year = input.nextInt();
		
		System.out.print("Enter month:  1-12: ");
		m = input.nextInt();
		while (m > 12 || m < 1) {
			System.out.print("Error. Please Enter a valid month.\n");
			System.out.print("Enter month:  1-12: ");
			m = input.nextInt();
		}
		
		System.out.print("Enter the day of the month: 1-31: ");
		q = input.nextInt();
		while (q > 31 || q < 1) {
			System.out.print("Error. Please Enter a valid date.\n");
			System.out.print("Enter the day of the month: 1-31: ");
			q = input.nextInt();
		}		
		
		if(m == 1 || m == 2) {
			m = m + 12;
			year--;
		}
		
		j = year / 100;
		k = year % 100;

		h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + 5*j) % 7;
	
		
		System.out.print("Day of the week is ");
		if (h == 0) {
			System.out.println("Saturday");
		}
		else if (h == 1) {
			System.out.println("Sunday");
		}
		else if (h == 2) {
			System.out.println("Monday");
		}
		else if (h == 3) {
			System.out.println("Tuesday");
		}
		else if (h == 4) {
			System.out.println("Wednesday");
		}
		else if (h == 5) {
			System.out.println("Thursday");
		}
		else if (h == 6) {
			System.out.println("Friday");
		}
		
		input.close();
	}
}
