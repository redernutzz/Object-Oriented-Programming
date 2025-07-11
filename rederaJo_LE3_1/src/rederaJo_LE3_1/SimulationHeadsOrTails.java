/**
 * 
 */
package rederaJo_LE3_1;
/**
======================================================================
CLASS NAME : SimulationHeadsOrTails
DESCRIPTION : Writes a program that simulates flipping a coin two million times and displays the number of heads and tails.
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
import java.lang.Math;

public class SimulationHeadsOrTails {
/**
======================================================================
METHOD : main
DESCRIPTION : runs the program which simulates the flipping of coins 2 million times.
PRE-CONDITION : There are no pre-conditions since it's the starting point of the program.
POST-CONDITION : Program will be executed and the number of heads and tails will be displayed.
======================================================================
*/
	public static void main(String[] args) {
		int i = 1, coinToss, heads = 0, tails = 0;
		final int LIMIT = 2000000;
		
		
		System.out.println("Flipping a coin 2 Million times");
		while (i <= LIMIT) {
			coinToss = (int)(Math.random() * 2);
			
			if (coinToss == 1) {
				heads++;
			}
			else {
				tails++;
			}
			i++;
		}
		
		System.out.println("Heads:" + heads);
		System.out.println("Tails:" + tails);
	}

}
