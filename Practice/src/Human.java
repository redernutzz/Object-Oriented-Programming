
public class Human {
	private String name;
	private int age;
	private String gender;
	
	Human(String name, int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String toString() {
		return String.format("Name: %s \nAge: %d \nGender: %s", this.name, this.age, this.gender);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
