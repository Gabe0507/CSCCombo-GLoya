
public class Wepon {
	private String name;
	private double power;
	public Wepon() {
	}
	public Wepon(String name, double power) {
		super();
		this.name = name;
		this.power = power;
	}
	// Getters
	public String getName() {
		return name;
	}

	public double getDamage() {
		return power;
	}
	// Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setDamage(int dmg) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "Name of wepon " + name + "\npower is " + power;
	}
	
}
