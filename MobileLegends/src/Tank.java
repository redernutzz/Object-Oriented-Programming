
public class Tank extends Hero{
	private int life;
	private String emblem;
	private String weakness;
	
	public Tank(String name, double price, String role, int life, String emblem, String weakness) {
		super(name, price, role);
		this.life = life;
		this.emblem = emblem;
		this.weakness = weakness;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nLife: " + life + "\nEmblem: " + emblem + "\nWeakness: " + weakness;
	}
	
}
