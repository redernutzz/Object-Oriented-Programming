import java.util.Scanner;

class Event{
	public static final int PRICE_PER_GUEST = 35;
	public static final int CUTOFF = 50;
	private String eventNum;
	private int numOfGuest;
	private int price;
	
	Event(){
		this.eventNum = "A000";
		this.numOfGuest = 0;
	}
	Event(String eventNum, int numOfGuest){
		setEventNum(eventNum);
		setGuests(numOfGuest);
	}
	public void setEventNum(String eventNum) {
		this.eventNum = eventNum;
	}
	public void setGuests(int numGuest) {
		this.numOfGuest = numGuest;
	}
	public String getEventNum() {
		return this.eventNum;
	}
	public int getGuests() {
		return this.numOfGuest;
	}
	public int getPrice(int numOfGuests) {
		this.price = (Event.PRICE_PER_GUEST * numOfGuests);
		return this.price;
	}
}
public class EventTest {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		Event acquaintance = new Event("B737", 45);
		System.out.println("Acquaintance Party Event:");
		System.out.println("Event Number: " + acquaintance.getEventNum());
		System.out.println("Number of Guests: " + acquaintance.getGuests());
		System.out.println("Event Price: $" + acquaintance.getPrice(acquaintance.getGuests()));
		
		Event birthday = new Event();
		System.out.println("\nNew Event:");
		System.out.print("Enter Event Number: ");
		birthday.setEventNum(input.next());
		System.out.print("Enter Number of Guests: ");
		int numGuests = input.nextInt();
		while (numGuests > Event.CUTOFF) {
			System.out.println("The maximum limit for a large event is 50 pax. Please enter again.");
			numGuests = input.nextInt();
		}
		birthday.setGuests(numGuests);
		
		System.out.println("\nBirthday Party Event:");
		System.out.println("Event Number: " + birthday.getEventNum());
		System.out.println("Number of Guests: " + birthday.getGuests());
		System.out.println("Event Price: $" + birthday.getPrice(birthday.getGuests()));
		
		input.close();
	}
}
