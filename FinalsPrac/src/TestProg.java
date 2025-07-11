import java.lang.Math;

public class TestProg {

	public static void main(String[] args) {
		Employee paul = new HourlyEmployee("Paul Ouano", "Senior Web Developer", 750, 8);
		Employee doja = new SalaryEmployee("Elline Fabian", "Instructor", 5342);
		System.out.println(paul);
		System.out.println();
		System.out.println(doja);
		System.out.println();
		int random = (int)(Math.random()*10);
		System.out.println(random);
		System.out.println(((HourlyEmployee) paul).calculateSomething());
		
		if(paul instanceof Employee) {
			System.out.println("Correct");
		}
	}

}
