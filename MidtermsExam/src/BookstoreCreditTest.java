import java.util.Scanner;

class BookstoreCredit{
	private String name;
	private double GPA;
	private double creditPerGPA;
	
	
	BookstoreCredit(){
		this.GPA = 0;
		this.creditPerGPA = 75;
	}
	BookstoreCredit(double GPA, double credit){
		this.GPA = GPA;
		this.creditPerGPA = credit;
	}
	public void setGPA(double GPA) {
		this.GPA = GPA;
	}
	public double getGPA() {
		return this.GPA;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public double getOverAllCredit() {
		return (this.GPA*this.creditPerGPA);
	}
	public void print(String name, double GPA, double credit) {
		System.out.print("\nName: " + name);
		System.out.print("\nGPA: " + GPA);
		System.out.print("\nBook Credit: PHP" + credit);
	}
}
public class BookstoreCreditTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BookstoreCredit credit = new BookstoreCredit();
		System.out.print("Enter User Name: ");
		credit.setName(input.next());
		
		System.out.print("Enter User GPA: ");
		credit.setGPA(input.nextDouble());
		
		credit.print(credit.getName(), credit.getGPA(), credit.getOverAllCredit());
		System.out.print("\n\nEnter User Name: ");
		
		credit.setName(input.next());
		
		System.out.print("Enter User GPA: ");
		credit.setGPA(input.nextDouble());
		
		credit.print(credit.getName(), credit.getGPA(), credit.getOverAllCredit());
		
		input.close();
		
	}

}