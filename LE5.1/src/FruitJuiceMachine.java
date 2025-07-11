import java.util.Scanner;

public class FruitJuiceMachine{
	public static void showSelection(){
		 System.out.println("===================MENU===================");
	        System.out.println("[1] Apple Juice\t\t[2] Orange Juice\n[3] Mango Lassi\t\t[4] Fruit Punch\n[5] Display Inventory\t[0] Exit");
	        System.out.println("==========================================");
	}
	public static void displayInventory(Dispenser appleJuice, Dispenser orangeJuice, Dispenser mangoLassi, Dispenser fruitPunch) {
		System.out.println("\nApple Juice: "+ appleJuice.getNoOfItems() +" pcs.");
		System.out.println("Orange Juice: "+ orangeJuice.getNoOfItems() +" pcs.");
		System.out.println("Mango Lassi: "+ mangoLassi.getNoOfItems() +"pcs.");
		System.out.println("Fruit Punch: "+ fruitPunch.getNoOfItems() +"pcs.");
		System.out.println();
	}
	public static void sellProduct(Dispenser dispenser, Scanner input, CashRegister cashReg){
		int money;
		if(dispenser.getNoOfItems()== 0){
			System.out.println("\nSold out\n");
			System.out.println("Please Choose Another Item\n");
			return;
		} 
		else{
			int i = 0;
			System.out.println("\nPlease deposit " + dispenser.getCost() + " PHP");
			System.out.print("Payment: ");
			money = input.nextInt();
			while (i < 2 && money < dispenser.getCost()) {
				int lack = dispenser.getCost() - money;
				System.out.println("\nYou lack PHP " + lack + " Please deposit again");
				money = money + input.nextInt();
			
				i++;
			}
			
			if(i == 2 && money < dispenser.getCost()) {
				System.out.println("\nYour money is still lacking. \nReturning Money...");
				System.out.println("Money Returned: PHP " + money);
				System.out.println();
				return;
			}
			
			if (money == dispenser.getCost()) {
				dispenser.makeSale();
				cashReg.acceptAmount(money);
			}
			
			else if (money > dispenser.getCost()){
		
				int change = money - dispenser.getCost();
				System.out.println("Your change is: " + change);
				System.out.println("");	
				dispenser.makeSale();
				cashReg.acceptAmount(money-change);
			}
			System.out.println("\nCurrent Vending Machine Balance: " + cashReg.getCurrentBalance());
			System.out.println();
			
		}
	}
	
	public static void main (String[] args){
		
		int selection = -1;
		Dispenser appleJuice = new Dispenser();
		Dispenser orangeJuice = new Dispenser();
		Dispenser mangoLassi = new Dispenser();
		Dispenser fruitPunch = new Dispenser(0, 30);
		CashRegister cashReg = new CashRegister();
		Scanner input = new Scanner(System.in);
		
		while( selection != 0){
			showSelection();

			System.out.println("Input the number of your desired item");
			System.out.print("Choice: ");
			selection = input.nextInt();

		
			
			switch(selection){
				case 1:
					System.out.println("\nApple Juice"); 
					System.out.print("Price: " + appleJuice.getCost()+ " PHP ");
					sellProduct(appleJuice, input, cashReg);
					break;
		
				case 2:
					System.out.println("\nOrange Juice");
					System.out.print("Price: " + orangeJuice.getCost()+ " PHP ");
					sellProduct(orangeJuice, input, cashReg);
					break;
		
				case 3:
					System.out.println("\nMango Lassi");
					System.out.print("Price: " +  mangoLassi.getCost()+ " PHP ");
					sellProduct(mangoLassi,input, cashReg);
					break;
				case 4:
					System.out.println("\nFruit Punch");
					System.out.print("Price: " + fruitPunch.getCost()+ " PHP ");
					sellProduct(fruitPunch, input, cashReg);
					break;
				case 5:
					displayInventory(appleJuice, orangeJuice, mangoLassi, fruitPunch);
					
					break;
				case 0:
					System.out.println("THANK YOU FOR USING");
					break;
				default:
					System.out.println("Please enter valid selection");
				break;
			}
		}
		input.close();
	}
}