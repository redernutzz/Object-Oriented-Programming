
public class SalaryEmployee extends Employee {
	private double weeklySalary;

	public SalaryEmployee(String name, String jobTitle, double weeklySalary) {
		super(name, jobTitle);
		this.weeklySalary = weeklySalary;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	@Override
	public double calculateWeeklyPay() {
		return this.weeklySalary;
	}

	@Override
	public String toString() {
		return super.toString() + "\nWeekly Salary: " + weeklySalary;
	}
	
}
