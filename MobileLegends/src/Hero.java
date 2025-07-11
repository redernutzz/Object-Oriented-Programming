
public class Hero {
	private String name;
	
	private double price;
	private String role;
	public Hero(String name, double price, String role) {
		this.name = name;
		this.price = price;
		this.role = role;
	}
	public String toString() {
		return "Hero: " + name + "\nPrice: " + price + "\nRole: " + role ;
	}
	
}
