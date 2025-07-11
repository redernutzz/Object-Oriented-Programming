import java.util.Scanner;

class HealthProfile{
	private String firstName, lastName, gender;
	private double birthMonth, birthday, birthYear;
	private double height, weight;
	public HealthProfile(String first, String last, String gender, double month, double day, double year, double height, double weight) {
		this.firstName = first;
		this.lastName = last;
		this.gender = gender;
		this.birthMonth = month;
		this.birthday = day;
		this.birthYear = year;
		this.height = height;
		this.weight = weight;
	}
	public void setFirstName(String first) {
		this.firstName = first;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public void setLastName(String last) {
		this.lastName = last;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getGender() {
		return this.gender;
	}
	public void setBirthMonth(double month) {
		this.birthMonth = month;
	}
	public double getBirthMonth() {
		return this.birthMonth;
	}
	public void setBirthday(double day) {
		this.birthday = day;
	}
	public double getBirthday() {
		return this.birthday;
	}
	public void setBirthYear(double year) {
		this.birthYear = year;
	}
	public double getBirthYear() {
		return this.birthYear;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return this.weight;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	public double calculateAgeInYears(double month, double year, double day) {
		double ageInYears, currentYear = 2023, currentDay = 4, currentMonth = 10;
		ageInYears = currentYear - year;
		System.out.println(ageInYears);
		month = (currentMonth - month)/12;
		System.out.println(month);
		if((int)year % 4 == 0) {
			day = (currentDay - day)/366;
			System.out.println(day);
		}
		else{
			day = (currentDay - day)/365;
			System.out.println(day);
		}
		return ageInYears = ageInYears + month + day;
	}
	public double calculateMaxHeartRate(double ageInYears) {
		return 220 - ageInYears;
	}
	public double targetHeartRate(double maxHeartRate, double percent) {
		return maxHeartRate*percent;
	}
	public double calculateBMI (double weight, double height) {
		return 703 * (weight/(height*height));
	}
}
public class Profile {
	public static boolean checkIfLeapYear(double year) {
		if((int)year % 4 == 0) {
			return true;
		}
		return false;
	}
	public static void main (String[] args) {
		String first, last, gender;
		double height, weight, day, month, year;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the following details:\n");
		System.out.print("First Name: ");
		first = s.nextLine();
		System.out.print("Last Name: ");
		last = s.nextLine();
		System.out.print("Gender: ");
		gender = s.nextLine();
		
		System.out.println("\nBirthday:");
		System.out.print("Year (ex. 1998): ");
		year = s.nextDouble();
		
		System.out.print("Month (1-12): ");
		month = s.nextDouble();
		while (month > 12 || month < 0) {
			System.out.println("Invalid Month. Please enter a valid month.");
			System.out.print("Month (1-12): ");
			month = s.nextDouble();
		}
		
		if(checkIfLeapYear(year) == true && (int)month == 2) {
			System.out.print("Day (1-29): ");
			day = s.nextDouble();
			while (day > 29 || day < 0) {
				System.out.println("Invalid Day. Please enter a valid day.");
				System.out.print("Day (1-29): ");
				day = s.nextDouble();
			}
		}
		else if((int)month == 2) {
			System.out.print("Day (1-28): ");
			day = s.nextDouble();
			while (day > 28 || day < 0) {
				System.out.println("Invalid Day. Please enter a valid day.");
				System.out.print("Day (1-28): ");
				day = s.nextDouble();
			}
		}
		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
			 
			System.out.print("Day (1-31): ");
			day = s.nextDouble();
			while (day > 31 || day < 0) {
				System.out.println("Invalid Day. Please enter a valid day.");
				System.out.print("Day (1-28): ");
				day = s.nextDouble();
			}
		}
		else {
			System.out.print("Day (1-30): ");
			day = s.nextDouble();
			while (day > 30 || day < 0) {
				System.out.println("Invalid Day. Please enter a valid day.");
				System.out.print("Day (1-30): ");
				day = s.nextDouble();
			}
		}
		System.out.print("Height (inches): ");
		height = s.nextDouble();
		System.out.print("Weight (pounds): ");
		weight = s.nextDouble();
			
		HealthProfile HP = new HealthProfile(first, last, gender, month, day, year, height, weight);
		double ageInYears = HP.calculateAgeInYears(month, year, day);
		double maxHR = HP.calculateMaxHeartRate(ageInYears);
        double minTarget = HP.targetHeartRate(maxHR, 0.50);
        double maxTarget = HP.targetHeartRate(maxHR, 0.85);
        
        System.out.println("\nHealth Profile:");
        System.out.println("Name: " + HP.getFirstName() + " "+HP.getLastName());
        System.out.println("Sex: " + HP.getGender());
        System.out.println("Birthday (MM/DD/YY): " + (int)HP.getBirthMonth() +"/"+ (int)HP.getBirthday() +"/" + (int)HP.getBirthYear());
        System.out.println("Age (in yrs.): " + ageInYears);
        System.out.println();
        System.out.println("Maximum Heart Rate (in bpm): " + maxHR +" bpm");
        System.out.println("Target Heart Rate (in bpm): " + minTarget +" bpm to " + maxTarget + " bpm");
        System.out.println("BMI : " + HP.calculateBMI(weight, height));
        s.close();
        
	}
}
