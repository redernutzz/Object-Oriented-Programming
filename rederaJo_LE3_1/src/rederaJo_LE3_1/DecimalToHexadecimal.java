/**
 * 
 */
package rederaJo_LE3_1;
/**
======================================================================
CLASS NAME : DecimalToHexadecimal
DESCRIPTION : A program that will convert inputted decimal number into hexadecimal number..
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

public class DecimalToHexadecimal {
/**
======================================================================
METHOD : main
DESCRIPTION : runs the program which  converts the inputted decimal number.
PRE-CONDITION : There are no pre-conditions since it's the starting point of the program.
POST-CONDITION : Program will be executed and the hexadecimal equivalent will be displayed.
======================================================================
*/
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number  :");;
		int userInp = input.nextInt();
		int remainder, i, j, wholeNum;
		double decimal;
		char hexaLetters [] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		char container [] = new char [20];
		
		for (i = 0; userInp > 0; i++) {
			decimal = (double)userInp/16;
			wholeNum = userInp/16;
			decimal = decimal - wholeNum;
			
			remainder = (int)(decimal * 16);
		
			container [i]= hexaLetters[remainder];
				
			userInp = wholeNum;
		}
		
		System.out.print("Hexadecimal number  : ");
		j = i - 1;
		while (j >= 0) {
			System.out.print(container[j]);
			j--;
		}
		
		input.close();
	}
}
