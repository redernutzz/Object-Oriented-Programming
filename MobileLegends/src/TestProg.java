
public class TestProg {

	public static void main(String[] args) {
		Hero lesley = new Marksman("Lesley", 32000, "Marksman", "Assassin", "Gusion");
		Hero edith = new Marksman ("Edith", 320000, "Marksman", "Tank", "None");
		Hero hylos = new Tank ("Hylos", 32000, "Tank", 15000, "Brave Smite", "Wanwan");
		
		System.out.println("MARKSMAN: ");
		System.out.println(lesley);
		System.out.println();
		System.out.println(edith);
		System.out.println();
		System.out.println("TANK: ");
		System.out.println(hylos);
		
	}

}
