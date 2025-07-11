import java.util.Scanner;

class Rent{
	public static final int MINUTES_IN_AN_HOUR = 60;
	public static final int HOURLY_RATE = 40;
	private String contractNum;
	private int numOfHours;
	private int numOfMins;
	private int price;
	
	Rent(){
		this.contractNum = "A000";
		this.numOfMins = 0;
	}
	Rent(String contractNum, int numOfMins){
		setContractNum(contractNum);
		setHoursAndMins(numOfMins);
	}
	public void setContractNum(String contractNum) {
		this.contractNum = contractNum;
	}
	public void setHoursAndMins(int numOfMins) {
		this.numOfHours = numOfMins/Rent.MINUTES_IN_AN_HOUR;
		this.numOfMins = numOfMins - 60 * this.numOfHours;
	}
	public String getContractNum() {
		return this.contractNum;
	}
	public int getNumOfMins() {
		return this.numOfMins;
	}
	public int getNumOfHours() {
		return this.numOfHours;
	}
	public int getPrice(int numOfHours) {
		Rent.HOURLY_RATE = 50;
		this.price = (Rent.HOURLY_RATE * numOfHours);
		return this.price;
	}
}
public class RentalTest {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		Rent firstRent = new Rent("B737", 500);
		System.out.println("First Renter:");
		System.out.println("Contract Number: " + firstRent.getContractNum());
		System.out.println("Number of Hours: " + firstRent.getNumOfHours());
		System.out.println("Extra Minutes: " + firstRent.getNumOfMins());
		System.out.println("Rent Price: $" + firstRent.getPrice(firstRent.getNumOfHours()));
		
		Rent secondRent = new Rent();
		System.out.println("\nNew Renter:");
		System.out.print("Enter Contract Number: ");
		secondRent.setContractNum(input.next());
		System.out.print("Enter Number of Minutes You Want To Rent: ");
		secondRent.setHoursAndMins(input.nextInt());
		
		System.out.println("\nSecond Rent:");
		System.out.println("Contract Number: " + secondRent.getContractNum());
		System.out.println("Number of Hours: " + secondRent.getNumOfHours());
		System.out.println("Extra Minutes: " + secondRent.getNumOfMins());
		System.out.println("Event Price: $" + secondRent.getPrice(secondRent.getNumOfHours()));
		
		input.close();
	}
}
