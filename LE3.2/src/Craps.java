import java.lang.Math;

class Dice{

	int[] faces =  {1,2,3,4,5,6};

	public int rollTheDice(int[] faces) {
		return faces[(int)(Math.random() * 6)];
	}
}

public class Craps {

	public static int sumOfTwoDiceRolls(int x,int y) {
		return (x + y);
	}

	public static void main(String[] args) {
		Dice  dice1 =  new Dice();
		Dice  dice2 =  new Dice();
		int i = 0, j = 0;
		int result = 2;
		int[] rolls1 = new int[99];
		int[] rolls2 = new int[99];
		int[] sum = new int[99];
		do {
			rolls1 [i] = dice1.rollTheDice(dice1.faces);
			rolls2 [i] = dice2.rollTheDice(dice2.faces);
			sum [i] = sumOfTwoDiceRolls(rolls1[i], rolls2[i]);
			
			System.out.println("You rolled " + rolls1[i] + " + " + rolls2[i] + " = " + sum[i]);

			if(i != 0) {
				
				if(sum[i] == sum[j]) {
					result = 1;
					continue;
				}
				else if(sum[i] == 7) {
					result = 0;
					continue;
				}
				else {
					System.out.println("point is " + sum[0]);
					continue;
				}
				
			}

			if(sum [i] == 2 || sum [i] == 3 || sum [i] ==  12) {
				result  = 0;
				continue;
			}
			else if (sum [i] == 7 || sum [i] == 11) {
				result = 1;
				continue;
			}
			
			System.out.println("point  is " + sum[0]);
			i++;
			
		}while(result ==  2);

		if (result == 1) {
			System.out.println("You win");
		}
		else {
			System.out.println("You lose");
		}
	}

}
