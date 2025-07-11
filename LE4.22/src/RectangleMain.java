import java.util.Scanner;

class Rectangle{
	private double width, length;
	
	public Rectangle() {
		this.width = 1.0;
		this.length = 1.0;
	}
	public void setWidth(double width) {
		if(width > 0.0 && width < 20.0) {
		this.width = width;
		}
	}
	public double getWidth() {
		return this.width;
	}
	public void setLength(double length) {
		if(length > 0.0 && length < 20.0) {
			this.length = length;
		}
	}
	public double getLength() {		
		return this.length;
	}
	public double getArea() {
		return (width * length);
	}
	public double getPerimeter() {
		return 2*(width + length);
	}
}
public class RectangleMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
	
		System.out.print("Enter Width: ");
		rectangle.setWidth(s.nextDouble());
		System.out.print("Enter Length: ");
		rectangle.setLength(s.nextDouble());
		
		System.out.println("\nRectangle:");
		System.out.print("Width: " + rectangle.getWidth());
		System.out.print("\nLength: " + rectangle.getLength());
		System.out.print("\nArea: " +rectangle.getArea()); 
		System.out.println("\nPerimeter: " +rectangle.getPerimeter()); 
		s.close();
		
	}
}
