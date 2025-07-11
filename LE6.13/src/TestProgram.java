import java.util.ArrayList;
import java.util.Scanner;

public class TestProgram {
	
	public static void displayCakes(ArrayList<Cake> cakeList) {
		System.out.println();
		System.out.println("CAKE: ");
		
		for (int i = 0; i < cakeList.size(); i++) {
			if(cakeList.get(i) instanceof Cake) {
				System.out.println(cakeList.get(i));
				System.out.println();
			}
		}
		System.out.println("----------------------------------------------------------------");
		System.out.println("\nORDER CAKE: ");
		System.out.println("Name: \t         Rate:\t           Weight:          Price:");
		for (int i = 0; i < cakeList.size(); i++) {
			if(cakeList.get(i) instanceof OrderCake) {
				System.out.println(cakeList.get(i));
				System.out.println();
			}
		}
		System.out.println("----------------------------------------------------------------");
		System.out.println("\nREADY-MADE: ");
		System.out.println("Name: \t         Rate:\t           Quantity:        Price:");
		for (int i = 0; i < cakeList.size(); i++) {
			if(cakeList.get(i) instanceof ReadymadeCake) {
				System.out.println(cakeList.get(i));
				System.out.println();
			}
		}
		System.out.print("----------------------------------------------------------------");
		System.out.print("\n----------------------------------------------------------------\n");
		double total = 0, quant = 0;
		for (int i = 0; i < cakeList.size(); i++) {
			if(cakeList.get(i) instanceof ReadymadeCake) {
				quant = quant + cakeList.get(i).getQuantity();
				total = total + cakeList.get(i).calcPrice();
			}
		}
		System.out.print("Total Price and Quantity Sold for Ready-made Cakes: Php"+ total + "\t" + (int)quant + "pcs.");
		
		total = 0;
		for (int i = 0; i < cakeList.size(); i++) {
			if(cakeList.get(i) instanceof Cake) {
				total = total + cakeList.get(i).calcPrice();
			}
		}
		System.out.print("\n\nTotal Price of All Cakes: Php "+ total + "\n");
		int index = 0;
		double max = 0;
		for (int i = 0; i < cakeList.size(); i++) {
			if(cakeList.get(i) instanceof ReadymadeCake || cakeList.get(i) instanceof OrderCake) {
				if(cakeList.get(i).calcPrice() > max) {
					max = cakeList.get(i).calcPrice();
					index = i;
				}
			}
		}
		System.out.println("\nMost Expensive Cake: ");
		System.out.println(cakeList.get(index));
		System.out.print("----------------------------------------------------------------");
		
	}
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    ArrayList<Cake> cakeList = new ArrayList<>(20);

	    int choice = 1;

	    System.out.println("Choose Method of Inputting Cakes:");
	    System.out.println("[1] User Input");
	    System.out.println("[2] Ready-made Input");
	    System.out.println("[0] Exit");
	    System.out.print("Choice: ");
	    choice = input.nextInt();

	    if (choice == 1) {
	    	int cakeChoice = 1;
	        do {
	            System.out.println("\nChoose Cake to Input:");
	            System.out.println("[1] Cake");
	            System.out.println("[2] Order Cake");
	            System.out.println("[3] Ready-made Cake");
	            System.out.println("[4] Display Cakes");
	            System.out.println("[0] Exit");
	            System.out.print("Choice: ");
	            cakeChoice = input.nextInt();

	            if (cakeChoice == 1) {
	                System.out.print("How many Cake would you like to Input? ");
	                int j = input.nextInt();
	                input.nextLine();
	                int i = 0;
	                while (i < j) {
	                    input.nextLine();
	                    System.out.print("\nEnter Cake Name: ");
	                    String name = input.nextLine();
	                    System.out.print("Enter Cake Rate: ");
	                    double rate = input.nextDouble();
	                    cakeList.add(new Cake(name, rate));
	                    i++;
	                }
	            } else if (cakeChoice == 2) {
	                System.out.print("How many Order Cake would you like to Input? ");
	                int j = input.nextInt();

	                int i = 0;
	                while (i < j) {
	                    input.nextLine();
	                    System.out.print("\nEnter Cake Name: ");
	                    String name = input.nextLine();
	                    System.out.print("Enter Cake Rate: ");
	                    double rate = input.nextDouble();
	                    System.out.print("Enter Cake Weight: ");
	                    double weight = input.nextDouble();
	                    cakeList.add(new OrderCake(name, rate, weight));
	                    i++;
	                }
	            } else if (cakeChoice == 3) {
	                System.out.print("How many Ready-made Cake would you like to Input? ");
	                int j = input.nextInt();

	                int i = 0;
	                while (i < j) {
	                    input.nextLine();
	                    System.out.print("\nEnter Cake Name: ");
	                    String name = input.nextLine();
	                    System.out.print("Enter Cake Rate: ");
	                    double rate = input.nextDouble();
	                    System.out.print("Enter Cake Quantity: ");
	                    double quantity = input.nextDouble();
	                    cakeList.add(new ReadymadeCake(name, rate, quantity));
	                    i++;
	                }
	            } else if (cakeChoice == 4) {
	                continue;
	            }
	            System.out.println("\nInput More Cakes? (Press 1 for Yes and 0 for No): ");
	            System.out.print("Choice: ");
	            int again = input.nextInt();
	            if (again == 0) {
	                displayCakes(cakeList);
	            }

	        } while (cakeChoice != 0);
	    } else if (choice == 2) {
	        cakeList.add(new Cake("Strawberry Cake", 150));
	        cakeList.add(new Cake("Avocado Cake", 130));
	        cakeList.add(new Cake("Walnut Cake", 110));
	        cakeList.add(new Cake("Blueberyy Cake", 120));

	        cakeList.add(new OrderCake("Graham Cake", 200, 0.6));
	        cakeList.add(new OrderCake("Red Velvet Cake", 250, 1.8));
	        cakeList.add(new OrderCake("Mango Cake", 210, 0.4));
	        cakeList.add(new OrderCake("Banana Cake", 120, 1.5));
	        cakeList.add(new OrderCake("Carrot Cake", 100, 1.5));
	        cakeList.add(new OrderCake("Birthday Cake", 200, 2.4));
	        cakeList.add(new OrderCake("Almond Cake", 210, 0.4));

	        cakeList.add(new ReadymadeCake("Orange Cake", 200, 3));
	        cakeList.add(new ReadymadeCake("Chiffon Cake", 250, 4));
	        cakeList.add(new ReadymadeCake("Chocolate Cake", 210, 4));
	        cakeList.add(new ReadymadeCake("Sponge Cake", 120, 2));
	        cakeList.add(new ReadymadeCake("Pudding Cake", 100, 5));
	        cakeList.add(new ReadymadeCake("Rainbow Cake", 200, 2));
	        cakeList.add(new ReadymadeCake("Marble Cake", 100, 1));
	        cakeList.add(new ReadymadeCake("Coconut Cake", 200, 3));
	        displayCakes(cakeList);
	    }
	    input.close();
	}
			
}
			


