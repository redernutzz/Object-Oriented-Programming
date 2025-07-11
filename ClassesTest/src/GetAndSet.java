import java.util.Scanner;

class Person{ // since the data fields in the class are private you use get and set to access them
	private String name;
	private int age;
	private String[] phoneNum;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
}
public class GetAndSet {
	public static void main (String[] args) {
		Person[] p = new Person[3];
		Scanner s = new Scanner(System.in);
		
		System.out.print("Please enter a person's name:");
		p[0].setName(s.nextLine());
		
		System.out.print("\n" + p[0].getName()); 
		
		System.out.print("\nPlease enter a person's age:");
		p[0].setAge(s.nextInt());
		
		System.out.print("\n" + p[0].getAge());
		
		System.out.print("Please enter a person's name:");
		p[1].setName(s.nextLine());
		
		System.out.print("\n" + p[1].getName()); 
		
		System.out.print("\nPlease enter a person's age:");
		p[1].setAge(s.nextInt());
		
		System.out.print("\n" + p[1].getAge());
	}
}
