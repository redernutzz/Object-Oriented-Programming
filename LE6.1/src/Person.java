
public class Person {
	private String name, address, phoneNum, email;
	
	Person (){
		this.name = "";
		this.address = "";
		this.phoneNum = "";
		this.email = "";
	}
	Person (String name, String address, String phoneNum, String email){
		this.name = name;
		this.address = address;
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress( ) {
		return this.address;
	}
	public void setPhone(String phone) {
		this.phoneNum = phone;
	}
	
	public String getPhone( ) {
		return this.phoneNum;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail( ) {
		return this.email;
	}
	public String toString() {
	        return "\nName: " + name + "\nAddress: " + address + "\nPhone Number: " + phoneNum + "\nEmail: " + email;
	 }
}
