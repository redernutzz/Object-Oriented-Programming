import java.lang.Math;
import java.util.Random;

public class SimulationHeadOrTails {
	
	public static void main(String[] args) {
		int i = 1, coinToss, heads = 0, tails = 0;
		final int LIMIT = 2000000;
		Random random = new Random();
		
		System.out.println("Flipping a coin 2 MIllion times");
		while (i <= LIMIT) {
			coinToss = random.nextInt(2);
			
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
