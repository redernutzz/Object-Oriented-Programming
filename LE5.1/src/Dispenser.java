public class Dispenser {
	private int numberOfItems;
	private int cost;
	
	Dispenser(){
		numberOfItems = 50;
		cost = 50;
	}
	
	Dispenser(int setNoOfItems, int setCost){
		this.numberOfItems = setNoOfItems;
		this.cost = setCost;
	}
	
	public int getNoOfItems() {
		return this.numberOfItems;
	}
	
	public int getCost() {
		return this.cost;
	}
	
	public void makeSale() {
		--this.numberOfItems;
	}
	
}