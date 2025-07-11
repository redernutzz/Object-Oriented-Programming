
public class OrderCake extends Cake{
	private double weight;
	
	OrderCake(String name, double rate, double weight) {
		super(name, rate);
		this.weight = weight;
	}
	
	@Override
	public double calcPrice() {
		return this.weight*this.rate;
	}
	
	@Override
	public String toString() {
		return super.toString() + "/kg\t   " + this.weight + " kg.\t     "+ calcPrice() +"Php";
	}
	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public double getWeight() {
		return this.weight;
	}
}
