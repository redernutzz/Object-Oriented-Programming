
public class HourlyEmployee extends Employee{
	private double payRate;
	private double hoursWorked;
	private double salary;
	
	HourlyEmployee(String name, String jobTitle, double payRate, double hoursWorked) {
		super(name, jobTitle);
		this.payRate = payRate;
		this.hoursWorked = hoursWorked;
		
	}
	public double calculateSomething() {
		return 5999.876;
	}
	@Override
	public double calculateWeeklyPay() {
		return this.hoursWorked * this.payRate;
	}
	@Override
	public String toString() {
		return super.toString() + "\nPay Rate: " + payRate + "\nHours Worked: " + hoursWorked + "\nSalary: " + calculateWeeklyPay();
	}
	
}
