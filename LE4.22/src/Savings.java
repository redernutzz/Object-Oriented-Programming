import java.util.Scanner;

class SavingsAccount{
	private static double annualInterestRate;
	private double savingsBalance;
	
	public SavingsAccount(double initial) {
		
		this.savingsBalance = initial;
	}
	public double getSavingsBalance() {
		return this.savingsBalance;
	}
	public double getAnnualInterest() {
		return SavingsAccount.annualInterestRate;
	}
	public double calculateMonthlyInterest(){
		return this.savingsBalance = savingsBalance + (savingsBalance * SavingsAccount.annualInterestRate) / 12;
	}
	public static double modifyInterestRate(double newInterestRate) {
		return SavingsAccount.annualInterestRate = newInterestRate;
	}
}
public class Savings {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter initial balance of savings account: ");
		SavingsAccount account = new SavingsAccount(s.nextDouble());
		System.out.print("Enter annual interest of savings account: ");
		SavingsAccount.modifyInterestRate(s.nextDouble());
		
		System.out.println("\nSavings Balance: " + account.getSavingsBalance());
		System.out.println("Annual Interest: " + account.getAnnualInterest());
	
		System.out.print("\nMonthly Interest: ");
		System.out.print(account.calculateMonthlyInterest());
		s.close();
	}
}
