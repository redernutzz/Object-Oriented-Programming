import java.util.Scanner;

class personType{
	private String firstName;
	private String lastName;
	
	public void print() {
		System.out.print(getFirstName() + " ");
		System.out.print(getLastName());
	}
	public void setName(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public personType() {
	}
	public personType(String first, String last) {
		this.firstName = first;
		this.lastName = last;
	}
}
public class Person {
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		String first, last;
		
		System.out.print("Enter First Name: ");
		first = s.nextLine();
		System.out.print("Enter Last Name: ");
		last = s.nextLine();
		
		personType p = new personType(first, last); // this uses the contructor with specified values
		
		//p.setName(first, last); //this however is used when setting values after contructor was created
		p.print();
		s.close();
	}
}
