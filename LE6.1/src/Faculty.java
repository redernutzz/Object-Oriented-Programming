
public class Faculty extends Employee{
	private String rank, officeHours;
	
	Faculty(String name, String address, String phoneNumber, String email, String office, double salary, String officeHours, String rank, long milli) {
        super(name, address, phoneNumber, email, office, salary, milli);
        this.officeHours = officeHours;
        this.rank = rank;
    }
	Faculty(String name, String address, String phoneNumber, String email, String office, double salary, String officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getRank() {
		return this.rank;
	}
	public void setOfficeHours(String hours) {
		this.officeHours = hours;
	}
	public String getOfficeHours() {
		return this.officeHours;
	}
	
	@Override
	public String toString() {
	    return super.toString() + "\nOffice Hours: " + officeHours + "\nRank: " + rank;
	}
}
