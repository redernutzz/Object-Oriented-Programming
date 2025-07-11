import java.util.Scanner;

class Date{
	private int day, month, year;
	
	Scanner s = new Scanner(System.in);
	public Date(int month, int day, int year) {
		this.year = year;
		this.month = month;
		this.day = day;
		while(month < 1 || month > 12) {
			System.out.println("Invalid Month. Please enter a valid month.");
			System.out.print("Day (1-12): ");
			month = s.nextInt();
			this.month = month;
			
		}
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			while (day > 31 || day < 1) {
				System.out.println("Invalid Day. Please enter a valid day.");
				System.out.print("Day (1-31): ");
				day = s.nextInt();
				this.day = day;
			}
		}
		else if (checkIfLeapYear (year)== true && month == 2) {
			while (day > 29 || day < 1) {
				System.out.println("Invalid Day. Please enter a valid day.");
				System.out.print("Day (1-29): ");
				day = s.nextInt();
				this.day = day;
			}
		}
		else if (checkIfLeapYear(year)== false && month == 2) {
			while (day > 28 || day < 1) {
				System.out.println("Invalid Day. Please enter a valid day.");
				System.out.print("Day (1-28): ");
				day = s.nextInt();
				this.day = day;
			}
		}
		else {
			while (day > 30 || day < 1) {
				System.out.println("Invalid Day. Please enter a valid day.");
				System.out.print("Day (1-30): ");
				day = s.nextInt();
				this.day = day;
			}
		}
		
		
		System.out.println("\nMM/DD/YYYY");
		System.out.println( Integer.toString(this.month) +"/"+ Integer.toString(this.day) +"/"+ Integer.toString(this.year));
	}
	
	public boolean checkIfLeapYear(int year) {
		if(year%4 == 0) {
			return true;
		}
		return false;
	}
	public void nextDay() {
		
		if(this.month == 2 && this.day == 29 && checkIfLeapYear(this.year) == true){
			this.day = 0;
			this.month++;
		}
		if(this.month == 2 && this.day == 28 && checkIfLeapYear(this.year) == false){
			this.day = 0;
			this.month++;
		}
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (this.month == 12 && this.day == 31) {
				this.month = 1;
				this.year++;
				this.day = 0;
			}
			if(this.day == 31) {
				this.month++;
				this.day = 1;
			}
			else {
				this.day++;
			}
			
		}
		else {
			if(this.day == 30) {
				this.month++;
				this.day = 0;
			}
			this.day++;
		}
		System.out.println("\nMM/DD/YYYY");
		System.out.println(Integer.toString(this.month) +"/"+ Integer.toString(this.day) +"/"+ Integer.toString(this.year));
	}
}

public class SuperClass {
	public static void main (String[] args) {
		
		Date a = new Date(12,31,2003);
		System.out.print("\nNEXT DAY:");
		a.nextDay();
		a.s.close();	
	}
}
