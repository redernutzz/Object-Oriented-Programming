
abstract class Employee {
	private String name;
	private String jobTitle;
	
	Employee(String name, String jobTitle) {
		this.name = name;
		this.jobTitle = jobTitle;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	abstract public double calculateWeeklyPay();
	
	public String toString() {
		return "Employee Name: " + name + "\nJob Title: " + jobTitle;
	}
	
}
