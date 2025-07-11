
public class Student extends Person{
	public static final String [] CLASS_STATUS = {"Freshman", "Sophomore", "Junior", "Senior"};
	//to access use Student.CLASS_STATUS
	
	private String status;
	private int yearLevel;
	Student (String name, String address, String phoneNum, String email, int yearLevel){
		super(name, address, phoneNum, email);
		this.yearLevel = yearLevel - 1;
		this.status = Student.CLASS_STATUS[this.yearLevel];
	}
	
	public String getStatus() {
		return this.status;
	}
	
	@Override
	public  String toString() {
        return super.toString() + "\nStatus: " + getStatus();
    }
}
