
public class Villain extends Human{
	private String villainName;
	private int crimes;
	Villain(String name, int age, String gender, String villainName, int crimes){
		super(name, age, gender);
		this.villainName = villainName;
		this.crimes = crimes;
	}
	public String killHero(String heroToKill) {
		return String.format("Killed %s", heroToKill);
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("\nVillain Name: %s \nNo. of Crimes: %d\n", this.villainName, this.crimes);
	}

}
