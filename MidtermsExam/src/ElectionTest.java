import java.util.Scanner;

class Election {
	private int[] votes = new int[5];
	private String[] candidate = new String [5];
	
	Election() {
		for (int i = 0; i < 5; i++) {
			this.votes[i] = 0;
			this.candidate[i] = "";
		}
	}

	Election (int vote, String candidate) {
		for (int i = 0; i < 5; i++) {
			this.votes[i] = vote;
			this.candidate[i] = candidate;
		}
	}
	
	public void setVote(int numVotes, int index) {
		this.votes[index] = numVotes;
	}
	public int getVote(int index) {
		return this.votes[index];
	}
	public void setCandidate(String candidate, int index) {
		this.candidate[index] = candidate;
	}
	public String getCandidate(int index) {
		return this.candidate[index];
	}
	public int getTotal() {
		int total = 0;
		for (int i = 0; i < 5; i++) {
			total = total + this.votes[i];
		}
		return total;
	}
	
	public int getWinner() {
		int winner = 0;
		int indexOfWin = 0;
		for (int i = 0; i < 5; i++) {
			if(this.votes[i] > winner) {
				winner = this.votes[i];
				indexOfWin = i;
			}
		}
		return indexOfWin;
	}
	
	public float getPercentage(int index) {
		return ((float)this.votes[index]/(float)getTotal()) * 100;
	}
	public void print(int total, int winner) {
		System.out.format("%-20s %-20s  %-25s \n", "Candidate", "Votes Received", "% of Total Votes");
		for(int i = 0; i < 5; i++) {
			System.out.format("%-20s %-20s  %-25.2f%% \n", this.candidate[i], + this.votes[i], getPercentage(i));
		}
		System.out.format("%-20s %-20s", "Total", total);
		System.out.print("\n\nThe Winner of the Election is ");
		System.out.println(this.candidate[winner]);
	
	}
}
public class ElectionTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Election election = new Election();
		for(int i = 0; i < 5; i++) {
			int j = i+1;
			System.out.print("Enter Candidate No." + j + ": ");
			election.setCandidate(input.next(), i);
			System.out.print("Enter Number of Votes: ");
			election.setVote(input.nextInt(), i);
		}
		System.out.println();
		election.print(election.getTotal(), election.getWinner());
		
		
		input.close();
	}
}
