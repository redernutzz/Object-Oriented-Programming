import java.util.Scanner;

class Bestseller {
	private String[] book = new String[5];
	private int[] sales = new int [5];
	
	Bestseller() {
		for (int i = 0; i < 5; i++) {
			this.sales[i] = 0;
			this.book[i] = "";
		}
	}

	Bestseller (int sales, String book) {
		for (int i = 0; i < 5; i++) {
			this.sales[i] = sales;
			this.book[i] = book;
		}
	}
	
	public void setSales(int numSales, int index) {
		this.sales[index] = numSales;
	}
	public int getSales(int index) {
		return this.sales[index];
	}
	public void setBook(String book, int index) {
		this.book[index] = book;
	}
	public String getBook(int index) {
		return this.book[index];
	}
	public int getTotal() {
		int total = 0;
		for (int i = 0; i < 5; i++) {
			total = total + this.sales[i];
		}
		return total;
	}
	
	public int getBestSeller() {
		int bestSeller = 0;
		int indexOfBestSeller = 0;
		for (int i = 0; i < 5; i++) {
			if(this.sales[i] > bestSeller) {
				bestSeller = this.sales[i];
				indexOfBestSeller = i;
			}
		}
		return indexOfBestSeller;
	}
	
	public float getPercentage(int index) {
		return ((float)this.sales[index]/(float)getTotal()) * 100;
	}
	public void print(int total, int bestSeller) {
		System.out.format("%-20s %-20s  %-25s \n", "Book", "Number of Sales", "% of Total Sales");
		for(int i = 0; i < 5; i++) {
			System.out.format("%-20s %-20s  %-25.2f \n", this.book[i],  this.sales[i], getPercentage(i));
		}
		System.out.format("%-20s %-20s", "Total", total);
		System.out.print("\n\nThe Best Seller is ");
		System.out.println(this.book[bestSeller]);
	
	}
}
public class BestsellerTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Bestseller book = new Bestseller();
		for(int i = 0; i < 5; i++) {
			int j = i+1;
			System.out.print("Enter Book No." + j + ": ");
		    book.setBook(input.nextLine(), i); 
		    System.out.print("Enter Number of Sales: ");
		    book.setSales(input.nextInt(), i);
		    input.nextLine();
		}
		System.out.println();
		book.print(book.getTotal(), book.getBestSeller());
		
		
		input.close();
	}
}
