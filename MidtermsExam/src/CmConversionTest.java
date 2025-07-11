import java.util.Scanner;

class CmConversion{
	private double cmToInch = 2.54, inchToFoot = 12, footToYard = 3, cm, inch, foot, yard;
	CmConversion(){
		this.cm = 0;
		this.inch = 0;
		this.foot = 0;
		this.yard = 0;
	}
	CmConversion(double cm, double inch, double foot){
		this.cm = cm;
		this.inch = inch;
		this.foot = foot;
	}
	public void setCM(double cm) {
		this.cm = cm;
	}
	public double getCM() {
		return this.cm;
	}
	public void setInch(double cm) {
		this.inch = cm/cmToInch;
	}
	public double getInch() {
		return this.inch;
	}
	public void setFoot(double inch) {
		this.foot = inch/inchToFoot;
	}
	public double getFoot() {
		return this.foot;
	}
	public void setYard(double foot) {
		this.yard = foot/footToYard;
	}
	public double getYard() {
		return this.yard;
	}
}
public class CmConversionTest {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		CmConversion cm = new CmConversion();
		System.out.print("Enter CM Measurement to Convert: ");
		cm.setCM(input.nextDouble());
		System.out.println("Converting...");
		System.out.print("CM Measurement: " + cm.getCM());
		cm.setInch(cm.getCM());
		System.out.printf("\nCM to Inches: %.02f", cm.getInch());
		cm.setFoot(cm.getInch());
		System.out.printf("\nCM to Foot: %.2f", cm.getFoot());
		cm.setYard(cm.getFoot());
		System.out.printf("\nCM to Yards: %.2f", cm.getYard());
		input.close();
	}
}
