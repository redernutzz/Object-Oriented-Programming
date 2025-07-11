import java.util.ArrayList;

public class TestProgram {
	public static void main(String[] args) {
		ArrayList<Human> people = new ArrayList<>();
		SuperHero hero1 = new SuperHero("Clark Kent", 32, "Male", "Super Strength", "Kryptonite", "Superman");
//		System.out.println(hero1);
		Human hero2 = new SuperHero("Diana", 23, "Female", "Magic Lasso", "None", "Wonder Woman");
//		System.out.println();
//		System.out.println(hero2);
//      System.out.println(((SuperHero) hero2).usePowers());
		people.add(new Villain("Lex", 52, "Male", "Lex Luthor", 532));
		people.add(new Human("Mary Jaane Lastimosa", 23, "Female"));
		if (people.get(0) instanceof Villain) {
			System.out.println(people.get(0));
		}
		if (hero1 instanceof Human) {
			System.out.println(hero1);
		}
		if (hero2 instanceof Human) {
			System.out.println();
			System.out.println(hero2);
		}
	}
}
