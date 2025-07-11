import java.util.Scanner;
import java.lang.Math;

class GradeDistribution{
	private int A, B, C, D, F;
	Scanner s = new Scanner(System.in);
	
	public int readGrade() {
		return s.nextInt();
	}
	public void setLetterA() {
		this.A = readGrade();
	}
	public void setLetterB() {
		this.B = readGrade();	
	}
	public void setLetterC() {
		this.C = readGrade();	
	}
	public void setLetterD() {
		this.D = readGrade();	
	}
	public void setLetterF() {
		this.F = readGrade();	
	}
	public int getGrade(char letter) {
		if(letter == 'a') {
			return this.A;
		}
		else if(letter == 'b') {
			return this.B;
		}
		else if(letter == 'c') {
			return this.C;
		}
		if(letter == 'd') {
			return this.D;
		}
		else  {
			return this.F;
		}
	}
	public double getTotalNumGrades() {
		return this.A + this.B + this.C + this.D + this.F;
	}
	public int getPercentage(int grade) {
		double x = (((grade/getTotalNumGrades()))*50);
		x = Math.round(x);
		return (int)x;
	}
	public void drawBarGraph(int percentage) {
		for(int i = 0; i < Math.round(percentage); i++) {
			System.out.print("*");
		}
	}
}
public class Grades {
	public static void main (String[] args) {
		GradeDistribution g = new GradeDistribution();
		System.out.println("Enter Grades:");
		System.out.print("A: ");
		g.setLetterA();
		System.out.print("B: ");
		g.setLetterB();
		System.out.print("C: ");
		g.setLetterC();
		System.out.print("D: ");
		g.setLetterD();
		System.out.print("F: ");
		g.setLetterF();
		
		System.out.print("\n0   10    20   30   40   50   60   70   80   90  100");
		System.out.println();
		System.out.print("|    |    |    |    |    |    |    |    |    |    |");
		
		System.out.println();
		for(int i = 0; i < 51; i++) {
			System.out.print("*");
		}
		System.out.println();
		g.drawBarGraph(g.getPercentage(g.getGrade('a')));
		System.out.println(" A");
		g.drawBarGraph(g.getPercentage(g.getGrade('b')));
		System.out.println(" B");
		g.drawBarGraph(g.getPercentage(g.getGrade('c')));
		System.out.println(" C");
		g.drawBarGraph(g.getPercentage(g.getGrade('d')));
		System.out.println(" D");
		g.drawBarGraph(g.getPercentage(g.getGrade('f')));
		System.out.println(" F");
	}
}
