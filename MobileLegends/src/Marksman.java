
public class Marksman extends Hero{
	private String secondaryRole;
	private String partner;
	 
	Marksman(String name, double price, String role, String secondaryRole, String partner) {
		super(name, price, role);
		this.secondaryRole = secondaryRole;
		this.partner = partner;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSecondary Role: " + secondaryRole + "\nPartner: " + partner;
	}
	
}
