
import java.util.Scanner;

class PB{
	
	private String fName;
	private String lName;
	private int number;
	
	public void setFirstName(String input) {
		this.fName = input;
	}
	
	public String getFirstName() {
		return this.fName;
	}
	
	public void setLastName(String input) {
		this.lName= input;
	}
	
	public String getLastName() {
		return this.lName;
	}
	public void setPhoneNumber(int input) {
		this.number= input;
	}
	
	public int getPhoneNumber() {
		return this.number;
	}
}
public class PhoneBook_App {
	public static void main (String[] args) {
		PB[] pb = new PB[99];
		PB z = new PB();
		Scanner s = new Scanner(System.in);
		char choice = 'X';
		int i = 0;
		while(choice != 'e') {
			pb[i] = new PB();
			System.out.println(" MENU:");
			System.out.print(" [A] ADD \n [B] BROWSE \n [C] CHANGE \n [D] DELETE \n [E] EXIT \n Choice: ");
			choice = s.next().toLowerCase().charAt(0);
			
			if (choice == 'a') {
				
				System.out.println("Please input:");
				System.out.println("First Name: ");
				pb[i].setFirstName(s.nextLine());
				System.out.println("Last Name: ");
				pb[i].setLastName(s.nextLine());
				System.out.println("Phone Number: ");
				pb[i].setPhoneNumber(s.nextInt());
			}
			else if(choice == 'b') {
				if(i == 0) {
					System.out.println("Phonebook is Empty. Please add first");
				}
				System.out.println("PHONEBOOK:");
				for(int j = 0; j < i; j++) {
					System.out.println("[ "+ j++ + " ]" + "\nFirst Name: " + pb[j].getFirstName());
					System.out.print( "\nLast Name: " + pb[j].getLastName());
					System.out.print( "\nPhone Number: " + pb[j].getPhoneNumber());
				}
			}
			
			i++;
		}
		
		
	}
}
