
public class Cake {
	protected String name;
	protected double rate;
	
	Cake (String n, double r) {
		name = n;
		rate = r;
	}
	public double calcPrice() {
		return 0; //override later
	}
	
	public String toString() {
		return  name  + "\t Php" + rate;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setWeight(double weight) {
		
	}
	public double getWeight() {
		return 0;
	}
	public void setQuantity(double quantity) {
		
	}
	public int getQuantity() {
		return 0;
	}
}
