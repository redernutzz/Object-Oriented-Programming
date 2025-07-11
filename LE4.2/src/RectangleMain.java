class Rectangle{
	private double width = 1, height = 1;
	
	public Rectangle() {
	}
	public Rectangle (double width, double height) {
		this.width = width;
		this.height = height;
	}
//	public double getWidth() {
//		return this.width;
//	}
//	public double getHeight() {
//		return this.height;
//	}
	public double getArea() {
		return (width * height);
	}
	public double getPerimeter() {
		return 2*(width + height);
	}
}
public class RectangleMain {
	public static void main(String[] args) {
		double rw1 = 4, rh1 = 40, rw2 = 3.5, rh2 = 35.9;
		Rectangle rectangle1 = new Rectangle(rw1, rh1);
		Rectangle rectangle2 = new Rectangle(rw2, rh2);
		System.out.println("Rectangle 1:");
		System.out.print("Width: " + rw1);
		System.out.print("\nHeight: " + rh1);
		System.out.print("\nArea: " +rectangle1.getArea()); 
		System.out.println("\nPerimeter: " +rectangle1.getPerimeter()); 
		
		System.out.println("\nRectangle 2:");
		System.out.print("Width: " + rw2);
		System.out.print("\nHeight: " + rh2);
		System.out.print("\nArea: " +rectangle2.getArea()); 
		System.out.print("\nPerimeter: " +rectangle2.getPerimeter()); 
	}
}
