
public class SuperHero extends Human{
	private String superHeroName;
	private String powers;
	private String weakness;
	
	SuperHero(String name, int age, String gender, String power, String weakness,String superHeroName){
		super(name, age, gender);
		this.superHeroName = superHeroName;
		this.powers = power;
		this.weakness = weakness;
	}
	public String usePowers() {
		return String.format("Whoosh used %s", this.powers);
	}
	@Override
	public String toString() {
		return super.toString() + "\nSuper Hero Name: " + this.superHeroName + "\nSuper Powers: "+ this.powers + "\nWeakness: "+ this.weakness;
	}

}
