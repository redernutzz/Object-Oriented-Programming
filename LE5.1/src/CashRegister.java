public class CashRegister{
	private int cashOnHand;
	
	CashRegister(){
		this.cashOnHand = 500;
	}
	
	CashRegister(int cashIn){
		this.cashOnHand = cashIn;
	}
	
	public void acceptAmount(int amountIn) {
		this.cashOnHand += amountIn;
	}
	
	public int getCurrentBalance() {
		return this.cashOnHand;
	}
}