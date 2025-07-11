
public class Employee extends Person {
	private String office;
	private double salary; 
	private MyDate dateHired;
	
	Employee(String name, String address, String phoneNum, String email, String office, double salary, long milli){
		super( name,  address,  phoneNum,  email);
		this.office = office;
		this.salary = salary;
		this.dateHired = new MyDate(milli);
	}
	Employee(String name, String address, String phoneNum, String email, String office, double salary){
		super( name,  address,  phoneNum,  email);
		this.office = office;
		this.salary = salary;
		this.dateHired = new MyDate();
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getOffice() {
		return this.office;
	}
	public void setSalary (double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return this.salary;
	}
	public void setDateHired() {
		this.dateHired = new MyDate();
	}
	public String getDateHired() {
		return dateHired.getMonth() + "/" + dateHired.getDay() + "/" + dateHired.getYear();
	}
	
	@Override
	public String toString() {
	    return super.toString() + "\nOffice: " + office + "\nSalary: Php" + getSalary() + "\nDate Hired: " + getDateHired();
	}
}
