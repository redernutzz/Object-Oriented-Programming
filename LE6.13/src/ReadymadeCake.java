
public class ReadymadeCake extends Cake{
	private double quantity;
	
	ReadymadeCake(String name, double rate, double quantity){
		super(name, rate);
		this.quantity = quantity;
	}
	
	@Override
	public double calcPrice() {
		return this.rate * this.quantity;
	}
	@Override
	public String toString() {
		return super.toString() + "/pc.\t   " + (int)this.quantity + "pcs.\t     "+ calcPrice() + "Php";
	}
	@Override
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	@Override
	public int getQuantity() {
		return (int)this.quantity ;
	}
}
